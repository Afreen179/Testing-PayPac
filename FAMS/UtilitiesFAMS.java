package FAMS;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class UtilitiesFAMS {


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
			
			//*******************JV Report*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// JV Report
			driver.findElement(By.xpath("//a[contains(text(),'JV Report')]")).click();
			Thread.sleep(2000);

			// BookId
			WebElement AccountingYear = driver.findElement(By.xpath("//select[@id='BookId']"));
			Select d = new Select(AccountingYear);
			d.selectByVisibleText("Company Book");
			Thread.sleep(2000);

			// From Date >=
//			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
//			Thread.sleep(2000);

			// To Date <=
//			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
//			Thread.sleep(2000);

			// Export Button
			driver.findElement(By.xpath("//input[@id='Export']")).click();
			Thread.sleep(2000);

	//*******************Asset Enquiry*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Asset Enquiry
			driver.findElement(By.xpath("//a[contains(text(),'Asset Enquiry')]")).click();
			Thread.sleep(2000);

//			// Branches
//			WebElement d1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[2]/div[1]/div/div[2]/div/button/span"));
//			Select Branch = new Select(d1);
//			Branch.selectByVisibleText("NH Bangalore");
//			Thread.sleep(2000);

			// Search Button
			driver.findElement(By.xpath("//input[@id='_btnGlobalAssetFilterSearch']")).click();
			Thread.sleep(2000);

			//*******************Asset Information*******************************		

			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Asset Enquiry
			driver.findElement(By.xpath("//a[contains(text(),'Asset Information')]")).click();
			Thread.sleep(2000);

			// Depreciation
			driver.findElement(By.xpath("(//a[contains(text(),'Depreciation')])[7]")).click();
			Thread.sleep(2000);

			// Sales
			driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
			Thread.sleep(2000);

			// Transfer
			driver.findElement(By.xpath("(//a[contains(text(),'Transfer')])[7]")).click();
			Thread.sleep(2000);

			// Transfer Out
			driver.findElement(By.xpath("(//a[contains(text(),'Transfer Out')])[2]")).click();
			Thread.sleep(2000);

			// Dependents
			driver.findElement(By.xpath("//a[contains(text(),'Dependents')]")).click();
			Thread.sleep(2000);

			// Asset Split
			driver.findElement(By.xpath("(//a[contains(text(),'Asset Split')])[3]")).click();
			Thread.sleep(2000);

			// Maintenance & Repairs
			driver.findElement(By.xpath("//a[contains(text(),'Maintenance & Repairs')]")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement InsuranceAndAMC1 = driver.findElement(By.xpath("//a[contains(text(),'Insurance & AMC')]"));
			JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("arguments[0].scrollIntoView()", InsuranceAndAMC1);

			// Insurance & AMC
			driver.findElement(By.xpath("//a[contains(text(),'Insurance & AMC')]")).click();
			Thread.sleep(2000);

			// Physical Verification
			driver.findElement(By.xpath("(//a[contains(text(),'Physical Verification')])[2]")).click();
			Thread.sleep(2000);

			//*******************Import 1. Masters*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Import
			Actions a24 = new Actions(driver);
			WebElement AssetCategories2 = driver.findElement(By.xpath("//a[contains(text(),'Import')]"));
			Thread.sleep(2000);
			a24.moveToElement(AssetCategories2).build().perform();
			Thread.sleep(2000);

			// Masters
			driver.findElement(By.xpath("(//a[contains(text(),'Masters')])[2]")).click();
			Thread.sleep(2000);

			// Select Masters
			WebElement d1 = driver.findElement(By.xpath("//select[@id='EmpMiscMasters']"));
			Select Branch = new Select(d1);
			Branch.selectByVisibleText("Department");
			Thread.sleep(2000);

			// Import Button
			driver.findElement(By.xpath("//a[@id='btnImport']")).click();
			Thread.sleep(2000);

			// Import Masters pop-up screen
			// Cancel Button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);
			
			//*******************Import 2. Cost Break Up*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Import
			Actions d2 = new Actions(driver);
			WebElement Import = driver.findElement(By.xpath("//a[contains(text(),'Import')]"));
			Thread.sleep(2000);
			d2.moveToElement(Import).build().perform();
			Thread.sleep(2000);

			// Cost Break Up
			driver.findElement(By.xpath("//a[contains(text(),'Cost Break Up')]")).click();
			Thread.sleep(2000);

			// Branch
			WebElement d3 = driver.findElement(By.xpath("//select[@id='ddlCompanyId']"));
			Select Branch1 = new Select(d3);
			Branch1.selectByVisibleText("NH Bangalore");
			Thread.sleep(2000);

			// Based On
			driver.findElement(By.xpath("//input[@id='IsSelected']")).click();
			Thread.sleep(2000);

			// Import Button
			driver.findElement(By.xpath("//a[@id='btnImport']")).click();
			Thread.sleep(2000);

			// Import Masters pop-up screen
			// Cancel Button
			driver.findElement(By.xpath("//button[@class='btn']")).click();
			Thread.sleep(2000);	
			
			//*******************Bulk Delete of Assets*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Bulk Delete of Assets
			driver.findElement(By.xpath("//a[contains(text(),'Bulk Delete of Assets')]")).click();
			Thread.sleep(2000);

			// Branch
			WebElement d4 = driver.findElement(By.xpath("//select[@id='ddlBranches']"));
			Select Branch2 = new Select(d4);
			Branch2.selectByVisibleText("NH Bangalore");
			Thread.sleep(2000);

			// Search Button
			driver.findElement(By.xpath("//input[@id='_btnGlobalAssetFilterSearch']")).click();
			Thread.sleep(2000);

			// Bulk Delete Button
			driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			Thread.sleep(2000);

			// Error Message pop-up screen
			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
			Thread.sleep(2000);
			
			//*******************Dashboard*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Dashboard
			driver.findElement(By.xpath("(//a[contains(text(),'Dashboard')])[6]")).click();
			Thread.sleep(2000);

			// AMC Covered Assets
			// Download Button
			// Assets By Location
			driver.findElement(By.xpath("//input[@id='amc']")).click();
			Thread.sleep(2000);
			
			//*******************INDAS - 1. INDAS - POST*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// INDAS
			Actions d7 = new Actions(driver);
			WebElement INDAS = driver.findElement(By.xpath("//a[contains(text(),'INDAS')]"));
			Thread.sleep(2000);
			d7.moveToElement(INDAS).build().perform();
			Thread.sleep(2000);

			// INDAS - ROLLBACK
			driver.findElement(By.xpath("//a[contains(text(),'INDAS - ROLLBACK')]")).click();
			Thread.sleep(2000);

	//*******************INDAS - 2. INDAS - ROLLBACK*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// INDAS
			Actions d6 = new Actions(driver);
			WebElement INDAS1 = driver.findElement(By.xpath("//a[contains(text(),'INDAS')]"));
			Thread.sleep(2000);
			d6.moveToElement(INDAS1).build().perform();
			Thread.sleep(2000);

			// INDAS - ROLLBACK
			driver.findElement(By.xpath("//a[contains(text(),'INDAS - ROLLBACK')]")).click();
			Thread.sleep(2000);
		
			//*******************Asset Ageing Enquiry*******************************		
			
			// Utilities -Title
			driver.findElement(By.xpath("//a[contains(text(),'Utilities ')]")).click();
			Thread.sleep(5000);

			// Asset Ageing Enquiry
			driver.findElement(By.xpath("//a[contains(text(),'Asset Ageing Enquiry')]")).click();
			Thread.sleep(2000);

			// Calculated Used Life in Months based on Date
			driver.findElement(By.xpath("//input[@id='CalculateUsedLife']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();
			Thread.sleep(2000);

			// Export To Excel Button
//			driver.findElement(By.xpath("//input[@id='downloadSummary']")).click();
//			Thread.sleep(2000);
					
			//***************************Logout***********************************
			
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Thread.sleep(5000);
			driver.close();

		}

	}

