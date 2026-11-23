package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ScreenshotUtils;

public class CandidateDetails {

	WebDriver driver;

	public CandidateDetails(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAndCapture(By locator, String name) throws IOException {

		driver.findElement(locator).click();

		ScreenshotUtils.captureScreenshot(driver, name);
	}

	By candidateemail = By.id("ContentPlaceHolder1_input_0_0_0");
	By password = By.xpath("//input[@type='password']");
	By reenterpassword = By.xpath("//input[@id='ContentPlaceHolder1_extraPasswordinput_0_0_1']");
	By particulars = By.xpath("//div[contains(@class,'navButtonDiv') and contains(text(),'Personal Particulars')]");
	By name = By.xpath("//input[@name='ctl00$ContentPlaceHolder1$input_1_0_0']");
	By employmentPassDropdown = By.id("ContentPlaceHolder1_input_1_0_2");
	By nricno = By.id("ContentPlaceHolder1_input_1_0_3");
	By address1 = By.id("ContentPlaceHolder1_input_1_0_6");
	By postalcode = By.id("ContentPlaceHolder1_input_1_0_5");
	By mobile = By.id("ContentPlaceHolder1_input_1_0_6");
	By gmail = By.id("ContentPlaceHolder1_input_1_0_14");
	By carrerinterest = By.id("navButton6");
	By expectedsalary = By.id("ContentPlaceHolder1_input_6_0_0");
	By noticeperiod = By.id("ContentPlaceHolder1_input_6_0_1");
	By importantquestions = By.id("navButton3");
	By employmenttype = By.id("ContentPlaceHolder1_input_3_0_0");
	By opportunity = By
			.xpath("//select[@name='ctl00$ContentPlaceHolder1$input_3_0_1' and contains(.,'Careers Future')]");
	By preferredRegion = By.xpath("//label[contains(text(),'Central Region')]");
	By Referredpcf = By.id("ContentPlaceHolder1_input_3_0_3");
	By formsanddocument = By.id("navButton4");
	By uploadFile = By.id("fuUpload_0");
	By uplaodfile2 = By.id("fuUpload_1");
	By uploadAllDocuments = By.id("ContentPlaceHolder1_addNewRecordGroupButton9");
	By declaration = By.id("navButton9");
	By disease = By.id("ContentPlaceHolder1_input_10_0_0");
	By surgicaloperation = By.id("ContentPlaceHolder1_input_10_0_1");
	By medication = By.id("ContentPlaceHolder1_input_10_0_2");
	By criminaloffence = By.id("ContentPlaceHolder1_input_10_0_3");
	By criminalpunishment = By.id("ContentPlaceHolder1_input_10_0_4");
	By financialembarrassment = By.id("ContentPlaceHolder1_input_10_0_5");
	By previousemployment = By.id("ContentPlaceHolder1_input_10_0_6");
	By presentlyemployedbyPCF = By.id("ContentPlaceHolder1_input_10_0_7");
	By workedinPCF = By.id("ContentPlaceHolder1_input_10_0_8");
	By acknowledge = By.xpath("//label[@for='ContentPlaceHolder1_disclaimerBox']");
	By submit = By.id("ContentPlaceHolder1_SubmitAllButton");
	By personalitytest = By.id("ContentPlaceHolder1_ddlQuestion_18");

	By nationality = By.id("ContentPlaceHolder1_input_1_0_1");
	By residentialaddress = By.id("ContentPlaceHolder1_input_1_0_2");
	By street = By.id("ContentPlaceHolder1_input_1_0_3");
	By landmark = By.id("ContentPlaceHolder1_input_1_0_4");

	By highestqualification = By.id("ContentPlaceHolder1_input_2_0_0");
	By typeofqualification = By.id("ContentPlaceHolder1_input_2_0_1");
	By nameofqualification = By.id("ContentPlaceHolder1_input_2_0_2");
	By nameofinstitute = By.id("ContentPlaceHolder1_input_2_0_3");
	By startdate = By.id("ContentPlaceHolder1_input_2_0_4");
	By enddate = By.id("ContentPlaceHolder1_input_2_0_5");
	By modestudy = By.id("ContentPlaceHolder1_input_2_0_6");
	By emailaddress = By.id("ContentPlaceHolder1_input_1_0_7");
	By educationalqualification = By.id("navButton2");

	public void enterEmailId(String email) {
		driver.findElement(candidateemail).sendKeys(email);
		System.out.println("User Emailid : " + email);

	}

	public void enterPassword(String userpassword) {
		driver.findElement(password).sendKeys(userpassword);
		System.out.println("User Password : " + userpassword);
	}

	public void reEnterPassword() {
		driver.findElement(reenterpassword).sendKeys("12345678");
	}

	public void clickParticulars() {
		driver.findElement(particulars).click();
	}

	public void enterName(String username) {
		driver.findElement(name).sendKeys(username);
		System.out.println("Name : " + username);
	}

	public void selectEmploymentPass() {
		WebElement dropdown = driver.findElement(employmentPassDropdown);
		Select select = new Select(dropdown);
		select.selectByVisibleText("Employment Pass P2");
	}

	public void enterNRIC(String nric) {
		driver.findElement(nricno).sendKeys(nric);
	}

	public void enterAddress() {
		driver.findElement(address1).sendKeys("BTM 2nd Stage, Near Central Mall");
	}

	public void enterPostal() {
		driver.findElement(postalcode).sendKeys("876876");
	}

	public void enterMobile() {
		driver.findElement(mobile).sendKeys("942384728742");
	}

	public void enterGmail(String email) {
		driver.findElement(gmail).sendKeys(email);
	}

	public void clickcarrerinterest() {
		driver.findElement(carrerinterest).click();
	}

	public void enterexpectedsalary() {
		driver.findElement(expectedsalary).click();
		driver.findElement(expectedsalary).sendKeys("200");
	}

	public void enternoticeperiod() {
		driver.findElement(noticeperiod).sendKeys("200");
	}

	public void enterImportantQuestions() {
		driver.findElement(importantquestions).click();
	}

	public void selectEmploymentType() {

		WebElement dp = driver.findElement(employmenttype);
		System.out.println("Tag Name = " + dp.getTagName());
		Select ss = new Select(dp);
		ss.selectByVisibleText("Contract Full Day");
	}

	public void selectOpportunity() {
		WebElement dp = driver.findElement(opportunity);
		Select ss1 = new Select(dp);
		ss1.selectByVisibleText("Careers Future");
	}

	public void selectpersonalitytest() {
		WebElement dp = driver.findElement(personalitytest);
		Select ss1 = new Select(dp);
		ss1.selectByVisibleText("Yes");
	}

	public void selectPreferredRegion() {
		driver.findElement(preferredRegion).click();
	}

	public void selectReferredpcf() {
		WebElement dp = driver.findElement(Referredpcf);
		Select ss2 = new Select(dp);
		ss2.selectByVisibleText("No");
	}

	public void clickformsanddocument() throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(formsanddocument).click();
	}

	public void uploadResume(String filePath) throws InterruptedException {

		Thread.sleep(1000);

		driver.findElement(uploadFile).sendKeys(filePath);

		String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);

		System.out.println("Selected File : " + fileName);
	}

	public void uploadResume2(String filePath) throws InterruptedException {

		Thread.sleep(1000);

		driver.findElement(uplaodfile2).sendKeys(filePath);

		String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);

		System.out.println("Selected File : " + fileName);
	}

	public void clickuploadAllDocuments() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(uploadAllDocuments).click();

	}

	public void clickDeclaration() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		By declarationTab = By.id("navButton9");

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(declarationTab))).click();
	}

//	public void selectDisease() {
//		WebElement dropdown = driver.findElement(disease);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}

//	public void selectDisease() {
//
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//	    WebElement diseaseDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
//	        By.id("ContentPlaceHolder1_input_10_0_0")
//	    ));
//
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	    js.executeScript(
//	        "arguments[0].value='N';" +
//	        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
//	        diseaseDropdown
//	    );
//	}

	public void selectNoById(String dropdownId) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(dropdownId)));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='N';" + "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));",
				dropdown);
	}

	public void selectDisease() {
		selectNoById("ContentPlaceHolder1_input_10_0_0");
	}

	public void selectSurgicalOperation() {
		selectNoById("ContentPlaceHolder1_input_10_0_1");
	}

	public void selectLongTermMedication() {
		selectNoById("ContentPlaceHolder1_input_10_0_2");
	}

	public void selectCriminalOffence() {
		selectNoById("ContentPlaceHolder1_input_10_0_3");
	}

	public void selectCriminalpunishment() {
		selectNoById("ContentPlaceHolder1_input_10_0_4");

	}

	public void selectFinancialembarrassment() {
		selectNoById("ContentPlaceHolder1_input_10_0_5");

	}

	public void selectPreviousemployment() {
		selectNoById("ContentPlaceHolder1_input_10_0_6");

	}

	public void selectPresentlyemployedbyPCF() {
		selectNoById("ContentPlaceHolder1_input_10_0_7");

	}

	public void selectWorkedinPCF() {
		selectNoById("ContentPlaceHolder1_input_10_0_8");

	}

//	public void selectSurgicalOperation() {
//		WebElement dropdown = driver.findElement(surgicaloperation);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectMedication() {
//		WebElement dropdown = driver.findElement(medication);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectCriminaloffence() {
//		WebElement dropdown = driver.findElement(criminaloffence);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//		}
//	public void selectCriminalpunishment() {
//		WebElement dropdown = driver.findElement(criminalpunishment);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectFinancialembarrassment() {
//		WebElement dropdown = driver.findElement(financialembarrassment);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectPreviousemployment() {
//		WebElement dropdown = driver.findElement(previousemployment);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectPresentlyemployedbyPCF() {
//		WebElement dropdown = driver.findElement(presentlyemployedbyPCF);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}
//	public void selectWorkedinPCF() {
//		WebElement dropdown = driver.findElement(workedinPCF);
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("No");
//	}

//	public void clickAcknowledge() {
//
//	    driver.findElement(acknowledge).click();
//	}
//	
	public void clickAcknowledge() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement checkbox = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_disclaimerBox")));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
	}

//	public void clickSubmit() {
//		driver.findElement(submit).click();
//	}
	public void clickSubmit() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement submitBtn = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_SubmitAllButton")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		js.executeScript("arguments[0].click();", submitBtn);
	}

	// =====================================================================================/

	public void selectNationality() {
		WebElement dropdown = driver.findElement(nationality);
		Select select = new Select(dropdown);
		select.selectByVisibleText("BRITISH");
	}

	public void residentialAdress() {
		driver.findElement(residentialaddress).sendKeys("hyderabad");
	}

	public void addressStreet() {
		driver.findElement(street).sendKeys("hai Street");
	}

	public void landMark() {
		driver.findElement(landmark).sendKeys("beside temple");
	}

	public void selectHighestQualification() {
		WebElement dropdown = driver.findElement(highestqualification);
		Select select = new Select(dropdown);
		select.selectByVisibleText("No");
	}

	public void selectqualification() {
		WebElement dropdown = driver.findElement(typeofqualification);
		Select select = new Select(dropdown);
		select.selectByVisibleText("Academic");
	}
	
	public void nameQualification() {
		driver.findElement(nameofqualification).sendKeys("ABC");
	}
	
	public void nameInstitiute() {
		WebElement dropdown = driver.findElement(nameofinstitute);
		Select select = new Select(dropdown);
		select.selectByVisibleText("3RD MIDDLE SCH JIQJI QIONGHAI");
	}

	public void modeStudy() {
		WebElement dropdown = driver.findElement(modestudy);
		Select select = new Select(dropdown);
		select.selectByVisibleText("FULL TIME");
	}
	
	public void emailaddress(String email) {
		driver.findElement(emailaddress).sendKeys(email);
	}
	
	public void educationQualification() {
		driver.findElement(educationalqualification).click();
	}
	
	
	
}
