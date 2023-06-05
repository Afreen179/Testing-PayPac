package com.Paypac;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException

	{

		WebDriver driver = new EdgeDriver();
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
// ***********************************************Company master******************************************************************************

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
		Select s = new Select(country);
		s.selectByVisibleText("India");
		Thread.sleep(2000);
		// state
		WebElement state = driver.findElement(By.xpath("//*[@id=\"City_StateID\"]"));
		Select st = new Select(state);
		st.selectByVisibleText("Maharashtra");
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

// *****************Add product admin*********************************************************
// *******************************************************************************************
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

// ***************************************************Miscellanous***************************************************************

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

//******************************************User defined parameter***********************************************************************

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

//Master-Title
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
		Select b = new Select(BankName);
		b.selectByIndex(1);
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
		Select b2 = new Select(BankName1);
		b2.selectByIndex(1);
		Thread.sleep(2000);

		// Branch Name- defect
		// WebElement BranchName =
		// driver.findElement(By.xpath("//select[@id='BankBranchID']"));
		// Select b3 = new Select(BranchName);
		// b3.selectByIndex(1);
		// Thread.sleep(2000);

		// Account Type
		WebElement AccountType = driver.findElement(By.xpath("//select[@id='BankAccountTypeID']"));
		Select b4 = new Select(AccountType);
		b4.selectByIndex(2);
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
		Select b5 = new Select(BranchName1);
		b5.selectByIndex(2);
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
//				//Master-Title
//				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
//				Thread.sleep(2000);
//						
//				//FlexiPay Master
//				driver.findElement(By.xpath("//a[contains(text(),'FlexiPay Master')]")).click();
//				Thread.sleep(2000);
//					
//				//Add button
//				driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[5]/a")).click();
//				Thread.sleep(2000);
//				
//				//SalaryComponentCode
//				WebElement SalaryComponentCode = driver.findElement(By.xpath("//*[@id=\"SalaryComponentCode\"]"));
//				Select b6 = new Select(SalaryComponentCode);
//				b6.selectByIndex(2);
//				Thread.sleep(2000);
//				//UDMCode
//				WebElement UDMCode = driver.findElement(By.xpath("//select[@id='UDMCode']"));
//				Select b7= new Select(UDMCode);
//				b7.selectByIndex(2);
//				Thread.sleep(2000);
//				
//				//Code 
//				Thread.sleep(2000);				
//				WebElement Code = driver.findElement(By.xpath("//select[@id='Code']"));
//				Select b8= new Select(Code);
//				b8.selectByIndex(1);
//				Thread.sleep(2000);				
//				
//				//MinValue
//				driver.findElement(By.xpath("//input[@id='MinValue']")).sendKeys("500");
//				Thread.sleep(2000);
//					
//				//MaxValue
//				driver.findElement(By.xpath("//input[@id='MaxValue']")).sendKeys("1000");
//				Thread.sleep(2000);
//					
//				//Cancel button		
//				driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/button")).click();	
//				Thread.sleep(2000);
//				
//				//Save button		
//				//driver.findElement(By.xpath("//*[@id="entityModal"]/div[3]/input")).click();	
//				//Thread.sleep(2000);
//				//Successful Message pop-up screen
//				//driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//				//Thread.sleep(2000);
//				
////Edit Link
////driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
////Thread.sleep(2000);
//							
////Update pop-up screen
//					
////Min Value			
////driver.findElement(By.xpath("//input[@id='MinValue']")).clear();
////Thread.sleep(2000);
////driver.findElement(By.xpath("//input[@id='MinValue']")).sendKeys("500");
////Thread.sleep(2000);
////Max Value			
////driver.findElement(By.xpath("//input[@id='MaxValue']")).clear();
////Thread.sleep(2000);
////driver.findElement(By.xpath("//input[@id='MaxValue']")).sendKeys("2000");
////Thread.sleep(2000);	
////Save button		
////driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();	
////Thread.sleep(2000);
////Successful Message pop-up screen
////driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
////Thread.sleep(2000);
//				
////********************************************************************				
//				
//	//Master-Title
//				driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[1]/a")).click();
//				Thread.sleep(2000);
//						
//				//Document Master
//				driver.findElement(By.xpath("//a[contains(text(),'Document Master')]")).click();
//				Thread.sleep(2000);
//				
//				//Add button		
//				driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();	
//				Thread.sleep(2000);
//				//Create Document pop-up screen
//				
//		        driver.findElement(By.xpath("//input[@id='DocumentName']")).sendKeys("Test");
//				Thread.sleep(2000);
//				
//			
//				//Save button		
//				driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();	
//				Thread.sleep(2000);
//				
//		       //Cancel button
//				driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();	
//				Thread.sleep(2000);
//				
//				//Error Message pop-up screen
//		        driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//				Thread.sleep(2000);		
		// ================================Logout===========================================================
		// Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

