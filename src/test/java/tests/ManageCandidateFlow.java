package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseTest;
import pages.LoginPage;
import pages.ManageCandidate;

import org.openqa.selenium.Keys;
import utilities.ExcelUtils;
public class ManageCandidateFlow extends BaseTest {

	@Test
	public void Managecandidateflow() throws InterruptedException {

	    String email = ExcelUtils.getCellData("Sheet1", 1, 0);
	    System.out.println("Email from Excel = [" + email + "]");

	    LoginPage lp = new LoginPage(driver);
	    ManageCandidate mc = new ManageCandidate(driver);

	    driver.get(cr.getProperty("testurl"));

	    lp.enterUsername("SYSTEM");
	    lp.enterPassword("123456");
	    lp.clickLogin();

	    if (lp.isGoButtonDisplayed()) {
	        lp.clickGo();
	        System.out.println("Login Successful");
	        System.out.println("Go button clicked successfully");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        Assert.assertTrue(
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//img[@src='assets/img/menu.png']")
	            )).isDisplayed(),
	            "Login failed. Menu icon not displayed"
	        );
	    }

	    mc.clickMenu();
	    mc.clickrecruitment();
	    mc.clicktransactions();
	    mc.clickmanagecandidateadmin();
	    mc.selectJob();
	    mc.selectPositionbyJd();
        mc.searchByEmail(email);
	    mc.selectcandidate();
	  //  mc.clickaddshortlist();
	}
}
