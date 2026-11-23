package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ScreenshotUtils;
import pages.CarrerPortalLoginPage;
import pages.CandidateDetails;
import utilities.ExcelUtils;
import base.BaseTest;
import utilities.DatePicker02;

public class KoreanTeacher extends BaseTest { // working dont touch code

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

		cp.enterJob(job);
		cp.clickSearchIcon();
		cp.clickJobTitle();
		cp.clickApply();

		cd.enterEmailId(email);
		cd.enterPassword(userpassword);
		cd.reEnterPassword();
		cd.clickParticulars();

		cd.enterName(username);
		cd.selectEmploymentPass();
		cd.enterNRIC(nric);
		cd.enterAddress();
		cd.enterPostal();
		cd.enterMobile();
		cd.enterGmail(email);
		cd.clickcarrerinterest();
		cd.enterexpectedsalary();
		cd.enternoticeperiod();
		cd.enterImportantQuestions();
		cd.selectEmploymentType();
		cd.selectOpportunity();
		cd.selectPreferredRegion();
		cd.selectReferredpcf();
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

	}
	
	//============================================================================================//

	@Test
	public void apply() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);
		CarrerPortalLoginPage cp = new CarrerPortalLoginPage(driver);
		CandidateDetails cd = new CandidateDetails(driver);
		DatePicker02 dp = new DatePicker02();

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

		cp.enterJob(job);
		cp.clickSearchIcon();
		cp.clickJobTitle();
		cp.clickApply();
		cd.enterEmailId(email);
		cd.enterPassword(userpassword);
		cd.reEnterPassword();
		cd.clickParticulars();
		cd.enterName(username);
		cd.selectNationality();
		cd.enterPostal();
		cd.enterMobile();
		cd.selectNationality();
		cd.residentialAdress();
		cd.addressStreet();
		cd.landMark();
		cd.emailaddress(email);
		cd.educationQualification();
		dp.selectDate(driver, "Course Start Date", "23", "June", "2023");
		dp.selectDate(driver, "Course End Date", "19", "May", "2025");
		cd.modeStudy();
		cd.clickformsanddocument();
		cd.uploadResume("C:\\Users\\UmaKurma\\Downloads\\JobReport.pdf");
		ScreenshotUtils.captureScreenshot(driver, "Jobreport");
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

	}

}