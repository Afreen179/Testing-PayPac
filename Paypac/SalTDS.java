package com.Paypac;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class SalTDS {

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

			// ******************************************************************************************************
//			 									   SalTDS TITLE
			// ******************************************************************************************************
			// ==============Employee Computation===============

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Employee Computation
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/ul/li[1]/a")).click();
			Thread.sleep(2000);

			// Employee Computation page
			// Branch Name
			WebElement BN = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
			Select r = new Select(BN);
			r.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

			// Financial Year
			WebElement FY = driver.findElement(By.xpath("//select[@id='FinancialYear']"));
			Select r1 = new Select(FY);
			Thread.sleep(2000);
			r1.selectByVisibleText("Apr 2022 - Mar 2023");

			// Search Any Employee
			driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
			Thread.sleep(2000);
			// Enter key
			Actions e7 = new Actions(driver);
			e7.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);

			// ===============Employee TDS Deduction==================

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Employee TDS Deduction
			driver.findElement(By.xpath("//a[contains(text(),'Employee TDS Deduction')]")).click();
			Thread.sleep(2000);

			// Add Link
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Month
			WebElement Month3 = driver.findElement(By.xpath("//select[@id='FinancialMonth']"));
			Select r2 = new Select(Month3);
			r2.selectByVisibleText("Month");
			Thread.sleep(2000);

			// TDS Deduction Date
			WebElement TDSDeductionDate = driver.findElement(By.xpath("//input[@id='EmployeeTDSDetail_TDSDeductionDate']"));
			TDSDeductionDate.sendKeys("18 April, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'18')]")).click();
			Thread.sleep(2000);

			// Branch Name
			WebElement BN1 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select r3 = new Select(BN1);
			r3.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

			// Search button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

			// =============Challan==============

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Challan
			driver.findElement(By.xpath("(//a[contains(text(),'Challan')])[9]")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY3 = driver.findElement(By.xpath("//select[@id='FinYear']"));
			Select r4 = new Select(FY3);
			r4.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Add Link
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY4 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select r5 = new Select(FY4);
			r5.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// TDS Deduction From Date
			WebElement TDSDeductionFromDate = driver.findElement(By.xpath("//input[@id='NewFromDate']"));
			TDSDeductionFromDate.sendKeys("01 March, 2023");
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// TDS Deduction To Date
			WebElement TDSDeductionToDate = driver.findElement(By.xpath("//input[@id='NewToDate']"));
			TDSDeductionToDate.sendKeys("30 March, 2023");
			driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
			Thread.sleep(2000);

			// TAN Number
			WebElement TANNumber = driver.findElement(By.xpath("//select[@id='TANNumber']"));
			Select r6 = new Select(TANNumber);
			r6.selectByVisibleText("AAAA99999B");
			Thread.sleep(2000);

			// Branch Name
			WebElement BN2 = driver.findElement(By.xpath("//select[@id='ddlCompanyID']"));
			Select r7 = new Select(BN2);
			r7.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

			// Display button
			driver.findElement(By.xpath("//input[@id='Display']")).click();
			Thread.sleep(3000);

			// =============Surplus Challan - 1.Create Surplus Challan===================

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Surplus Challan
			Actions u = new Actions(driver);
			WebElement SurplusChallan = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/ul/li[4]/a"));
			u.moveToElement(SurplusChallan).build().perform();

			// Create Surplus Challan
			driver.findElement(By.xpath("//a[contains(text(),'Create Surplus Challan')]")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY5 = driver.findElement(By.xpath("//select[@id='FinYear']"));
			Select r8 = new Select(FY5);
			r8.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// =============Surplus Challan - 1.Create Surplus Challan==============

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Surplus Challan
			Actions u1 = new Actions(driver);
			WebElement SurplusChallan1 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/ul/li[4]/a"));
			u1.moveToElement(SurplusChallan1).build().perform();

			// Create Surplus Challan
			driver.findElement(By.xpath("//a[contains(text(),'Create Surplus Challan')]")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY6 = driver.findElement(By.xpath("//select[@id='FinYear']"));
			Select r9 = new Select(FY6);
			r9.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// =========Surplus Challan - 2.Reset Surplus Challan=================

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Surplus Challan
			Actions u2 = new Actions(driver);
			WebElement SurplusChallan2 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/ul/li[4]/a"));
			u2.moveToElement(SurplusChallan2).build().perform();

			// Reset Surplus Challan
			driver.findElement(By.xpath("//a[contains(text(),'Reset Surplus Challan')]")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY7 = driver.findElement(By.xpath("//select[@id='FinYear']"));
			Select r10 = new Select(FY7);
			r10.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// ================Challan Payments=================

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Challan Payments
			driver.findElement(By.xpath("//a[contains(text(),'Challan Payments')]")).click();
			Thread.sleep(2000);

			// Financial Year
			WebElement FY8 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select r11 = new Select(FY8);
			r11.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Add Link
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
			// Challan No
			WebElement ChallanNo = driver.findElement(By.xpath("//select[@id='ChallanNo']"));
			Select r12 = new Select(ChallanNo);
			r12.selectByVisibleText("Select");
			Thread.sleep(2000);

			// Minor Head
			WebElement MinorHead = driver.findElement(By.xpath("//select[@id='MinorHead']"));
			Select r13 = new Select(MinorHead);
			r13.selectByVisibleText("200");
			Thread.sleep(2000);

			// Payment Mode
			WebElement PaymentMode = driver.findElement(By.xpath("//select[@id='paymentType']"));
			Select r14 = new Select(PaymentMode);
			r14.selectByVisibleText("NetBanking");
			Thread.sleep(2000);

			// Sroll down a page
			WebElement Back = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			JavascriptExecutor j2 = (JavascriptExecutor) driver;
			j2.executeScript("arguments[0].scrollIntoView()", Back);
			Thread.sleep(2000);

			// Back button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(3000);

			// ==============Quarterly eTDS Statement====================

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Quarterly eTDS Statement
			driver.findElement(By.xpath("//a[contains(text(),'Quarterly eTDS Statement')]")).click();
			Thread.sleep(2000);

			// TAN No
			WebElement TANNo = driver.findElement(By.xpath("//select[@id='TANNo']"));
			Select r15 = new Select(TANNo);
			r15.selectByVisibleText("AAAA99999B");
			Thread.sleep(2000);

			// Branch
			WebElement Branch7 = driver.findElement(By.xpath("//select[@id='ddlTDSMasterID']"));
			Select r16 = new Select(Branch7);
			r16.selectByVisibleText("MUMBAI");
			Thread.sleep(2000);

			// Financial Year
			WebElement FY9 = driver.findElement(By.xpath("//select[@id='ddlFinancialYear']"));
			Select r17 = new Select(FY9);
			r17.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Quarter
			WebElement Quarter = driver.findElement(By.xpath("//select[@id='ddlQuarter']"));
			Select r18 = new Select(Quarter);
			r18.selectByVisibleText("Q1");
			Thread.sleep(2000);

			// Sroll down a page
			WebElement eTDSbutton = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
			JavascriptExecutor j3 = (JavascriptExecutor) driver;
			j3.executeScript("arguments[0].scrollIntoView()", eTDSbutton);
			Thread.sleep(2000);

			// Create eTDS File button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(3000);

			// pop-up screen - (No Challan Found)
			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
			Thread.sleep(2000);

			// ==================Fast Traces Form 16============

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Fast Traces Form 16
			driver.findElement(By.xpath("//a[contains(text(),'Fast Traces Form 16')]")).click();
			Thread.sleep(2000);

//									//Financial Year
//									WebElement FY3 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//									Select b19= new Select(FY3);
//									b19.selectByVisibleText("");
//									Thread.sleep(2000);	

			// TAN Number
			WebElement TANNo1 = driver.findElement(By.xpath("//select[@id='TanNumberMasterID']"));
			Select r20 = new Select(TANNo1);
			r20.selectByVisibleText("AAAA99999B");
			Thread.sleep(2000);

			// 1.PartA and 2.PartB-Traces (it will be selected defautly)

			// PartB
			driver.findElement(By.xpath("//a[contains(text(),'PartB')]")).click();
			Thread.sleep(2000);

			// Generate Form16
			driver.findElement(By.xpath("//a[contains(text(),'Generate Form16')]")).click();
			Thread.sleep(2000);

			// ===============Read Original FVU File==========

			// SalTDS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[11]/a")).click();
			Thread.sleep(2000);

			// Read Original FVU File
			driver.findElement(By.xpath("//a[contains(text(),'Read Original FVU File')]")).click();
			Thread.sleep(2000);

			// TAN No
			WebElement TANNo2 = driver.findElement(By.xpath("//select[@id='ddlTANNo']"));
			Select r21 = new Select(TANNo2);
			r21.selectByVisibleText("AAAA99999B");
			Thread.sleep(2000);

			// Select Branch
			WebElement SelectBranch = driver.findElement(By.xpath("//select[@id='ddlTDSMasterID']"));
			Select r22 = new Select(SelectBranch);
			r22.selectByVisibleText("Select");
			Thread.sleep(2000);

			// Financial Year
			WebElement FY10 = driver.findElement(By.xpath("//select[@id='ddlFinancialYear']"));
			Select r23 = new Select(FY10);
			r23.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

			// Quarter
			WebElement Quarter1 = driver.findElement(By.xpath("//select[@id='ddlQuarter']"));
			Select r24 = new Select(Quarter1);
			r24.selectByVisibleText("Q1");
			Thread.sleep(2000);

			// Browse button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(3000);

			// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(3000);

			// ******************************************************************************************************
//															LOGOUT
			// ******************************************************************************************************
			// ========================Logout=================
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
			Thread.sleep(5000);
			driver.close();

		}

	}
