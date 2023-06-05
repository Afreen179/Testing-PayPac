package com.Paypac;
	
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Utilities {

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new EdgeDriver();
			//driver.manage().window().maximize();
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

	// *******************************************************************************************************
//	 		UTILITIES TITLE
	//*******************************************************************************************************	
	// **********Query Builder******************************

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Query Builder
			driver.findElement(By.xpath("//a[contains(text(),'Query Builder')]")).click();
			Thread.sleep(2000);

	// Add New button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Query Code
			driver.findElement(By.xpath("//input[@id='QueryCode']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='QueryCode']")).sendKeys("TEST");
			Thread.sleep(2000);

	// Query Name
			driver.findElement(By.xpath("//input[@id='QueryName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='QueryName']")).sendKeys("TEST1");
			Thread.sleep(2000);

	// Options
	// FromYear
	// Year
			WebElement FromYear = driver.findElement(By.xpath("//select[@id='FromYear']"));
			Select s = new Select(FromYear);
			Thread.sleep(2000);
			s.selectByVisibleText("2022");
	// Month
			WebElement FromMonth = driver.findElement(By.xpath("//select[@id='FromMonth']"));
			Select s1 = new Select(FromMonth);
			Thread.sleep(2000);
			s1.selectByVisibleText("April");

	// ToYear
	// Year
			WebElement ToYear = driver.findElement(By.xpath("//select[@id='ToYear']"));
			Select s2 = new Select(ToYear);
			Thread.sleep(2000);
			s2.selectByVisibleText("2023");

	// Month
			WebElement ToMonth = driver.findElement(By.xpath("//select[@id='ToMonth']"));
			Select s3 = new Select(ToMonth);
			Thread.sleep(2000);
			s3.selectByVisibleText("April");

	// Sroll down a page
			WebElement Reset = driver.findElement(By.xpath("(//input[@class='btn btn-secondary'])[3]"));
			JavascriptExecutor y = (JavascriptExecutor) driver;
			y.executeScript("arguments[0].scrollIntoView()", Reset);
			Thread.sleep(2000);

	// Reset button
			driver.findElement(By.xpath("(//input[@class='btn btn-secondary'])[3]")).click();
			Thread.sleep(2000);

	// ===========Set Reminders============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Set Reminders
			driver.findElement(By.xpath("//a[contains(text(),'Set Reminders')]")).click();
			Thread.sleep(2000);

	// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Create Reminder popup screen
	// Title
			driver.findElement(By.xpath("//input[@id='Remind_Title']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Remind_Title']")).sendKeys("TEST");
			Thread.sleep(2000);

	// Type
	// Information
			driver.findElement(By.xpath("//input[@id='Remind_IsAlert']")).click();
			Thread.sleep(2000);

	// Active
			driver.findElement(By.xpath("//input[@id='Remind_IsActive']")).click();
			Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(2000);

	// =========================================Send Email To
	// Employee==============================================================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Set Reminders
			driver.findElement(By.xpath("//a[contains(text(),'Send Email To Employee')]")).click();
			Thread.sleep(2000);

	// Employees
	// Select Employee
			WebElement SelectEmployee = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select s4 = new Select(SelectEmployee);
			Thread.sleep(2000);
			s4.selectByVisibleText("All Employees");
	// s4.selectByVisibleText("Selected Employees");
	// s4.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

	// From
			driver.findElement(By.xpath("//input[@id='EmailFrom']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='EmailFrom']")).sendKeys("test@fastfacts.co");
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Send = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]"));
			JavascriptExecutor y1 = (JavascriptExecutor) driver;
			y1.executeScript("arguments[0].scrollIntoView()", Send);
			Thread.sleep(2000);

//					//Email Text Area
//						driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
//						Thread.sleep(2000);
//						driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Test");
//						Thread.sleep(2000);
//										
//					//Send button
//						driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
//						Thread.sleep(2000);
//					
//					//Successful Message Pop-up Screen (Email successfully sent to employees)
//						driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//						Thread.sleep(2000);

	// Clear button
			driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	//=======================Customize Payslip=====================================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Customize Payslip
			driver.findElement(By.xpath("//a[contains(text(),'Customize Payslip')]")).click();
			Thread.sleep(2000);

	// Customize Payslip page
	// PaySlip Type
			WebElement PaySlipType = driver.findElement(By.xpath("//select[@id='SlipFormat_SlipType']"));
			Select s5 = new Select(PaySlipType);
			Thread.sleep(2000);
			s5.selectByVisibleText("PaySlip");
	// s5.selectByVisibleText("Custom PaySlip");
	// s5.selectByVisibleText("Reimbursement");
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Save4 = driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']"));
			JavascriptExecutor y2 = (JavascriptExecutor) driver;
			y2.executeScript("arguments[0].scrollIntoView()", Save4);
			Thread.sleep(2000);

	// P.F
			driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']")).sendKeys("TEST");

	// P.Tax
			driver.findElement(By.xpath("//input[@id='SlipFormat_PTaxName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='SlipFormat_PTaxName']")).sendKeys("TEST1");

	// E.S.I.C
			driver.findElement(By.xpath("//input[@id='SlipFormat_ESICName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='SlipFormat_ESICName']")).sendKeys("TEST2");

	// Clear button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
			Thread.sleep(2000);

	//===================Employee Salary details=====================================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Customize Payslip
			driver.findElement(By.xpath("//a[contains(text(),'Employee Salary details')]")).click();
			Thread.sleep(2000);

	// Employee Salary details page
	// Branch Name
			WebElement BranchName13 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
			Select s6 = new Select(BranchName13);
			s6.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Any Employee
			driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
			Thread.sleep(2000);
	// Enter key
			Actions e6 = new Actions(driver);
			e6.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);

	// Details Link
			driver.findElement(By.xpath("(//a[contains(text(),'Details')])[4]")).click();
			Thread.sleep(2000);

	//=====================Reimbursement Bank Letter======================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Reimbursement Bank Letter
			driver.findElement(By.xpath("//a[contains(text(),'Reimbursement Bank Letter')]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// Reimbursement Bank Letter page
	// Bank Name
			WebElement BankName2 = driver.findElement(By.xpath("//select[@id='BankName']"));
			Select s7 = new Select(BankName2);
			s7.selectByVisibleText("Test1");
			Thread.sleep(2000);

	// Bank Branch
	// WebElement BankBranch =
	// driver.findElement(By.xpath("//select[@id='EmployerBankID']"));
	// Select s8= new Select(BankBranch);
	// Thread.sleep(2000);
	// s8.selectByVisibleText("");

	// FinancialYearID
			WebElement FinancialYear15 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select s9 = new Select(FinancialYear15);
			Thread.sleep(2000);
			s9.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

	// Month
	// WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
	// Select s10= new Select(Month);
	// Thread.sleep(2000);
	// s10.selectByVisibleText("");

	// Date Of Printing
			WebElement DateofPrinting = driver.findElement(By.xpath("//input[@id='DateOfPrinting']"));
			DateofPrinting.sendKeys("21 April, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//======================Import Branch Wise - 1.Import Masters==================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m = new Actions(driver);
			WebElement ImportBranchWise = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m.moveToElement(ImportBranchWise).build().perform();

	// 1.Import Masters
			driver.findElement(By.xpath("//a[contains(text(),'Import Masters')]")).click();
			Thread.sleep(2000);

	// Import Masters page
	// Import Masters
			WebElement ImportMasters = driver.findElement(By.xpath("//select[@id='EmpMiscMasters']"));
			Select s11 = new Select(ImportMasters);
			s11.selectByVisibleText("Branch");
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//============Import Branch Wise - 2.Import Variables===============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m1 = new Actions(driver);
			WebElement ImportBranchWise1 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m1.moveToElement(ImportBranchWise1).build().perform();

	// 2.Import Variables
			driver.findElement(By.xpath("//a[contains(text(),'Import Variables')]")).click();
			Thread.sleep(2000);

//						//Pop-up Screen (Please create atleast one variable at Define Variable screen)
//						driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//						Thread.sleep(2000);

	// Import Variables page
	// List Of Variables
//						WebElement ListOfVariables = driver.findElement(By.xpath("//select[@id='VariableComponents']"));
//						Select s11= new Select(ListOfVariables);
//						s11.selectByVisibleText("");
//						Thread.sleep(2000);	

	// Branch Name
			WebElement BranchName14 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s12 = new Select(BranchName14);
			s12.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Please select atleast one variable)
			driver.findElement(By.xpath("(//a[contains(text(),'×')])[1]")).click();
			Thread.sleep(5000);

	//============Import Branch Wise - 3.Import Salary Component=============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m2 = new Actions(driver);
			WebElement ImportBranchWise2 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m2.moveToElement(ImportBranchWise2).build().perform();

	// 3.Import Salary Component
			driver.findElement(By.xpath("//a[contains(text(),'Import Salary Component')]")).click();
			Thread.sleep(2000);

	// Import Salary Component page
	// List Of Variables
			WebElement ListOfVariables = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
			Select s13 = new Select(ListOfVariables);
			s13.selectByVisibleText("Special Pay");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName15 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s14 = new Select(BranchName15);
			s14.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Sroll down a page
			WebElement DownloadTemplate = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			JavascriptExecutor y3 = (JavascriptExecutor) driver;
			y3.executeScript("arguments[0].scrollIntoView()", DownloadTemplate);
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//===========Import Branch Wise - 4.Import One Time Component===================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m3 = new Actions(driver);
			WebElement ImportBranchWise3 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m3.moveToElement(ImportBranchWise3).build().perform();

	// 4.Import One Time Component
			driver.findElement(By.xpath("//a[contains(text(),'Import One Time Component')]")).click();
			Thread.sleep(2000);

	// Import Salary Component page
	// List Of Variables
			WebElement ListOfVariables1 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
			Select s15 = new Select(ListOfVariables1);
			s15.selectByVisibleText("Incentive 21_22 (INC)");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName16 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s16 = new Select(BranchName16);
			s16.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Sroll down a page
			WebElement DownloadTemplate1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			JavascriptExecutor y4 = (JavascriptExecutor) driver;
			y4.executeScript("arguments[0].scrollIntoView()", DownloadTemplate1);
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//===========Import Branch Wise - 4.Import Arrear Effective From=============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m4 = new Actions(driver);
			WebElement ImportBranchWise4 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m4.moveToElement(ImportBranchWise4).build().perform();

	// 4.Import Arrear Effective From
			driver.findElement(By.xpath("//a[contains(text(),'Import Arrear Effective From')]")).click();
			Thread.sleep(2000);

	// Import Arrear Effective From page
	// Branch Name
			WebElement BranchName17 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s17 = new Select(BranchName17);
			s17.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	//==============Import Branch Wise - 5.Import Investments======================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m5 = new Actions(driver);
			WebElement ImportBranchWise5 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m5.moveToElement(ImportBranchWise5).build().perform();

	// 5.Import Investments
			driver.findElement(By.xpath("//a[contains(text(),'Import Investments')]")).click();
			Thread.sleep(2000);

	// Import Investments page
	// Branch Name
			WebElement BranchName18 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s18 = new Select(BranchName18);
			s18.selectByVisibleText("Ahmedabad Depot");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);
	//
	//// scroll down a page
	//Actions m6 = new Actions(driver);
	//m6.sendKeys(Keys.PAGE_DOWN).build().perform();

	// HP & Other Income
			driver.findElement(By.xpath("//a[contains(text(),'HP & Other Income')]")).click();
			Thread.sleep(2000);
	// Other Investments
			driver.findElement(By.xpath("//a[contains(text(),'Other Investments')]")).click();
			Thread.sleep(2000);

	// Section 80CCD(2)
			driver.findElement(By.xpath("//a[contains(text(),'Section 80CCD(2)')]")).click();
			Thread.sleep(2000);

	// Super Annuation
			driver.findElement(By.xpath("//a[contains(text(),'Super Annuation')]")).click();
			Thread.sleep(2000);

	//===================Import Branch Wise - 6.Import Statutory=================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m7 = new Actions(driver);
			WebElement ImportBranchWise6 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m7.moveToElement(ImportBranchWise6).build().perform();

	// 6.Import Statutory
			driver.findElement(By.xpath("//a[contains(text(),'Import Statutory')]")).click();
			Thread.sleep(2000);

	// Import Investments page
	// Branch Name
			WebElement BranchName19 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s19 = new Select(BranchName19);
			s19.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// PF
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);
	// ESIC
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[3]/a")).click();
			Thread.sleep(2000);
	// PTax
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[4]/a")).click();
			Thread.sleep(2000);
	// TDS deducted on salary
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[5]/a")).click();
			Thread.sleep(2000);
	// Previous Employer Data
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[6]/a")).click();
			Thread.sleep(2000);
	// Other Section
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[7]/a")).click();
			Thread.sleep(2000);

	//==============Import Branch Wise - 7.Import Disbursement=============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m8 = new Actions(driver);
			WebElement ImportBranchWise7 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m8.moveToElement(ImportBranchWise7).build().perform();

	// 7.Import Disbursement
			driver.findElement(By.xpath("//a[contains(text(),'Import Disbursement')]")).click();
			Thread.sleep(2000);

	// Import Investments page
	// Branch Name
			WebElement BranchName20 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s20 = new Select(BranchName20);
			s20.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement DownloadTemplate2 = driver.findElement(By.xpath("//a[contains(text(),'Download Template')]"));
			JavascriptExecutor y5 = (JavascriptExecutor) driver;
			y5.executeScript("arguments[0].scrollIntoView()", DownloadTemplate2);
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==================Import Branch Wise - 8.Import Reimbursement=====================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m9 = new Actions(driver);
			WebElement ImportBranchWise8 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m9.moveToElement(ImportBranchWise8).build().perform();

	// 9.Import Reimbursement
			driver.findElement(By.xpath("//a[contains(text(),'Import Reimbursement')]")).click();
			Thread.sleep(2000);

	// Import Reimbursement page
	// List Of Components
			WebElement BranchName21 = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
			Select s21 = new Select(BranchName21);
			s21.selectByVisibleText("Medical Reimbursement");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName22 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s22 = new Select(BranchName22);
			s22.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==============Import Branch Wise - 9.Import Reimbursement====================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m10 = new Actions(driver);
			WebElement ImportBranchWise9 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m10.moveToElement(ImportBranchWise9).build().perform();

	// 9.Import Reimbursement
			driver.findElement(By.xpath("//a[contains(text(),'Import Reimbursement')]")).click();
			Thread.sleep(2000);

	// Import Reimbursement page
	// List Of Components
			WebElement ListOfComponents = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
			Select s23 = new Select(ListOfComponents);
			s23.selectByVisibleText("Medical Reimbursement");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName24 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s24 = new Select(BranchName24);
			s24.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search Button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==================Import Branch Wise - 10.Import Employees===================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m11 = new Actions(driver);
			WebElement ImportBranchWise10 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m11.moveToElement(ImportBranchWise10).build().perform();

	// 10.Import Employees
			driver.findElement(By.xpath("//a[contains(text(),'Import Employees')]")).click();
			Thread.sleep(2000);

	// Import Employees page
	// Branch Name
			WebElement BranchName25 = driver.findElement(By.xpath("//select[@id='CompanyID']"));
			Select s25 = new Select(BranchName25);
			s25.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Employee Activation
			WebElement EmployeeActivation = driver.findElement(By.xpath("//select[@id='Status']"));
			Select s26 = new Select(EmployeeActivation);
			s26.selectByVisibleText("Active");
			Thread.sleep(2000);

	// Emplyee Active
			driver.findElement(By.xpath("//input[@id='EmplyeeActive']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//=========Import Branch Wise - 11.Import Leaves Availed==================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m12 = new Actions(driver);
			WebElement ImportBranchWise11 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m12.moveToElement(ImportBranchWise11).build().perform();

	// 11.Import Leaves Availed
			driver.findElement(By.xpath("//a[contains(text(),'Import Leaves Availed')]")).click();
			Thread.sleep(2000);

	// Import Leaves Availed page
	// Branch Name
			WebElement BranchName26 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s27 = new Select(BranchName26);
			s27.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Export Button
			driver.findElement(By.xpath("//a[contains(text(),'Export')]")).click();
			Thread.sleep(2000);

	//===========Import Branch Wise - 12.Import Branch Wise Employee Computation Detail======================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m13 = new Actions(driver);
			WebElement ImportBranchWise12 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m13.moveToElement(ImportBranchWise12).build().perform();

	// 12.Import Branch Wise Employee Computation Detail
			driver.findElement(By.xpath("//a[contains(text(),'Import Employee Computation Detail')]")).click();
			Thread.sleep(2000);

	// Import Branch Wise Employee Computation Detail page
	// Financial Month
			WebElement FinancialMonth1 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
			Select q = new Select(FinancialMonth1);
			Thread.sleep(2000);
			q.selectByVisibleText("April-22");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName27 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select s28 = new Select(BranchName27);
			s28.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Export All Employee Computation Detail
	// Salary components
			WebElement BranchName28 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
			Select s29 = new Select(BranchName28);
			s29.selectByVisibleText("Basic Salary");
			Thread.sleep(2000);

	// One time components
			WebElement BranchName29 = driver.findElement(By.xpath("//select[@id='OneTimeComponentID']"));
			Select s30 = new Select(BranchName29);
			s30.selectByVisibleText("SALARY BONUS");
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[contains(text(),'Download Template')]")).click();
			Thread.sleep(2000);

	//=========Import Branch Wise - 13.Import Rent Free Accommodation=================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Branch Wise
			Actions m14 = new Actions(driver);
			WebElement ImportBranchWise13 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
			m14.moveToElement(ImportBranchWise13).build().perform();

	// 13.Import Rent Free Accommodation
			driver.findElement(By.xpath("//a[contains(text(),'Import Rent Free Accommodation')]")).click();
			Thread.sleep(2000);

	// Import Rent Free Accommodation page
	// Financial Month
			WebElement FinancialMonth3 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
			Select s31 = new Select(FinancialMonth3);
			Thread.sleep(2000);
			s31.selectByVisibleText("April-22");
			Thread.sleep(2000);

	// Branch Name
			WebElement BranchName30 = driver.findElement(By.xpath("//select[@id='ddlBranch']"));
			Select s32 = new Select(BranchName30);
			s32.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Sample Template Button
			driver.findElement(By.xpath("//a[contains(text(),'Sample Template')]")).click();
			Thread.sleep(2000);

	//==============Import Company Wise - 1.Import All Employees=======================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q1 = new Actions(driver);
			WebElement ImportCompanyWise = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q1.moveToElement(ImportCompanyWise).build().perform();

	// 1.Import All Employees
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees')]")).click();
			Thread.sleep(2000);

	// Import All Employees page
	// Status
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Emplyee Active Check-Box
			driver.findElement(By.xpath("//input[@id='EmplyeeActive']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement DownloadTemplate3 = driver.findElement(By.xpath("//a[contains(text(),'Download Template')]"));
			JavascriptExecutor y6 = (JavascriptExecutor) driver;
			y6.executeScript("arguments[0].scrollIntoView()", DownloadTemplate3);
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[contains(text(),'Download Template')]")).click();
			Thread.sleep(2000);

	//=============Import Company Wise - 2.Import All Employees Statutory==============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q2 = new Actions(driver);
			WebElement ImportCompanyWise1 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q2.moveToElement(ImportCompanyWise1).build().perform();

	// 2.Import All Employees Statutory
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Statutory')]")).click();
			Thread.sleep(2000);

	// Import All Employees page
	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//============Import Company Wise - 3.Import All Employees Salary Component=============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q3 = new Actions(driver);
			WebElement ImportCompanyWise2 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q3.moveToElement(ImportCompanyWise2).build().perform();

	// 3.Import All Employees Salary Component
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Salary Component')]")).click();
			Thread.sleep(2000);

	//// Import All Employees Salary Component page
	//// List Of Components
	//WebElement ListOfComponents1 = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
	//Select q4 = new Select(ListOfComponents1);
	//q4.selectByVisibleText("Special Pay");
	//Thread.sleep(2000);
	//
	//// Status
	//// Status -Active Status Flag
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//
	//// Download Template Button
	//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==========Import Company Wise - 4.Import All Employees One Time Component====

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions n9 = new Actions(driver);
			WebElement ImportCompanyWise4 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			n9.moveToElement(ImportCompanyWise4).build().perform();

	// 4.Import All Employees One Time Component
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees One Time Component')]")).click();
			Thread.sleep(2000);

	//// Import All Employees Salary Component page
	//// List Of Components
	//WebElement ListOfComponents2 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
	//Select q6 = new Select(ListOfComponents2);
	//q6.selectByVisibleText("SAL BONUS (BON)");
	//Thread.sleep(2000);
	//
	//// Status
	//// Status -Active Status Flag
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//
	//// Download Template Button
	//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//=============Import Company Wise - 5.Import All Employees Disbursement===============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions n10 = new Actions(driver);
			WebElement ImportCompanyWise5 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			n10.moveToElement(ImportCompanyWise5).build().perform();

	// 5.Import All Employees Disbursement
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Disbursement')]")).click();
			Thread.sleep(2000);

	// Import All Employees Disbursement page
	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//================Import Company Wise - 6.Import All Employees Investments==================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions n11 = new Actions(driver);
			WebElement ImportCompanyWise6 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			n11.moveToElement(ImportCompanyWise6).build().perform();

	// 6.Import All Employees Investments
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Investments')]")).click();
			Thread.sleep(2000);

	// Import All Employees Investments page
	// Select Investment For
			WebElement SelectInvestmentFor = driver.findElement(By.xpath("//select[@id='InvestmentFor']"));
			Select q9 = new Select(SelectInvestmentFor);
			q9.selectByVisibleText("ALL");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	//=======Import Company Wise - 7.Import All Arrear Effective From============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q10 = new Actions(driver);
			WebElement ImportCompanyWise7 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q10.moveToElement(ImportCompanyWise7).build().perform();

	// 7.Import All Arrear Effective From
			driver.findElement(By.xpath("//a[contains(text(),'Import All Arrear Effective From')]")).click();
			Thread.sleep(2000);

	// Import All Arrear Effective From page
	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==========Import Company Wise - 8.Import All Employees Absent Entry===============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q11 = new Actions(driver);
			WebElement ImportCompanyWise8 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q11.moveToElement(ImportCompanyWise8).build().perform();

	// 8.Import All Employees Absent Entry
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Absent Entry')]")).click();
			Thread.sleep(2000);

	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==========Import Company Wise - 9.Import All Employees Leave Entry==============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q12 = new Actions(driver);
			WebElement ImportCompanyWise9 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q12.moveToElement(ImportCompanyWise9).build().perform();

	// 9.Import All Employees Leave Entry
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Leave Entry')]")).click();
			Thread.sleep(2000);

	// Import All Employees Leave Entry page
	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Financial Year
			WebElement FinancialYear30 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select q13 = new Select(FinancialYear30);
			q13.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

	// Month
			WebElement Month2 = driver.findElement(By.xpath("//select[@id='Month']"));
			Select q14 = new Select(Month2);
			q14.selectByVisibleText("April-22");
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//==========Import Company Wise - 10.Import All Employees Adjust Leave Balances===============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q15 = new Actions(driver);
			WebElement ImportCompanyWise10 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q15.moveToElement(ImportCompanyWise10).build().perform();

	// 10.Import All Employees Adjust Leave Balances
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Adjust Leave Balances')]")).click();
			Thread.sleep(2000);

	// Import All Employees Adjust Leave Balances page
	// Close Month
			WebElement CloseMonth1 = driver.findElement(By.xpath("//select[@id='Month']"));
			Select q16 = new Select(CloseMonth1);
			q16.selectByVisibleText("March-22");
			Thread.sleep(2000);

	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	//=======Import Company Wise - 11.Import All Employees Map Variable==========

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q17 = new Actions(driver);
			WebElement ImportCompanyWise11 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q17.moveToElement(ImportCompanyWise11).build().perform();

	// 11.Import All Employees Map Variable
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Map Variable')]")).click();
			Thread.sleep(2000);

	//// Import All Employees Map Variable page
	//// List Of Components
	//WebElement ListOfComponents3 = driver.findElement(By.xpath("//select[@id='VariableComponents']"));
	//Select q18 = new Select(ListOfComponents3);
	//q18.selectByVisibleText("TEST1");
	//Thread.sleep(2000);
	//
	//// Status
	//// Status -Active Status Flag
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
	//Thread.sleep(2000);
	//
	//// Download Template Button
	//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	//Thread.sleep(2000);

	//==============Import Company Wise - 12.Update Statutory Values============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q19 = new Actions(driver);
			WebElement ImportCompanyWise12 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q19.moveToElement(ImportCompanyWise12).build().perform();

	// 12.Update Statutory Values
			driver.findElement(By.xpath("//a[contains(text(),'Import All Statutory Values')]")).click();
			Thread.sleep(2000);

	// Update Statutory Values page
	// Status
	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//=======Import Company Wise - 13.Import All Reimbursement============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q20 = new Actions(driver);
			WebElement ImportCompanyWise13 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q20.moveToElement(ImportCompanyWise13).build().perform();

	// 13.Import All Reimbursement
			driver.findElement(By.xpath("//a[contains(text(),'Import All Reimbursement')]")).click();
			Thread.sleep(2000);

	// Import All Reimbursement page
	// List Of Components
			WebElement ListOfComponents4 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
			Select q21 = new Select(ListOfComponents4);
			q21.selectByVisibleText("Medical Reimbursement");
			Thread.sleep(2000);

	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	//===========Import Company Wise - 14.Import All Employees Leave Mapping==========

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q22 = new Actions(driver);
			WebElement ImportCompanyWise14 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q22.moveToElement(ImportCompanyWise14).build().perform();

	// 14.Import All Employees Leave Mapping
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Leave Mapping')]")).click();
			Thread.sleep(2000);

	//// Import All Employees Leave Mapping page
	//// Download Template Button
	//driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
	//Thread.sleep(2000);

	//=======Import Company Wise - 15.Import All Employee Computation Detail==========

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q23 = new Actions(driver);
			WebElement ImportCompanyWise15 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q23.moveToElement(ImportCompanyWise15).build().perform();

	// 15.Import All Employee Computation Detail
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employee Computation Detail')]")).click();
			Thread.sleep(2000);

	// Import All Employee Computation Detail page
	// Financial Month
			WebElement FinancialMonth4 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
			Select q24 = new Select(FinancialMonth4);
			q24.selectByVisibleText("April-22");
			Thread.sleep(2000);

	// Salary components
			WebElement Salarycomponents = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
			Select q25 = new Select(Salarycomponents);
			q25.selectByVisibleText("Basic Salary");
			Thread.sleep(2000);

	// One time components
			WebElement Onetimecomponents = driver.findElement(By.xpath("//select[@id='OneTimeComponentID']"));
			Select q26 = new Select(Onetimecomponents);
			q26.selectByVisibleText("SALARY BONUS");
			Thread.sleep(2000);

	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	//==========Import Company Wise -16.Import Statutory Masters=========================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q27 = new Actions(driver);
			WebElement ImportCompanyWise16 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q27.moveToElement(ImportCompanyWise16).build().perform();

	// 16.Import Statutory Masters
			driver.findElement(By.xpath("//a[contains(text(),'Import Statutory Masters')]")).click();
			Thread.sleep(2000);

	// Import Statutory Masters page
			WebElement ImportStatutoryMasters = driver.findElement(By.xpath("//select[@id='StatutoryMasters']"));
			Select i = new Select(ImportStatutoryMasters);
			i.selectByVisibleText("PF Branch Master");
			Thread.sleep(2000);
	// Download Template Button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]")).click();
			Thread.sleep(2000);

	//========Import Company Wise -17.Import All Employees ESIC Reason============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q28 = new Actions(driver);
			WebElement ImportCompanyWise17 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q28.moveToElement(ImportCompanyWise17).build().perform();

	// 17.Import All Employees ESIC Reason
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees ESIC Reason')]")).click();
			Thread.sleep(2000);

	// Import Statutory Masters page
	// pop-up screen
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

	// Financial Year
			WebElement FinancialYear31 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select q29 = new Select(FinancialYear31);
			q29.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

//						//Month
//						WebElement Month = driver.findElement(By.xpath("//select[@id='FinancialMonthID']"));
//						Select q26= new Select(Month);
//						q26.selectByVisibleText("");
//						Thread.sleep(2000);	

	//=====Import Company Wise -18.Import All Employees Paid Days=========

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q30 = new Actions(driver);
			WebElement ImportCompanyWise18 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q30.moveToElement(ImportCompanyWise18).build().perform();

	// 18.Import All Employees Paid Days
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Paid Days')]")).click();
			Thread.sleep(2000);

	// Download Template Button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	//=======Import Company Wise -19.Import All Employees Rent Free Accommodation=====

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q31 = new Actions(driver);
			WebElement ImportCompanyWise19 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q31.moveToElement(ImportCompanyWise19).build().perform();

	// 19.Import All Employees Rent Free Accommodation
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Rent Free Accommodation')]")).click();
			Thread.sleep(2000);

	// Financial Month
			WebElement FinancialMonth5 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
			Select q32 = new Select(FinancialMonth5);
			q32.selectByVisibleText("April-22");
			Thread.sleep(2000);

	// Sample Download button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	//======Import Company Wise -20.Import All Employees Previous Month Paid Days=====

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Import Company Wise
			Actions q33 = new Actions(driver);
			WebElement ImportCompanyWise20 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
			q33.moveToElement(ImportCompanyWise20).build().perform();

	// 20.Import All Employees Previous Month Paid Days
			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Previous Month Paid Days')]")).click();
			Thread.sleep(2000);

	// Import All Employees Adjust Leave Balances page
	// Close Month
			WebElement CloseMonth2 = driver.findElement(By.xpath("//select[@id='ClosedMonth']"));
			Select q34 = new Select(CloseMonth2);
			q34.selectByVisibleText("March-22");
			Thread.sleep(2000);

	// Status -Active Status Flag
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
			Thread.sleep(2000);

	// Sample Download button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	//===========List of Rule Codess=============

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// List of Rule Codes
			driver.findElement(By.xpath("//a[contains(text(),'List of Rule Codes')]")).click();
			Thread.sleep(2000);

	// List of Rule Codes page
	// 1.Income From Salaries
			driver.findElement(By.xpath("//a[contains(text(),'Income From Salaries')]")).click();
			Thread.sleep(2000);

	// 2.Income From Other Sources
			driver.findElement(By.xpath("//a[contains(text(),'Income From Other Sources')]")).click();
			Thread.sleep(2000);

	// 3.Deductions Under VIA
			driver.findElement(By.xpath("//a[contains(text(),'Deductions Under VIA')]")).click();
			Thread.sleep(2000);

	// 4.Investments U/S 80C
			driver.findElement(By.xpath("//a[contains(text(),'Investments U/S 80C')]")).click();
			Thread.sleep(2000);

	//===========Component Mapping for Form16 and eTds creation===========================

	// Utilies Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
			Thread.sleep(2000);

	// Component Mapping for Form16 and eTds creation
			driver.findElement(By.xpath("//a[contains(text(),'Component Mapping for Form16 and eTds creation')]")).click();
			Thread.sleep(2000);

	// Component Mapping for Form16 and eTds creation page
	// Financial Year
			WebElement FinancialYear33 = driver.findElement(By.xpath("//select[@id='ddlFinancialYear']"));
			Select s33 = new Select(FinancialYear33);
			s33.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

	// Travel concession or assistance under section 10(5) Component
			WebElement FinancialYear34 = driver.findElement(By.xpath("//select[@id='dropdown_F0001']"));
			Select s34 = new Select(FinancialYear34);
			s34.selectByVisibleText("Basic Salary");
			Thread.sleep(2000);

	// Scroll down a page
			WebElement Submit = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor y7 = (JavascriptExecutor) driver;
			y7.executeScript("arguments[0].scrollIntoView()", Submit);
			Thread.sleep(3000);

	// Submit button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// pop-up screen
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);
			// -------------------------------------------Logout-------------------------------------------------------------
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Thread.sleep(5000);
			driver.close();
		}

	}

