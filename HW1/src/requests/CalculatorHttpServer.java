package requests;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalculatorHttpServer
{
    private static final int PORT = 1313;
    private static float number1 = 0;
    private static float number2 = 0;
    private static float result = 0;

    public static void main(String[] args)
    {
        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            System.out.println("Note HTTP Server запущен на порту " + PORT);
            while (true)
            {
                try (Socket clientSocket = serverSocket.accept())
                {
                    handleClient(clientSocket);
                }
            }
        }
        catch (IOException e)
        {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();
        if (line == null) return;
        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];
        if (method.equals("GET") && path.equals("/calculator"))
        {
            initPage(out);
        }
        else if (method.equals("GET") && path.startsWith("/calculator"))
        {
            Dictionary<String, String> input = extractPath(path);
            if (input == null) handleNoInput(out);
            else
            {
                handleOperation(input.get("n1"), input.get("n2"), input.get("op"), out);
            }
        }
        else
        {
            handleNotFound(out);
        }
        out.flush();
    }

    private static void initPage(PrintWriter out)
    {
        StringBuilder response = new StringBuilder();
        response.append("<html><body><h1>Calculator</h1>");
        response.append("<form method='GET' action='/calculator'>");
        response.append("<p><input type='text' name='n1' value = " + number1 + " required />")
                .append("<input type='text' name='n2' value = " + number2 + " required /></p>");
        response.append("<p><input type='submit' name='op' value='+'/>")
                .append("<input type='submit' name='op' value='-'/>")
                .append("<input type='submit' name='op' value='*'/>")
                .append("<input type='submit' name='op' value='/'/></p>")
                .append("</form>");
        response.append("<p>Answer: " + result + " </p>");
        response.append("</body></html>");
        sendHttpResponse(out, 200, response.toString());
    }

    private static void handleOperation(String num1, String num2, String op, PrintWriter out)
    {
        try
        {
            number1 = Float.parseFloat(num1);
            number2 = Float.parseFloat(num2);
            switch (op)
            {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0)
                {
                    handleZeroDivision(out);
                    return;
                }
                result = number1 / number2;
                break;
            }
            sendHttpRedirect(out, "/calculator");
        }
        catch (Exception e)
        {
            sendHttpResponse(out, 400, "<html><body><h1>Invalid numbers</h1> " +
                    "<a href='/calculator'>Back to calculator</a></body></html> ");
        }
    }

    private static void handleNotFound(PrintWriter out)
    {
        sendHttpResponse(out, 404, "<html><body><h1>404 Not Found </h1></body></html> ");
    }
    private static void handleNoInput(PrintWriter out)
    {
        sendHttpResponse(out, 400, "<html><body><h1>No Input</h1></body></html> ");
    }
    private static void handleZeroDivision(PrintWriter out)
    {
        sendHttpResponse(out, 400, "<html><body><h1>Can not divide by zero</h1></body></html> ");
    }

    private static Dictionary<String, String> extractBody(BufferedReader in) throws IOException
    {
        StringBuilder body = new StringBuilder();
        String line;
        char[] buffer = new char[1024];
        int readSize = 0;
        while (!(line = in.readLine()).isEmpty())
        {
            // Считываем заголовки
        }
        while (in.ready() && (readSize = in.read(buffer, 0, 1024)) != 0)
        {
            line = new String(buffer, 0, readSize);
            body.append(line);
        }
        String bodyString = body.toString();
        Dictionary<String, String> parts = new Hashtable<>();
        String[] pairs = bodyString.split("&");
        for (String pair : pairs)
        {
            String[] splitPair = pair.split("=");
            if (splitPair.length < 2) continue;
            parts.put(splitPair[0], splitPair[1].replace("%2B", "+").replace("%2F", "/"));
        }
        return parts.isEmpty() ? null : parts;
    }

    private static Dictionary<String, String> extractPath(String path)
    {
        Dictionary<String, String> parts = new Hashtable<>();
        String arguments = path.split("\\?")[1];
        String[] pairs = arguments.split("&");
        for (String pair : pairs)
        {
            String[] splitPair = pair.split("=");
            if (splitPair.length < 2) continue;
            parts.put(splitPair[0], splitPair[1].replace("%2B", "+").replace("%2F", "/"));
        }
        return parts.isEmpty() ? null : parts;
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body)
    {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }

    private static void sendHttpRedirect(PrintWriter out, String location)
    {
        out.println("HTTP/1.1 302 Found");
        out.println("Location: " + location);
        out.println("Content-Length: 0");
        out.println();
    }
}
