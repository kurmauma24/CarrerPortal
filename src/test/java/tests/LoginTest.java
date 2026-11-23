package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utilities.ScreenshotUtils;

import org.testng.Assert;
import pages.CarrerPortalLoginPage;
import pages.CandidateDetails;
import utilities.ExcelUtils;
public class LoginTest extends BaseTest {

	@Test
	public void verifyLogin() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		CarrerPortalLoginPage cp = new CarrerPortalLoginPage(driver);
		CandidateDetails cd = new CandidateDetails(driver);
		
		String email = ExcelUtils.getCellData("Sheet1", 1, 0);
		System.out.println("Email from Excel: " + email);
		
		String username = ExcelUtils.getCellData("Sheet1", 1, 1);
		System.out.println("Email from Excel: " + username);
		
		String userpassword = ExcelUtils.getCellData("Sheet1", 1, 2);
		System.out.println("Email from Excel: " + userpassword);
		
		String nric = ExcelUtils.getCellData("Sheet1", 1, 3);
		System.out.println("NRIC from Excel: " + nric);
		
		String job = ExcelUtils.getCellData("Sheet1", 1, 4);
		System.out.println("Job from Excel: " + job);

		
		// First flow - Career Portal
		driver.get(cr.getProperty("carrerportalurl"));
		// cp.clickLogin();
//		cp.emailEnter();
//		cp.enterPassword();
		// cp.clickLoginButton();
		cp.enterJob(job);
		cp.clickSearchIcon();
		cp.clickJobTitle();
		cp.clickApply();
//		String userpassword = "12345678";
//		String username = "sandya01";

		cd.enterEmailId(email);
		ScreenshotUtils.captureScreenshot(driver, "Step01_EnterEmail");
		cd.enterPassword(userpassword);
		ScreenshotUtils.captureScreenshot(driver, "Step02_EnterPassword");
		cd.reEnterPassword();
		ScreenshotUtils.captureScreenshot(driver, "Step03_Reenterpassword");
		cd.clickParticulars();
		cd.enterName(username);
		ScreenshotUtils.captureScreenshot(driver, "Step04_entername");
		cd.selectEmploymentPass();
		ScreenshotUtils.captureScreenshot(driver, "Step05_EmploymentPass");
		cd.enterNRIC(nric);
		ScreenshotUtils.captureScreenshot(driver, "Step06_enterNRIC");
		cd.enterAddress();
		ScreenshotUtils.captureScreenshot(driver, "Step07_enterAddress");
		cd.enterPostal();
		ScreenshotUtils.captureScreenshot(driver, "Step08_enterPostal");
		cd.enterMobile();
		ScreenshotUtils.captureScreenshot(driver, "Step09_enterMobile");
		cd.enterGmail(email);
		ScreenshotUtils.captureScreenshot(driver, "Step10_enterGmail");
		cd.clickcarrerinterest();
		ScreenshotUtils.captureScreenshot(driver, "Step11_carrerinterest");
		cd.enterexpectedsalary();
		ScreenshotUtils.captureScreenshot(driver, "Step12_enterexpectedsalary");
		cd.enternoticeperiod();
		ScreenshotUtils.captureScreenshot(driver, "Step13_enternoticeperiod");
		cd.enterImportantQuestions();
		ScreenshotUtils.captureScreenshot(driver, "Step14_enterImportantQuestions");
		cd.selectEmploymentType();
		ScreenshotUtils.captureScreenshot(driver, "Step15_selectEmploymentType");
		cd.selectOpportunity();
		ScreenshotUtils.captureScreenshot(driver, "Step16_selectOpportunity");
		cd.selectPreferredRegion();
		ScreenshotUtils.captureScreenshot(driver, "Step17_selectPreferredRegion");
		cd.selectReferredpcf();
		ScreenshotUtils.captureScreenshot(driver, "Step18_selectPreferredRegion");
		cd.selectpersonalitytest();
        cd.clickformsanddocument();
        cd.uploadResume("C:\\Users\\UmaKurma\\Downloads\\JobReport.pdf");	
		ScreenshotUtils.captureScreenshot(driver, "Jobreport");
        cd.uploadResume2("C:\\Users\\UmaKurma\\Downloads\\JobReport.pdf");
		ScreenshotUtils.captureScreenshot(driver, "Secondreport");
		cd.clickuploadAllDocuments();
		cd.clickDeclaration();
		cd.selectDisease();
		cd.selectSurgicalOperation();
		cd.selectLongTermMedication();
		cd.selectCriminalOffence();
		cd.selectCriminalpunishment();
		cd.selectFinancialembarrassment();
		cd.selectPreviousemployment();
		cd.selectPresentlyemployedbyPCF();
		cd.selectWorkedinPCF();
		cd.clickAcknowledge();
        cd.clickSubmit();
        
        System.out.println("===== Candidate Details =====");
        System.out.println("Email    : " + email);
        System.out.println("Password : " + userpassword);
        System.out.println("Name     : " + username);
        System.out.println("=============================");
        
    
		 cp.clickMenu(); 
		 cp.clickLogout();
		 
		System.out.println("Current URL after logout: " + driver.getCurrentUrl());
		System.out.println("Career Portal Logout Successful");

		// Second flow - Test URL
		
//		  driver.navigate().to(cr.getProperty("testurl"));
		//  System.out.println("Current URL after navigation:" + driver.getCurrentUrl());
//		  lp.enterUsername("00000032"); 
//		  lp.enterPassword("12345"); 
//		  lp.clickLogin(); 
//		  if
//		  (lp.isGoButtonDisplayed()) {
//		  lp.clickGo();
//		  System.out.println("Login Successful");
//		  System.out.println("Go button clicked successfully");
//		  Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard")); } else {
//		  String errorMsg = lp.getLoginErrorMessage();
//		  System.out.println("Error Message: " + errorMsg);
//		  Assert.assertEquals(errorMsg, "Login Error. UserID or Password is invalid.");
//		  }
//		 

	}

}