package com.Paypac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Processing {

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

		// *********************************************************************************************
//		PROCESSING TITLE
//*********************************************************************************************
//**************Monthly Transaction**************************

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Monthly Transaction
		Actions act5 = new Actions(driver);
		WebElement MonthlyTransaction = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/ul/li[1]/a"));
		act5.moveToElement(MonthlyTransaction).build().perform();

// Employee Wise
		driver.findElement(By.xpath("//a[contains(text(),'Employee Wise')]")).click();
		Thread.sleep(2000);

// Branch Name
		WebElement BranchName8 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
		Select h = new Select(BranchName8);
		h.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

// Search Any Employee
		driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
		Thread.sleep(2000);
// Enter key
		Actions e2 = new Actions(driver);
		e2.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
// (i)Employee Salary Structure

// (ii)Employee Variable Parameter
		driver.findElement(By.xpath("//a[contains(text(),'Employee Variable Parameter')]")).click();
		Thread.sleep(2000);

// Add button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// Map Variable Parameter pop-up screen
// Variable Parameter -defect
// Value
		driver.findElement(By.xpath("//input[@id='VariableValue']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='VariableValue']")).sendKeys("1200");
		Thread.sleep(2000);

// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

// (iii)One Time Component
		driver.findElement(By.xpath("(//a[contains(text(),'One Time Component')])[3]")).click();
		Thread.sleep(2000);

// Edit Link
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		Thread.sleep(2000);

// Update OneTime Salary Component pop-up screen
// Salary Component
		WebElement SalaryComponent = driver
				.findElement(By.xpath("//select[@id='OneTimeSalaryComponent_SalaryComponent_SalaryComponentID']"));
		Select h1 = new Select(SalaryComponent);
		h1.selectByVisibleText("Leave Encashment (LEAVEENCASH)");
		Thread.sleep(2000);

// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

// (iv)Employee Payslip Message
		driver.findElement(By.xpath("//a[contains(text(),'Employee Payslip Message')]")).click();
		Thread.sleep(2000);

// Payslip Message
		driver.findElement(By.xpath("//textarea[@id='PayslipMessage']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='PayslipMessage']")).sendKeys("JULY MONTH PAY IN SLIP");
		Thread.sleep(2000);

// Save
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// successful Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);

// (v)Days
		driver.findElement(By.xpath("(//a[contains(text(),'Days')])[4]")).click();
		Thread.sleep(2000);
		;

//=============Bonus Processing====================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Bonus Processing
		driver.findElement(By.xpath("(//a[contains(text(),'Bonus Processing')])[1]")).click();
		Thread.sleep(2000);

// All Employees Radio button
		driver.findElement(By.xpath("(//input[@id='employeeFilter'])[1]")).click();
		Thread.sleep(2000);

// Process button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// scroll down a page
		Actions act6 = new Actions(driver);
		act6.sendKeys(Keys.PAGE_DOWN).build().perform();

// Continue button
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);

// Error Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);

//==============Gratuity Processing ===========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Gratuity Processing
		driver.findElement(By.xpath("(//a[contains(text(),'Gratuity Processing')])[1]")).click();
		Thread.sleep(2000);

// Employee Gratuity
// > 5 Years
		driver.findElement(By.xpath("(//input[@id='EmployeeGratuity'])[1]")).click();
		Thread.sleep(2000);
// Accident/Death
// driver.findElement(By.xpath("(//input[@id='EmployeeGratuity'])[2]")).click();
// Thread.sleep(2000);

//===================Arrear - Auto Arrear===================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Arrear
		Actions act7 = new Actions(driver);
		WebElement Arrear = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/ul/li[4]/a"));
		act7.moveToElement(Arrear).build().perform();

// Auto Arrear
		driver.findElement(By.xpath("//a[contains(text(),'Auto Arrear')]")).click();
		Thread.sleep(2000);

// Select All Employees
		driver.findElement(By.xpath("//input[@id='check_allEmployees']")).click();
		Thread.sleep(2000);

// Process button
// driver.findElement(By.xpath("(//input[@class='btn
// btn-primary'])[1]")).click();
// Thread.sleep(2000);

// UnProcess button
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);

// Error Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);

//==============Manual - Manual Arrear====================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Arrear
		Actions act8 = new Actions(driver);
		WebElement Arrear1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/ul/li[4]/a"));
		act8.moveToElement(Arrear1).build().perform();

// Manual Arrear
		driver.findElement(By.xpath("//a[contains(text(),'Manual Arrear')]")).click();
		Thread.sleep(2000);

//=============Salary Processing================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Salary Processing
		driver.findElement(By.xpath("//a[contains(text(),'Salary Processing')]")).click();
		Thread.sleep(2000);

// Continue button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);
// Select All Employees
		driver.findElement(By.xpath("//input[@id='employeeFilter']")).click();
		Thread.sleep(2000);

// Process button
// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
// Thread.sleep(2000);

// Cancel button
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		Thread.sleep(2000);

//==================Undo Salary Processing========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Undo Salary Processing
		driver.findElement(By.xpath("//a[contains(text(),'Undo Salary Processing')]")).click();
		Thread.sleep(2000);

// Select All Employees
		driver.findElement(By.xpath("//input[@id='employeeFilter']")).click();
		Thread.sleep(2000);

// Undo Process button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// Error Message pop-up screen
		driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(2000);

//===============Stop Salary========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Stop Salary
		driver.findElement(By.xpath("//a[contains(text(),'Stop Salary')]")).click();
		Thread.sleep(2000);

// Branch Name
		WebElement BranchName9 = driver.findElement(By.xpath("//select[@id='BranchID']"));
		Select h2 = new Select(BranchName9);
		h2.selectByVisibleText("DAMAN UNIT I AND II\r\n");
		Thread.sleep(2000);

// Search button
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(2000);

// Check-Box
		driver.findElement(By.xpath("//input[@id='check_all']	")).click();
		Thread.sleep(2000);

// scroll down a page
		WebElement Previous2 = driver.findElement(By.xpath("//a[@id='entityTableMini_previous']"));
		JavascriptExecutor je13 = (JavascriptExecutor) driver;
		je13.executeScript("arguments[0].scrollIntoView()", Previous2);
		Thread.sleep(3000);

// Stop Salary button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

// Reason pop-up screen
// Reason
		driver.findElement(By.xpath("//input[@id='Reason']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Reason']")).sendKeys("Test");
		Thread.sleep(2000);

// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//=====================Release Salary===============================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Release Salary
		driver.findElement(By.xpath("//a[contains(text(),'Release Salary')]")).click();
		Thread.sleep(2000);

// Financial Month
		WebElement FinancialMonth = driver.findElement(By.xpath("//select[@id='FinancialMonthID']"));
		Select h3 = new Select(FinancialMonth);
		h3.selectByVisibleText("April-22");
		Thread.sleep(2000);

// Branch Name
		WebElement BranchName10 = driver.findElement(By.xpath("//select[@id='BranchID']"));
		Select h4 = new Select(BranchName10);
		h4.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

// Search button
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(2000);

// Check-Box
		driver.findElement(By.xpath("//input[@id='check_all']")).click();
		Thread.sleep(2000);

// Release Salary button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

// Error message pop-up screen
		driver.findElement(By.xpath("(//a[contains(text(),'×')])[1]")).click();
		Thread.sleep(2000);

//================Estimate Gratuity=========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Estimate Gratuity
		driver.findElement(By.xpath("//a[contains(text(),'Estimate Gratuity')]")).click();
		Thread.sleep(2000);

// Branch Name
		WebElement BranchName11 = driver.findElement(By.xpath("//select[@id='BranchID']"));
		Select h5 = new Select(BranchName11);
		h5.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

// Components Considered
		WebElement ComponentsConsidered1 = driver.findElement(By.xpath("//select[@id='SalaryComponentIDs']"));
		Select h7 = new Select(ComponentsConsidered1);
		h7.selectByVisibleText("Basic Salary (BAS)");
		Thread.sleep(2000);

// Calculate Till Date
		WebElement CalculateTillDate = driver.findElement(By.xpath("//input[@id='CalculateTillDate']"));
		CalculateTillDate.sendKeys("07/15/2022" + Keys.ENTER);
		Thread.sleep(2000);

// Calculate button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

//================Close Month==========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Close Month
		driver.findElement(By.xpath("//a[contains(text(),'Close Month')]")).click();
		Thread.sleep(2000);

//// Financial Year
//WebElement FinancialMonth1 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//Select h6 = new Select(FinancialMonth1);
//h6.selectByVisibleText("Apr 2022 - Mar 2023");
//Thread.sleep(2000);
//
//// Close Link
//driver.findElement(By.xpath("(//a[contains(text(),'Close')])[2]")).click();
//Thread.sleep(2000);
//
//// Close Financial Month pop-up screen
//// Close icon
//driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//Thread.sleep(2000);

//====================Full and Final========================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Full and Final
		driver.findElement(By.xpath("//a[contains(text(),'Full and Final')]")).click();
		Thread.sleep(2000);

// Branch Name
		WebElement BranchName12 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
		Select h8 = new Select(BranchName12);
		h8.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

// Financial Month
		WebElement FinancialMonth2 = driver.findElement(By.xpath("//select[@id='ddlFinYearID']"));
		Select h9 = new Select(FinancialMonth2);
		h9.selectByVisibleText("Apr 2022 - Mar 2023");
		Thread.sleep(2000);

// Processed
		WebElement Processed = driver.findElement(By.xpath("//select[@id='ddlIsProc']"));
		Select h10 = new Select(Processed);
		h10.selectByVisibleText("No");
		Thread.sleep(2000);

// Select All Employees Check-Box
		driver.findElement(By.xpath("//input[@id='check_allEmployees']")).click();
		Thread.sleep(2000);

// Process button
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

// Do you want to process the salary? pop-up screen
// No button
		driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
		Thread.sleep(2000);

//=========Undo Bonus Processing======================================

// Processing Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
		Thread.sleep(2000);

// Undo Bonus Processing
		driver.findElement(By.xpath("//a[contains(text(),'Undo Bonus Processing')]")).click();
		Thread.sleep(2000);

// Select All Employees
		driver.findElement(By.xpath("//input[@id='employeeFilter']")).click();
		Thread.sleep(2000);

// Undo Process button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// Error Message pop-up screen
		driver.findElement(By.xpath("//a[@class='close']")).click();
		Thread.sleep(2000);

// =============================================Logout================================================================
		// Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
