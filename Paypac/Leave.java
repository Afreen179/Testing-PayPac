package com.Paypac;
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Leave {

		public static void main(String[] args) throws InterruptedException, IOException {
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

	//**********************************************************************************************
//									LEAVE TITLE
	//*********************************************************************************************

	//**********************Masters - Define Leave**********************
	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Masters
			Actions f = new Actions(driver);
			WebElement Masters = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/ul/li[1]/a"));
			f.moveToElement(Masters).build().perform();

	// Define Leave
			driver.findElement(By.xpath("//a[contains(text(),'Define Leave')]")).click();
			Thread.sleep(2000);

	// Details Link
			driver.findElement(By.xpath("(//a[contains(text(),'Details')])[4]")).click();
			Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	//=============Masters - Configure Leave==================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Masters
			Actions f1 = new Actions(driver);
			WebElement Masters1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/ul/li[1]/a"));
			f1.moveToElement(Masters1).build().perform();

	// Configure Leave
			driver.findElement(By.xpath("//a[contains(text(),'Configure Leave')]")).click();
			Thread.sleep(2000);

	// Branch
			WebElement Branch = driver.findElement(By.xpath("//select[@id='CompanyID']"));
			Select f2 = new Select(Branch);
			f2.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Download Template button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]")).click();
			Thread.sleep(2000);

	//=====================Employee Leave Mapping==============
	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Employee Leave Mapping
			driver.findElement(By.xpath("//a[contains(text(),'Employee Leave Mapping')]")).click();
			Thread.sleep(2000);

	// Branch
			WebElement Branch1 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select f3 = new Select(Branch1);
			f3.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Thread.sleep(2000);

	// Details Link
			driver.findElement(By.xpath("(//a[contains(text(),'Details')])[4]")).click();
			Thread.sleep(2000);

	// Close button
			driver.findElement(By.xpath("(//button[@class='btn'])[2]")).click();
			Thread.sleep(2000);

	//=================Carry Forward Balances============================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Carry Forward Balances
			driver.findElement(By.xpath("//a[contains(text(),'Carry Forward  Balances')]")).click();
			Thread.sleep(2000);
	// Leave Year
			WebElement LeaveYear = driver.findElement(By.xpath("//select[@id='LeaveYearID']"));
			Select f6 = new Select(LeaveYear);
			f6.selectByVisibleText("Jan 2022 - Dec 2022");
			Thread.sleep(2000);
	// Branch
			WebElement Branch2 = driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_CompanyID']"));
			Select f7 = new Select(Branch2);
			f7.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//=================Absent Entry=====================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Absent Entry
			driver.findElement(By.xpath("//a[contains(text(),'Absent Entry')]")).click();
			Thread.sleep(2000);

	// Branch
			WebElement Branch3 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select f8 = new Select(Branch3);
			f8.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

	// Update Employee Absent Entry pop-up screen
	// Absent Count
			driver.findElement(By.xpath("//input[@id='AbsentCount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AbsentCount']")).sendKeys("2");
			Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	//==========================Leave Entry=====================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Leave Entry
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/ul/li[5]/a")).click();
			Thread.sleep(2000);

	// Branch
			WebElement Branch4 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select f9 = new Select(Branch4);
			f9.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Modify Link
			driver.findElement(By.xpath("//a[contains(text(),'Modify')]")).click();
			Thread.sleep(2000);

	// Modify Employee Monthly Leave pop-up screen
	// Absent Count
			driver.findElement(By.xpath("//input[@id='AbsCount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AbsCount']")).sendKeys("2");
			Thread.sleep(2000);
	// Leave Name
			WebElement Branch5 = driver.findElement(By.xpath("//select[@id='LeaveID']"));
			Select f10 = new Select(Branch5);
			f10.selectByVisibleText("LOP");
			Thread.sleep(2000);
	// Leave Count
			driver.findElement(By.xpath("//input[@id='LeaveCount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='LeaveCount']")).sendKeys("0");
			Thread.sleep(2000);

	// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	//================Adjust Leave Balances====================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Adjust Leave Balances
			driver.findElement(By.xpath("//a[contains(text(),'Adjust Leave Balances')]")).click();
			Thread.sleep(2000);

	// Financial Year
			WebElement FinancialYear1 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select f11 = new Select(FinancialYear1);
			f11.selectByVisibleText("Apr 2022 - Mar 2023");
			Thread.sleep(2000);

	// Close Month
			WebElement CloseMonth = driver.findElement(By.xpath("//select[@id='Month']"));
			Select f12 = new Select(CloseMonth);
			f12.selectByVisibleText("March-22");
			Thread.sleep(2000);

	// Branch
			WebElement Branch8 = driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_CompanyID']"));
			Select f13 = new Select(Branch8);
			f13.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	////scroll down a page
	//WebElement Previous = driver.findElement(By.xpath("(//a[contains(text(),'Previous')])"));
	//JavascriptExecutor g = (JavascriptExecutor) driver;
	//g.executeScript("arguments[0].scrollIntoView()", Previous);
	//// scroll down a page
	//Actions f14 = new Actions(driver);
	//f14.sendKeys(Keys.PAGE_DOWN).build().perform();
	// Edit Link
//			driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
//			Thread.sleep(2000);

	// Leave Correction pop-up screen
	// Absent Count
//			driver.findElement(By.xpath("//input[@id='EditAbsentCount']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='EditAbsentCount']")).sendKeys("2");
//			Thread.sleep(2000);
	//
	//// Cancel button
//			driver.findElement(By.xpath("//button[@class='btn']")).click();
//			Thread.sleep(2000);

	// ======================Exception===========================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Exception
			driver.findElement(By.xpath("//a[contains(text(),'Exception')]")).click();
			Thread.sleep(2000);

	// Leave Year
			WebElement LeaveYear1 = driver.findElement(By.xpath("//select[@id='LeaveYearId']"));
			Select f15 = new Select(LeaveYear1);
			f15.selectByVisibleText("Jan 2022 - Dec 2022");
			Thread.sleep(2000);

	// Branch
			WebElement Branch9 = driver.findElement(By.xpath("//select[@id='EmployeeProfessionalDetail_CompanyID']"));
			Select f16 = new Select(Branch9);
			f16.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// ==================Encashment====================

	// Leave Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
			Thread.sleep(2000);

	// Encashment
			driver.findElement(By.xpath("//a[contains(text(),'Encashment')]")).click();
			Thread.sleep(2000);

	// Branch
			WebElement Branch10 = driver.findElement(By.xpath("//select[@id='BranchID']"));
			Select f17 = new Select(Branch10);
			f17.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);

	// Search button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Download Template button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

	// ======================Leave Credit================

	//// Leave Title
	//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
	//Thread.sleep(2000);

	//// Leave Credit
	//driver.findElement(By.xpath("//a[contains(text(),'Leave Credit')]")).click();
	//Thread.sleep(2000);
	//
	//// Branch
	//WebElement Branch11 = driver.findElement(By.xpath("//select[@id='BranchID']"));
	//Select f18 = new Select(Branch11);
	//f18.selectByVisibleText("DAMAN UNIT I AND II");
	//Thread.sleep(2000);
	//
	//// Search button
	//driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	//Thread.sleep(2000);
	//
	//// Edit Link
	//driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	//Thread.sleep(2000);
	//
	//// Leave Credit Mapping pop-up screen
	//// Leave Type
	//WebElement LeaveType = driver.findElement(By.xpath("//select[@id='LeaveID']"));
	//Select f19 = new Select(LeaveType);
	//f19.selectByVisibleText("EL");
	//Thread.sleep(2000);
	//
	//// LeaveCredit
	//driver.findElement(By.xpath("//input[@id='LeaveCredit']")).clear();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='LeaveCredit']")).sendKeys("1");
	//Thread.sleep(2000);
	//
	//// Cancel button
	//driver.findElement(By.xpath("//button[@class='btn']")).click();
	//Thread.sleep(2000);
	//=============================================================================================================		
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
			Thread.sleep(5000);

			driver.close();

		}
	}

