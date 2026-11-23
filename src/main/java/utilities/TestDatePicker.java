package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDatePicker {

	private static final By Active_Calender = By.cssSelector("div.xdsoft_datetimepicker[style*='display: block']");
	private static final By Month_Calender = By.cssSelector(".xdsoft_month span");
	private static final By NEXT_BUTTON = By.cssSelector(".xdsoft_next");
	private static final By PREVIOUS_BUTTON = By.cssSelector(".xdsoft_prev");
	
	
	public static void selectDate(WebDriver driver, String day, String date, String Month, String Year)
	{
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		By inputLocator = By.xpath("//label[contains(normalize-space(),'" + fieldLabel + "')]/following::input[1]");

			wait.until( ExpectedConditions.elementToBeClickable(inputLocator)).click();
			wait.until(  ExpectedConditions.visibilityOfElementLocated(Active_Calender));
				
	}

}
