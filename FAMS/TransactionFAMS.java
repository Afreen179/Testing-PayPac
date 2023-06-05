package FAMS;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class TransactionFAMS {

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
			// Login Button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			
	//***************************************Closing Balance Asset Acquisition********************************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Closing Balance Asset Acquisition
			driver.findElement(By.xpath("//a[contains(text(),'Closing Balance Asset Acquisition')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement DataUploads = driver.findElement(By.xpath("(//div[@id='accordion'])"));
			JavascriptExecutor je14 = (JavascriptExecutor) driver;
			je14.executeScript("arguments[0].scrollIntoView()", DataUploads);
			
			// Add button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);
					
			// Javascript executor- Scroll Down Page
			WebElement Next = driver.findElement(By.xpath("//button[@class='btn pull-right']"));
			JavascriptExecutor je15 = (JavascriptExecutor) driver;
			je15.executeScript("arguments[0].scrollIntoView()", Next);
			
//			// 2. Asset Cost Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
//			
//			// 3. Category Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
//			
//			// 4. Additional Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);

	//***************************************Asset Acquisition********************************************

			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Acquisition
			driver.findElement(By.xpath("//a[contains(text(),'Asset Acquisition')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement DataUploads1 = driver.findElement(By.xpath("(//div[@id='accordion'])"));
			JavascriptExecutor je16 = (JavascriptExecutor) driver;
			je16.executeScript("arguments[0].scrollIntoView()", DataUploads1);

			// Add button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Next1 = driver.findElement(By.xpath("//button[@class='btn pull-right']"));
			JavascriptExecutor je17 = (JavascriptExecutor) driver;
			je17.executeScript("arguments[0].scrollIntoView()", Next1);

//			// 2. Asset Cost Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
//					
//			// 3. Category Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
//				
//			// 4. Additional Info
//			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//			Thread.sleep(2000);
			
	// **************Assign Multi-Shift Details****************

			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Assign Multi-Shift Details
			driver.findElement(By.xpath("//a[contains(text(),'Assign Multi-Shift Details')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// CompanyBook
			WebElement CompanyBook = driver.findElement(By.xpath("//select[@id='CompanyBookID']"));
			Select c = new Select(CompanyBook);
			c.selectByVisibleText("Company Book");
			Thread.sleep(2000);

			// BookAccountingYear
			WebElement BookAccountingYear = driver.findElement(By.xpath("//select[@id='BookAccountingYearID']"));
			Select c1 = new Select(BookAccountingYear);
			c1.selectByVisibleText("2022-2023");
			Thread.sleep(2000);

			// Effective From
			driver.findElement(By.xpath("//input[@id='EffectiveFrom']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// Effective To
			driver.findElement(By.xpath("//input[@id='EffectiveTo']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// Double Shift(In Days)
			driver.findElement(By.id("DblShftInDays")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("DblShftInDays")).sendKeys("1");
			Thread.sleep(2000);

			// Triple Shift(In Days)
			driver.findElement(By.id("TrplShftInDays")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("TrplShftInDays")).sendKeys("1");
			Thread.sleep(2000);

			// Map button
			driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
			Thread.sleep(2000);

			// ok Button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[3]")).click();
			Thread.sleep(2000);

	//***************************************Asset Sale/Discard********************************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Sale/Discard
			driver.findElement(By.xpath("//a[contains(text(),'Asset Sale/Discard')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Create Asset Sale Page
			// Back Button
			driver.findElement(By.id("_btnGlobalAssetFilterSearch")).click();
			Thread.sleep(2000);

	//*********************Asset Split*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Split
			driver.findElement(By.xpath("//a[contains(text(),'Asset Split')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Import1 = driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]"));
			JavascriptExecutor je18 = (JavascriptExecutor) driver;
			je18.executeScript("arguments[0].scrollIntoView()", Import1);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Sale Page
			// Back Button
			driver.findElement(By.id("btnBack")).click();
			Thread.sleep(2000);
		
	//*********************Depreciation Calculations - 1. As Per Books*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Depreciation Calculations
			Actions c2 = new Actions(driver);
			WebElement DepreciationCalculations = driver
					.findElement(By.xpath("//a[contains(text(),'Depreciation Calculations')]"));
			c2.moveToElement(DepreciationCalculations).build().perform();

			// As Per Books
			driver.findElement(By.xpath("(//a[contains(text(),'As Per Books')])[2]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Depreciation Calculation Page
			// Accounting Year
			WebElement AccountingYear = driver.findElement(By.xpath("//select[@id='BookAccYear']"));
			Select c3 = new Select(AccountingYear);
			c3.selectByVisibleText("2022-2023");
			Thread.sleep(2000);

			// Calculation From
			driver.findElement(By.xpath("//input[@id='EffectiveFrom']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// Calculation as at
			driver.findElement(By.xpath("//input[@id='EffectiveTo']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Calculate = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
			JavascriptExecutor je19 = (JavascriptExecutor) driver;
			je19.executeScript("arguments[0].scrollIntoView()", Calculate);

			// Back Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
				
	//*********************Depreciation Calculations - 2. Income-Tax Act*******************************

			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Depreciation Calculations
			Actions c4 = new Actions(driver);
			WebElement DepreciationCalculations1 = driver
					.findElement(By.xpath("//a[contains(text(),'Depreciation Calculations')]"));
			c4.moveToElement(DepreciationCalculations1).build().perform();

			// Income-Tax Act
			driver.findElement(By.xpath("//a[contains(text(),'Income-Tax Act')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Depreciation Calculation Page
			// Financial Year
			WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='BookAccYear']"));
			Select c5 = new Select(FinancialYear);
			c5.selectByVisibleText("2022-2023");
			Thread.sleep(2000);

			// Quarter
			WebElement Quarter = driver.findElement(By.xpath("//select[@id='QuarterDDL']"));
			Select c6 = new Select(Quarter);
			c6.selectByVisibleText("Quarter-1");
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Calculate1 = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
			JavascriptExecutor je20 = (JavascriptExecutor) driver;
			je20.executeScript("arguments[0].scrollIntoView()", Calculate1);

			// Back Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

	//*********************Retrospective Change in Depreciation - 2. Change of Rate / Method*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Retrospective Change in Depreciation
			Actions c7 = new Actions(driver);
			WebElement RetrospectiveChangeInDepreciation = driver
					.findElement(By.xpath("//a[contains(text(),'Retrospective Change in Depreciation')]"));
			c7.moveToElement(RetrospectiveChangeInDepreciation).build().perform();

			// Change of Rate / Method
			driver.findElement(By.xpath("//a[contains(text(),'Change of Rate / Method')]")).click();
			Thread.sleep(2000);

			// Change of Rate / Method Page
			// Error Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
			
	//*********************Retrospective Change in Depreciation - 2. As per Companies ACT 2013 - Post*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Retrospective Change in Depreciation
			Actions c8 = new Actions(driver);
			WebElement RetrospectiveChangeInDepreciation1 = driver
					.findElement(By.xpath("//a[contains(text(),'Retrospective Change in Depreciation')]"));
			c8.moveToElement(RetrospectiveChangeInDepreciation1).build().perform();

			// As per Companies ACT 2013 - Post
			driver.findElement(By.xpath("//a[contains(text(),'As per Companies ACT 2013 - Post')]")).click();
			Thread.sleep(2000);

			// Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Import2 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			JavascriptExecutor je21 = (JavascriptExecutor) driver;
			je21.executeScript("arguments[0].scrollIntoView()", Import2);

			// As per Companies ACT 2013 - Post Page
			// Update Button
			driver.findElement(By.xpath("(//input[@class='btn btn-primary'])[2]")).click();
			Thread.sleep(2000);

			// Error Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
			
	//*********************Retrospective Change in Depreciation - 3. As per Companies ACT 2013 - Rollback*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Retrospective Change in Depreciation
			Actions c9 = new Actions(driver);
			WebElement RetrospectiveChangeInDepreciation2 = driver
					.findElement(By.xpath("//a[contains(text(),'Retrospective Change in Depreciation')]"));
			c9.moveToElement(RetrospectiveChangeInDepreciation2).build().perform();

			// As per Companies ACT 2013 - Rollback
			driver.findElement(By.xpath("//a[contains(text(),'As per Companies ACT 2013 - Rollback')]")).click();
			Thread.sleep(2000);
			
	//*********************Asset Category Change*******************************
					
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Category Change
			driver.findElement(By.xpath("//a[contains(text(),'Asset Category Change')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Import3 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
			JavascriptExecutor je22 = (JavascriptExecutor) driver;
			je22.executeScript("arguments[0].scrollIntoView()", Import3);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Category Level 1
			WebElement CategoryLevel1 = driver.findElement(By.xpath("//select[@id='ddlCategoryLevel1Filter']"));
			Select c10 = new Select(CategoryLevel1);
			c10.selectByVisibleText("Lab equip 10 yrs");

			// Back Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
		
	//********************Asset Insurance*******************************

			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Insurance
			driver.findElement(By.xpath("//a[contains(text(),'Asset Insurance')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Insurance Pop-up screen
			// Policy Number
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__PolicyNumber']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__PolicyNumber']")).sendKeys("123");
			Thread.sleep(2000);

			// Insurance From
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__FromDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'25')])"));
			Thread.sleep(2000);

			// Insurance Up to
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__ToDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'25')])")).click();
			Thread.sleep(2000);

			// Policy Amount
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__PolicyAmount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AssetInsuranceDetails_0__PolicyAmount']")).sendKeys("1000");
			Thread.sleep(2000);

			// Vendor
			WebElement Vendor = driver.findElement(By.xpath("//select[@id='AssetInsuranceDetails_0__VendorID']"));
			Select c11 = new Select(Vendor);
			c11.selectByVisibleText("JUNIPER LIFE SCIENCES PVT LTD");

			// Back Button
			driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
			Thread.sleep(2000);

	//******************** Asset Warranty *******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Warranty
			driver.findElement(By.xpath("//a[contains(text(),'Asset Warranty')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Insurance Pop-up screen
			// From Date
			driver.findElement(By.xpath("//input[@id='AssetWarrantyDetails_0__FromDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'25')])"));
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='AssetWarrantyDetails_0__ToDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'25')])")).click();
			Thread.sleep(2000);

			// Vendor
			WebElement Vendor1 = driver.findElement(By.xpath("//select[@id='AssetWarrantyDetails_0__VendorID']"));
			Select c12 = new Select(Vendor1);
			c12.selectByVisibleText("BECKMAN COULTER INDIA PRIVATE LIMITED");

			// Back Button
			driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
			Thread.sleep(2000);
			
	//********************Asset Maintenance Contract*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Maintenance Contract
			driver.findElement(By.xpath("//a[contains(text(),'Asset Maintenance Contract')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Insurance Pop-up screen
			// From Date
			driver.findElement(By.xpath("//input[@id='AssetMaintenanceContractDetails_0__FromDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'25')])"));
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='AssetMaintenanceContractDetails_0__ToDate']")).click();
			driver.findElement(By.xpath("(//a[contains(text(),'31')])")).click();
			Thread.sleep(2000);

			// Amount
			driver.findElement(By.xpath("//input[@id='AssetMaintenanceContractDetails_0__Amount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='AssetMaintenanceContractDetails_0__Amount']")).sendKeys("1000");
			Thread.sleep(2000);

			// Vendor
			WebElement Vendor2 = driver
					.findElement(By.xpath("//select[@id='AssetMaintenanceContractDetails_0__VendorID']"));
			Select c13 = new Select(Vendor2);
			c13.selectByVisibleText("BECKMAN COULTER INDIA PRIVATE LIMITED");

			// Back Button
			driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
			Thread.sleep(2000);		
			
	//********************Track Repairs & Maintenance*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Track Repairs & Maintenance
			driver.findElement(By.xpath("//a[contains(text(),'Track Repairs & Maintenance')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Insurance Pop-up screen
			// Back Button
			driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
			
	//*******************Shifting of Asset - 1. Asset Transferred Within the Unit*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Shifting of Asset
			Actions c14 = new Actions(driver);
			WebElement ShiftingOfAsset = driver.findElement(By.xpath("//a[contains(text(),'Shifting of Asset')]"));
			c14.moveToElement(ShiftingOfAsset).build().perform();

			// Asset Transferred Within the Unit
			driver.findElement(By.xpath("//a[contains(text(),'Asset Transferred Within the Unit')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Transfer Pop-up screen
			// Date
			driver.findElement(By.xpath("//input[@id='txtTransferDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Back Button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);

	//*******************Shifting of Asset - 2. Asset Transferred to different Unit*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Shifting of Asset
			Actions c15 = new Actions(driver);
			WebElement ShiftingOfAsset1 = driver.findElement(By.xpath("//a[contains(text(),'Shifting of Asset')]"));
			c15.moveToElement(ShiftingOfAsset1).build().perform();

			// Asset Transferred Within the Unit
			driver.findElement(By.xpath("//a[contains(text(),'Asset Transferred to different Unit')]")).click();
			Thread.sleep(2000);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Asset Transfer Pop-up screen
			// Invoice/Ref Number
			driver.findElement(By.xpath("//input[@id='RefNo']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='RefNo']")).sendKeys("12345");
			Thread.sleep(2000);

			// Shifted To
			driver.findElement(By.xpath("//input[@id='ShiftedTo']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ShiftedTo']")).sendKeys("Test");
			Thread.sleep(2000);

			// Date
			driver.findElement(By.xpath("//input[@id='TransferDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Back Button
			driver.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
			Thread.sleep(2000);

			//*******************Asset Physical Verification*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Asset Physical Verification
			driver.findElement(By.xpath("//a[contains(text(),'Asset Physical Verification')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Import4 = driver.findElement(By.xpath("//a[@id='btnImport']"));
			JavascriptExecutor je23 = (JavascriptExecutor) driver;
			je23.executeScript("arguments[0].scrollIntoView()", Import4);

			// Add button
			driver.findElement(By.xpath("(//a[contains(text(),'Add')])[2]")).click();
			Thread.sleep(2000);

			// Create Verification Transaction Pop-up screen
			// Reconciliation Date
			driver.findElement(By.xpath("//input[@id='StartDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// Description
			driver.findElement(By.xpath("//input[@id='Description']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='Description']")).sendKeys("Test");
			Thread.sleep(2000);

			// Done By
			driver.findElement(By.xpath("//input[@id='DoneBy']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='DoneBy']")).sendKeys("Tester");
			Thread.sleep(2000);

			// Back Button
			driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
			Thread.sleep(2000);
			
	//*******************Change Child Asset as Parent Asset*******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Change Child Asset as Parent Asset
			driver.findElement(By.xpath("//a[contains(text(),'Change Child Asset as Parent Asset')]")).click();
			Thread.sleep(2000);		

	//*******************Impairment of Assset - 1. Asset Impairment - Post *******************************
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Impairment of Assset
			Actions c16 = new Actions(driver);
			WebElement ImpairmentOfAssset = driver.findElement(By.xpath("//a[contains(text(),'Impairment of Assset')]"));
			c16.moveToElement(ImpairmentOfAssset).build().perform();

			// Asset Impairment - Post
			driver.findElement(By.xpath("//a[contains(text(),'Asset Impairment - Post')]")).click();
			Thread.sleep(2000);

			// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
			
			// Javascript executor- Scroll Down Page
			WebElement Import5 = driver.findElement(By.xpath("//a[@id='btnImport']"));
			JavascriptExecutor je24 = (JavascriptExecutor) driver;
			je24.executeScript("arguments[0].scrollIntoView()", Import5);

			// Update button
			driver.findElement(By.xpath("//input[@id='btnUpdate']")).click();
			Thread.sleep(2000);
			
			// Successful Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
					
	//*******************Impairment of Assset - 2. Asset Impairment - Rollback *******************************		
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Impairment of Assset
			Actions c17 = new Actions(driver);
			WebElement ImpairmentOfAssset1 = driver.findElement(By.xpath("//a[contains(text(),'Impairment of Assset')]"));
			c17.moveToElement(ImpairmentOfAssset1).build().perform();

			// Asset Impairment - Rollback
			driver.findElement(By.xpath("//a[contains(text(),'Asset Impairment - Rollback')]")).click();
			Thread.sleep(2000);
			

	////********************************Dashboard*******************************		
//					
//			// Transactions-Title
//			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
//			Thread.sleep(5000);
	//
//			// Dashboard
//			driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]")).click();
//			Thread.sleep(2000);
			
	//*******************Dashboard Asset Acquisition*******************************		
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Dashboard Asset Acquisition
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard Asset Acquisition')]")).click();
			Thread.sleep(2000);

			// Delete Button
			driver.findElement(By.xpath("//input[@id='_btnDelete']")).click();
			Thread.sleep(2000);
							
			
	//*******************Dashboard Asset Sale*******************************		

			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Dashboard Asset Sale
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard Asset Sale')]")).click();
			Thread.sleep(2000);

			// Delete Button
			driver.findElement(By.xpath("//input[@id='_btnApprove']")).click();
			Thread.sleep(2000);

	//*******************Dashboard Asset Transfer Within Unit*******************************		
			
			// Transactions-Title
			driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
			Thread.sleep(5000);

			// Dashboard Asset Transfer Within Unit
			driver.findElement(By.xpath("//a[contains(text(),'Dashboard Asset Transfer Within Unit')]")).click();
			Thread.sleep(2000);

			// Delete Button
			driver.findElement(By.xpath("//input[@id='_btnApprove']")).click();
			Thread.sleep(2000);
			
			//*******************Preventive Maintenance and task creation*******************************		
			
					// Transactions-Title
					driver.findElement(By.xpath("//a[contains(text(),'Transactions')]")).click();
					Thread.sleep(5000);

					// Dashboard Asset Transfer Within Unit
					driver.findElement(By.xpath("//a[contains(text(),'Dashboard Asset Transfer Within Unit')]")).click();
					Thread.sleep(2000);
					
					//From Date >=
					driver.findElement(By.xpath("//input[@id='_txtPurchaseDateGE']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
					Thread.sleep(2000);
					
					//To Date <=
					driver.findElement(By.xpath("//input[@id='_txtPurchaseDateLE']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
					Thread.sleep(2000);
					
					//Search Button
					driver.findElement(By.xpath("//input[@id='_btnGlobalAssetFilterSearch']")).click();
					Thread.sleep(2000);
					
					//Delete Button
					driver.findElement(By.xpath("//input[@id='_btnApprove']")).click();
					Thread.sleep(2000);
					
	//-------------------------------------------Logout-------------------------------------------------------------
					// Logout
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
					Thread.sleep(5000);	
					driver.close();
			driver.close();
		}

	}
