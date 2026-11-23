package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class MultipleBrowser {

    public WebDriver driver;
    public ConfigReader cr;


    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) throws Exception {

        System.out.println("Browser from testng.xml: " + browser);

        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {

            System.out.println("Starting Edge...");

            System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");

            driver = new EdgeDriver();

            System.out.println("Edge browser opened.");
        }
        else {
            throw new RuntimeException("Invalid browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        cr = new ConfigReader();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}