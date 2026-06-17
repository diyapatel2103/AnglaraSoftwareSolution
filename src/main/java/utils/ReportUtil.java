package utils;

import java.io.FileWriter;
import java.io.IOException;

public class ReportUtil {

    public static void createReport(String testName, String status, String message) {
        try {
            FileWriter writer = new FileWriter("test-report.html", true);

            writer.write("<html><body>");
            writer.write("<h2>" + testName + "</h2>");
            writer.write("<p>Status: " + status + "</p>");
            writer.write("<p>Message: " + message + "</p>");
            writer.write("<hr>");
            writer.write("</body></html>");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
