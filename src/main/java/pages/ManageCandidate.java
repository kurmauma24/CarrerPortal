package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.openqa.selenium.JavascriptExecutor;


public class ManageCandidate {

	WebDriver driver;

	public ManageCandidate(WebDriver driver) {
		this.driver = driver;
	}

	By menu = By.xpath("//img[@src='assets/img/menu.png']");
	By recruitment = By.xpath("//img[@src='/PCF_DEV/HR/Images/Recruitment.png']");
	By managecandidateadmin =  By.xpath("//a[contains(text(),'Manage Candidate - Admin')]");
	By jobdescription = By.xpath("//select[@name='ddlJobDesc']");	
	By job = By.id("gv1_ctl04_lnkPosition");
	By eventSearch = By.xpath("(//tr[@class='dg-search-row']//input[@type='text'])[5]");
	By candidate = By.xpath("(//div[contains(@class,'icheckbox_square-aero')]//ins[contains(@class,'iCheck-helper')])[1]");
	By transactions = By.id("RECREC2");
	By positionbyjd = By.id("gv1_ctl04_lnkPosition");
	By addshortlist = By.xpath("//input[@name='btnShortList']");
	

	public void clickMenu() {
		driver.findElement(menu).click();
	}
	
	public void clickrecruitment() {
		driver.findElement(recruitment).click();
	}
	
	public void clicktransactions() {
		driver.findElement(transactions).click();
	}
	public void clickmanagecandidateadmin() {
		driver.findElement(managecandidateadmin).click();
	}
	
	public void selectJob()  {
		WebElement jb = driver.findElement(jobdescription);
		Select jbb = new Select(jb);
		jbb.selectByVisibleText("Contract Assistant Teacher - Test");
	}
	
	
	public void selectJobb() {
		driver.findElement(job).click();
	}
	
	public void selectPositionbyJd() 
	{
		driver.findElement(positionbyjd).click();
	}
	
	public void searchByEmail(String email) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement emailBox = wait.until(ExpectedConditions.elementToBeClickable(eventSearch));
	//    emailBox.clear();
	    emailBox.sendKeys(email);
	  //  driver.findElement(By.tagName("body")).click();
	 ///   System.out.println("Email entered: " + email);

	}
	
	public void selectcandidate() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	    By checkbox = By.xpath("//input[contains(@id,'checkbox1')]");

	    WebElement ele = wait.until(
	            ExpectedConditions.presenceOfElementLocated(checkbox));
	    ele.click();

//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	    js.executeScript(
//	            "arguments[0].checked=true;" +
//	            "arguments[0].dispatchEvent(new Event('change'));" +
//	            "arguments[0].dispatchEvent(new Event('click'));",
//	            ele);

	    System.out.println("Checkbox selected");
	}
	
	public void clickaddshortlist() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement btn = wait.until(
	            ExpectedConditions.elementToBeClickable(addshortlist));
	    Assert.assertTrue(btn.isDisplayed(), "Add Shortlist button is not displayed");
	    Assert.assertTrue(btn.isEnabled(), "Add Shortlist button is not enabled");
	    btn.click();
	}
	
}
