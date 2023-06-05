package com.Paypac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Employee {

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

		// *********************************************************************************************
//											EMPLOYEE TITLE
		// *********************************************************************************************
		// *********************************Employee Masters********************************************
		
		//Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		
		//Employee Masters
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		//Branch Name
		WebElement BranchName2 = driver.findElement(By.xpath("//Select[@id='ddlBranchID']"));
		Select p = new Select(BranchName2);
		p.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);
		
		//Edit Link
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
		Thread.sleep(2000);

		// Employee Update page
		// Basic Details
		// First Name
		// driver.findElement(By.xpath("//input[@id='EmployeeProfessionalDetail_FirstName']")).clear();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='EmployeeProfessionalDetail_FirstName']")).sendKeys("Debadwiti");
		// Thread.sleep(2000);
		// Last Name
		// driver.findElement(By.xpath("//input[@id='EmployeeProfessionalDetail_LastName']")).clear();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@id='EmployeeProfessionalDetail_LastName']")).sendKeys(".");
		// Thread.sleep(2000);
		// Gender
		// WebElement Gender =
		// driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_GenderID']"));
		// Select p1 = new Select(Gender);
		// Thread.sleep(2000);
		// p1.selectByVisibleText("Male");
		// Thread.sleep(2000);

		// Professional Details
		// Designation
		// WebElement Designation =
		// driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_DesignationID']"));
		// Select p3 = new Select(Designation);
		// Thread.sleep(2000);
		// p3.selectByVisibleText("Peon cum Packer");

		// Employee Status
		// WebElement EmployeeStatus =
		// driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_Status']"));
		// Select p4 = new Select(EmployeeStatus);
		// Thread.sleep(2000);
		// p4.selectByVisibleText("Active");

		// TEST*
		// WebElement TEST =
		// driver.findElement(By.xpath("//select[@id='EmployeeUDM_1__UDMDataID']"));
		// Select p5 = new Select(TEST);
		// Thread.sleep(2000);
		// p5.selectByVisibleText("1");

		// scroll-dowm page
		WebElement AddRange2 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
		JavascriptExecutor je10 = (JavascriptExecutor) driver;
		je10.executeScript("arguments[0].scrollIntoView()", AddRange2);
		Thread.sleep(2000);

		// back button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
	
	// ===================Map Components==================
	
		// Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		
		// Map Components
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		// Branch Name
		WebElement BranchName3 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
		Select p6 = new Select(BranchName3);
		p6.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);
		// Search Any Employee
		driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
		Thread.sleep(2000);
		// Enter key
		Actions e = new Actions(driver);
		e.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

		// Scroll a page
		WebElement Previous1 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je11 = (JavascriptExecutor) driver;
		je11.executeScript("arguments[0].scrollIntoView()", Previous1);

		// Map Salary Components
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Employee Update page
		// Edit Link
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);
		
		// Edit Mapped Component pop-up screen
		// Monthly
		driver.findElement(By.xpath("//input[@id='ComponentValue']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ComponentValue']")).sendKeys("1");
		Thread.sleep(2000);
		// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
		// ============Additional Details===================
	
		// Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
				
		// Additional Details
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		// Branch Name
		WebElement BranchName4 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
		Select p7 = new Select(BranchName4);
		p7.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

		// Search Any Employee
		driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
		Thread.sleep(2000);
		// Enter key
		Actions e1 = new Actions(driver);
		e1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		// 1.Employee Disbursement Information
		// Payment Type
		WebElement PaymentType = driver
				.findElement(By.xpath("//select[@id='EmployeeDisbursementDetailSal_PaymentTypeID']"));
		Select p8 = new Select(PaymentType);
		Thread.sleep(2000);
		p8.selectByVisibleText("Bank Transfer");
		// IFSC Code
		driver.findElement(By.xpath("//input[@id='EmployeeDisbursementDetailSal_IFSCCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EmployeeDisbursementDetailSal_IFSCCode']")).sendKeys("TEST");
		Thread.sleep(2000);
		// Account No
		driver.findElement(By.xpath("//input[@id='EmployeeDisbursementDetailSal_AccountNo']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='EmployeeDisbursementDetailSal_AccountNo']")).sendKeys("TEST");
		Thread.sleep(2000);
		// scroll-dowm page
		WebElement AddRange3 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
		JavascriptExecutor je12 = (JavascriptExecutor) driver;
		je12.executeScript("arguments[0].scrollIntoView()", AddRange3);
		Thread.sleep(2000);
		// Cancel button
		driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
		Thread.sleep(2000);
		// Are you sure you want to reset? pop-up screen
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

		// 2.Employee Statutory Details
				driver.findElement(By.xpath("//a[contains(text(),'Employee Statutory Details')]	")).click();
		Thread.sleep(2000);

		//// Provident Fund
		//// P.F. Applicable
		//// Yes
		// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPFApplicable'])[2]")).click();
		// Thread.sleep(2000);
		//// Consider Max Salary for P.F. Deduction
		//// Yes
		// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsEPSApplicable'])[1]")).click();
		// Thread.sleep(2000);
		//// E.P.S. Applicable
		//// Yes
		// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsMaxSalForPFDeduction'])[1]")).click();
		// Thread.sleep(2000);
		//// Consider Max Salary for P.F. Contribution
		//// Yes
		// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsMaxSalForPFContribution'])[1]")).click();
		// Thread.sleep(2000);
		//
		//// scroll-dowm page
		// WebElement AddRange4 = driver.findElement(By.xpath("(//input[@class='btn
		//// btn-primary'])[1]"));
		// JavascriptExecutor je13 = (JavascriptExecutor) driver;
		// je13.executeScript("arguments[0].scrollIntoView()", AddRange4);
		//// Clear button
		// driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
		// Thread.sleep(2000);
		//
		//// scroll up a page
		// Actions a = new Actions(driver);
		// a.sendKeys(Keys.PAGE_UP).build().perform();
//						
		//// scroll-up page
		// WebElement sc =
		//// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPTaxApplicable'])[2]"));
		// JavascriptExecutor je14 = (JavascriptExecutor) driver;
		// je14.executeScript("arguments[0].scrollIntoView()", sc);
		//
		//// scroll-up page
		// WebElement sc1 =
		//// driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPFApplicable'])[2]"));
		// JavascriptExecutor je15 = (JavascriptExecutor) driver;
		// je15.executeScript("arguments[0].scrollIntoView()", sc1);

		
		// 3. Employee HR Information
		driver.findElement(By.xpath("//a[contains(text(),'Employee HR Information')]")).click();
		Thread.sleep(2000);

		// scroll-down page
		Actions act3 = new Actions(driver);
		act3.sendKeys(Keys.PAGE_UP).build().perform();

		// scroll-up page
		Actions act4 = new Actions(driver);
		act4.sendKeys(Keys.PAGE_UP).build().perform();
		// 4. Employee Document
		driver.findElement(By.xpath("//a[contains(text(),'Employee Document')]")).click();
		Thread.sleep(2000);
	
		// ===========================Map Loan===========================
		
		// Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);

		// Map Loan
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[4]/a")).click();
		Thread.sleep(2000);

		// Branch Name
		WebElement BranchName5 = driver.findElement(By.xpath("//select[@id='BranchID']"));
		Select p9 = new Select(BranchName5);
		p9.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);

		// Search button
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(2000);

		// Map Link
		// driver.findElement(By.xpath("//a[contains(text(),'Map')]")).click();
		// Thread.sleep(2000);
		// scroll down a page
		// Thread.sleep(2000);
		// WebElement back
		// =driver.findElement(By.xpath("/html/body/div[2]/div/div/section/form/div[2]/a"));
		// JavascriptExecutor je16 = (JavascriptExecutor) driver;
		// je16.executeScript("arguments[0].scrollIntoView()",back);
		// Back button
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("///a[@class='btn btn-secondary']")).click();
		// Thread.sleep(2000);
		// Map Loan page
		// Name
		// WebElement Name =
		// driver.findElement(By.xpath("//select[@id='EmployeeLoan_LoanID']"));
		// Select p10 = new Select(Name);
		// b10.selectByVisibleText("TEST");
		// scroll-dowm page
		// WebElement AddRange3 =
		// driver.findElement(By.xpath("(//input[@id='btnSave'])[1]"));
		// JavascriptExecutor je17 = (JavascriptExecutor) driver;
		// je17.executeScript("arguments[0].scrollIntoView()", AddRange3);
		// Back button
		// driver.findElement(By.xpath("//*[@id=\"maindiv\"]/div[2]/a")).click();
		// Thread.sleep(2000);
		
		// ==================Map Advance========================================
		
		// Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		
		// Map Advance
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[5]/a")).click();
		Thread.sleep(2000);

		// Branch Name
		WebElement BranchName6 = driver.findElement(By.xpath("//select[@id='BranchID']"));
		Select p11 = new Select(BranchName6);
		p11.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);
		// Search button
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Thread.sleep(2000);
		// Map Link
		// driver.findElement(By.xpath("//a[contains(text(),'Map')]")).click();
		// Thread.sleep(2000);
		//	testCase.log(Status.INFO,"Navigating to Map Advance Details page");
		// Map Advance Details page
		// Name - Defect

		// Cancel button
		// driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		// Thread.sleep(2000);
		
		// ===============Transfer Details======================================
					 
		// Employee Title
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		
		// Transfer Details
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		
		// Branch Name
		WebElement BranchName7 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
		Select p12 = new Select(BranchName7);
		p12.selectByVisibleText("DAMAN UNIT I AND II");
		Thread.sleep(2000);
		// Modify button
		driver.findElement(By.xpath("//a[contains(text(),'Modify')]")).click();
		Thread.sleep(2000);
		// Modify Masters
		// Cancel button
		driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);
		// Are you sure you want to reset? pop-up screen
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		// Modify Leaves
		driver.findElement(By.xpath("//a[contains(text(),'Modify Leaves')]")).click();
		Thread.sleep(2000);
		// ================================================Logout==================================================================
		// Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}
	}

