package FAMS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class masters {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://localhost:88/Account/Login");

//***************************************Login********************************************
		//Company Code
		driver.findElement(By.xpath("//input[@id='Company_CompanyCode']")).sendKeys("ITPL");
		Thread.sleep(2000);
		// User name
		driver.findElement(By.xpath("(//input[@id='UserName'])")).sendKeys("admin");
		Thread.sleep(2000);
		// Password
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123");
		Thread.sleep(2000);
		// Login
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

// *******************************Company master***********************************************

		// Master-Title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(5000);

		// company master
		driver.findElement(By.xpath("//a[contains(text(),'Company Master')]")).click();
		Thread.sleep(2000);

		// Edit
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);

		//Pop-up screen
		// company name
		driver.findElement(By.xpath("//input[@id='CompanyName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys("IMMUNEEL THERAPEUTICS PRIVATE LIMITED");
		Thread.sleep(2000);
		
		// Company logo
		// driver.findElement(By.xpath("//input[@placeholder='Selectfile']")).click();

		// phone
		driver.findElement(By.xpath("//input[@id='Phone']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("1234567890");
		Thread.sleep(3000);

		// address1
		driver.findElement(By.xpath("//input[@id='Address1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("N");
		Thread.sleep(2000);

		// country
		WebElement country = driver.findElement(By.xpath("//select[@id='City_State_CountryID']"));
		Select s = new Select(country);
		s.selectByVisibleText("India");
		Thread.sleep(2000);

		// state
		WebElement state = driver.findElement(By.xpath("//select[@id='City_StateID']"));
		Select st = new Select(state);
		st.selectByVisibleText("Karnataka");
		Thread.sleep(2000);

		// city
		WebElement city = driver.findElement(By.xpath("//select[@id='CityID']"));
		Select ct = new Select(city);
		ct.selectByVisibleText("BANGALORE");
		Thread.sleep(2000);

		// pincode
		driver.findElement(By.xpath("//input[@id='PinCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PinCode']")).sendKeys("400093");
		Thread.sleep(2000);

		// Cancel
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);

// *******************************Mandatory - 1. Country ***********************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Mandatory
		Actions a = new Actions(driver);
		WebElement Mandatory = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a.moveToElement(Mandatory).build().perform();
		Thread.sleep(2000);

		// Country
		driver.findElement(By.xpath("//a[contains(text(),'Country')]")).click();
		Thread.sleep(2000);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		//Pop-up screen
		// Country Code
		driver.findElement(By.xpath("//input[@id='CountryCode']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CountryCode']")).sendKeys("TEST");
		Thread.sleep(2000);

		// Country Name
		driver.findElement(By.xpath("//input[@id='CountryName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CountryName']")).sendKeys("TEST1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

// *******************************Mandatory - 2. State ***********************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Mandatory
		Actions a1 = new Actions(driver);
		WebElement Mandatory1 = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a1.moveToElement(Mandatory1).build().perform();
		Thread.sleep(2000);

		// State
		driver.findElement(By.xpath("//a[contains(text(),'State')]")).click();
		Thread.sleep(2000);

		// Javascript executor
		WebElement previous = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", previous);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create State Pop-up screen
		// Country
		WebElement a2 = driver.findElement(By.xpath("//*[@id=\"CountryID\"]"));
		Select country1 = new Select(a2);
		country1.selectByVisibleText("India");
		Thread.sleep(2000);

		// State Code
		driver.findElement(By.xpath("//input[@id='StateCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='StateCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// State Name
		driver.findElement(By.xpath("//input[@id='StateName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='StateName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
// *******************************Mandatory - 3. City***********************************************
		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Mandatory
		Actions a3 = new Actions(driver);
		WebElement Mandatory2 = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a3.moveToElement(Mandatory2).build().perform();
		Thread.sleep(2000);

		// City
		driver.findElement(By.xpath("//a[contains(text(),'City')]")).click();
		Thread.sleep(2000);

		// Javascript executor
		WebElement previous1 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("arguments[0].scrollIntoView()", previous1);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create City Pop-up screen
		// Country Name
		WebElement a4 = driver.findElement(By.xpath("//select[@id='State_CountryID']"));
		Select country3 = new Select(a4);
		country3.selectByVisibleText("India");
		Thread.sleep(2000);

		// State
		WebElement a5 = driver.findElement(By.xpath("//select[@id='StateID']"));
		Select country4 = new Select(a5);
		country4.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);

		// City Code
		driver.findElement(By.xpath("//input[@id='CityCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CityCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// City Name
		driver.findElement(By.xpath("//input[@id='CityName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CityName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Is Metro
		driver.findElement(By.xpath("(//input[@id='IsMetro'])[1]")).click();
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

		// *********************Mandatory - 4.Branch*************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Mandatory
		Actions a6 = new Actions(driver);
		WebElement Mandatory3 = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a6.moveToElement(Mandatory3).build().perform();
		Thread.sleep(2000);

		// Branch
		driver.findElement(By.xpath("//a[contains(text(),'Branch')]")).click();
		Thread.sleep(2000);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create Branch Pop-up screen
		// Branch Code
		driver.findElement(By.xpath("//input[@id='BranchCode']")).clear();
		driver.findElement(By.xpath("//input[@id='BranchCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Branch Name
		driver.findElement(By.xpath("//input[@id='BranchName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='BranchName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Phone
		driver.findElement(By.xpath("//input[@id='Phone']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys("1234567890");
		Thread.sleep(2000);

		// address1
		driver.findElement(By.xpath("//input[@id='Address1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("Test2");
		Thread.sleep(2000);

		// country
		WebElement country5 = driver.findElement(By.xpath("//select[@id='City_State_CountryID']"));
		Select a7 = new Select(country5);
		a7.selectByVisibleText("India");
		Thread.sleep(2000);

		// state
		WebElement state1 = driver.findElement(By.xpath("//select[@id='City_StateID']"));
		Select a8 = new Select(state1);
		a8.selectByVisibleText("Tamil Nadu");
		Thread.sleep(2000);

		// city
		WebElement city1 = driver.findElement(By.xpath("//select[@id='CityID']"));
		Select a9 = new Select(city1);
		a9.selectByVisibleText("CHENNAI");
		Thread.sleep(2000);

		// pincode
		driver.findElement(By.xpath("//input[@id='PinCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='PinCode']")).sendKeys("6000001");
		Thread.sleep(2000);

		// Cancel
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);

		// *****************Mandatory - 5. Location**********************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Mandatory
		Actions a10 = new Actions(driver);
		WebElement Mandatory4 = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a10.moveToElement(Mandatory4).build().perform();
		Thread.sleep(2000);

		// Location
		driver.findElement(By.xpath("//a[contains(text(),'Location')]")).click();
		Thread.sleep(2000);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create Office Locations Page
		// Branch Name
		WebElement a11 = driver.findElement(By.xpath("//select[@id='CompanyID']"));
		Select country6 = new Select(a11);
		country6.selectByVisibleText("NH Bangalore");
		Thread.sleep(2000);

		// Location Code
		driver.findElement(By.xpath("//input[@id='LocationCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LocationCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Location Name
		driver.findElement(By.xpath("//input[@id='LocationName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LocationName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

// ****************************Vendor******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);
		
		// Vendor
		Actions a12 = new Actions(driver);
		WebElement Vendor = driver.findElement(By.xpath("//a[contains(text(),'Mandatory')]"));
		Thread.sleep(2000);
		a12.moveToElement(Vendor).build().perform();
		Thread.sleep(2000);

		// Location
		driver.findElement(By.xpath("//a[contains(text(),'Vendor')]")).click();
		Thread.sleep(2000);

		// Javascript executor - Scroll Down Page
		WebElement previous2 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		je2.executeScript("arguments[0].scrollIntoView()", previous2);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Vendor Pop-up screen
		// Vendor Code
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='VendorCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='VendorCode']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Vendor Name
		driver.findElement(By.xpath("//input[@id='VendorName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='VendorName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//****************************Cost Center******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);
		
		// Cost Center
		driver.findElement(By.xpath("//a[contains(text(),'Cost Center')]")).click();
		Thread.sleep(2000);

		// Javascript executor - Scroll Down Page
		WebElement previous3 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je3 = (JavascriptExecutor) driver;
		je3.executeScript("arguments[0].scrollIntoView()", previous3);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create Cost Center Pop-up screen
		// Cost Center Code
		driver.findElement(By.xpath("//input[@id='CostCenterCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CostCenterCode']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cost Center
		driver.findElement(By.xpath("//input[@id='CostCenterName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CostCenterName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//****************************Department******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);
		
		// Department
		driver.findElement(By.xpath("//a[contains(text(),'Department')]")).click();
		Thread.sleep(2000);

		// Javascript executor - Scroll Down Page
		WebElement previous4 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je4 = (JavascriptExecutor) driver;
		je4.executeScript("arguments[0].scrollIntoView()", previous4);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create Department Pop-up screen
		// Department Code
		driver.findElement(By.xpath("//input[@id='DepartmentCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='DepartmentCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Department Name
		driver.findElement(By.xpath("//input[@id='DepartmentName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='DepartmentName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
//****************************General Ledger******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// General Ledger
		driver.findElement(By.xpath("//a[contains(text(),'General Ledger')]")).click();
		Thread.sleep(2000);

		// Javascript executor - Scroll Down Page
//		WebElement previous5 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
//		JavascriptExecutor je5 = (JavascriptExecutor) driver;
//		je5.executeScript("arguments[0].scrollIntoView()", previous5);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Ledger Pop-up screen
		// Ledger Code
		driver.findElement(By.xpath("//input[@id='GLCode1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='GLCode1']")).sendKeys("Test");
		Thread.sleep(2000);

		// Ledger Name
		driver.findElement(By.xpath("//input[@id='GLCodeType']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='GLCodeType']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Type
		WebElement a13 = driver.findElement(By.xpath("//select[@id='DR_CR']"));
		Select Type = new Select(a13);
		Type.selectByVisibleText("Debit");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//****************************Asset User******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Asset User
		driver.findElement(By.xpath("//a[contains(text(),'Asset User')]")).click();
		Thread.sleep(2000);

		// Branches
		WebElement a14 = driver.findElement(By.xpath("//select[@id='ddlBranches']"));
		Select Branches = new Select(a14);
		Branches.selectByVisibleText("NH Bangalore");
		Thread.sleep(2000);

		// Javascript executor - Scroll Down Page
//				WebElement previous6 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
//				JavascriptExecutor je6 = (JavascriptExecutor) driver;
//				je6.executeScript("arguments[0].scrollIntoView()", previous6);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary MyLinkClass']")).click();
		Thread.sleep(2000);

		// Asset User Pop-up screen
		// First Name
		driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Test");
		Thread.sleep(2000);

		//// Last Name
		driver.findElement(By.xpath("//input[@id='LastName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Employee Code
		driver.findElement(By.xpath("//input[@id='Ecode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Ecode']")).sendKeys("Test2");
		Thread.sleep(2000);

		// Email
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Test@fastfacts.co");
		Thread.sleep(2000);

		// Department
		WebElement a15 = driver.findElement(By.xpath("//select[@id='DepartmentID']"));
		Select Department = new Select(a15);
		Department.selectByVisibleText("test");
		Thread.sleep(2000);

		// Cost Center
		WebElement a16 = driver.findElement(By.xpath("//select[@id='CostCenterID']"));
		Select CostCenter = new Select(a16);
		CostCenter.selectByVisibleText("Admin");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
// ***************Cost Breakup Category**********************
		
		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Cost Breakup Category
		driver.findElement(By.xpath("//a[contains(text(),'Cost Breakup Category')]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
//		WebElement previous7 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
//		JavascriptExecutor je7 = (JavascriptExecutor) driver;
//		je7.executeScript("arguments[0].scrollIntoView()", previous7);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create Cost Breakup Category Pop-up screen
		// Cost Category Code
		driver.findElement(By.xpath("//input[@id='CostBreakupCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CostBreakupCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Cost Category Name
		driver.findElement(By.xpath("//input[@id='CostBreakupCategoryName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='CostBreakupCategoryName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//****************************User Defined Parameters - 1. UDM ******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// User Defined Parameters
		Actions a17 = new Actions(driver);
		WebElement UDM = driver.findElement(By.xpath("//a[contains(text(),'User Defined Parameters')]"));
		Thread.sleep(2000);
		a17.moveToElement(UDM).build().perform();
		Thread.sleep(2000);

		// UDM
		driver.findElement(By.xpath("//a[contains(text(),'UDM')]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
//		WebElement previous8 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
//		JavascriptExecutor je8 = (JavascriptExecutor) driver;
//		je8.executeScript("arguments[0].scrollIntoView()", previous8);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create Parameters Pop-up screen
		// Parameter Name
		driver.findElement(By.xpath("//input[@id='UDMMisc_UDMName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UDMMisc_UDMName']")).sendKeys("Test");
		Thread.sleep(2000);

		// Code
		driver.findElement(By.xpath("//input[@id='UDMMisc_UDMCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UDMMisc_UDMCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Is Master
		// Yes
		driver.findElement(By.xpath("//input[@id='UDMMisc_IsMasterYes']")).click();
		Thread.sleep(2000);

		// Is Mandatory
		// No
		driver.findElement(By.xpath("//input[@id='UDMMisc_IsMandatoryNo']")).click();
		Thread.sleep(2000);

		// Is Active
		// Yes
		driver.findElement(By.xpath("//input[@id='UDMMisc_IsActiveYes']")).click();
		Thread.sleep(2000);

		// Data Type
		WebElement a18 = driver.findElement(By.xpath("//select[@id='UDMTypeID']"));
		Select DataType = new Select(a18);
		DataType.selectByVisibleText("Date");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		driver.close();

//****************************User Defined Parameters - 2. UDM Data ******************************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// User Defined Parameters
		Actions a19 = new Actions(driver);
		WebElement UDMData = driver.findElement(By.xpath("//a[contains(text(),'User Defined Parameters')]"));
		Thread.sleep(2000);
		a19.moveToElement(UDMData).build().perform();
		Thread.sleep(2000);

		// UDM Data
		driver.findElement(By.xpath("//a[contains(text(),'UDM Data')]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
//		WebElement previous9 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
//		JavascriptExecutor je9 = (JavascriptExecutor) driver;
//		je9.executeScript("arguments[0].scrollIntoView()", previous9);

		// Add Button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create UDM Data Pop-up screen
		// Parameter Name
		WebElement a20 = driver.findElement(By.xpath("//select[@id='UDMID']"));
		Select ParameterName = new Select(a20);
		ParameterName.selectByVisibleText("Select");
		Thread.sleep(2000);

		// Code
		driver.findElement(By.xpath("//input[@id='UDMDataCode']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UDMDataCode']")).sendKeys("Test");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

//*************************Asset Categories - 1.Asset Category Creation**********************************
		
		
		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Asset Categories
		Actions a21 = new Actions(driver);
		WebElement AssetCategories = driver.findElement(By.xpath("//a[contains(text(),'Asset Categories')]"));
		Thread.sleep(2000);
		a21.moveToElement(AssetCategories).build().perform();
		Thread.sleep(2000);

		// Asset Category Creation
		driver.findElement(By.xpath("//a[contains(text(),'Asset Category Creation')]")).click();
		Thread.sleep(2000);

		// Branches
		WebElement a22 = driver.findElement(By.xpath("//select[@id='ddlBranches']"));
		Select Branches1 = new Select(a22);
		Branches1.selectByVisibleText("NH Bangalore");
		Thread.sleep(2000);

		//Javascript executor- Scroll Down Page
		WebElement Add = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]"));
		JavascriptExecutor je10 = (JavascriptExecutor) driver;
		je10.executeScript("arguments[0].scrollIntoView()", Add);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create Asset Category Level - 1 Pop-up screen
		// Description
		driver.findElement(By.xpath("//input[@id='AssetDescription']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='AssetDescription']")).sendKeys("Test");
		Thread.sleep(2000);

		// Prefix
		driver.findElement(By.xpath("//input[@id='Prefix']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Prefix']")).sendKeys("Test1");
		Thread.sleep(2000);

		// Cancel Button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
// *********Asset Categories - 2.Asset Category - Branch Map**********************************

		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Asset Categories
		Actions a23 = new Actions(driver);
		WebElement AssetCategories1 = driver.findElement(By.xpath("//a[contains(text(),'Asset Categories')]"));
		Thread.sleep(2000);
		a23.moveToElement(AssetCategories1).build().perform();
		Thread.sleep(2000);

		// Asset Category - Branch Map
		driver.findElement(By.xpath("//a[contains(text(),'Asset Category  - Branch Map')]")).click();
		Thread.sleep(2000);

		// All Branches
		driver.findElement(By.xpath("//input[@id='SelectAllBranches']")).click();
		Thread.sleep(2000);

		// ASSET CATEGORY - LEVEL 1
		// Lab equip 10 yrs
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[1]")).click();
		Thread.sleep(2000);

		// Furniture and Fixtures
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[2]")).click();
		Thread.sleep(2000);

		// Computers
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[3]")).click();
		Thread.sleep(2000);

		// Lab equip 5 yrs
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[4]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
		WebElement previous11 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je11 = (JavascriptExecutor) driver;
		je11.executeScript("arguments[0].scrollIntoView()", previous11);

		// Override old mapping
		driver.findElement(By.xpath("//input[@id='OverrideOldMapping']")).click();
		Thread.sleep(2000);

		// Save Button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Successfule Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);
	
		//*************************Asset Categories - 3.Asset Category  - Role Map**********************************
		
		// Master-title
		driver.findElement(By.xpath("//a[contains(text(),'Masters ')]")).click();
		Thread.sleep(2000);

		// Asset Categories
		Actions a24 = new Actions(driver);
		WebElement AssetCategories2 = driver.findElement(By.xpath("//a[contains(text(),'Asset Categories')]"));
		Thread.sleep(2000);
		a24.moveToElement(AssetCategories2).build().perform();
		Thread.sleep(2000);

		// Asset Category - Role Map
		driver.findElement(By.xpath("//a[contains(text(),'Asset Category  - Role Map')]")).click();
		Thread.sleep(2000);

		// Branches
		WebElement a25 = driver.findElement(By.xpath("//select[@id='CompanyId']"));
		Select Branches2 = new Select(a25);
		Branches2.selectByVisibleText("NH Bangalore");
		Thread.sleep(2000);

		// All Role
		driver.findElement(By.xpath("//input[@id='SelectAllBranches']")).click();
		Thread.sleep(2000);

		// ASSET CATEGORY - LEVEL 1
		// Lab equip 10 yrs
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[1]")).click();
		Thread.sleep(2000);

		// Furniture and Fixtures
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[2]")).click();
		Thread.sleep(2000);

		// Computers
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[3]")).click();
		Thread.sleep(2000);

		// Lab equip 5 yrs
		driver.findElement(By.xpath("(//input[@id='SelectedCategories'])[4]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
		WebElement previous12 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je12 = (JavascriptExecutor) driver;
		je12.executeScript("arguments[0].scrollIntoView()", previous12);

		// Override old mapping
		driver.findElement(By.xpath("//input[@id='OverrideOldMapping']")).click();
		Thread.sleep(2000);

		// Save Button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Successfull Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);	
		
//-------------------------------------------Logout-------------------------------------------------------------
		// Logout 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);
		driver.close();

	}
}
