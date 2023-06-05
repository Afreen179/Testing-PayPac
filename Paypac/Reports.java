package com.Paypac;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Reports {

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

	//********************************************PaySlip********************************************************

			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// PaySlip
			driver.findElement(By.xpath("//a[contains(text(),'PaySlip')]")).click();
			Thread.sleep(2000);

			// pop-up screen
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select b = new Select(FinancialYear);
			Thread.sleep(2000);
			b.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Month -defect
			// WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
			// Select b1= new Select(Month);
			// Thread.sleep(2000);
			// b1.selectByVisibleText("");
			// Thread.sleep(2000);

			// Select Employee
			WebElement SelectEmployee = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select b2 = new Select(SelectEmployee);
			Thread.sleep(2000);
			b2.selectByVisibleText("All Employees");
			// b2.selectByVisibleText("Selected Employees");
			// b2.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

			// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);
	//==========================================Salary Register===========================================================
	//Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Salary Register
			driver.findElement(By.xpath("//a[contains(text(),'Salary Register')]")).click();
			Thread.sleep(2000);

			// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'EDIT')]")).click();
			Thread.sleep(2000);

			// pop-up screen - (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FinancialYear1 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select b3 = new Select(FinancialYear1);
			Thread.sleep(2000);
			b3.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Month -defect
			// WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
			// Select b4= new Select(Month1);
			// Thread.sleep(2000);
			// b4.selectByVisibleText("");

			Thread.sleep(2000);

			// Select Employee
			WebElement SelectEmployee1 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select b5 = new Select(SelectEmployee1);
			Thread.sleep(2000);
			b5.selectByVisibleText("All Employees");
			// b5.selectByVisibleText("Selected Employees");
			// b5.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

			// Sroll down a page
			WebElement Proceed = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor je2 = (JavascriptExecutor) driver;
			je2.executeScript("arguments[0].scrollIntoView()", Proceed);
			Thread.sleep(2000);

			// Proceed button
			// driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			// Thread.sleep(2000);

			// Back button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
	//=====================================Disbursement - 1.Cash / Cheque Report============================================================================
			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a = new Actions(driver);
			WebElement Disbursement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a.moveToElement(Disbursement).build().perform();
			Thread.sleep(2000);

			// 1.Cash / Cheque Report
			driver.findElement(By.xpath("//a[contains(text(),'Cash / Cheque Report')]")).click();
			Thread.sleep(2000);

			// pop-up screen - (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FinancialYear2 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select b4 = new Select(FinancialYear2);
			Thread.sleep(2000);
			b4.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Month -defect
			// WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
			// Select b5= new Select(Month1);
			// Thread.sleep(2000);
			// b5.selectByVisibleText("");
			Thread.sleep(2000);

			// Select Employee
			WebElement SelectEmployee2 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select b6 = new Select(SelectEmployee2);
			Thread.sleep(2000);
			b6.selectByVisibleText("All Employees");
			// b6.selectByVisibleText("Selected Employees");
			// b6.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

			// Sorting
			WebElement Sorting = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select b7 = new Select(Sorting);
			Thread.sleep(2000);
			// b7.selectByVisibleText("Employee Code");
			b7.selectByVisibleText("Name");
			Thread.sleep(2000);

			// Sroll down a page
			WebElement Proceed1 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor je3 = (JavascriptExecutor) driver;
			je3.executeScript("arguments[0].scrollIntoView()", Proceed1);
			Thread.sleep(2000);

			// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	//======================================Disbursement - 2.Bank Transfer Statement=======================================================================
			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a1 = new Actions(driver);
			WebElement Disbursement1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a1.moveToElement(Disbursement1).build().perform();
			Thread.sleep(2000);

			// Bank Transfer Statement
			driver.findElement(By.xpath("//a[contains(text(),'Bank Transfer Statement')]")).click();
			Thread.sleep(2000);

			// pop-up screen - (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FinancialYear3 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select b8 = new Select(FinancialYear3);
			b8.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Month -defect
			// WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
			// Select b9= new Select(Month1);
			// b9.selectByVisibleText("");
			Thread.sleep(2000);

			// Bank Name
			// WebElement BankName = driver.findElement(By.xpath("//select[@id='Bank
			// Name']"));
			// Select b10= new Select(BankName);
			// b10.selectByVisibleText("");
			// Thread.sleep(2000);

			// Date of Printing
			WebElement DateofPrinting = driver.findElement(By.xpath("//input[@id='DateofPrinting']"));
			DateofPrinting.sendKeys("11 April, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// Select Employee
			WebElement SelectEmployee3 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select b11 = new Select(SelectEmployee3);
			Thread.sleep(2000);
			b11.selectByVisibleText("All Employees");
			// b11.selectByVisibleText("Selected Employees");
			// b11.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

			// Sorting
			WebElement Sorting1 = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select b12 = new Select(Sorting1);
			b12.selectByVisibleText("Employee Code");
			// b12.selectByVisibleText("Name");
			Thread.sleep(2000);

			// Sroll down a page
			WebElement Proceed2 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor je4 = (JavascriptExecutor) driver;
			je4.executeScript("arguments[0].scrollIntoView()", Proceed2);
			Thread.sleep(2000);

			// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	//=================================Disbursement - 3.Create Bank Transfer Format================================================================================				
			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a2 = new Actions(driver);
			WebElement Disbursement2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a2.moveToElement(Disbursement2).build().perform();
			Thread.sleep(2000);

			// Create Bank Transfer Format
			driver.findElement(By.xpath("//a[contains(text(),'Create Bank Transfer Format')]")).click();
			Thread.sleep(2000);

			// Create Bank Transfer Format PAGE
			// Bank Name
			WebElement BankName = driver.findElement(By.xpath("//select[@id='BankID']"));
			Select b13 = new Select(BankName);
			Thread.sleep(2000);
			b13.selectByVisibleText("Test1");

			// File Format
			// WebElement FileFormat =
			// driver.findElement(By.xpath("//select[@id='BankFileFormatID']"));
			// Select b14= new Select(FileFormat);
			// Thread.sleep(2000);
			// b14.selectByVisibleText("");

			// Save to Path
//			WebElement FinancialYear4 = driver.findElement(By.xpath("//select[@id='BankFileFormat_FilePath']"));
//			Select b15 = new Select(FinancialYear4);
//			Thread.sleep(2000);
//			b15.selectByVisibleText("Test");

//			// Save to Path button
//			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[6]/div/div/div[2]/input[2]")).click();
//			Thread.sleep(2000);
	//===================================Disbursement - 4.Generate Bank Transfer File================================================================================

			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a4 = new Actions(driver);
			WebElement Disbursement4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a4.moveToElement(Disbursement4).build().perform();
			Thread.sleep(2000);

			// Generate Bank Transfer File
			driver.findElement(By.xpath("//a[contains(text(),'Generate Bank Transfer File')]")).click();
			Thread.sleep(2000);

			// Generate Bank Transfer File page
			// Account Type
			WebElement AccountType = driver.findElement(By.xpath("//select[@id='AccountType']"));
			Select b16 = new Select(AccountType);
			Thread.sleep(2000);
			b16.selectByVisibleText("Salary");

//				//Bank
//					WebElement Bank = driver.findElement(By.xpath("//select[@id='BankID']"));
//					Select b17= new Select(Bank);
//					Thread.sleep(2000);	
//					b17.selectByVisibleText("");
//					
//				//	Branch
//					WebElement Branch = driver.findElement(By.xpath("//select[@id='BankBranchID']"));
//					Select b18= new Select(Branch);
//					Thread.sleep(2000);	
//					b18.selectByVisibleText("");
//					
//				//	File Format
//					WebElement FileFormat = driver.findElement(By.xpath("//select[@id='BankFileFormatID']"));
//					Select b19= new Select(FileFormat);
//					Thread.sleep(2000);	
//					b19.selectByVisibleText("");
//					
//				//	Financial Month
//					WebElement FinancialMonth = driver.findElement(By.xpath("//select[@id='FinancialMonthID']"));
//					Select b20= new Select(FinancialMonth);
//					Thread.sleep(2000);	
//					b20.selectByVisibleText("");

			// Transaction Date
			WebElement TransactionDate = driver.findElement(By.xpath("//input[@id='TransactionDate']"));
			TransactionDate.sendKeys("17 April, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// Output File
			WebElement OutputFile = driver.findElement(By.xpath("//select[@id='OutputFileType']"));
			Select b21 = new Select(OutputFile);
			Thread.sleep(2000);
			b21.selectByVisibleText("Excel");

			// Generate File button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
	//===================================Disbursement - 5.Generate Bank Transfer File Non Payslip Component========================================================================
			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a5 = new Actions(driver);
			WebElement Disbursement5 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a5.moveToElement(Disbursement5).build().perform();
			Thread.sleep(2000);

			// Generate Bank Transfer File Non Payslip Component
			driver.findElement(By.xpath("//a[contains(text(),'Generate Bank Transfer File Non Payslip Component')]"))
					.click();
			Thread.sleep(2000);

			// Generate Bank Transfer File Non Payslip Component page
			// Salary Components
			WebElement SalaryComponents = driver.findElement(By.xpath("//select[@id='NonPayslipSalaryComponentIds']"));
			Select b22 = new Select(SalaryComponents);
			Thread.sleep(2000);
			b22.selectByVisibleText("Leave Travel Allowance");

//				//Bank
//					WebElement Bank = driver.findElement(By.xpath("//select[@id='BankID']"));
//					Select b23= new Select(Bank);
//					Thread.sleep(2000);	
//					b23.selectByVisibleText("");
//					
//				//	Branch
//					WebElement Branch = driver.findElement(By.xpath("//select[@id='BankBranchID']"));
//					Select b24= new Select(Branch);
//					Thread.sleep(2000);	
//					b24.selectByVisibleText("");
//					
//				//	File Format
//					WebElement FileFormat = driver.findElement(By.xpath("//select[@id='BankFileFormatID']"));
//					Select b25= new Select(FileFormat);
//					Thread.sleep(2000);	
//					b25.selectByVisibleText("");
//					
//				//	Financial Month
//					WebElement FinancialMonth = driver.findElement(By.xpath("//select[@id='FinancialMonthID']"));
//					Select b26= new Select(FinancialMonth);
//					Thread.sleep(2000);	
//					b26.selectByVisibleText("");

			// Transaction Date
			WebElement TransactionDate1 = driver.findElement(By.xpath("//input[@id='TransactionDate']"));
			TransactionDate1.sendKeys("17 April, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// Output File
			WebElement OutputFile1 = driver.findElement(By.xpath("//select[@id='OutputFileType']"));
			Select b27 = new Select(OutputFile1);
			Thread.sleep(2000);
			b27.selectByVisibleText("Excel");

			// Generate File button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Reports Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/a")).click();
			Thread.sleep(2000);

			// Disbursement
			Actions a6 = new Actions(driver);
			WebElement Disbursement6 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[8]/ul/li[3]/a"));
			a6.moveToElement(Disbursement6).build().perform();
			Thread.sleep(2000);

			// Generate Bank Transfer File
			driver.findElement(By.xpath("//a[contains(text(),'Generate Bank Transfer File Non Payslip Component')]"))
					.click();
			Thread.sleep(2000);

		}

	}
