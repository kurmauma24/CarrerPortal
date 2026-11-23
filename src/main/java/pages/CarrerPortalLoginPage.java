package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;public class CarrerPortalLoginPage {

	WebDriver driver;

	public CarrerPortalLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By Login = By.id("loginShowButton");
	By email = By.id("UserName");
	By password = By.id("Password");
	By loginbutton = By.id("loginButton");
	By togglebutton = By.id("userAccountButton");
	By logout = By.id("toLogOut");
	By searchjob = By.id("ContentPlaceHolder1_searchBox");
	By searchicon = By.id("ContentPlaceHolder1_searchButton");
	By jobtitle = By.xpath("//div[contains(@class,'jobTitle')])[1]");
	By apply = By.xpath("//a[contains(@href,'ApplyJob.aspx') and contains(text(),'Apply')]");


	public void clickLogin() {
		driver.findElement(Login).click();
	}

	public void emailEnter() {
		 driver.findElement(email).sendKeys("Myra123@gmail.com");
	}
	
	public void enterPassword() {
		driver.findElement(password).sendKeys("Uma12345");
	}
	
	public void clickLoginButton() {
		driver.findElement(loginbutton).click();
	}
	
	public void clickMenu() {
		driver.findElement(togglebutton).click();
	}
	
	public void clickLogout() {
		 driver.findElement(logout).click();
	}
	
	public void enterJob(String job) {
		driver.findElement(searchjob).sendKeys(job);
	}
	
	public void clickSearchIcon() {
		driver.findElement(searchicon).click();
	}
	
	public void clickJobTitle() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    By jobTitle = By.xpath("(//div[contains(@class,'jobTitle')])[1]");

	    wait.until(driver -> {
	        try {
	            WebElement ele = driver.findElement(jobTitle);

	            ((JavascriptExecutor) driver)
	                    .executeScript("arguments[0].scrollIntoView({block:'center'});", ele);

	            ele.click();
	            return true;

	        } catch (StaleElementReferenceException e) {
	            return false;
	        }
	    });
	}
	
	public void clickApply() {
		driver.findElement(apply).click();
	}
	
	
	
}
