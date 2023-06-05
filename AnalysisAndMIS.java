package com.Paypac;
	import java.util.ArrayList;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class AnalysisAndMIS {

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

	// *******************************************************************************************************
//			ANALYSIS AND MIS TITLE
	//*******************************************************************************************************	

	//***************Payroll Reconciliation**************

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Payroll Reconciliation
			driver.findElement(By.xpath("//a[contains(text(),'Payroll Reconciliation')]")).click();
			Thread.sleep(2000);

	// Payroll Reconciliation page
	//// Financial Year
	//WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
	//Select k = new Select(FinancialYear);
	//Thread.sleep(2000);
	//k.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k1= new Select(Month);
	//Thread.sleep(2000);	
	//k1.selectByVisibleText("");

	//// Previous Month
	//WebElement PreviousMonth = driver.findElement(By.xpath("//select[@id='PreviousMonth']"));
	//Select k2 = new Select(PreviousMonth);
	//Thread.sleep(2000);
	//k2.selectByVisibleText("March-22");
	//
	//// Select Employee
	//WebElement SelectEmployee = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
	//Select k3 = new Select(SelectEmployee);
	//Thread.sleep(2000);
	//k3.selectByVisibleText("All Employees");
	//// k3.selectByVisibleText("Selected Employees");
	//// k3.selectByVisibleText("Selected Group");
	//
	//// Employees
	//// Sorting
	//WebElement Sorting = driver.findElement(By.xpath("//select[@id='Sorting']"));
	//Select k4 = new Select(Sorting);
	//Thread.sleep(2000);
	//// k4.selectByVisibleText("Employee Code");
	//k4.selectByVisibleText("Name");
	//
	//// One Grouping btnSave
	//driver.findElement(By.xpath("//input[@id='Grouping']")).click();
	//Thread.sleep(2000);
	//
	//// Sroll down a page
	//WebElement Proceed = driver.findElement(By.xpath("//input[@id='btnSave']"));
	//JavascriptExecutor t = (JavascriptExecutor) driver;
	//t.executeScript("arguments[0].scrollIntoView()", Proceed);
	//Thread.sleep(2000);
	//
	//// Proceed button
	//driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	//Thread.sleep(2000);

	//=========Payroll Comparision Report=================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Payroll Comparision Report
			driver.findElement(By.xpath("//a[contains(text(),'Payroll Comparision Report')]")).click();
			Thread.sleep(2000);

	// Payroll Comparision Report page
	// Financial Year
			WebElement FinancialYear2 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k5 = new Select(FinancialYear2);
			Thread.sleep(2000);
			k5.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select v1= new Select(Month1);
	//Thread.sleep(2000);	
	//v1.selectByVisibleText("");

	// Previous Month
			WebElement PreviousMonth1 = driver.findElement(By.xpath("//select[@id='PreviousMonth']"));
			Select k7 = new Select(PreviousMonth1);
			Thread.sleep(2000);
			k7.selectByVisibleText("March-22");

	// Employees
	// Selkect Employee
			WebElement SelectEmployee1 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k8 = new Select(SelectEmployee1);
			Thread.sleep(2000);
			k8.selectByVisibleText("All Employees");
	// k8.selectByVisibleText("Selected Employees");
	// k8.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

	// Sorting
			WebElement Sorting1 = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select k9 = new Select(Sorting1);
			Thread.sleep(2000);
	// k9.selectByVisibleText("Employee Code");
			k9.selectByVisibleText("Name");
			Thread.sleep(2000);

	// No Grouping
			driver.findElement(By.xpath("//input[@id='Grouping']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Proceed1 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor t1 = (JavascriptExecutor) driver;
			t1.executeScript("arguments[0].scrollIntoView()", Proceed1);
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	//==========Annual Salary Component==========================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Annual Salary Component
			driver.findElement(By.xpath("//a[contains(text(),'Annual Salary Component')]")).click();
			Thread.sleep(2000);

	// Annual Salary Component page
	// Financial Year
			WebElement FinancialYear3 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k10 = new Select(FinancialYear3);
			Thread.sleep(2000);
			k10.selectByVisibleText("Apr 2022 - Mar 2023");

	// Employees
	// Select Employee
			WebElement SelectEmployee2 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k11 = new Select(SelectEmployee2);
			Thread.sleep(2000);
			k11.selectByVisibleText("All Employees");
	// k11.selectByVisibleText("Selected Employees");
	// k11.selectByVisibleText("Selected Group");
			Thread.sleep(2000);

	// Sorting
			WebElement Sorting2 = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select k12 = new Select(Sorting2);
			Thread.sleep(2000);
	// k12.selectByVisibleText("Employee Code");
			k12.selectByVisibleText("Name");
			Thread.sleep(2000);

	// No Grouping
			driver.findElement(By.xpath("//input[@id='Grouping']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Proceed2 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor t2 = (JavascriptExecutor) driver;
			t2.executeScript("arguments[0].scrollIntoView()", Proceed2);
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
	//driver.close();
	//driver.switchTo().window(tabs.get(0));
	// Annual Salary Component Analysis Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			driver.close();
			driver.switchTo().window(tabs1.get(0));

	//===========Annual Employee Salary=====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Annual Employee Salary
			driver.findElement(By.xpath("//a[contains(text(),'Annual Employee Salary')]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// Annual Employee Salary page
	// Employees
	// Select Employee
			WebElement SelectEmployee3 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k13 = new Select(SelectEmployee3);
			Thread.sleep(2000);
			k13.selectByVisibleText("All Employees");
	// k13.selectByVisibleText("Selected Employees");
	// k13.selectByVisibleText("Selected Group");

	// Selection
	// Financial Year
			WebElement FinancialYear4 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k14 = new Select(FinancialYear4);
			Thread.sleep(2000);
			k14.selectByVisibleText("Apr 2022 - Mar 2023");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
	//driver.close();
	//driver.switchTo().window(tabs.get(0));

	// Annual Salary Component Analysis Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	// Pop-up Screen (No salary has been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs3.get(1));
			driver.close();
			driver.switchTo().window(tabs3.get(0));

	//===============Monthly Payroll Analysis=====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Monthly Payroll Analysis
			driver.findElement(By.xpath("//a[contains(text(),'Monthly Payroll Analysis')]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// Annual Employee Salary page
	// Financial Year
			WebElement FinancialYear5 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k15 = new Select(FinancialYear5);
			Thread.sleep(2000);
			k15.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month3 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k16= new Select(Month3);
	//Thread.sleep(2000);	
	//k16.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee4 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k17 = new Select(SelectEmployee4);
			Thread.sleep(2000);
			k17.selectByVisibleText("Selected Group");

	// Grouping
	// No Grouping
			driver.findElement(By.xpath("//input[@id='Grouping']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Proceed3 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor t3 = (JavascriptExecutor) driver;
			t3.executeScript("arguments[0].scrollIntoView()", Proceed3);
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	//========Cost to Company====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Cost to Company
			driver.findElement(By.xpath("//a[contains(text(),'Cost to Company')]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// Cost to Company page
	// Financial Year
			WebElement FinancialYear6 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k18 = new Select(FinancialYear6);
			Thread.sleep(2000);
			k18.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k19= new Select(Month1);
	//Thread.sleep(2000);	
	//k19.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee5 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k19 = new Select(SelectEmployee5);
			Thread.sleep(2000);
			k19.selectByVisibleText("All Employees");
	// k19.selectByVisibleText("Selected Employees");
	// k19.selectByVisibleText("Selected Group");

	// Sorting
			WebElement Sorting3 = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select k20 = new Select(Sorting3);
			Thread.sleep(2000);
	// k20.selectByVisibleText("Employee Code");
			k20.selectByVisibleText("Name");
			Thread.sleep(2000);

	// No Grouping
			driver.findElement(By.xpath("//input[@id='Grouping']")).click();
			Thread.sleep(2000);

	// Salary Components
			WebElement Month1 = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
			Select k1 = new Select(Month1);
			Thread.sleep(2000);
			k1.selectByVisibleText("BAS");

	// Sroll down a page
			WebElement Proceed4 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor t4 = (JavascriptExecutor) driver;
			t4.executeScript("arguments[0].scrollIntoView()", Proceed4);
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs4.get(1));
	//driver.close();
	//driver.switchTo().window(tabs.get(0));

	// Cost to Company Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	// Pop-up Screen (No salary has been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs5.get(1));
			driver.close();
			driver.switchTo().window(tabs5.get(0));

	//===========Salary Increment=============================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Salary Increment
			driver.findElement(By.xpath("//a[contains(text(),'Salary Increment')]")).click();
			Thread.sleep(2000);

	// Salary Increment page
	// Previous Financial Years
	//WebElement PreviousFinancialYears = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
	//Select k18= new Select(PreviousFinancialYears);
	//Thread.sleep(2000);	
	//k18.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee6 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k21 = new Select(SelectEmployee6);
			Thread.sleep(2000);
			k21.selectByVisibleText("All Employees");
	// k21.selectByVisibleText("Selected Employees");
	// k21.selectByVisibleText("Selected Group");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// Switch tabs
			ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs6.get(1));

	// Salary Increment Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	// Switch tabs
			ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs7.get(1));
			driver.close();
			driver.switchTo().window(tabs4.get(0));

	//===============New / Left Employees====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// New / Left Employees
			driver.findElement(By.xpath("//a[contains(text(),'New / Left Employees')]")).click();
			Thread.sleep(2000);

	// New / Left Employees Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

	// Annual Employee Salary page
	// Financial Year
			WebElement FinancialYear7 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k22 = new Select(FinancialYear7);
			Thread.sleep(2000);
			k22.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k23= new Select(Month4);
	//Thread.sleep(2000);	
	//k23.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee7 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k24 = new Select(SelectEmployee7);
			Thread.sleep(2000);
			k24.selectByVisibleText("All Employees");
	// k24.selectByVisibleText("Selected Employees");
	// k24.selectByVisibleText("Selected Group");

	// Grouping
			WebElement Sorting4 = driver.findElement(By.xpath("//select[@id='Sorting']"));
			Select k25 = new Select(Sorting4);
			Thread.sleep(2000);
	// k25.selectByVisibleText("Employee Code");
			k25.selectByVisibleText("Name");
			Thread.sleep(2000);

	// No Grouping
			driver.findElement(By.xpath("//input[@id='Grouping']")).click();
			Thread.sleep(2000);

	// Sroll down a page
			WebElement Proceed5 = driver.findElement(By.xpath("//input[@id='btnSave']"));
			JavascriptExecutor t5 = (JavascriptExecutor) driver;
			t5.executeScript("arguments[0].scrollIntoView()", Proceed5);
			Thread.sleep(2000);

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	//====================Dashboard=========================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Dashboard
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
			Thread.sleep(2000);

	// Dashboard Page
	// Group By
			WebElement GroupBy = driver.findElement(By.xpath("//select[@id='GroupByFields_GroupByField']"));
			Select k26 = new Select(GroupBy);
			Thread.sleep(2000);
			k26.selectByVisibleText("Branch");

	// Financial Year
			WebElement FinancialYear8 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k27 = new Select(FinancialYear8);
			Thread.sleep(2000);
			k27.selectByVisibleText("Apr 2022 - Mar 2023");

	// Month
			WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
			Select k28 = new Select(Month);
			Thread.sleep(2000);
			k28.selectByVisibleText("May-22");

	//// 1.Monthly Gross Pay
	//driver.findElement(By.xpath("//a[contains(text(),'Monthly Gross Pay')]")).click();
	//Thread.sleep(2000);
	//
	//// 2.YTD Gross & Net Pay
	//driver.findElement(By.xpath("//a[contains(text(),'YTD Gross & Net Pay')]")).click();
	//Thread.sleep(2000);
	//
	//// 3.Employee Statistics
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"list\"]/li[3]/a")).click();
	//Thread.sleep(2000);

	//// 4.F & F List
	//driver.findElement(By.xpath("//a[contains(text(),'F & F List')]")).click();
	//Thread.sleep(2000);

	//// 5.Pending Salary & Leave Mapping List
	//driver.findElement(By.xpath("//a[contains(text(),'Pending Salary & Leave Mapping List')]")).click();
	//Thread.sleep(2000);

	//// 6.Investments Status
	//driver.findElement(By.xpath("(//a[contains(text(),'Investments Status')])")).click();
	//Thread.sleep(2000);

	//======== Salary Computation Comparison Report=========================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Salary Computation Comparison Report
			driver.findElement(By.xpath("//a[contains(text(),'Salary Computation Comparison Report')]")).click();
			Thread.sleep(2000);

	// Employee Computation and Annual Salary Comparison Report Page
	// Financial Year
			WebElement FinancialYear9 = driver.findElement(By.xpath("//select[@id='ddlYear']"));
			Select k29 = new Select(FinancialYear9);
			Thread.sleep(2000);
			k29.selectByVisibleText("Apr 2022 - Mar 2023");

	////Pop-up Screen (Salary has not been processed to view the report)
	//driver.findElement(By.xpath("(//a[@class='close'])")).click();
	//Thread.sleep(2000);

	// Sync Salary with Computation button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//*[@id=\"divMessage\"]/div/a")).click();
			Thread.sleep(2000);

	//==============Letters - 1.Appointment Letter==========================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Letters
			Actions act9 = new Actions(driver);
			WebElement Letters = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[11]/a"));
			act9.moveToElement(Letters).build().perform();

	// Appointment Letter
			driver.findElement(By.xpath("//a[contains(text(),'Appointment Letter')]")).click();
			Thread.sleep(2000);

	// Appointment Letter Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	// Print Letter
	// Financial Year
			WebElement FinancialYear0 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k30 = new Select(FinancialYear0);
			Thread.sleep(2000);
			k30.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month5 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k31= new Select(Month5);
	//Thread.sleep(2000);	
	//k31.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee8 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k31 = new Select(SelectEmployee8);
			Thread.sleep(2000);
			k31.selectByVisibleText("All Employees");
	// k31.selectByVisibleText("Selected Employees");
	// k31.selectByVisibleText("Selected Group");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act10 = new Actions(driver);
			act10.sendKeys(Keys.PAGE_UP).build().perform();

	// Edit Letter
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);

	// Headings
			WebElement Headings = driver.findElement(By.xpath("//select[@id='Headings']"));
			Select k32 = new Select(Headings);
			Thread.sleep(2000);
			k32.selectByVisibleText("Salary Components");

	// Items
			WebElement Items = driver.findElement(By.xpath("//select[@id='Items']"));
			Select k33 = new Select(Items);
			Thread.sleep(2000);
			k33.selectByVisibleText("Basic Salary");

	// Add button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(2000);

	// //scroll up a page
			Actions act11 = new Actions(driver);
			act11.sendKeys(Keys.PAGE_UP).build().perform();

	// Save button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[4]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	//=================Letters - 2.Experience Letter=================================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Letters
			Actions act12 = new Actions(driver);
			WebElement Letters1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[11]/a"));
			act12.moveToElement(Letters1).build().perform();

	// Experience Letter
			driver.findElement(By.xpath("//a[contains(text(),'Experience Letter')]")).click();
			Thread.sleep(2000);

	// Experience Letter Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	// Print Letter
	// Financial Year
			WebElement FinancialYear10 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k34 = new Select(FinancialYear10);
			Thread.sleep(2000);
			k34.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
	//WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
	//Select k35= new Select(Month4);
	//Thread.sleep(2000);	
	//k35.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee9 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k36 = new Select(SelectEmployee9);
			Thread.sleep(2000);
			k36.selectByVisibleText("All Employees");
	// k36.selectByVisibleText("Selected Employees");
	// k36.selectByVisibleText("Selected Group");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.PAGE_UP).build().perform();

	// Edit Letter
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);

	// Headings
			WebElement Headings1 = driver.findElement(By.xpath("//select[@id='Headings']"));
			Select k37 = new Select(Headings1);
			Thread.sleep(2000);
			k37.selectByVisibleText("Salary Components");

	// Items
			WebElement Items1 = driver.findElement(By.xpath("//select[@id='Items']"));
			Select k38 = new Select(Items1);
			Thread.sleep(2000);
			k38.selectByVisibleText("Basic Salary");

	// Add button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(2000);

	// //scroll up a page
			Actions act13 = new Actions(driver);
			act13.sendKeys(Keys.PAGE_UP).build().perform();

	// Save button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[4]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	//============Letters - 3.Increment Letter======================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Letters
			Actions act14 = new Actions(driver);
			WebElement Letters2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[11]/a"));
			act14.moveToElement(Letters2).build().perform();

	// Increment Letter
			driver.findElement(By.xpath("//a[contains(text(),'Increment Letter')]")).click();
			Thread.sleep(2000);

	// Increment Letter Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	// Print Letter
	// Financial Year
			WebElement FinancialYear11 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k39 = new Select(FinancialYear11);
			Thread.sleep(2000);
			k39.selectByVisibleText("Apr 2022 - Mar 2023");

	// Month
//		WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//		Select k40= new Select(Month4);
//		Thread.sleep(2000);	
//		k40.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee10 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k41 = new Select(SelectEmployee10);
			Thread.sleep(2000);
			k41.selectByVisibleText("All Employees");
	// k41.selectByVisibleText("Selected Employees");
	// k41.selectByVisibleText("Selected Group");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act15 = new Actions(driver);
			act15.sendKeys(Keys.PAGE_UP).build().perform();

	// Edit Letter
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);

	// Headings
			WebElement Headings2 = driver.findElement(By.xpath("//select[@id='Headings']"));
			Select k42 = new Select(Headings2);
			Thread.sleep(2000);
			k42.selectByVisibleText("Salary Components");

	// Items
			WebElement Items2 = driver.findElement(By.xpath("//select[@id='Items']"));
			Select k43 = new Select(Items2);
			Thread.sleep(2000);
			k43.selectByVisibleText("Basic Salary");

	// Add button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act16 = new Actions(driver);
			act16.sendKeys(Keys.PAGE_UP).build().perform();

	// Save button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[4]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	//=================Letters -  4.Promotion Letter==============================================================
	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Letters
			Actions act17 = new Actions(driver);
			WebElement Letters3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[11]/a"));
			act17.moveToElement(Letters3).build().perform();

	// Promotion Letter
			driver.findElement(By.xpath("//a[contains(text(),'Promotion Letter')]")).click();
			Thread.sleep(2000);

	// Promotion Letter Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	// Print Letter
	// Financial Year
			WebElement FinancialYear12 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k44 = new Select(FinancialYear12);
			Thread.sleep(2000);
			k44.selectByVisibleText("Apr 2022 - Mar 2023");

	////Month
//		WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//		Select k45= new Select(Month4);
//		Thread.sleep(2000);	
//		k45.selectByVisibleText("");

	// Employees
	// Select Employee
			WebElement SelectEmployee11 = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
			Select k46 = new Select(SelectEmployee11);
			Thread.sleep(2000);
			k46.selectByVisibleText("All Employees");
	// k46.selectByVisibleText("Selected Employees");
	// k46.selectByVisibleText("Selected Group");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act18 = new Actions(driver);
			act18.sendKeys(Keys.PAGE_UP).build().perform();

	// Edit Letter
			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
			Thread.sleep(2000);

	// Headings
			WebElement Headings3 = driver.findElement(By.xpath("//select[@id='Headings']"));
			Select k47 = new Select(Headings3);
			Thread.sleep(2000);
			k47.selectByVisibleText("Salary Components");

	// Items
			WebElement Items3 = driver.findElement(By.xpath("//select[@id='Items']"));
			Select k48 = new Select(Items3);
			Thread.sleep(2000);
			k48.selectByVisibleText("Basic Salary");

	// Add button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(2000);

	// scroll up a page
			Actions act19 = new Actions(driver);
			act19.sendKeys(Keys.PAGE_UP).build().perform();

	// Save button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[4]")).click();
			Thread.sleep(2000);

	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	//================Monthly Processed Salary Register====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000); // Monthly Processed Salary Register
			driver.findElement(By.xpath("//a[contains(text(),'Monthly Processed Salary Register')]")).click();
			Thread.sleep(2000);

	// Monthly Processed Salary Register Page
	// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("(//a[@class='close'])")).click();
			Thread.sleep(2000);

	// Financial Year
			WebElement FinancialYear13 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k49 = new Select(FinancialYear13);
			Thread.sleep(2000);
			k49.selectByVisibleText("Apr 2022 - Mar 2023");

	// Month
//		WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//		Select k50= new Select(Month4);
//		Thread.sleep(2000);	
//		k50.selectByVisibleText("");

	// Mode of Report
			WebElement SelectEmployee12 = driver.findElement(By.xpath("//select[@id='ModeOfReport']"));
			Select k51 = new Select(SelectEmployee12);
			Thread.sleep(2000);
			k51.selectByVisibleText("All");
	// k51.selectByVisibleText("Arrear Components");
	// k51.selectByVisibleText("Non PaySlip Components");
	// k51.selectByVisibleText("PaySlip Components");

	// Structure Value
			driver.findElement(By.xpath("//input[@id='StrFlag']")).click();
			Thread.sleep(2000);

	// ==========Audit Trail Reports - 1.SalaryComponent======================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Audit Trail Reports
			Actions act20 = new Actions(driver);
			WebElement AuditTrailReports = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[13]/a"));
			act20.moveToElement(AuditTrailReports).build().perform();

	// 1.SalaryComponent
			driver.findElement(By.xpath("//a[contains(text(),'SalaryComponent')]")).click();
			Thread.sleep(2000);

	// Audit Trail Report - SalaryComponent Page
	// Download PDF
			driver.findElement(By.xpath("//a[contains(text(),'Download PDF')]")).click();
			Thread.sleep(2000);

	//===============Audit Trail Reports - 2.Salary Structure=====================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Audit Trail Reports
			Actions a5 = new Actions(driver);
			WebElement AuditTrailReports1 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[13]/a"));
			a5.moveToElement(AuditTrailReports1).build().perform();

	// 2.Salary Structure
			driver.findElement(By.xpath("//a[contains(text(),'Salary Structure')]")).click();
			Thread.sleep(2000);

	// Audit Trail Report - Salary Structure Page
	// Report Type
			WebElement SelectEmployee13 = driver.findElement(By.xpath("//select[@id='SelectedReportType']"));
			Select k50 = new Select(SelectEmployee13);
			Thread.sleep(2000);
			k50.selectByVisibleText("Earnings Report");
	// k50.selectByVisibleText("Deductions Report");

	// Proceed button
			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs8.get(1));

	// Earnings Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	// Pop-up Screen (No Data Found)
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs9.get(1));
			driver.close();
			driver.switchTo().window(tabs9.get(0));

	//==========Audit Trail Reports - 3.Employee Movement================

	// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

	// Audit Trail Reports
			Actions a6 = new Actions(driver);
			WebElement AuditTrailReports2 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/ul/li[13]/a"));
			a6.moveToElement(AuditTrailReports2).build().perform();

	// 3.Employee Movement
			driver.findElement(By.xpath("//a[contains(text(),'Employee Movement')]")).click();
			Thread.sleep(2000);

	// Audit Trail Report - Employee Movement Page
	// Financial Year
			WebElement FinancialYear14 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
			Select k52 = new Select(FinancialYear14);
			Thread.sleep(2000);
			k52.selectByVisibleText("Apr 2022 - Mar 2023");

	// Criteria
			WebElement SelectEmployee14 = driver.findElement(By.xpath("//select[@id='GroupByFields_GroupByField']"));
			Select k53 = new Select(SelectEmployee14);
			Thread.sleep(2000);
			k53.selectByVisibleText("Branch");

	// Proceed button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	// Switch tabs
			ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs10.get(1));

	// Earnings Report Page
	// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

	// Switch tabs
			ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs11.get(1));
			driver.close();
			driver.switchTo().window(tabs11.get(0));

			driver.close();
		}

	}

