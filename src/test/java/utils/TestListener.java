package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListener {
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void startReport() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("target/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}