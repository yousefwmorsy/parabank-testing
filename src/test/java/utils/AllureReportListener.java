package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;

import java.io.IOException;

public class AllureReportListener implements ITestListener {
    @Override
    public void onFinish(ITestContext context) {
        try {
            new ProcessBuilder("allure", "serve", "allure-results")
                    .inheritIO()
                    .start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}