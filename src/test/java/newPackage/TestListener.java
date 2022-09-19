package newPackage;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener  extends TaskBTest implements ITestListener {

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();

    }
@Attachment(value = "Page screenshot on the failed test case", type = "image/png")
public byte[] saveScreenshotPNG (WebDriver driver) {
    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

@Attachment(value ="{0}", type = "text/plain")
    public static String saveTextLog (String message) {
        return message;
    }

    public void onTestFailure(ITestResult iTestResult){
        System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult)+ " failed");

        Object testClass = iTestResult.getInstance();
        WebDriver driver = ((BaseTest) testClass).getWebDriver();

        if (driver instanceof WebDriver){
            System.out.println("Screenshot captured for test case: " + getTestMethodName(iTestResult));
            saveScreenshotPNG(driver);
        }

        saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");

    }
}
