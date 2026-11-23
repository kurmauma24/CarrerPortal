
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import utilities.ConfigReader;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public ConfigReader cr;
    protected String excelFile;

    @Parameters({"browser", "excelFile"})
    @BeforeMethod
    public void setup(String browser, String excelFile) throws Exception {

        this.excelFile = excelFile;

        // Browser initialization
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else {
            throw new IllegalArgumentException(
                "Invalid browser name: " + browser);
        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        cr = new ConfigReader();
    }

//    @AfterMethod
//    public void tearDown() {
//
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
