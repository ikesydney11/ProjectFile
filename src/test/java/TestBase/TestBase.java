package TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public  static ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public TestBase() {
    }


    @BeforeClass

    public void SetUp() {

        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    public static void NavigateToUrl(String Url) {
        driver.get(Url);
    }

    public void sleep(int seconds) {
        try{
            Thread.sleep(seconds * 1000L);
        }catch (InterruptedException e) {
            e.getMessage();
        }
    }
    public void initializeReport(){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/extentExtentSparkReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Pension, Remittance, On Internet Banking");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzzz')'");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    public static String captureScreenshot(WebDriver driver) throws IOException {
        String FileSeparator = FileSystems.getDefault().getSeparator();
        String Extent_report_path ="."+FileSeparator+"Reports";
        String ScreenshotPath = Extent_report_path+FileSeparator+ "screenshots";
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String screenshotName = "screenshot"+Math.random()+".png";
        String screenshotpath = ScreenshotPath+FileSeparator+screenshotName;
        FileUtils.copyFile(src,new File(screenshotpath));
        return "."+FileSeparator+"screenshots"+FileSeparator+screenshotName;}
    @AfterTest

    public void endReport(){

        extent.flush();
    }

    // @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.close();
    }
}