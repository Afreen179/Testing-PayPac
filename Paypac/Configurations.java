package com.Paypac;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Configurations {

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = (WebDriver) new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.paypac.in/Testing/");

			// Login
			// Company code
			driver.findElement(By.xpath("//input[@id='Company_CompanyCode']")).sendKeys("MPL");
			Thread.sleep(2000);
			// User name
			driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
			Thread.sleep(2000);
			// Password
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123");
			Thread.sleep(2000);
			// Login
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
// ***************************************************************************************
//                        	      CONFIGURATION TITLE
//***************************************************************************************

	//************company info - Configure Contact Us*************
			
	// configurations
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
	Thread.sleep(2000);

	// company info
			Actions act = new Actions(driver);
			WebElement companyinfo1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[1]/a"));
			Thread.sleep(2000);
			act.moveToElement(companyinfo1).build().perform();

	// Configure Contact Us
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Configure Contact Us')]")).click();
			Thread.sleep(2000);
			
	// Contact Name
			driver.findElement(By.id("ContactName")).clear();
			driver.findElement(By.id("ContactName")).sendKeys("Test");
			Thread.sleep(2000);

	// Email Address
			driver.findElement(By.id("EmailAddress")).clear();
			driver.findElement(By.id("EmailAddress")).sendKeys("Test@fastfacts.co");
			Thread.sleep(2000);
	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	//--------------company info - Configure About Us -----------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// company info
			Actions b0 = new Actions(driver);
			WebElement companyinfo2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[1]/a"));
			b0.moveToElement(companyinfo2).build().perform();

	// Configure About Us
			driver.findElement(By.xpath("//a[contains(text(),'Configure About Us')]")).click();
			Thread.sleep(2000);

	// Describe your company
	// driver.findElement(By.xpath("//*[@id='tinymce']/div")).clear();
	// Thread.sleep(2000);
	// driver.findElement(By.xpath("//*[@id='tinymce']/div")).sendKeys("The
	// essential elements of an excellent Contact Us page include a clear call to
	// action, easy navigation, and a message that resonates with visitors. Keep
	// these things in mind when designing a Contact Us page: Don’t overload
	// visitors with too much information, use readable text, and create a landing
	// page that converts.");
	// Thread.sleep(2000);

	// scroll down a page
	// Thread.sleep(2000);
	// Actions e = new Actions(driver);
	// e.sendKeys(Keys.PAGE_DOWN).build().perform();

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	// Thread.sleep(3000);

	//------------Access - 1.Define User----------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b1 = new Actions(driver);
			WebElement Access = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b1.moveToElement(Access).build().perform();

	// Define User
			driver.findElement(By.xpath("//a[contains(text(),'Define User')]")).click();
			Thread.sleep(2000);

	// User Type drop-down

			WebElement UserType = driver.findElement(By.id("UserType"));
			Select b2 = new Select(UserType);
			b2.selectByIndex(2);
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// Email
			driver.findElement(By.xpath("//input[@id='Email']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Test@fastfacts.co");
			Thread.sleep(2000);
	// Save button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(3000);

	// cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(3000);

	//------------Access - 2.Define Role----------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b3 = new Actions(driver);
			WebElement Access1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b3.moveToElement(Access1).build().perform();
			Thread.sleep(2000);

	// Define Role
			driver.findElement(By.xpath("//a[contains(text(),'Define Role')]")).click();
			Thread.sleep(2000);

	// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Create Role pop-up screen

	// Role Name
			driver.findElement(By.xpath("//input[@id='RoleName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='RoleName']")).sendKeys("TEST");
			Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	// ----------------Access - 3.User Role Mapping--------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b4 = new Actions(driver);
			WebElement Access2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b4.moveToElement(Access2).build().perform();
			Thread.sleep(2000);

	// User Role Mapping
			driver.findElement(By.xpath("//a[contains(text(),'User Role Mapping')]")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// Update User Role pop-up screen
	// User Name
			WebElement UserName = driver.findElement(By.xpath("//select[@id='AppUserID']"));
			Select b5 = new Select(UserName);
			b5.selectByIndex(2);

	// Role Name
			WebElement RoleName = driver.findElement(By.xpath("//select[@id='AppRoleID']"));
			Select b6 = new Select(RoleName);
			b6.selectByVisibleText("TEST");
	// Branch Name`
			WebElement BranchName = driver.findElement(By.xpath("//select[@id='CompanyID']"));
			Select b7 = new Select(BranchName);
			b7.selectByIndex(2);

	// Save button
	// driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/input")).click();
	// Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
	// Thread.sleep(3000);

	// cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(3000);

	// -----------------------Access - 4.Access Rights---------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b8 = new Actions(driver);
			WebElement Access3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b8.moveToElement(Access3).build().perform();
			Thread.sleep(2000);

	// Access Rights
			driver.findElement(By.xpath("//a[contains(text(),'Access Rights')]")).click();
			Thread.sleep(2000);

	// Role Name
			WebElement RoleName1 = driver.findElement(By.xpath("//Select[@id='AppRoleID']"));
			Select b9 = new Select(RoleName1);
			b9.selectByVisibleText("TEST");
			Thread.sleep(2000);

	// Read Check-box
			driver.findElement(By.id("check_allRead")).click();
			Thread.sleep(2000);
	// Add Check-box
			driver.findElement(By.id("check_allAdd")).click();
			Thread.sleep(2000);
	// Edit Check-box
			driver.findElement(By.id("check_allEdit")).click();
			Thread.sleep(2000);
	// Delete Check-box
			driver.findElement(By.id("check_allDelete")).click();
			Thread.sleep(2000);
	// Java script executor
			WebElement Save = driver.findElement(By.xpath("//*[@id=\"divMenuGrid\"]/p/input"));
			JavascriptExecutor je0 = (JavascriptExecutor) driver;
			je0.executeScript("arguments[0].scrollIntoView()", Save);
	// Save button
			driver.findElement(By.xpath("//*[@id=\"divMenuGrid\"]/p/input")).click();
			Thread.sleep(3000);
			
	// Error Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// --------------------Access - 5.Activate Emails------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b10 = new Actions(driver);
			WebElement Access4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b10.moveToElement(Access4).build().perform();
			Thread.sleep(2000);

	// Activate Emails
			driver.findElement(By.xpath("//a[contains(text(),'Activate Emails')]")).click();
			Thread.sleep(2000);

	// Check All Check-box
			driver.findElement(By.xpath("//input[@id='check_all']")).click();
			Thread.sleep(2000);

	// Scroll down a page
			WebElement Previous = driver.findElement(By.xpath("//*[@id='entityTable_previous']"));
			JavascriptExecutor je1 = (JavascriptExecutor) driver;
			je1.executeScript("arguments[0].scrollIntoView()", Previous);
			Thread.sleep(3000);

	// Activate button
	// driver.findElement(By.xpath("(//input[@name='name'])[1]")).click();
	// Thread.sleep(3000);

	// Deactivate button
			driver.findElement(By.xpath("(//input[@name='name'])[2]")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// ----------------Access -6. Update Employee Password------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Access
			Actions b11 = new Actions(driver);
			WebElement Access5 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[2]/a"));
			b11.moveToElement(Access5).build().perform();
			Thread.sleep(2000);

	// Update Employee Password
			driver.findElement(By.xpath("//a[contains(text(),'Update Employee Password')]")).click();
			Thread.sleep(2000);

	//// Edit Link
	//driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	//Thread.sleep(2000);
	//
	//// New Password
	//driver.findElement(By.id("NewPassword")).sendKeys("12345678");
	//Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("(//input[@class='btn
	// btn-primary'])[3]")).click();
	// Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	// Thread.sleep(2000);
	// driver.close();

	//// Cancel button
	//driver.findElement(By.xpath("//button[@class='btn']")).click();
	//Thread.sleep(3000);

	// ****************************General*******************************
	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// General
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'General')]")).click();
			Thread.sleep(2000);

	// (i)Employee Setting

	// Employee Type
			WebElement EmployeeType = driver.findElement(By.xpath("//Select[@id='IsContractor']"));
			Select c = new Select(EmployeeType);
			Thread.sleep(2000);
			c.selectByVisibleText("Permanent");

	// Generate Code
			driver.findElement(By.xpath("(//input[@id='CodeGenerateType'])[1]")).click();
			Thread.sleep(2000);

	// Probation Period
			driver.findElement(By.xpath("(//input[@id='EmployeeSettings_ProbationPeriod'])[1]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@id='EmployeeSettings_ProbationPeriod'])[1]")).sendKeys("5");
			Thread.sleep(2000);

	// Notice Period
			driver.findElement(By.xpath("(//input[@id='EmployeeSettings_NoticePeriod'])[1]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@id='EmployeeSettings_NoticePeriod'])[1]")).sendKeys("10");
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Save1 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
			JavascriptExecutor je2 = (JavascriptExecutor) driver;
			je2.executeScript("arguments[0].scrollIntoView()", Save1);
			Thread.sleep(2000);

	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
			Actions act1 = new Actions(driver);
	// scroll up a page
			act1.sendKeys(Keys.PAGE_UP).build().perform();

	// (ii)Leave Year

	// Leave year option
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);

	// (iii)PDF Password Policy
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'PDF Password Policy')]")).click();
			Thread.sleep(2000);

	// Do you want password to have password policy radio button

	// Yes
	// driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[1]")).click();
	// Thread.sleep(2000);

	// No
			driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[2]")).click();
			Thread.sleep(2000);

	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// (iv)Additional Information
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Additional Information')]")).click();
			Thread.sleep(2000);

	// Corporate Identification Number

			driver.findElement(By.id("CompanyIDNumber")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("CompanyIDNumber")).sendKeys("TEST");

	// Permanent Account Number

			driver.findElement(By.id("CompanyPAN")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("CompanyPAN")).sendKeys("PANNOTAVBL");

	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// (v)Configure TDS
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Configure TDS')]")).click();
			Thread.sleep(2000);

	// TDS Applicable radio button
	// Yes
			driver.findElement(By.xpath("(//input[@id='IsApplicable'])[1]")).click();
			Thread.sleep(3000);

	// Update TDS Deduction date as 7th of the Next Month
	// No
			driver.findElement(By.xpath("(//input[@id='IsDeductionDateas7thNextMonth'])[2]")).click();
			Thread.sleep(3000);

	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(3000);

	// (vi)Login Password Policy

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Login Password Policy')]")).click();
			Thread.sleep(2000);

	// TDS Applicable radio button
	// Yes
	// driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[1]")).click();
	// Thread.sleep(3000);

	//// No
	//driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[2]")).click();
	//Thread.sleep(2000);
	//
	//// DefaultPassword
	//
	//// driver.findElement(By.xpath("//a[contains(text(),'DefaultPassword')]")).sendKeys("DefaultPassword");
	//// Thread.sleep(2000);
	//
	//// scroll down a page
	//Actions act2 = new Actions(driver);
	//act2.sendKeys(Keys.PAGE_DOWN).build().perform();
	//
	//// Save button
	//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	//Thread.sleep(2000);
	//
	//// Successful Message pop-up screen
	//driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	//Thread.sleep(2000);
	//
	//// scroll up a page
	//Actions act3 = new Actions(driver);
	//act3.sendKeys(Keys.PAGE_UP).build().perform();
	//
	//// (vii)SMTP Settings
	//
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[contains(text(),'SMTP Settings')]")).click();
	//Thread.sleep(2000);
	//
	//// Host Name
	//driver.findElement(By.xpath("//input[@id='Host']")).clear();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='Host']")).sendKeys("smtp@gmail.com");
	//Thread.sleep(2000);
	//// User Name
	//driver.findElement(By.xpath("//input[@id='UserName']")).clear();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
	//
	//// Password
	//// driver.findElement(By.xpath("//input[@id='Password']")).clear();
	//// Thread.sleep(3000);
	//// driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("");
	//
	//// Port Number
	//driver.findElement(By.xpath("//input[@id='PortNumber']")).clear();
	//Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@id='PortNumber']")).sendKeys("587");
	//
	//// Save button
	//// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	//// Thread.sleep(3000);
	//
	//// Successful Message pop-up screen
	//// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	//// Thread.sleep(2000);

	// **********Statutory - 1. Configure PF****************

	// configurations Tab

			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Statutory
			Actions n = new Actions(driver);
			WebElement Statutory = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/a"));
			n.moveToElement(Statutory).build().perform();

	// Configure PF
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/ul/li[1]/a")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// update PF Configuration pop-up screen
	// Effective Month To
			WebElement EffectiveMonthTo = driver.findElement(By.xpath("//*[@id=\"PFConfiguration_ToYear\"]"));
			Select b12 = new Select(EffectiveMonthTo);
			b12.selectByIndex(3);
			Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	// Thread.sleep(3000);

	// Cancel button
			driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/button")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	// Thread.sleep(2000);

	// ----------Statutory - 2.Configure ESIC-------------------

	// configurations Tab

			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Statutory
			Actions n1 = new Actions(driver);
			WebElement Statutory1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/a"));
			n1.moveToElement(Statutory1).build().perform();

	// Configure ESIC
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/ul/li[2]/a")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// update PF Configuration pop-up screen
	// Effective To
			WebElement EffectiveTo = driver.findElement(By.xpath("//*[@id=\"ToYear\"]"));
			Select b13 = new Select(EffectiveTo);
			b13.selectByIndex(3);
			Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	// Thread.sleep(3000);

	// Cancel button
			driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/button")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	// Thread.sleep(2000);

	//--------------Statutory - 3.Configure P Tax---------------------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Statutory
			Actions n2 = new Actions(driver);
			WebElement Statutory2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/a"));
			n2.moveToElement(Statutory2).build().perform();

	// Configure P Tax
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/ul/li[3]/a")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// Configure P Tax page

			driver.findElement(By.xpath("//*[@id=\"PTaxCode\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"PTaxCode\"]")).sendKeys("GUJ");
			WebElement AddRange = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]"));
			JavascriptExecutor je3 = (JavascriptExecutor) driver;
			je3.executeScript("arguments[0].scrollIntoView()", AddRange);

	// Save button
	// driver.findElement(By.xpath("//*[@id="btnSubmit"]")).click();
	// Thread.sleep(3000);

	// Cancel button
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/form/div[3]/a")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//*[@id="divMessage"]/div/a")).click();
	// Thread.sleep(2000);

	//------------Statutory - Configure LWF-----------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Statutory
			Actions n3 = new Actions(driver);
			WebElement Statutory3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/a"));
			n3.moveToElement(Statutory3).build().perform();

	// Configure LWF
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[4]/ul/li[4]/a")).click();
			Thread.sleep(2000);

	// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Configure LWF page

	// LWF State
			WebElement LWFState = driver.findElement(By.xpath("//select[@id='LWFApplicable_StateID']"));
			Select b14 = new Select(LWFState);
			b14.selectByVisibleText("Tamil Nadu");

	// LWF Establishment Code
			driver.findElement(By.xpath("//input[@id='LWFApplicable_LWFEstablishmentCode']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='LWFApplicable_LWFEstablishmentCode']")).sendKeys("Test");
			Thread.sleep(2000);

			WebElement Save2 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
			JavascriptExecutor je5 = (JavascriptExecutor) driver;
			je5.executeScript("arguments[0].scrollIntoView()", Save2);
			Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//*[@id="divMessage"]/div/a")).click();
	// Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(3000);

	// -------------------Bonus - Configure Bonus--------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Bonus
			Actions n4 = new Actions(driver);
			WebElement Bonus = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/a"));
			n4.moveToElement(Bonus).build().perform();

	// Configure Bonus
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/ul/li[1]/a")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Create Bonus pop-up screen
	// Bonus Name
			driver.findElement(By.xpath("//input[@id='BonusAsPerAct_BonusName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='BonusAsPerAct_BonusName']")).sendKeys("Test1");

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(3000);

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//*[@id="divMessage"]/div/a")).click();
	// Thread.sleep(2000);

	//-------------Bonus - Statewise Minimum Wages----------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Bonus
			Actions n5 = new Actions(driver);
			WebElement Bonus1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/a"));
			n5.moveToElement(Bonus1).build().perform();

	// Statewise Minimum Wages
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/ul/li[2]/a")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// State Wages Update pop-up screen
	// Minimum Wages
			driver.findElement(By.xpath("//*[@id=\"MinimumWages\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"MinimumWages\"]")).sendKeys("8580.00");

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']").click();

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(3000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("(//a[contains(text(),'×')])[1]")).click();
	// Thread.sleep(2000);

	//-----------Configure Gratuity--------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Configure Gratuity
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[6]/a")).click();
			Thread.sleep(2000);

	// Configure Gratuity page
	// Max Amount Payable
			driver.findElement(By.xpath("//input[@id='GratuityConfig_MaxAmountPayable']")).sendKeys("1000");
			Thread.sleep(2000);

	// Components Considered
			WebElement ComponentsConsidered = driver.findElement(By.xpath("	//*[@id=\"SalaryComponentIDs\"]"));
			Select b15 = new Select(ComponentsConsidered);
			b15.selectByVisibleText("Basic Salary (BAS)");
			Thread.sleep(2000);

	// Save button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	// History button
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"form0\"]/div/div[6]/div/div/a")).click();
	//Thread.sleep(2000);

	// scroll down a page
	//Actions b8 = new Actions(driver);
	//a8.sendKeys(Keys.PAGE_DOWN).build().perform();
	//Thread.sleep(2000);

	// Back button
	//driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[4]/span/a")).click();
	//Thread.sleep(2000);

	// ----------------- Loan/Advance Master--------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Loan/Advance Master
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[7]/a")).click();
			Thread.sleep(2000);

	// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Create Loan/Advance pop-up screen
	// Type
			driver.findElement(By.xpath("//*[@id=\"Description\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Description\"]")).sendKeys("SAL ADV");
			Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	// Thread.sleep(2000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("(//a[contains(text(),'×')])[1]")).click();
	// Thread.sleep(2000);
	// Cancel button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	//---------------------Others - 1.Global Parameters-----------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Others
			Actions n6 = new Actions(driver);
			WebElement Others = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/a"));
			n6.moveToElement(Others).build().perform();

	// 1.Global Parameters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/ul/li[1]/a")).click();
			Thread.sleep(2000);

	// Penal TDS Rate applicable for employee not having valid PAN radio button
	// Yes
			driver.findElement(By.xpath("(//input[@id='IsPenalTdsForEmployeeForInvalidPAN'])[1]")).click();
			Thread.sleep(3000);
	// No
	// driver.findElement(By.xpath("(//input[@id='IsPenalTdsForEmployeeForInvalidPAN'])[2]")).click();
	// Thread.sleep(2000);

	// Scroll down Page
			WebElement Save3 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
			JavascriptExecutor je6 = (JavascriptExecutor) driver;
			je6.executeScript("arguments[0].scrollIntoView()", Save3);
			Thread.sleep(2000);

	// Save button
	// driver.findElement(By.xpath("(//input[@class='btn
	// btn-primary'])[1]")).click();
	// Thread.sleep(2000);

	// Successful Message pop-up screen
	// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
	// Thread.sleep(2000);

	// Reset button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
			Thread.sleep(2000);

	// Are you sure you want to reset? pop-up screen
	// No
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	// -------------Others - 2.Gross Salary Base--------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Others
			Actions n7 = new Actions(driver);
			WebElement Others1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/a"));
			n7.moveToElement(Others1).build().perform();

	// 2.Gross Salary Base
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/ul/li[2]/a")).click();
			Thread.sleep(2000);

	// Gross Salary Base
			WebElement GrossSalaryBase = driver.findElement(By.xpath("//*[@id=\"GrossSalary\"]"));
			Select b16 = new Select(GrossSalaryBase);
			b16.selectByVisibleText("Section 80CCD");
			Thread.sleep(2000);

	// Select
			driver.findElement(By.xpath("//*[@id=\"entityTable\"]/thead/tr/th[1]")).click();
			Thread.sleep(2000);

	// scroll down a page
			WebElement previous = driver.findElement(By.xpath("(//*[@id=\"entityTable_previous\"])"));
			JavascriptExecutor je4 = (JavascriptExecutor) driver;
			je4.executeScript("arguments[0].scrollIntoView()", previous);

	// Save button
			driver.findElement(By.xpath("(//*[@id=\"GrossSalSave\"])")).click();
			Thread.sleep(2000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//*[@id=\"divMessage\"]/div/a")).click();
			Thread.sleep(2000);

	// -------------Others - 3.Activate Components--------------------------

	// configurations Tab
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a")).click();
			Thread.sleep(2000);

	// Others
			Actions n8 = new Actions(driver);
			WebElement Others2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/a"));
			n8.moveToElement(Others2).build().perform();

	// 3.Activate Components
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[8]/ul/li[3]/a")).click();
			Thread.sleep(2000);

	// Select
			driver.findElement(By.xpath("//*[@id=\"check_all\"]")).click();
			Thread.sleep(2000);

	// scroll down a page
			WebElement previous1 = driver.findElement(By.xpath("(//*[@id=\"entityTable_previous\"])"));
			JavascriptExecutor je7 = (JavascriptExecutor) driver;
			je7.executeScript("arguments[0].scrollIntoView()", previous1);
			Thread.sleep(2000);

	// Save button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Successful Message pop-up screen
			driver.findElement(By.xpath("//*[@id=\"divMessage\"]/div/a")).click();
			Thread.sleep(2000);

	//-------------------------------------------Logout-------------------------------------------------------------
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
			Thread.sleep(5000);
			driver.close();

		}

	}
