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

	public class WebPayPac {

		public static void main(String[] args) throws InterruptedException

		{

			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
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

	//***********************************************************************
//	                               MASTER TITLE
	//***********************************************************************
			// **********Company master******************

			// Master-Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(5000);

			// company master
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[1]/a")).click();
			Thread.sleep(2000);

			// Edit
			driver.findElement(By.xpath("//*[@id=\"entityTableServerSide\"]/tbody/tr/td[8]/a[1]")).click();
			Thread.sleep(2000);

			// company name
			driver.findElement(By.xpath("//*[@id=\"CompanyName\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"CompanyName\"]")).sendKeys("MEDLEY PHARMACEUTICALS LIMITED");
			Thread.sleep(2000);
			// Company logo
			// driver.findElement(By.xpath("//input[@placeholder='Selectfile']")).click();

			// phone
			driver.findElement(By.xpath("//*[@id=\"Phone\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("02268757575");
			Thread.sleep(3000);

			// address1
			driver.findElement(By.xpath("//*[@id=\"Address1\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"Address1\"]")).sendKeys("MEDLEY HOUSE D 2 M I D C AREA ANDHERI (EAST)");
			Thread.sleep(2000);

			// Javascript executor
			WebElement pincode = driver.findElement(By.xpath("//*[@id=\"PinCode\"]"));
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView()", pincode);

			// country
			WebElement country = driver.findElement(By.xpath("//*[@id=\"City_State_CountryID\"]"));
			Select st = new Select(country);
			st.selectByVisibleText("India");
			Thread.sleep(2000);
			// state
			WebElement state = driver.findElement(By.xpath("//*[@id=\"City_StateID\"]"));
			Select st1 = new Select(state);
			st1.selectByVisibleText("Maharashtra");
			Thread.sleep(2000);
			// city
			WebElement city = driver.findElement(By.xpath("//*[@id=\"CityID\"]"));
			Select ct = new Select(city);
			ct.selectByVisibleText("MUMBAI");
			Thread.sleep(2000);
			// pincode
			driver.findElement(By.xpath("//*[@id=\"PinCode\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"PinCode\"]")).sendKeys("400093");
			Thread.sleep(2000);

			// Cancel
			driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/button")).click();
			Thread.sleep(2000);

			// Master-title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);

	// *****************Add product admin***********************

			// Add product admin
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[2]/a")).click();
			Thread.sleep(2000);

	// ******************Mandatory**********************

			// Mandatory
			// masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Mandatory
			Actions count = new Actions(driver);
			WebElement mandatory = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/a"));
			count.moveToElement(mandatory).build().perform();
			Thread.sleep(2000);
			// Country
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);

			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Mandatory
			Actions sta = new Actions(driver);
			WebElement mandatory1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/a"));
			sta.moveToElement(mandatory1).build().perform();
			Thread.sleep(2000);
			// State
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Mandatory
			Actions cit = new Actions(driver);
			WebElement mandatory2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/a"));
			cit.moveToElement(mandatory2).build().perform();
			Thread.sleep(2000);
			// City
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Mandatory
			Actions brn = new Actions(driver);
			WebElement mandatory3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/a"));
			brn.moveToElement(mandatory3).build().perform();
			Thread.sleep(2000);
			// State
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/ul/li[4]/a")).click();
			Thread.sleep(2000);

			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Mandatory
			Actions desig = new Actions(driver);
			WebElement mandatory4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/a"));
			desig.moveToElement(mandatory4).build().perform();
			Thread.sleep(2000);
			// Designation
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[3]/ul/li[5]/a")).click();
			Thread.sleep(2000);

	// *****************Miscellanous********************

			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Miscellanous
			Actions dept = new Actions(driver);
			WebElement misc = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/a"));
			Thread.sleep(2000);
			dept.moveToElement(misc).build().perform();
			Thread.sleep(2000);
			// Department
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Miscellanous
			Actions categ = new Actions(driver);
			WebElement misc1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/a"));
			Thread.sleep(2000);
			categ.moveToElement(misc1).build().perform();
			Thread.sleep(2000);
			// Category
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Miscellanous
			Actions costcenter = new Actions(driver);
			WebElement misc2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/a"));
			Thread.sleep(2000);
			costcenter.moveToElement(misc2).build().perform();
			Thread.sleep(2000);
			// Cost Center
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Miscellanous
			Actions grade = new Actions(driver);
			WebElement misc3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/a"));
			Thread.sleep(2000);
			grade.moveToElement(misc3).build().perform();
			Thread.sleep(2000);
			// Grade
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// Miscellanous
			Actions Section = new Actions(driver);
			WebElement misc4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/a"));
			Thread.sleep(2000);
			Section.moveToElement(misc4).build().perform();
			Thread.sleep(2000);
			// Section
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[4]/ul/li[5]/a")).click();
			Thread.sleep(2000);

	// ***************User defined parameter********************

			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// UDM
			Actions udm = new Actions(driver);
			WebElement userdef = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[5]/a"));
			Thread.sleep(2000);
			udm.moveToElement(userdef).build().perform();
			Thread.sleep(2000);
			// UDM
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[5]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			// Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);
			// UDM DATA
			Actions udmdata = new Actions(driver);
			WebElement userdef1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[5]/a"));
			Thread.sleep(2000);
			udmdata.moveToElement(userdef1).build().perform();
			Thread.sleep(2000);
			// UDM
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[5]/ul/li[2]/a")).click();
			Thread.sleep(2000);

			// Master-Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);

			// Bank
			Actions a = new Actions(driver);
			WebElement Bank = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[6]/a"));
			a.moveToElement(Bank).build().perform();

			// Define Bank
			driver.findElement(By.xpath("//a[contains(text(),'Define Bank')]")).click();
			Thread.sleep(2000);

			// Edit Link
			driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			Thread.sleep(2000);

			// update Bank pop-up screen
			// BankName
			driver.findElement(By.xpath("//input[@id='BankName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='BankName']")).sendKeys("Test1");
			// save button
			driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/input")).click();
			Thread.sleep(2000);
			// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

			// Master-Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);

			// Bank
			Actions a1 = new Actions(driver);
			WebElement Bank1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[6]/a"));
			a1.moveToElement(Bank1).build().perform();

			// Bank Branch
			driver.findElement(By.xpath("//a[contains(text(),'Bank Branch')]")).click();
			Thread.sleep(2000);

			// BankName drop-down
			WebElement BankName = driver.findElement(By.id("BankID"));
			Select bn = new Select(BankName);
			bn.selectByIndex(1);
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Create Bank Branch pop-up screen
			// Branch Code
			driver.findElement(By.xpath("//input[@id='BranchCode']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='BranchCode']")).sendKeys("Test");
			Thread.sleep(2000);

			// Branch Name
			driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("TEST1");
			Thread.sleep(2000);

			// IFSC Code
			driver.findElement(By.xpath("//input[@id='IFSCCode']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IFSCCode']")).sendKeys("TEST2");
			Thread.sleep(2000);

			// Save button
			// driver.findElement(By.xpath("//input[@id='txtNavigationTypeahead']")).click();
			// Thread.sleep(2000);
			// Successful Message pop-up screen
			// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			// Thread.sleep(2000);

			// cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

			// Master-Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);

			// Bank
			Actions a2 = new Actions(driver);
			WebElement Bank2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/ul/li[6]/a"));
			a2.moveToElement(Bank2).build().perform();

			// Employer Bank Master
			driver.findElement(By.xpath("//a[contains(text(),'Employer Bank Master')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// update Employer Bank pop-up screen
			// Bank Name
			WebElement BankName1 = driver.findElement(By.xpath("//select[@id='BankBranch_BankID']"));
			Select bn1 = new Select(BankName1);
			bn1.selectByIndex(1);
			Thread.sleep(2000);

			// Branch Name- defect
			// WebElement BranchName =
			// driver.findElement(By.xpath("//select[@id='BankBranchID']"));
			// Select bn2 = new Select(BranchName);
			// bn2.selectByIndex(1);
			// Thread.sleep(2000);

			// Account Type
			WebElement AccountType = driver.findElement(By.xpath("//select[@id='BankAccountTypeID']"));
			Select bn3 = new Select(AccountType);
			bn3.selectByIndex(2);
			Thread.sleep(2000);

			// Account No
			driver.findElement(By.xpath("//input[@id='AccountNo']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AccountNo']")).sendKeys("0987654321");

			// Save button
			// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			// Thread.sleep(2000);
			// Successful Message pop-up screen
			// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			// Thread.sleep(2000);

			// Cancel button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

			// Master-Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
			Thread.sleep(2000);

			// Location
			driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

			// Create Office Locations page
			// Branch Name
			WebElement BranchName1 = driver.findElement(By.xpath("//select[@id='CompanyID']"));
			Select bn4 = new Select(BranchName1);
			bn4.selectByIndex(2);
			Thread.sleep(2000);

			// Location Code
			driver.findElement(By.xpath("//input[@id='LocationCode']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='LocationCode']")).sendKeys("TEST");
			Thread.sleep(2000);
			// Location Name
			driver.findElement(By.xpath("//input[@id='LocationName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='LocationName']")).sendKeys("TEST");
			Thread.sleep(2000);
			// Physical Location
			driver.findElement(By.xpath("//input[@id='PhysicalLocation']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PhysicalLocation']")).sendKeys("TEST");
			Thread.sleep(2000);
			// Save button
			// driver.findElement(By.xpath("//input[@id='save']")).click();
			// Thread.sleep(2000);
			// Successful Message pop-up screen
			// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			// Thread.sleep(2000);
			// Cancel button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

//						
//						//Master-Title
//						driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
//						Thread.sleep(2000);
//								
//						//FlexiPay Master
//						driver.findElement(By.xpath("//a[contains(text(),'FlexiPay Master')]")).click();
//						Thread.sleep(2000);
//							
//						//Add button
//						driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[5]/a")).click();
//						Thread.sleep(2000);
//						
//						//SalaryComponentCode
//						WebElement SalaryComponentCode = driver.findElement(By.xpath("//*[@id=\"SalaryComponentCode\"]"));
//						Select bn5 = new Select(SalaryComponentCode);
//						bn5.selectByIndex(2);
//						Thread.sleep(2000);
//						//UDMCode
//						WebElement UDMCode = driver.findElement(By.xpath("//select[@id='UDMCode']"));
//						Select bn6= new Select(UDMCode);
//						bn6.selectByIndex(2);
//						Thread.sleep(2000);
//						
//						//Code 
//						Thread.sleep(2000);				
//					WebElement Code = driver.findElement(By.xpath("//select[@id='Code']"));
//						Select bn7= new Select(Code);
//						b8.selectByIndex(1);
//						Thread.sleep(2000);				
//						
//						//MinValue
//						driver.findElement(By.xpath("//input[@id='MinValue']")).sendKeys("500");
//						Thread.sleep(2000);
//							
//						//MaxValue
//						driver.findElement(By.xpath("//input[@id='MaxValue']")).sendKeys("1000");
//						Thread.sleep(2000);
//							
//						//Cancel button		
//						driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/button")).click();	
//						Thread.sleep(2000);
//						
//						//Save button		
//						//driver.findElement(By.xpath("//*[@id="entityModal"]/div[3]/input")).click();	
//						//Thread.sleep(2000);
//						//Successful Message pop-up screen
//						//driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//						//Thread.sleep(2000);
//						
			//// Edit Link
			//// driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
			//// Thread.sleep(2000);
//									
			//// Update pop-up screen
//							
			//// Min Value
			//// driver.findElement(By.xpath("//input[@id='MinValue']")).clear();
			//// Thread.sleep(2000);
			//// driver.findElement(By.xpath("//input[@id='MinValue']")).sendKeys("500");
			//// Thread.sleep(2000);
			//// Max Value
			//// driver.findElement(By.xpath("//input[@id='MaxValue']")).clear();
			//// Thread.sleep(2000);
			//// driver.findElement(By.xpath("//input[@id='MaxValue']")).sendKeys("2000");
			//// Thread.sleep(2000);
			//// Save button
			//// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			//// Thread.sleep(2000);
			//// Successful Message pop-up screen
			//// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			//// Thread.sleep(2000);
//						
			//// ********************************************************************
//						
//			//Master-Title
//						driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
//						Thread.sleep(2000);
//								
//						//Document Master
//						driver.findElement(By.xpath("//a[contains(text(),'Document Master')]")).click();
//						Thread.sleep(2000);
//						
//						//Add button		
//						driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();	
//						Thread.sleep(2000);
//						//Create Document pop-up screen
//						
//				        driver.findElement(By.xpath("//input[@id='DocumentName']")).sendKeys("Test");
//						Thread.sleep(2000);
//						
//					
//						//Save button		
//						driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();	
//						Thread.sleep(2000);
//						
//				       //Cancel button
//						driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();	
//						Thread.sleep(2000);
//						
//						//Error Message pop-up screen
//				        driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//						Thread.sleep(2000);	

	//***************************************************************************************
//	                              CONFIGURATION TITLE
	//***************************************************************************************

	// ************company info - Configure Contact Us*************
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

	// --------------company info - Configure About Us -----------

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

	// ------------Access - 1.Define User----------------

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

	// ------------Access - 2.Define Role----------------

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

//					// Edit Link
//					driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
//					Thread.sleep(2000);
			//
//					// New Password
//					driver.findElement(By.id("NewPassword")).sendKeys("12345678");
//					Thread.sleep(2000);

			// Save button
			// driver.findElement(By.xpath("(//input[@class='btn
			// btn-primary'])[3]")).click();
			// Thread.sleep(3000);

			// Successful Message pop-up screen
			// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			// Thread.sleep(2000);
			// driver.close();

//					// Cancel button
//					driver.findElement(By.xpath("//button[@class='btn']")).click();
//					Thread.sleep(3000);

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

//					// No
//					driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[2]")).click();
//					Thread.sleep(2000);
			//
//					// DefaultPassword
			//
//					// driver.findElement(By.xpath("//a[contains(text(),'DefaultPassword')]")).sendKeys("DefaultPassword");
//					// Thread.sleep(2000);
			//
//					// scroll down a page
//					Actions act2 = new Actions(driver);
//					act2.sendKeys(Keys.PAGE_DOWN).build().perform();
			//
//					// Save button
//					driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//					Thread.sleep(2000);
			//
//					// Successful Message pop-up screen
//					driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//					Thread.sleep(2000);
			//
//					// scroll up a page
//					Actions act3 = new Actions(driver);
//					act3.sendKeys(Keys.PAGE_UP).build().perform();
			//
//					// (vii)SMTP Settings
			//
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//a[contains(text(),'SMTP Settings')]")).click();
//					Thread.sleep(2000);
			//
//					// Host Name
//					driver.findElement(By.xpath("//input[@id='Host']")).clear();
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='Host']")).sendKeys("smtp@gmail.com");
//					Thread.sleep(2000);
//					// User Name
//					driver.findElement(By.xpath("//input[@id='UserName']")).clear();
//					Thread.sleep(3000);
//					driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
			//
//					// Password
//					// driver.findElement(By.xpath("//input[@id='Password']")).clear();
//					// Thread.sleep(3000);
//					// driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("");
			//
//					// Port Number
//					driver.findElement(By.xpath("//input[@id='PortNumber']")).clear();
//					Thread.sleep(3000);
//					driver.findElement(By.xpath("//input[@id='PortNumber']")).sendKeys("587");
			//
//					// Save button
//					// driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//					// Thread.sleep(3000);
			//
//					// Successful Message pop-up screen
//					// driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//					// Thread.sleep(2000);

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

	// --------------Statutory - 3.Configure P Tax---------------------------------

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

	// ------------Statutory - Configure LWF-----------------

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

	// -------------Bonus - Statewise Minimum Wages----------

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

	// -----------Configure Gratuity--------------

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
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"form0\"]/div/div[6]/div/div/a")).click();
//			Thread.sleep(2000);

			// scroll down a page
//			Actions b8 = new Actions(driver);
//			a8.sendKeys(Keys.PAGE_DOWN).build().perform();
//			Thread.sleep(2000);

			// Back button
//			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[4]/span/a")).click();
//			Thread.sleep(2000);

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

	// ---------------------Others - 1.Global Parameters-----------------

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

	//***************************************************************************************
//	    							  PAY TITLE
	//***************************************************************************************

	// *******************Define Financial Year ************************

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
	// *******************Statutory Masters - 1. PF Branch Master*************

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

	// ==============Statutory Masters - 2.ESIC Branch Master===========================

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

	// ===============Statutory Masters -3.PTax Branch Master=====================

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

	// ============Total Days Masters - Total Day Parameter==============================

			// Total Days Masters
			// Pay Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/a")).click();
			Thread.sleep(2000);

			// Total Days Masters
			Actions c9 = new Actions(driver);
			WebElement TotalDaysMasters = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[3]/a"));
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
			WebElement TotalDaysMasters1 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[3]/a"));
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
			WebElement DefineComponents = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[5]/a"));
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
			WebElement DefineComponents1 = driver
					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[3]/ul/li[5]/a"));
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

	//**********************************************************************************************
//											EMPLOYEE TITLE
	//*********************************************************************************************
	//******************************************Employee Masters**********************************

			// Employee Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/a")).click();
			Thread.sleep(2000);

			// Employee Masters
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[4]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			// Branch Name
			WebElement BranchName2 = driver.findElement(By.xpath("//Select[@id='ddlBranchID']"));
			Select p = new Select(BranchName2);
			p.selectByVisibleText("DAMAN UNIT I AND II");
			Thread.sleep(2000);
			// Edit Link
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

	//===================Map Components==================	

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
			// =========================================Additional
			// Details=================================================================

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

//								//Provident Fund
//								//P.F. Applicable
//									//Yes  
//									driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPFApplicable'])[2]")).click();
//									Thread.sleep(2000);
//								//Consider Max Salary for P.F. Deduction  
//									//Yes  
//									driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsEPSApplicable'])[1]")).click();
//									Thread.sleep(2000);
//								//E.P.S. Applicable
//									//Yes  
//									driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsMaxSalForPFDeduction'])[1]")).click();
//									Thread.sleep(2000);
//								//Consider Max Salary for P.F. Contribution  	
//									//Yes  
//									driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryPFDetail_IsMaxSalForPFContribution'])[1]")).click();
//									Thread.sleep(2000);
//									
//								//scroll-dowm page
//									WebElement AddRange4 = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]"));
//									JavascriptExecutor je13 = (JavascriptExecutor) driver;
//									je13.executeScript("arguments[0].scrollIntoView()", AddRange4);		
//								//Clear button
//									driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
//									Thread.sleep(2000);
//									
//									//scroll up a page
//									Actions a = new Actions(driver);
//									a.sendKeys(Keys.PAGE_UP).build().perform();
//														
//									//scroll-up page
//									WebElement sc = driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPTaxApplicable'])[2]"));
//									JavascriptExecutor je14 = (JavascriptExecutor) driver;
//									je14.executeScript("arguments[0].scrollIntoView()", sc);
//									
//								//scroll-up page
//									WebElement sc1 = driver.findElement(By.xpath("(//input[@id='EmployeeStatutoryDetail_IsPFApplicable'])[2]"));
//									JavascriptExecutor je15 = (JavascriptExecutor) driver;
//									je15.executeScript("arguments[0].scrollIntoView()", sc1);
//									

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

	//===========================Map Loan===========================							

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

	//==================Map Advance========================================			

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

			// Map Advance Details page
			// Name - Defect

			// Cancel button
			// driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
			// Thread.sleep(2000);

	//===============Transfer Details======================================			

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

	//**********************************************************************************************
//										LEAVE TITLE
	//*********************************************************************************************

	// **********************Masters - Define Leave**********************
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

	// =============Masters - Configure Leave==================

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

	// =====================Employee Leave Mapping==============
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

	// =================Carry Forward Balances============================

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

	// =================Absent Entry=====================

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

	// ==========================Leave Entry=====================

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

	// ================Adjust Leave Balances====================

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

//		//scroll down a page
//		WebElement Previous = driver.findElement(By.xpath("(//a[contains(text(),'Previous')])"));
//		JavascriptExecutor g = (JavascriptExecutor) driver;
//		g.executeScript("arguments[0].scrollIntoView()", Previous);
//		// scroll down a page
//		Actions f14 = new Actions(driver);
//		f14.sendKeys(Keys.PAGE_DOWN).build().perform();
//			// Edit Link
//			driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();
//			Thread.sleep(2000);
	//
//			// Leave Correction pop-up screen
//			// Absent Count
//			driver.findElement(By.xpath("//input[@id='EditAbsentCount']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='EditAbsentCount']")).sendKeys("2");
//			Thread.sleep(2000);
	//
//			// Cancel button
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

//					// Leave Title
//					driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[5]/a")).click();
//					Thread.sleep(2000);

//					// Leave Credit
//					driver.findElement(By.xpath("//a[contains(text(),'Leave Credit')]")).click();
//					Thread.sleep(2000);
			//
//					// Branch
//					WebElement Branch11 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//					Select f18 = new Select(Branch11);
//					f18.selectByVisibleText("DAMAN UNIT I AND II");
//					Thread.sleep(2000);
			//
//					// Search button
//					driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//					Thread.sleep(2000);
			//
//					// Edit Link
//					driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
//					Thread.sleep(2000);
			//
//					// Leave Credit Mapping pop-up screen
//					// Leave Type
//					WebElement LeaveType = driver.findElement(By.xpath("//select[@id='LeaveID']"));
//					Select f19 = new Select(LeaveType);
//					f19.selectByVisibleText("EL");
//					Thread.sleep(2000);
			//
//					// LeaveCredit
//					driver.findElement(By.xpath("//input[@id='LeaveCredit']")).clear();
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//input[@id='LeaveCredit']")).sendKeys("1");
//					Thread.sleep(2000);
			//
//					// Cancel button
//					driver.findElement(By.xpath("//button[@class='btn']")).click();
//					Thread.sleep(2000);

	//*********************************************************************************************
//										PROCESSING TITLE
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

	// =============Bonus Processing====================

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

//			// scroll down a page
//			Actions act6 = new Actions(driver);
//			act6.sendKeys(Keys.PAGE_DOWN).build().perform();
	//
//			// Continue button
//			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
//			Thread.sleep(2000);
	//
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//			Thread.sleep(2000);

	// ==============Gratuity Processing ===========================

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

	// ===================Arrear - Auto Arrear===================

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

	// ==============Manual - Manual Arrear====================

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

	// =============Salary Processing================

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

	// ==================Undo Salary Processing========================

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

	// ===============Stop Salary========================

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

	// =====================Release Salary===============================

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

	// ================Estimate Gratuity=========================

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

	// ================Close Month==========================

			// Processing Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[6]/a")).click();
			Thread.sleep(2000);

			// Close Month
			driver.findElement(By.xpath("//a[contains(text(),'Close Month')]")).click();
			Thread.sleep(2000);

//					// Financial Year
//					WebElement FinancialMonth1 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//					Select h6 = new Select(FinancialMonth1);
//					h6.selectByVisibleText("Apr 2022 - Mar 2023");
//					Thread.sleep(2000);
			//
//					// Close Link
//					driver.findElement(By.xpath("(//a[contains(text(),'Close')])[2]")).click();
//					Thread.sleep(2000);
			//
//					// Close Financial Month pop-up screen
//					// Close icon
//					driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//					Thread.sleep(2000);

	// ====================Full and Final========================

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

	// =========Undo Bonus Processing======================================

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

	//*******************************************************************************************************
//							EMPLOYEE REIMBURSEMENT SETTLEMENT TITLE
	//*******************************************************************************************************	

			// Employee Reimbursement Settlement Title
			driver.findElement(By.xpath("//a[contains(text(),'Employee Reimbursement Settlement')]")).click();
			Thread.sleep(2000);

			// Salary Component - Medical Reimbursement
			WebElement SalaryComponent0 = driver.findElement(By.xpath("//select[@id='ddlSalaryComponentId']"));
			Select e3 = new Select(SalaryComponent0);
			Thread.sleep(2000);
			e3.selectByVisibleText("Medical Reimbursement");
			Thread.sleep(2000);

			// Salary Component - Leave Travel Allowance
			WebElement SalaryComponent1 = driver.findElement(By.xpath("//select[@id='ddlSalaryComponentId']"));
			Select e4 = new Select(SalaryComponent1);
			Thread.sleep(2000);
			e4.selectByVisibleText("Leave Travel Allowance");
			Thread.sleep(2000);

			// Salary Component
			WebElement SalaryComponent2 = driver.findElement(By.xpath("//select[@id='ddlSalaryComponentId']"));
			Select e5 = new Select(SalaryComponent2);
			Thread.sleep(2000);
			e5.selectByVisibleText("Food Coupons");
			Thread.sleep(2000);

	//*******************************************************************************************************
//										ANALYSIS AND MIS TITLE
	//*******************************************************************************************************	

	// ***************Payroll Reconciliation**************

			// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

			// Payroll Reconciliation
			driver.findElement(By.xpath("//a[contains(text(),'Payroll Reconciliation')]")).click();
			Thread.sleep(2000);

			// Payroll Reconciliation page
//					// Financial Year
//					WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//					Select k = new Select(FinancialYear);
//					Thread.sleep(2000);
//					k.selectByVisibleText("Apr 2022 - Mar 2023");

//							//Month
//								WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select k1= new Select(Month);
//								Thread.sleep(2000);	
//								k1.selectByVisibleText("");

//					// Previous Month
//					WebElement PreviousMonth = driver.findElement(By.xpath("//select[@id='PreviousMonth']"));
//					Select k2 = new Select(PreviousMonth);
//					Thread.sleep(2000);
//					k2.selectByVisibleText("March-22");
			//
//					// Select Employee
//					WebElement SelectEmployee = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
//					Select k3 = new Select(SelectEmployee);
//					Thread.sleep(2000);
//					k3.selectByVisibleText("All Employees");
//					// k3.selectByVisibleText("Selected Employees");
//					// k3.selectByVisibleText("Selected Group");
			//
//					// Employees
//					// Sorting
//					WebElement Sorting = driver.findElement(By.xpath("//select[@id='Sorting']"));
//					Select k4 = new Select(Sorting);
//					Thread.sleep(2000);
//					// k4.selectByVisibleText("Employee Code");
//					k4.selectByVisibleText("Name");
			//
//					// One Grouping btnSave
//					driver.findElement(By.xpath("//input[@id='Grouping']")).click();
//					Thread.sleep(2000);
			//
//					// Sroll down a page
//					WebElement Proceed = driver.findElement(By.xpath("//input[@id='btnSave']"));
//					JavascriptExecutor t = (JavascriptExecutor) driver;
//					t.executeScript("arguments[0].scrollIntoView()", Proceed);
//					Thread.sleep(2000);
			//
//					// Proceed button
//					driver.findElement(By.xpath("//input[@id='btnSave']")).click();
//					Thread.sleep(2000);

	// =========Payroll Comparision Report=================

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

//							//Month
//								WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select v1= new Select(Month1);
//								Thread.sleep(2000);	
//								v1.selectByVisibleText("");

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

	// ==========Annual Salary Component==========================

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
//					    driver.close();
//					    driver.switchTo().window(tabs.get(0));
			// Annual Salary Component Analysis Report Page
			// View Report button
			driver.findElement(By.xpath("//a[@class='btn btn-secondary']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			driver.close();
			driver.switchTo().window(tabs1.get(0));

	// ===========Annual Employee Salary=====================

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
//					    driver.close();
//					    driver.switchTo().window(tabs.get(0));

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

	// ===============Monthly Payroll Analysis=====================

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

//							//Month
//							WebElement Month3 = driver.findElement(By.xpath("//select[@id='Month']"));
//							Select k16= new Select(Month3);
//							Thread.sleep(2000);	
//							k16.selectByVisibleText("");

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

	// ========Cost to Company====================

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

//								//Month
//								WebElement Month1 = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select k19= new Select(Month1);
//								Thread.sleep(2000);	
//								k19.selectByVisibleText("");

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
//							    driver.close();
//							    driver.switchTo().window(tabs.get(0));

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

	// ===========Salary Increment=============================

			// Analysis and MIS Title
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[9]/a")).click();
			Thread.sleep(2000);

			// Salary Increment
			driver.findElement(By.xpath("//a[contains(text(),'Salary Increment')]")).click();
			Thread.sleep(2000);

			// Salary Increment page
			// Previous Financial Years
//							WebElement PreviousFinancialYears = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//							Select k18= new Select(PreviousFinancialYears);
//							Thread.sleep(2000);	
//							k18.selectByVisibleText("");

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

	// ===============New / Left Employees====================

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

//								//Month
//								WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select k23= new Select(Month4);
//								Thread.sleep(2000);	
//								k23.selectByVisibleText("");

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

	// ====================Dashboard=========================

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

//					// 1.Monthly Gross Pay
//					driver.findElement(By.xpath("//a[contains(text(),'Monthly Gross Pay')]")).click();
//					Thread.sleep(2000);
			//
//					// 2.YTD Gross & Net Pay
//					driver.findElement(By.xpath("//a[contains(text(),'YTD Gross & Net Pay')]")).click();
//					Thread.sleep(2000);
			//
//					// 3.Employee Statistics
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("//*[@id=\"list\"]/li[3]/a")).click();
//					Thread.sleep(2000);

//					// 4.F & F List
//					driver.findElement(By.xpath("//a[contains(text(),'F & F List')]")).click();
//					Thread.sleep(2000);

//					// 5.Pending Salary & Leave Mapping List
//					driver.findElement(By.xpath("//a[contains(text(),'Pending Salary & Leave Mapping List')]")).click();
//					Thread.sleep(2000);

//					// 6.Investments Status
//					driver.findElement(By.xpath("(//a[contains(text(),'Investments Status')])")).click();
//					Thread.sleep(2000);

	// ======== Salary Computation Comparison Report=========================

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

//							//Pop-up Screen (Salary has not been processed to view the report)
//								driver.findElement(By.xpath("(//a[@class='close'])")).click();
//								Thread.sleep(2000);

			// Sync Salary with Computation button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Pop-up Screen (Salary has not been processed to view the report)
			driver.findElement(By.xpath("//*[@id=\"divMessage\"]/div/a")).click();
			Thread.sleep(2000);

	// ==============Letters - 1.Appointment Letter==========================

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

//								//Month
//								WebElement Month5 = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select k31= new Select(Month5);
//								Thread.sleep(2000);	
//								k31.selectByVisibleText("");

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

	// =================Letters - 2.Experience Letter=================================

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

//								//Month
//								WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//								Select k35= new Select(Month4);
//								Thread.sleep(2000);	
//								k35.selectByVisibleText("");

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

	// ============Letters - 3.Increment Letter======================

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
//									WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//									Select k40= new Select(Month4);
//									Thread.sleep(2000);	
//									k40.selectByVisibleText("");

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

	// =================Letters -  4.Promotion Letter==============================================================
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

//							//Month
//									WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//									Select k45= new Select(Month4);
//									Thread.sleep(2000);	
//									k45.selectByVisibleText("");

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

	// ================Monthly Processed Salary Register====================

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
//									WebElement Month4 = driver.findElement(By.xpath("//select[@id='Month']"));
//									Select k50= new Select(Month4);
//									Thread.sleep(2000);	
//									k50.selectByVisibleText("");

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

	// ===============Audit Trail Reports - 2.Salary Structure=====================

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

	// ==========Audit Trail Reports - 3.Employee Movement================

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

	//*******************************************************************************************************
//									 		UTILITIES TITLE
	//*******************************************************************************************************	
//			// **********Query Builder******************************
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Query Builder
//			driver.findElement(By.xpath("//a[contains(text(),'Query Builder')]")).click();
//			Thread.sleep(2000);
	//
//			// Add New button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
//			// Query Code
//			driver.findElement(By.xpath("//input[@id='QueryCode']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='QueryCode']")).sendKeys("TEST");
//			Thread.sleep(2000);
	//
//			// Query Name
//			driver.findElement(By.xpath("//input[@id='QueryName']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='QueryName']")).sendKeys("TEST1");
//			Thread.sleep(2000);
	//
//			// Options
//			// FromYear
//			// Year
//			WebElement FromYear = driver.findElement(By.xpath("//select[@id='FromYear']"));
//			Select s = new Select(FromYear);
//			Thread.sleep(2000);
//			s.selectByVisibleText("2022");
//			// Month
//			WebElement FromMonth = driver.findElement(By.xpath("//select[@id='FromMonth']"));
//			Select s1 = new Select(FromMonth);
//			Thread.sleep(2000);
//			s1.selectByVisibleText("April");
	//
//			// ToYear
//			// Year
//			WebElement ToYear = driver.findElement(By.xpath("//select[@id='ToYear']"));
//			Select s2 = new Select(ToYear);
//			Thread.sleep(2000);
//			s2.selectByVisibleText("2023");
	//
//			// Month
//			WebElement ToMonth = driver.findElement(By.xpath("//select[@id='ToMonth']"));
//			Select s3 = new Select(ToMonth);
//			Thread.sleep(2000);
//			s3.selectByVisibleText("April");
	//
//			// Sroll down a page
//			WebElement Reset = driver.findElement(By.xpath("(//input[@class='btn btn-secondary'])[3]"));
//			JavascriptExecutor y = (JavascriptExecutor) driver;
//			y.executeScript("arguments[0].scrollIntoView()", Reset);
//			Thread.sleep(2000);
	//
//			// Reset button
//			driver.findElement(By.xpath("(//input[@class='btn btn-secondary'])[3]")).click();
//			Thread.sleep(2000);
	//
//			// ===========Set Reminders============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Set Reminders
//			driver.findElement(By.xpath("//a[contains(text(),'Set Reminders')]")).click();
//			Thread.sleep(2000);
	//
//			// Add button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
//			// Create Reminder popup screen
//			// Title
//			driver.findElement(By.xpath("//input[@id='Remind_Title']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='Remind_Title']")).sendKeys("TEST");
//			Thread.sleep(2000);
	//
//			// Type
//			// Information
//			driver.findElement(By.xpath("//input[@id='Remind_IsAlert']")).click();
//			Thread.sleep(2000);
	//
//			// Active
//			driver.findElement(By.xpath("//input[@id='Remind_IsActive']")).click();
//			Thread.sleep(2000);
	//
//			// Cancel button
//			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
//			Thread.sleep(2000);
	//
//			// =========================================Send Email To
//			// Employee==============================================================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Set Reminders
//			driver.findElement(By.xpath("//a[contains(text(),'Send Email To Employee')]")).click();
//			Thread.sleep(2000);
	//
//			// Employees
//			// Select Employee
//			WebElement SelectEmployee = driver.findElement(By.xpath("//select[@id='EmployeeType']"));
//			Select s4 = new Select(SelectEmployee);
//			Thread.sleep(2000);
//			s4.selectByVisibleText("All Employees");
//			// s4.selectByVisibleText("Selected Employees");
//			// s4.selectByVisibleText("Selected Group");
//			Thread.sleep(2000);
	//
//			// From
//			driver.findElement(By.xpath("//input[@id='EmailFrom']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='EmailFrom']")).sendKeys("test@fastfacts.co");
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement Send = driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]"));
//			JavascriptExecutor y1 = (JavascriptExecutor) driver;
//			y1.executeScript("arguments[0].scrollIntoView()", Send);
//			Thread.sleep(2000);
	//
////													//Email Text Area
////														driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
////														Thread.sleep(2000);
////														driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Test");
////														Thread.sleep(2000);
////																		
////													//Send button
////														driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
////														Thread.sleep(2000);
////													
////													//Successful Message Pop-up Screen (Email successfully sent to employees)
////														driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
////														Thread.sleep(2000);
	//
//			// Clear button
//			driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
//			Thread.sleep(2000);
	//
	//// =======================Customize Payslip=====================================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Customize Payslip
//			driver.findElement(By.xpath("//a[contains(text(),'Customize Payslip')]")).click();
//			Thread.sleep(2000);
	//
//			// Customize Payslip page
//			// PaySlip Type
//			WebElement PaySlipType = driver.findElement(By.xpath("//select[@id='SlipFormat_SlipType']"));
//			Select s5 = new Select(PaySlipType);
//			Thread.sleep(2000);
//			s5.selectByVisibleText("PaySlip");
//			// s5.selectByVisibleText("Custom PaySlip");
//			// s5.selectByVisibleText("Reimbursement");
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement Save4 = driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']"));
//			JavascriptExecutor y2 = (JavascriptExecutor) driver;
//			y2.executeScript("arguments[0].scrollIntoView()", Save4);
//			Thread.sleep(2000);
	//
//			// P.F
//			driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='SlipFormat_PFName']")).sendKeys("TEST");
	//
//			// P.Tax
//			driver.findElement(By.xpath("//input[@id='SlipFormat_PTaxName']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='SlipFormat_PTaxName']")).sendKeys("TEST1");
	//
//			// E.S.I.C
//			driver.findElement(By.xpath("//input[@id='SlipFormat_ESICName']")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='SlipFormat_ESICName']")).sendKeys("TEST2");
	//
//			// Clear button
//			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
//			Thread.sleep(2000);
	//
	//// ===================Employee Salary details=====================================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Customize Payslip
//			driver.findElement(By.xpath("//a[contains(text(),'Employee Salary details')]")).click();
//			Thread.sleep(2000);
	//
//			// Employee Salary details page
//			// Branch Name
//			WebElement BranchName13 = driver.findElement(By.xpath("//select[@id='ddlBranchID']"));
//			Select s6 = new Select(BranchName13);
//			s6.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Any Employee
//			driver.findElement(By.xpath("//input[@id='txtEmployeeTypeahead']")).sendKeys("Hit");
//			Thread.sleep(2000);
//			// Enter key
//			Actions e6 = new Actions(driver);
//			e6.sendKeys(Keys.ENTER).build().perform();
//			Thread.sleep(2000);
	//
//			// Details Link
//			driver.findElement(By.xpath("(//a[contains(text(),'Details')])[4]")).click();
//			Thread.sleep(2000);
	//
	//// =====================Reimbursement Bank Letter======================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Reimbursement Bank Letter
//			driver.findElement(By.xpath("//a[contains(text(),'Reimbursement Bank Letter')]")).click();
//			Thread.sleep(2000);
	//
//			// Pop-up Screen (Salary has not been processed to view the report)
//			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//			Thread.sleep(2000);
	//
//			// Reimbursement Bank Letter page
//			// Bank Name
//			WebElement BankName2 = driver.findElement(By.xpath("//select[@id='BankName']"));
//			Select s7 = new Select(BankName2);
//			s7.selectByVisibleText("Test1");
//			Thread.sleep(2000);
	//
//			// Bank Branch
//			// WebElement BankBranch =
//			// driver.findElement(By.xpath("//select[@id='EmployerBankID']"));
//			// Select s8= new Select(BankBranch);
//			// Thread.sleep(2000);
//			// s8.selectByVisibleText("");
	//
//			// FinancialYearID
//			WebElement FinancialYear15 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//			Select s9 = new Select(FinancialYear15);
//			Thread.sleep(2000);
//			s9.selectByVisibleText("Apr 2022 - Mar 2023");
//			Thread.sleep(2000);
	//
//			// Month
//			// WebElement Month = driver.findElement(By.xpath("//select[@id='Month']"));
//			// Select s10= new Select(Month);
//			// Thread.sleep(2000);
//			// s10.selectByVisibleText("");
	//
//			// Date Of Printing
//			WebElement DateofPrinting = driver.findElement(By.xpath("//input[@id='DateOfPrinting']"));
//			DateofPrinting.sendKeys("21 April, 2023");
//			driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
//			Thread.sleep(2000);
	//
//			// Proceed button
//			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ======================Import Branch Wise - 1.Import Masters==================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m = new Actions(driver);
//			WebElement ImportBranchWise = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m.moveToElement(ImportBranchWise).build().perform();
	//
//			// 1.Import Masters
//			driver.findElement(By.xpath("//a[contains(text(),'Import Masters')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Masters page
//			// Import Masters
//			WebElement ImportMasters = driver.findElement(By.xpath("//select[@id='EmpMiscMasters']"));
//			Select s11 = new Select(ImportMasters);
//			s11.selectByVisibleText("Branch");
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ============Import Branch Wise - 2.Import Variables===============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m1 = new Actions(driver);
//			WebElement ImportBranchWise1 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m1.moveToElement(ImportBranchWise1).build().perform();
	//
//			// 2.Import Variables
//			driver.findElement(By.xpath("//a[contains(text(),'Import Variables')]")).click();
//			Thread.sleep(2000);
	//
////														//Pop-up Screen (Please create atleast one variable at Define Variable screen)
////														driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
////														Thread.sleep(2000);
	//
//			// Import Variables page
//			// List Of Variables
////														WebElement ListOfVariables = driver.findElement(By.xpath("//select[@id='VariableComponents']"));
////														Select s11= new Select(ListOfVariables);
////														s11.selectByVisibleText("");
////														Thread.sleep(2000);	
	//
//			// Branch Name
//			WebElement BranchName14 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s12 = new Select(BranchName14);
//			s12.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
//			// Pop-up Screen (Please select atleast one variable)
//			driver.findElement(By.xpath("(//a[contains(text(),'×')])[1]")).click();
//			Thread.sleep(5000);
	//
	//// ============Import Branch Wise - 3.Import Salary Component=============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m2 = new Actions(driver);
//			WebElement ImportBranchWise2 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m2.moveToElement(ImportBranchWise2).build().perform();
	//
//			// 3.Import Salary Component
//			driver.findElement(By.xpath("//a[contains(text(),'Import Salary Component')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Salary Component page
//			// List Of Variables
//			WebElement ListOfVariables = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
//			Select s13 = new Select(ListOfVariables);
//			s13.selectByVisibleText("Special Pay");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName15 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s14 = new Select(BranchName15);
//			s14.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement DownloadTemplate = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
//			JavascriptExecutor y3 = (JavascriptExecutor) driver;
//			y3.executeScript("arguments[0].scrollIntoView()", DownloadTemplate);
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ===========Import Branch Wise - 4.Import One Time Component===================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m3 = new Actions(driver);
//			WebElement ImportBranchWise3 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m3.moveToElement(ImportBranchWise3).build().perform();
	//
//			// 4.Import One Time Component
//			driver.findElement(By.xpath("//a[contains(text(),'Import One Time Component')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Salary Component page
//			// List Of Variables
//			WebElement ListOfVariables1 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
//			Select s15 = new Select(ListOfVariables1);
//			s15.selectByVisibleText("Incentive 21_22 (INC)");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName16 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s16 = new Select(BranchName16);
//			s16.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement DownloadTemplate1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
//			JavascriptExecutor y4 = (JavascriptExecutor) driver;
//			y4.executeScript("arguments[0].scrollIntoView()", DownloadTemplate1);
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ===========Import Branch Wise - 4.Import Arrear Effective From=============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m4 = new Actions(driver);
//			WebElement ImportBranchWise4 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m4.moveToElement(ImportBranchWise4).build().perform();
	//
//			// 4.Import Arrear Effective From
//			driver.findElement(By.xpath("//a[contains(text(),'Import Arrear Effective From')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Arrear Effective From page
//			// Branch Name
//			WebElement BranchName17 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s17 = new Select(BranchName17);
//			s17.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
	//// ==============Import Branch Wise - 5.Import Investments======================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m5 = new Actions(driver);
//			WebElement ImportBranchWise5 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m5.moveToElement(ImportBranchWise5).build().perform();
	//
//			// 5.Import Investments
//			driver.findElement(By.xpath("//a[contains(text(),'Import Investments')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Investments page
//			// Branch Name
//			WebElement BranchName18 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s18 = new Select(BranchName18);
//			s18.selectByVisibleText("Ahmedabad Depot");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
//			//
////					// scroll down a page
////					Actions m6 = new Actions(driver);
////					m6.sendKeys(Keys.PAGE_DOWN).build().perform();
	//
//			// HP & Other Income
//			driver.findElement(By.xpath("//a[contains(text(),'HP & Other Income')]")).click();
//			Thread.sleep(2000);
//			// Other Investments
//			driver.findElement(By.xpath("//a[contains(text(),'Other Investments')]")).click();
//			Thread.sleep(2000);
	//
//			// Section 80CCD(2)
//			driver.findElement(By.xpath("//a[contains(text(),'Section 80CCD(2)')]")).click();
//			Thread.sleep(2000);
	//
//			// Super Annuation
//			driver.findElement(By.xpath("//a[contains(text(),'Super Annuation')]")).click();
//			Thread.sleep(2000);
	//
	//// ===================Import Branch Wise - 6.Import Statutory=================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m7 = new Actions(driver);
//			WebElement ImportBranchWise6 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m7.moveToElement(ImportBranchWise6).build().perform();
	//
//			// 6.Import Statutory
//			driver.findElement(By.xpath("//a[contains(text(),'Import Statutory')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Investments page
//			// Branch Name
//			WebElement BranchName19 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s19 = new Select(BranchName19);
//			s19.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
//			// PF
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[2]/a")).click();
//			Thread.sleep(2000);
//			// ESIC
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[3]/a")).click();
//			Thread.sleep(2000);
//			// PTax
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[4]/a")).click();
//			Thread.sleep(2000);
//			// TDS deducted on salary
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[5]/a")).click();
//			Thread.sleep(2000);
//			// Previous Employer Data
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[6]/a")).click();
//			Thread.sleep(2000);
//			// Other Section
//			driver.findElement(By.xpath("//*[@id=\"list\"]/li[7]/a")).click();
//			Thread.sleep(2000);
	//
	//// ==============Import Branch Wise - 7.Import Disbursement=============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m8 = new Actions(driver);
//			WebElement ImportBranchWise7 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m8.moveToElement(ImportBranchWise7).build().perform();
	//
//			// 7.Import Disbursement
//			driver.findElement(By.xpath("//a[contains(text(),'Import Disbursement')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Investments page
//			// Branch Name
//			WebElement BranchName20 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s20 = new Select(BranchName20);
//			s20.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement DownloadTemplate2 = driver.findElement(By.xpath("//a[contains(text(),'Download Template')]"));
//			JavascriptExecutor y5 = (JavascriptExecutor) driver;
//			y5.executeScript("arguments[0].scrollIntoView()", DownloadTemplate2);
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==================Import Branch Wise - 8.Import Reimbursement=====================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m9 = new Actions(driver);
//			WebElement ImportBranchWise8 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m9.moveToElement(ImportBranchWise8).build().perform();
	//
//			// 9.Import Reimbursement
//			driver.findElement(By.xpath("//a[contains(text(),'Import Reimbursement')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Reimbursement page
//			// List Of Components
//			WebElement BranchName21 = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
//			Select s21 = new Select(BranchName21);
//			s21.selectByVisibleText("Medical Reimbursement");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName22 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s22 = new Select(BranchName22);
//			s22.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==============Import Branch Wise - 9.Import Reimbursement====================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m10 = new Actions(driver);
//			WebElement ImportBranchWise9 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m10.moveToElement(ImportBranchWise9).build().perform();
	//
//			// 9.Import Reimbursement
//			driver.findElement(By.xpath("//a[contains(text(),'Import Reimbursement')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Reimbursement page
//			// List Of Components
//			WebElement ListOfComponents = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
//			Select s23 = new Select(ListOfComponents);
//			s23.selectByVisibleText("Medical Reimbursement");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName24 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s24 = new Select(BranchName24);
//			s24.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Search Button
//			driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==================Import Branch Wise - 10.Import Employees===================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m11 = new Actions(driver);
//			WebElement ImportBranchWise10 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m11.moveToElement(ImportBranchWise10).build().perform();
	//
//			// 10.Import Employees
//			driver.findElement(By.xpath("//a[contains(text(),'Import Employees')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Employees page
//			// Branch Name
//			WebElement BranchName25 = driver.findElement(By.xpath("//select[@id='CompanyID']"));
//			Select s25 = new Select(BranchName25);
//			s25.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Employee Activation
//			WebElement EmployeeActivation = driver.findElement(By.xpath("//select[@id='Status']"));
//			Select s26 = new Select(EmployeeActivation);
//			s26.selectByVisibleText("Active");
//			Thread.sleep(2000);
	//
//			// Emplyee Active
//			driver.findElement(By.xpath("//input[@id='EmplyeeActive']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// =========Import Branch Wise - 11.Import Leaves Availed==================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m12 = new Actions(driver);
//			WebElement ImportBranchWise11 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m12.moveToElement(ImportBranchWise11).build().perform();
	//
//			// 11.Import Leaves Availed
//			driver.findElement(By.xpath("//a[contains(text(),'Import Leaves Availed')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Leaves Availed page
//			// Branch Name
//			WebElement BranchName26 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s27 = new Select(BranchName26);
//			s27.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Export Button
//			driver.findElement(By.xpath("//a[contains(text(),'Export')]")).click();
//			Thread.sleep(2000);
	//
	//// ===========Import Branch Wise - 12.Import Branch Wise Employee Computation Detail======================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m13 = new Actions(driver);
//			WebElement ImportBranchWise12 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m13.moveToElement(ImportBranchWise12).build().perform();
	//
//			// 12.Import Branch Wise Employee Computation Detail
//			driver.findElement(By.xpath("//a[contains(text(),'Import Employee Computation Detail')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise Employee Computation Detail page
//			// Financial Month
//			WebElement FinancialMonth1 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
//			Select q = new Select(FinancialMonth1);
//			Thread.sleep(2000);
//			q.selectByVisibleText("April-22");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName27 = driver.findElement(By.xpath("//select[@id='BranchID']"));
//			Select s28 = new Select(BranchName27);
//			s28.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Export All Employee Computation Detail
//			// Salary components
//			WebElement BranchName28 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
//			Select s29 = new Select(BranchName28);
//			s29.selectByVisibleText("Basic Salary");
//			Thread.sleep(2000);
	//
//			// One time components
//			WebElement BranchName29 = driver.findElement(By.xpath("//select[@id='OneTimeComponentID']"));
//			Select s30 = new Select(BranchName29);
//			s30.selectByVisibleText("SALARY BONUS");
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[contains(text(),'Download Template')]")).click();
//			Thread.sleep(2000);
	//
	//// =========Import Branch Wise - 13.Import Rent Free Accommodation=================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Branch Wise
//			Actions m14 = new Actions(driver);
//			WebElement ImportBranchWise13 = driver
//					.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/ul/li[7]/a"));
//			m14.moveToElement(ImportBranchWise13).build().perform();
	//
//			// 13.Import Rent Free Accommodation
//			driver.findElement(By.xpath("//a[contains(text(),'Import Rent Free Accommodation')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Rent Free Accommodation page
//			// Financial Month
//			WebElement FinancialMonth3 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
//			Select s31 = new Select(FinancialMonth3);
//			Thread.sleep(2000);
//			s31.selectByVisibleText("April-22");
//			Thread.sleep(2000);
	//
//			// Branch Name
//			WebElement BranchName30 = driver.findElement(By.xpath("//select[@id='ddlBranch']"));
//			Select s32 = new Select(BranchName30);
//			s32.selectByVisibleText("DAMAN UNIT I AND II");
//			Thread.sleep(2000);
	//
//			// Sample Template Button
//			driver.findElement(By.xpath("//a[contains(text(),'Sample Template')]")).click();
//			Thread.sleep(2000);
	//
	//// ==============Import Company Wise - 1.Import All Employees=======================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q1 = new Actions(driver);
//			WebElement ImportCompanyWise = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q1.moveToElement(ImportCompanyWise).build().perform();
	//
//			// 1.Import All Employees
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees page
//			// Status
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Emplyee Active Check-Box
//			driver.findElement(By.xpath("//input[@id='EmplyeeActive']")).click();
//			Thread.sleep(2000);
	//
//			// Sroll down a page
//			WebElement DownloadTemplate3 = driver.findElement(By.xpath("//a[contains(text(),'Download Template')]"));
//			JavascriptExecutor y6 = (JavascriptExecutor) driver;
//			y6.executeScript("arguments[0].scrollIntoView()", DownloadTemplate3);
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[contains(text(),'Download Template')]")).click();
//			Thread.sleep(2000);
	//
	//// =============Import Company Wise - 2.Import All Employees Statutory==============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q2 = new Actions(driver);
//			WebElement ImportCompanyWise1 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q2.moveToElement(ImportCompanyWise1).build().perform();
	//
//			// 2.Import All Employees Statutory
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Statutory')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees page
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ============Import Company Wise - 3.Import All Employees Salary Component=============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q3 = new Actions(driver);
//			WebElement ImportCompanyWise2 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q3.moveToElement(ImportCompanyWise2).build().perform();
	//
//			// 3.Import All Employees Salary Component
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Salary Component')]")).click();
//			Thread.sleep(2000);
	//
////					// Import All Employees Salary Component page
////					// List Of Components
////					WebElement ListOfComponents1 = driver.findElement(By.xpath("//select[@id='SalaryComponents']"));
////					Select q4 = new Select(ListOfComponents1);
////					q4.selectByVisibleText("Special Pay");
////					Thread.sleep(2000);
//			//
////					// Status
////					// Status -Active Status Flag
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
//			//
////					// Download Template Button
////					driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==========Import Company Wise - 4.Import All Employees One Time Component====
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions n9 = new Actions(driver);
//			WebElement ImportCompanyWise4 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			n9.moveToElement(ImportCompanyWise4).build().perform();
	//
//			// 4.Import All Employees One Time Component
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees One Time Component')]")).click();
//			Thread.sleep(2000);
	//
////					// Import All Employees Salary Component page
////					// List Of Components
////					WebElement ListOfComponents2 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
////					Select q6 = new Select(ListOfComponents2);
////					q6.selectByVisibleText("SAL BONUS (BON)");
////					Thread.sleep(2000);
//			//
////					// Status
////					// Status -Active Status Flag
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
//			//
////					// Download Template Button
////					driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// =============Import Company Wise - 5.Import All Employees Disbursement===============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions n10 = new Actions(driver);
//			WebElement ImportCompanyWise5 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			n10.moveToElement(ImportCompanyWise5).build().perform();
	//
//			// 5.Import All Employees Disbursement
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Disbursement')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees Disbursement page
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ================Import Company Wise - 6.Import All Employees Investments==================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions n11 = new Actions(driver);
//			WebElement ImportCompanyWise6 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			n11.moveToElement(ImportCompanyWise6).build().perform();
	//
//			// 6.Import All Employees Investments
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Investments')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees Investments page
//			// Select Investment For
//			WebElement SelectInvestmentFor = driver.findElement(By.xpath("//select[@id='InvestmentFor']"));
//			Select q9 = new Select(SelectInvestmentFor);
//			q9.selectByVisibleText("ALL");
//			Thread.sleep(2000);
	//
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
	//// =======Import Company Wise - 7.Import All Arrear Effective From============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q10 = new Actions(driver);
//			WebElement ImportCompanyWise7 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q10.moveToElement(ImportCompanyWise7).build().perform();
	//
//			// 7.Import All Arrear Effective From
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Arrear Effective From')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Arrear Effective From page
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==========Import Company Wise - 8.Import All Employees Absent Entry===============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q11 = new Actions(driver);
//			WebElement ImportCompanyWise8 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q11.moveToElement(ImportCompanyWise8).build().perform();
	//
//			// 8.Import All Employees Absent Entry
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Absent Entry')]")).click();
//			Thread.sleep(2000);
	//
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==========Import Company Wise - 9.Import All Employees Leave Entry==============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q12 = new Actions(driver);
//			WebElement ImportCompanyWise9 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q12.moveToElement(ImportCompanyWise9).build().perform();
	//
//			// 9.Import All Employees Leave Entry
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Leave Entry')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees Leave Entry page
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Financial Year
//			WebElement FinancialYear30 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//			Select q13 = new Select(FinancialYear30);
//			q13.selectByVisibleText("Apr 2022 - Mar 2023");
//			Thread.sleep(2000);
	//
//			// Month
//			WebElement Month2 = driver.findElement(By.xpath("//select[@id='Month']"));
//			Select q14 = new Select(Month2);
//			q14.selectByVisibleText("April-22");
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// ==========Import Company Wise - 10.Import All Employees Adjust Leave Balances===============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q15 = new Actions(driver);
//			WebElement ImportCompanyWise10 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q15.moveToElement(ImportCompanyWise10).build().perform();
	//
//			// 10.Import All Employees Adjust Leave Balances
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Adjust Leave Balances')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees Adjust Leave Balances page
//			// Close Month
//			WebElement CloseMonth1 = driver.findElement(By.xpath("//select[@id='Month']"));
//			Select q16 = new Select(CloseMonth1);
//			q16.selectByVisibleText("March-22");
//			Thread.sleep(2000);
	//
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
	//// =======Import Company Wise - 11.Import All Employees Map Variable==========
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q17 = new Actions(driver);
//			WebElement ImportCompanyWise11 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q17.moveToElement(ImportCompanyWise11).build().perform();
	//
//			// 11.Import All Employees Map Variable
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Map Variable')]")).click();
//			Thread.sleep(2000);
	//
////					// Import All Employees Map Variable page
////					// List Of Components
////					WebElement ListOfComponents3 = driver.findElement(By.xpath("//select[@id='VariableComponents']"));
////					Select q18 = new Select(ListOfComponents3);
////					q18.selectByVisibleText("TEST1");
////					Thread.sleep(2000);
//			//
////					// Status
////					// Status -Active Status Flag
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
////					driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
////					Thread.sleep(2000);
//			//
////					// Download Template Button
////					driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
////					Thread.sleep(2000);
	//
	//// ==============Import Company Wise - 12.Update Statutory Values============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q19 = new Actions(driver);
//			WebElement ImportCompanyWise12 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q19.moveToElement(ImportCompanyWise12).build().perform();
	//
//			// 12.Update Statutory Values
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Statutory Values')]")).click();
//			Thread.sleep(2000);
	//
//			// Update Statutory Values page
//			// Status
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
	//
	//// =======Import Company Wise - 13.Import All Reimbursement============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q20 = new Actions(driver);
//			WebElement ImportCompanyWise13 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q20.moveToElement(ImportCompanyWise13).build().perform();
	//
//			// 13.Import All Reimbursement
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Reimbursement')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Reimbursement page
//			// List Of Components
//			WebElement ListOfComponents4 = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
//			Select q21 = new Select(ListOfComponents4);
//			q21.selectByVisibleText("Medical Reimbursement");
//			Thread.sleep(2000);
	//
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[1]")).click();
//			Thread.sleep(2000);
	//
	//// ===========Import Company Wise - 14.Import All Employees Leave Mapping==========
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q22 = new Actions(driver);
//			WebElement ImportCompanyWise14 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q22.moveToElement(ImportCompanyWise14).build().perform();
	//
//			// 14.Import All Employees Leave Mapping
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Leave Mapping')]")).click();
//			Thread.sleep(2000);
	//
////					// Import All Employees Leave Mapping page
////					// Download Template Button
////					driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
////					Thread.sleep(2000);
	//
	////=======Import Company Wise - 15.Import All Employee Computation Detail==========
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q23 = new Actions(driver);
//			WebElement ImportCompanyWise15 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q23.moveToElement(ImportCompanyWise15).build().perform();
	//
//			// 15.Import All Employee Computation Detail
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employee Computation Detail')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employee Computation Detail page
//			// Financial Month
//			WebElement FinancialMonth4 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
//			Select q24 = new Select(FinancialMonth4);
//			q24.selectByVisibleText("April-22");
//			Thread.sleep(2000);
	//
//			// Salary components
//			WebElement Salarycomponents = driver.findElement(By.xpath("//select[@id='SalaryComponentID']"));
//			Select q25 = new Select(Salarycomponents);
//			q25.selectByVisibleText("Basic Salary");
//			Thread.sleep(2000);
	//
//			// One time components
//			WebElement Onetimecomponents = driver.findElement(By.xpath("//select[@id='OneTimeComponentID']"));
//			Select q26 = new Select(Onetimecomponents);
//			q26.selectByVisibleText("SALARY BONUS");
//			Thread.sleep(2000);
	//
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
//			Thread.sleep(2000);
	//
	//// ==========Import Company Wise -16.Import Statutory Masters=========================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q27 = new Actions(driver);
//			WebElement ImportCompanyWise16 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q27.moveToElement(ImportCompanyWise16).build().perform();
	//
//			// 16.Import Statutory Masters
//			driver.findElement(By.xpath("//a[contains(text(),'Import Statutory Masters')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Statutory Masters page
//			WebElement ImportStatutoryMasters = driver.findElement(By.xpath("//select[@id='StatutoryMasters']"));
//			Select i = new Select(ImportStatutoryMasters);
//			i.selectByVisibleText("PF Branch Master");
//			Thread.sleep(2000);
//			// Download Template Button
//			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]")).click();
//			Thread.sleep(2000);
	//
	////========Import Company Wise -17.Import All Employees ESIC Reason============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q28 = new Actions(driver);
//			WebElement ImportCompanyWise17 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q28.moveToElement(ImportCompanyWise17).build().perform();
	//
//			// 17.Import All Employees ESIC Reason
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees ESIC Reason')]")).click();
//			Thread.sleep(2000);
	//
//			// Import Statutory Masters page
//			// pop-up screen
//			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
//			Thread.sleep(2000);
	//
//			// Financial Year
//			WebElement FinancialYear31 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
//			Select q29 = new Select(FinancialYear31);
//			q29.selectByVisibleText("Apr 2022 - Mar 2023");
//			Thread.sleep(2000);
	//
////														//Month
////														WebElement Month = driver.findElement(By.xpath("//select[@id='FinancialMonthID']"));
////														Select q26= new Select(Month);
////														q26.selectByVisibleText("");
////														Thread.sleep(2000);	
	//
	////=====Import Company Wise -18.Import All Employees Paid Days=========
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q30 = new Actions(driver);
//			WebElement ImportCompanyWise18 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q30.moveToElement(ImportCompanyWise18).build().perform();
	//
//			// 18.Import All Employees Paid Days
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Paid Days')]")).click();
//			Thread.sleep(2000);
	//
//			// Download Template Button
//			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
//			Thread.sleep(2000);
	//
	//// =======Import Company Wise -19.Import All Employees Rent Free Accommodation=====
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q31 = new Actions(driver);
//			WebElement ImportCompanyWise19 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q31.moveToElement(ImportCompanyWise19).build().perform();
	//
//			// 19.Import All Employees Rent Free Accommodation
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Rent Free Accommodation')]")).click();
//			Thread.sleep(2000);
	//
//			// Financial Month
//			WebElement FinancialMonth5 = driver.findElement(By.xpath("//select[@id='ddlMonth']"));
//			Select q32 = new Select(FinancialMonth5);
//			q32.selectByVisibleText("April-22");
//			Thread.sleep(2000);
	//
//			// Sample Download button
//			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
//			Thread.sleep(2000);
	//
	//// ======Import Company Wise -20.Import All Employees Previous Month Paid Days=====
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Import Company Wise
//			Actions q33 = new Actions(driver);
//			WebElement ImportCompanyWise20 = driver.findElement(By.xpath("//a[contains(text(),'Import Company Wise')]"));
//			q33.moveToElement(ImportCompanyWise20).build().perform();
	//
//			// 20.Import All Employees Previous Month Paid Days
//			driver.findElement(By.xpath("//a[contains(text(),'Import All Employees Previous Month Paid Days')]")).click();
//			Thread.sleep(2000);
	//
//			// Import All Employees Adjust Leave Balances page
//			// Close Month
//			WebElement CloseMonth2 = driver.findElement(By.xpath("//select[@id='ClosedMonth']"));
//			Select q34 = new Select(CloseMonth2);
//			q34.selectByVisibleText("March-22");
//			Thread.sleep(2000);
	//
//			// Status -Active Status Flag
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//input[@id='IsActiveStatusFlag']")).click();
//			Thread.sleep(2000);
	//
//			// Sample Download button
//			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
//			Thread.sleep(2000);
	//
	//// ===========List of Rule Codess=============
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// List of Rule Codes
//			driver.findElement(By.xpath("//a[contains(text(),'List of Rule Codes')]")).click();
//			Thread.sleep(2000);
	//
//			// List of Rule Codes page
//			// 1.Income From Salaries
//			driver.findElement(By.xpath("//a[contains(text(),'Income From Salaries')]")).click();
//			Thread.sleep(2000);
	//
//			// 2.Income From Other Sources
//			driver.findElement(By.xpath("//a[contains(text(),'Income From Other Sources')]")).click();
//			Thread.sleep(2000);
	//
//			// 3.Deductions Under VIA
//			driver.findElement(By.xpath("//a[contains(text(),'Deductions Under VIA')]")).click();
//			Thread.sleep(2000);
	//
//			// 4.Investments U/S 80C
//			driver.findElement(By.xpath("//a[contains(text(),'Investments U/S 80C')]")).click();
//			Thread.sleep(2000);
	//
	//// ===========Component Mapping for Form16 and eTds creation===========================
	//
//			// Utilies Title
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[10]/a")).click();
//			Thread.sleep(2000);
	//
//			// Component Mapping for Form16 and eTds creation
//			driver.findElement(By.xpath("//a[contains(text(),'Component Mapping for Form16 and eTds creation')]")).click();
//			Thread.sleep(2000);
	//
//			// Component Mapping for Form16 and eTds creation page
//			// Financial Year
//			WebElement FinancialYear33 = driver.findElement(By.xpath("//select[@id='ddlFinancialYear']"));
//			Select s33 = new Select(FinancialYear33);
//			s33.selectByVisibleText("Apr 2022 - Mar 2023");
//			Thread.sleep(2000);
	//
//			// Travel concession or assistance under section 10(5) Component
//			WebElement FinancialYear34 = driver.findElement(By.xpath("//select[@id='dropdown_F0001']"));
//			Select s34 = new Select(FinancialYear34);
//			s34.selectByVisibleText("Basic Salary");
//			Thread.sleep(2000);
	//
//			// Scroll down a page
//			WebElement Submit = driver.findElement(By.xpath("//input[@id='btnSave']"));
//			JavascriptExecutor y7 = (JavascriptExecutor) driver;
//			y7.executeScript("arguments[0].scrollIntoView()", Submit);
//			Thread.sleep(3000);
	//
//			// Submit button
//			driver.findElement(By.xpath("//input[@id='btnSave']")).click();
//			Thread.sleep(2000);
	//
//			// pop-up screen
//			driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
//			Thread.sleep(2000);

			// ******************************************************************************************************
//			   SalTDS TITLE
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

	////Financial Year
	//WebElement FY3 = driver.findElement(By.xpath("//select[@id='FinancialYearID']"));
	//Select b19= new Select(FY3);
	//b19.selectByVisibleText("");
	//Thread.sleep(2000);	

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
	//******************************************************************************************************		
//													LOGOUT
	//******************************************************************************************************	
	// ========================Logout=================
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
			Thread.sleep(5000);
			driver.close();

		}
	}
