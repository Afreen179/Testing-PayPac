package FAMS;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class configurationsFAMS {

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

	//*******************************Company Config - 1. Book Setting ***************************

		// configurations
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		// company Config
		Actions b = new Actions(driver);
		WebElement companyConfig = driver.findElement(By.xpath("//a[contains(text(),'Company Config')]"));
		Thread.sleep(2000);
		b.moveToElement(companyConfig).build().perform();

		// Book Setting
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Book Setting')]")).click();
		Thread.sleep(2000);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);
		
		// Book Setting Pop-up Screen
		//Book
		WebElement b1 = driver.findElement(By.xpath("//select[@id='BookID']"));
		Select Book = new Select(b1);
		Book.selectByVisibleText("Additional Book1");
		Thread.sleep(2000);
		
		//Book Name
		driver.findElement(By.id("BookName")).clear();
		driver.findElement(By.id("BookName")).sendKeys("Additional Book1");
		Thread.sleep(2000);
		
		//Currency
		WebElement b2 = driver.findElement(By.xpath("//select[@id='Currency']"));
		Select Currency = new Select(b2);
		Currency.selectByVisibleText("Rupee");
		Thread.sleep(2000);

		// Save button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

	//*******************************Company Config - 1. Parameters ***************************

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		// company Config
		Actions b3 = new Actions(driver);
		WebElement companyConfig1 = driver.findElement(By.xpath("//a[contains(text(),'Company Config')]"));
		b3.moveToElement(companyConfig1).build().perform();

		// Parameters
		driver.findElement(By.xpath("(//a[contains(text(),'Parameters')])[2]")).click();
		Thread.sleep(2000);

		// Global Parameters
		driver.findElement(By.xpath("//a[contains(text(),'Global Parameters')]")).click();
		Thread.sleep(2000);
		
		// Company Book
		driver.findElement(By.xpath("//a[contains(text(),'Company Book')]")).click();
		Thread.sleep(2000);
		
		// IT Book
		driver.findElement(By.xpath("//a[contains(text(),'IT Book')]")).click();
		Thread.sleep(2000);
		
		// Additional Book1
		driver.findElement(By.xpath("//a[contains(text(),'Additional Book1')]")).click();
		Thread.sleep(2000);
		
		//*************************Accounting Year - As Per Books**********************************
		
		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		// Accounting Year - As Per Books
		driver.findElement(By.xpath("//a[contains(text(),'Accounting Year - As Per Books')]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
		WebElement previous12 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je12 = (JavascriptExecutor) driver;
		je12.executeScript("arguments[0].scrollIntoView()", previous12);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Book Accounting Year Pop-up Screen
		// Book
		WebElement b4 = driver.findElement(By.xpath("//select[@id='CompanyBookID']"));
		Select Book1 = new Select(b4);
		Book1.selectByVisibleText("Company Book");
		Thread.sleep(2000);

		// Book Accounting Year
		driver.findElement(By.id("BookAccountingYear1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("BookAccountingYear1")).sendKeys("2023");
		Thread.sleep(2000);

//		Opening Date
//		WebElement OpeningDate = driver.findElement(By.xpath("//input[@id='OpeningDate']"));
//		OpeningDate.sendKeys("01 January, 2023" + Keys.ENTER);
//		Thread.sleep(2000);
//				
//		Closing Date
//		WebElement ClosingDate = driver.findElement(By.xpath("//input[@id='ClosingDate']"));
//		ClosingDate.sendKeys("031 May, 2023" + Keys.ENTER);
//		Thread.sleep(2000);

		// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
		
		//*************************Rates of Depreciation**********************************

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		//Rates of Depreciation
		driver.findElement(By.xpath("//a[contains(text(),'Rates of Depreciation')]")).click();
		Thread.sleep(2000);
		
		// Javascript executor- Scroll Down Page
		WebElement previous13 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je13 = (JavascriptExecutor) driver;
		je13.executeScript("arguments[0].scrollIntoView()", previous13);
		
		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);
		
		//Code
		driver.findElement(By.id("Code")).sendKeys("2023");
		Thread.sleep(2000);
		
		//Book name
		WebElement b5 = driver.findElement(By.xpath("//select[@id='CompanyBookID']"));
		Select Bookname = new Select(b5);
		Bookname.selectByVisibleText("Company Book");
		Thread.sleep(2000);
		
		//Description
		driver.findElement(By.id("Description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("Description")).sendKeys("Test");
		Thread.sleep(2000);
		
		//Useful Life (In Months)
		driver.findElement(By.id("UsefullLife")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("UsefullLife")).sendKeys("10");
		Thread.sleep(2000);
		
		//Depreciation Method
		WebElement b6 = driver.findElement(By.xpath("//select[@id='DepreciationMethodID']"));
		Select DepreciationMethod = new Select(b6);
		DepreciationMethod.selectByVisibleText("Written Down Value Method");
		Thread.sleep(2000);
		
		// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);
		
		// ***************Working Shift Denominatorn***********

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		// Working Shift Denominator
		driver.findElement(By.xpath("//a[contains(text(),'Working Shift Denominator')]")).click();
		Thread.sleep(2000);

		// Javascript executor- Scroll Down Page
		WebElement previous14 = driver.findElement(By.xpath("//a[@class='paginate_disabled_previous']"));
		JavascriptExecutor je14 = (JavascriptExecutor) driver;
		je14.executeScript("arguments[0].scrollIntoView()", previous14);

		// Add Button
		driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
		Thread.sleep(2000);

		// Create Shift Denominator Pop-up Screen
		// Book Accounting Year ID
		WebElement b7 = driver.findElement(By.xpath("//select[@id='BookAccountingYearID']"));
		Select BookAccountingYearID = new Select(b7);
		BookAccountingYearID.selectByVisibleText("2021-2022");
		Thread.sleep(2000);

		// Shift
		WebElement b8 = driver.findElement(By.xpath("//select[@id='ShiftID']"));
		Select Shift = new Select(b8);
		Shift.selectByVisibleText("Double");
		Thread.sleep(2000);

		// Shift Denominator
		driver.findElement(By.id("ShiftDenominatorValue")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ShiftDenominatorValue")).sendKeys("12");
		Thread.sleep(2000);

		// Cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

		// *********Access - 1.Define User**************

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations ')]")).click();
		Thread.sleep(2000);

		// Access
		Actions b9 = new Actions(driver);
		WebElement Access = driver.findElement(By.xpath("//a[contains(text(),'Access')]"));
		b9.moveToElement(Access).build().perform();

		// User
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		// User Type drop-down
		WebElement UserType = driver.findElement(By.id("UserType"));
		Select b10 = new Select(UserType);
		b10.selectByVisibleText("User");
		Thread.sleep(2000);

		// Add Button
		driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
		Thread.sleep(2000);

		// First Name
		driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Test");
		Thread.sleep(2000);

		// Last Name
		driver.findElement(By.xpath("//input[@id='LastName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Test1");
		Thread.sleep(2000);

		// User Name
		driver.findElement(By.xpath("//input[@id='UserName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("Test2");
		Thread.sleep(2000);

		// Email
		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Test@fastfacts.co");
		Thread.sleep(2000);

		// cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(3000);

		// *************************Access - 2.Role**********************************

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations')]")).click();
		Thread.sleep(2000);

		// Access
		Actions b11 = new Actions(driver);
		WebElement Access1 = driver.findElement(By.xpath("//a[contains(text(),'Access')]"));
		b11.moveToElement(Access1).build().perform();

		// Define Role
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/ul/li[5]/ul/li[2]/a")).click();
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
		driver.findElement(By.xpath("//a[contains(text(),'Configurations')]")).click();
		Thread.sleep(2000);

		// Access
		Actions b12 = new Actions(driver);
		WebElement Access2 = driver.findElement(By.xpath("//a[contains(text(),'Access')]"));
		b12.moveToElement(Access2).build().perform();

		// User Role Mapping
		driver.findElement(By.xpath("//a[contains(text(),'User Role Mapping')]")).click();
		Thread.sleep(2000);

		// Add button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		Thread.sleep(2000);

		// Create User Role pop-up screen
		// User Name
		WebElement UserName = driver.findElement(By.xpath("//select[@id='AppUserID']"));
		Select b13 = new Select(UserName);
		b13.selectByVisibleText("Admin");
		Thread.sleep(2000);

		// Role Name
		WebElement RoleName = driver.findElement(By.xpath("//select[@id='AppRoleID']"));
		Select b14 = new Select(RoleName);
		b14.selectByVisibleText("TESTING");
		Thread.sleep(2000);

		// Branch Name`
		WebElement BranchName = driver.findElement(By.xpath("//select[@id='Companies']"));
		Select b15 = new Select(BranchName);
		b15.selectByVisibleText("NH Bangalore");
		Thread.sleep(2000);

		// Save button
		// driver.findElement(By.xpath("//*[@id=\"entityModal\"]/div[3]/input")).click();
		// Thread.sleep(2000);

		// Successful Message pop-up screen
		// driver.findElement(By.xpath("(//a[contains(text(),'×')])")).click();
		// Thread.sleep(3000);

		// cancel button
		driver.findElement(By.xpath("//button[@class='btn']")).click();
		Thread.sleep(2000);

		// -----------------------Access - 4.Access Rights---------------------

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations')]")).click();
		Thread.sleep(2000);

		// Access
		Actions b16 = new Actions(driver);
		WebElement Access3 = driver.findElement(By.xpath("//a[contains(text(),'Access')]"));
		b16.moveToElement(Access3).build().perform();

		// Access Rights
		driver.findElement(By.xpath("//a[contains(text(),'Access Rights')]")).click();
		Thread.sleep(2000);

		// Role Name
		WebElement RoleName1 = driver.findElement(By.xpath("//Select[@id='AppRoleID']"));
		Select b17 = new Select(RoleName1);
		b17.selectByVisibleText("TESTING");
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

		// ****************************General*******************************

		// configurations Tab
		driver.findElement(By.xpath("//a[contains(text(),'Configurations')]")).click();
		Thread.sleep(2000);

		// General
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'General')])[2]")).click();
		Thread.sleep(2000);

		// Password Policy Page
		// Do you want password to have password policy
		// Yes
		driver.findElement(By.xpath("(//input[@id='PasswordPolicy'])[1]")).click();
		Thread.sleep(2000);

		// Save button
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(3000);

		// Successful Message pop-up screen
		driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
		Thread.sleep(2000);

	//-------------------------------------------Logout-------------------------------------------------------------
		// Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);
		driver.close();


	}}
