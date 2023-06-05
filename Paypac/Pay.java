package com.Paypac;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;


public class Pay {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = (WebDriver) new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.paypac.in/Testing/");

		// Login
		// driver.get("http://localhost:82/Account/Login?ReturnUrl=%2f");
		// driver.getTitle();
		// Thread.sleep(2000);
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
//												  PAY TITLE
//***************************************************************************************

	// ************Define Financial Year*********************************

	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Define Financial Year /
	driver.findElement(By.xpath("//a[contains(text(),'Define Financial Year')]")).click();
	Thread.sleep(2000);

	// Details Link
	driver.findElement(By.xpath("//a[contains(text(),'Details ')]")).click();
	Thread.sleep(2000);
	// Financial Year Details pop-up screen

	// Close button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);
			
	// *****************Statutory Masters - 1. PF Branch Master****************
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Statutory Masters

	Actions c0 = new Actions(driver);
	WebElement Statutory0 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[2]/a"));
	c0.moveToElement(Statutory0).build().perform();

	// 1. PF Branch Master

	driver.findElement(By.xpath("//a[contains(text(),'PF Branch Master')]")).click();
	Thread.sleep(2000);

	// Edit Link

	driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
	Thread.sleep(2000);

	// Update PF Branch Master popup screen

	// PF Branch Details
	driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("DAMAN UNIT I AND II");
	Thread.sleep(2000);

	// PF Branch Address1
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).sendKeys("DAMAN UNIT I AND II");

	// Prefix
	driver.findElement(By.xpath("//input[@id='Prefix']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Prefix']")).sendKeys("DA");
	Thread.sleep(2000);

	// P.F Status Code
	driver.findElement(By.xpath("//input[@id='PFStatusCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='PFStatusCode']")).sendKeys("123");
	Thread.sleep(2000);

	// Region Code
	driver.findElement(By.xpath("//input[@id='ePFRegionCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ePFRegionCode']")).sendKeys("123");
	Thread.sleep(2000);

	// Office Code
	driver.findElement(By.xpath("//input[@id='ePFOfficeCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ePFOfficeCode']")).sendKeys("123");
	Thread.sleep(2000);

	// Establishment Code
	driver.findElement(By.xpath("//input[@id='ePFEstablishmentCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ePFEstablishmentCode']")).sendKeys("12345");
	Thread.sleep(2000);

	// Extension Code
	driver.findElement(By.xpath("//input[@id='ePFExtensionCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ePFExtensionCode']")).sendKeys("1234");
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);
			
	// ==============Statutory Masters - 2.ESIC Branch Master=======================
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Statutory Masters

	Actions c1 = new Actions(driver);
	WebElement Statutory6 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[2]/a"));
	c1.moveToElement(Statutory6).build().perform();

	// 2.ESIC Branch Master

	driver.findElement(By.xpath("//a[contains(text(),'ESIC Branch Master')]")).click();
	Thread.sleep(2000);

	// Edit Link

	driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
	Thread.sleep(2000);

	// Update ESIC Branch Master popup screen

	// Employer Code No3
	driver.findElement(By.xpath("//input[@id='EmployerCodeNo']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='EmployerCodeNo']")).sendKeys("54321");
	Thread.sleep(2000);

	// ESIC Branch Name
	driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("DAMAN UNIT I AND II");
	Thread.sleep(2000);

	// ESIC Branch Address1
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).sendKeys("DAMAN UNIT I AND II");
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);

	// =============Statutory Masters - 3.PTax Branch Master=============
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Statutory Masters

	Actions c2 = new Actions(driver);
	WebElement Statutory7 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[2]/a"));
	c2.moveToElement(Statutory7).build().perform();

	// 3.PTax Branch Master
	driver.findElement(By.xpath("//a[contains(text(),'PTax Branch Master')]")).click();
	Thread.sleep(2000);

	// Edit Link

	driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
	Thread.sleep(2000);

	// Update PTax Branch Master popup screen

	// P.Tax Branch Name
	driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("MUMBAI");
	Thread.sleep(2000);
	// P.Tax Registration Number
	driver.findElement(By.xpath("//input[@id='RegistrationNumber']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='RegistrationNumber']")).sendKeys("123");
	Thread.sleep(2000);
	// P.Tax Branch Address 1
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='BranchAddress1']")).sendKeys("123");
	Thread.sleep(2000);
	// State
	WebElement State = driver.findElement(By.xpath("//select[@id='City_StateID']"));
	Select c3 = new Select(State);
	c3.selectByVisibleText("Maharashtra");
	Thread.sleep(2000);

	// City
	WebElement City = driver.findElement(By.xpath("//select[@id='CityID']"));
	Select c4 = new Select(City);
	c4.selectByVisibleText("MUMBAI");
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);

	//==================Statutory Masters - 4.TDS Branch Master=================							

	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Statutory Masters

	Actions c5 = new Actions(driver);
	WebElement Statutory8 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[2]/a"));
	c5.moveToElement(Statutory8).build().perform();

	// 4. TDS Branch Master
	driver.findElement(By.xpath("//a[contains(text(),'TDS Branch Master')]")).click();
	Thread.sleep(2000);

	// Edit Link

	driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
	Thread.sleep(2000);

	// Update PTax Branch Master popup screen
	// TDS Branch Code
	driver.findElement(By.xpath("//input[@id='BranchCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='BranchCode']")).sendKeys("1");
	Thread.sleep(2000);

	// TDS Branch Name
	driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("MUMBAI");
	Thread.sleep(2000);

	// Type of Deductor Government
	// NonGovernment
	driver.findElement(By.xpath("(//input[@id='IsGovtDeductor'])[2]")).click();
	Thread.sleep(2000);
	// Category of Deductor
	WebElement CategoryOfDeductor = driver.findElement(By.xpath("//select[@id='TDSDeductorCategoryID']"));
	Select c6 = new Select(CategoryOfDeductor);
	c6.selectByVisibleText("Company");
	Thread.sleep(2000);

	// TAN
	driver.findElement(By.xpath("//input[@id='TAN']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='TAN']")).sendKeys("AAAA99999B");
	Thread.sleep(2000);
	// Branch Details
	// TAN Branch Address 1
	driver.findElement(By.xpath("//textarea[@id='TANBranchAddress1']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='TANBranchAddress1']")).sendKeys("MUMBAI");
	Thread.sleep(2000);

	// TAN Branch Address 2
	driver.findElement(By.xpath("//textarea[@id='TANBranchAddress2']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='TANBranchAddress2']")).sendKeys("MUMBAI");
	Thread.sleep(2000);

	// State
	WebElement State1 = driver.findElement(By.xpath("//select[@id='StateID']"));
	Select c7 = new Select(State1);
	c7.selectByVisibleText("Maharashtra");
	Thread.sleep(2000);

	// City
	WebElement City1 = driver.findElement(By.xpath("//select[@id='CityID']"));
	Select c8 = new Select(City1);
	c8.selectByVisibleText("MUMBAI");
	Thread.sleep(2000);

	// PinCode
	driver.findElement(By.xpath("//input[@id='PinCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='PinCode']")).sendKeys("122015");
	Thread.sleep(2000);
	// Responsible Person's Details

	// Name
	driver.findElement(By.xpath("//input[@id='ResponsiblePerson']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ResponsiblePerson']")).sendKeys("Mr. Debashis S. Tripathy");
	Thread.sleep(2000);

	// Designation
	driver.findElement(By.xpath("//input[@id='AuthDesignation']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AuthDesignation']")).sendKeys("V P Accounts & Finance");
	Thread.sleep(2000);

	// PAN
	driver.findElement(By.xpath("//input[@id='TanRegistrationNo']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='TanRegistrationNo']")).sendKeys("ACKPT5698P");
	Thread.sleep(2000);
	// Address Details

	// Address 1
	driver.findElement(By.xpath("//textarea[@id='AuthAddress1']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='AuthAddress1']")).sendKeys("MUMBAI");
	Thread.sleep(2000);
	// Contact Details

	// Email Address
	driver.findElement(By.xpath("//input[@id='AuthEmail']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AuthEmail']")).sendKeys("Test@gmail.com");
	Thread.sleep(2000);
	// STD Code
	driver.findElement(By.xpath("//input[@id='AuthSTDCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AuthSTDCode']")).sendKeys("123");
	Thread.sleep(2000);

	// Phone
	driver.findElement(By.xpath("//input[@id='AuthPhone']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AuthPhone']")).sendKeys("2453637");
	Thread.sleep(2000);

	// Mobile No
	driver.findElement(By.xpath("//input[@id='AuthMobileNo']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='AuthMobileNo']")).sendKeys("9999999999");
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);

	// ===========Total Days Masters - Total Day Parameter===============
	// Total Days Masters
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Total Days Masters
	Actions c9 = new Actions(driver);
	WebElement TotalDaysMasters = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[3]/a"));
	c9.moveToElement(TotalDaysMasters).build().perform();

	// (i)Total Day Parameter
	driver.findElement(By.xpath("//a[contains(text(),'Total Day Parameter')]")).click();
	Thread.sleep(2000);

	// Add button
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	// Create Total Days pop-up screen
	// Parameter Code
	driver.findElement(By.xpath("//input[@id='ParameterCode']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ParameterCode']")).sendKeys("TEST");
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);

	// =============Total Days Masters - (ii)Total Day Values=======================

	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Total Days Masters
	Actions c10 = new Actions(driver);
	WebElement TotalDaysMasters1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[3]/a"));
	c10.moveToElement(TotalDaysMasters1).build().perform();

	// (ii)Total Day Values
	driver.findElement(By.xpath("//a[contains(text(),'Total Day Values')]")).click();
	Thread.sleep(2000);

	// Details Link
	driver.findElement(By.xpath("//a[contains(text(),'Details ')]")).click();
	Thread.sleep(2000);

	// Total Day Values pop-up screen

	// Close button
	driver.findElement(By.xpath("//button[@class='btn']")).click();
	Thread.sleep(2000);

	// =================Define Variable=======================
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Define Variable

	driver.findElement(By.xpath("//a[contains(text(),'Define Variable')]")).click();
	Thread.sleep(2000);

	// Add button
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	// Create Variable page
	// Variable Name
	driver.findElement(By.xpath("//input[@id='VariableName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='VariableName']")).sendKeys("TEST1");
	Thread.sleep(2000);

	// Employee Wise
	// Yes
	driver.findElement(By.xpath(" (//input[@id='IsEmployeewise'])[1]")).click();
	Thread.sleep(2000);

	// Consider for Arrears Yes No
	driver.findElement(By.xpath("(//input[@id='IsArrear'])[2]")).click();
	Thread.sleep(2000);

	// Carry Forward Value to next month
	driver.findElement(By.xpath("(//input[@id='CarryForwardtoNextMonth'])[2]")).click();
	Thread.sleep(2000);

	// Back button
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	// =================Define Components - (i)Salary Components==================
	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
	// Define Components
	Actions c11 = new Actions(driver);
	WebElement DefineComponents = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[5]/a"));
	c11.moveToElement(DefineComponents).build().perform();

	// (i)Salary Components
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[5]/ul/li[1]/a")).click();
	Thread.sleep(2000);

	// Edit icon
	driver.findElement(By.xpath("//*[@id=\"entityTable\"]/tbody/tr[1]/td[3]/a[1]/i")).click();
	Thread.sleep(2000);

	// Basic Details
	// Display Sequence
	driver.findElement(By.xpath("//input[@id='SalaryComponent_DisplaySequence']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='SalaryComponent_DisplaySequence']")).sendKeys("1");
	Thread.sleep(2000);

	// Display Name
	driver.findElement(By.xpath("//input[@id='SalaryComponent_PayslipName']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='SalaryComponent_PayslipName']")).sendKeys("Basic Salary");
	Thread.sleep(2000);

	// Calculated
	// No
	driver.findElement(By.xpath("(//input[@id='SalaryComponent_ComponentDrivenTypeNo'])")).click();
	Thread.sleep(2000);

	// Allow Employees to Opt
	// No
	driver.findElement(By.xpath("(//input[@id='SalaryComponent_CanEmployeeEditNo'])")).click();
	Thread.sleep(2000);

	// Round Off
	// Yes
	driver.findElement(By.xpath("(//input[@id='roundOff'])[1]")).click();
	Thread.sleep(2000);
	// scroll-dowm page
	WebElement AddRange1 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	JavascriptExecutor je8 = (JavascriptExecutor) driver;
	je8.executeScript("arguments[0].scrollIntoView()", AddRange1);

	// Statutory Settings

	// Consider for Arrears
	// No
	driver.findElement(By.xpath("(//input[@id='SalaryComponent_IsConsideredForArrearCalculationYes'])[1]")).click();
	Thread.sleep(2000);
	// Tax Deduction Settings

	// Estimate for T.D.S.
	// Yes
	driver.findElement(By.xpath("(//input[@id='SalaryComponent_IsEstimateforTDSYes'])[1]")).click();
	Thread.sleep(2000);

	// Deduct Incremental Tax
	// No
	driver.findElement(By.xpath("(//input[@id='SalaryComponent_IsDeductIncrementalTaxNo'])[1]")).click();
	Thread.sleep(2000);

	// SalTDS Code
	WebElement SalTDSCode = driver.findElement(By.xpath("//select[@id='SalaryComponent_RuleCodeID']"));
	Select c12 = new Select(SalTDSCode);
	c12.selectByVisibleText("Basic Salary");

	// Cancel button
	driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
	Thread.sleep(2000);

	//====================Define Components - (ii)Salary Group	==============================		

	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Define Components
	Actions c13 = new Actions(driver);
	WebElement DefineComponents1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[5]/a"));
	c13.moveToElement(DefineComponents1).build().perform();

	// (ii)Salary Group
	driver.findElement(By.xpath("//a[contains(text(),'Salary Group')]")).click();
	Thread.sleep(2000);

	// Add button
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	// Configure Salary Group page

	// Description
	driver.findElement(By.xpath("//input[@id='SalaryDescription']")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='SalaryDescription']")).sendKeys("earning");
	Thread.sleep(2000);

	// Salary Components
	// WebElement SalaryComponents =
	// driver.findElement(By.xpath("//*[@id=\"SalaryComponentIDs\"]"));
	// Actions c10 = new Select(SalaryComponents);
	// p10.selectByVisibleText("Food Coupons (FOODCOUPON)");

	// scroll down a page
	WebElement save = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	JavascriptExecutor je9 = (JavascriptExecutor) driver;
	je9.executeScript("arguments[0].scrollIntoView()", save);
	Thread.sleep(2000);

	// Cancel button
	driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
	Thread.sleep(2000);

	// =================Define Budget====================

	// Pay Title
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);

	// Define Budget
	driver.findElement(By.xpath("//a[contains(text(),'Define Budget')]")).click();
	Thread.sleep(2000);

	// Financial Year
	WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
	Select c14 = new Select(FinancialYear);
	c14.selectByVisibleText("Apr 2022 - Mar 2023");

	// Month - Defect
	// WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
	// Select c15 = new Select(Month);
	// p15.selectByVisibleText("May-22");

	// Proceed button
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	Thread.sleep(2000);

	//========================================Logout=================================================================
	// Logout
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
	Thread.sleep(5000);
	driver.close();
}

	}

