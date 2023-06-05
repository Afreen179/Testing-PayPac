package FAMS;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class AuditLogReportsFAMS {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://localhost:88/Account/Login");

			// ***************************************Login*************************
			// Company Code
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

			// *******************************AppRole log***************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// AppRole log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AppRole log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *******************************AssetTransfer Log***************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// AssetTransfer Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AssetTransfer Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// ********Asset Acquisition Log******************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Asset Acquisition Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Acquisition Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *******************************AMC Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// AMC Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AMC Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			//************Asset Acquisition UDMLog************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Asset Acquisition UDMLog
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Acquisition UDMLog')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *******************************Insurance Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Insurance Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *******************************Asset Document Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Asset Document Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Document Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *******************************Warranty Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Warranty Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Warranty Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			// *****Asset FinancialDepreciation Detail Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			// Asset FinancialDepreciation Detail Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset FinancialDepreciation Detail Log')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);

			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			//*******************************Repair and Maintainance Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Repair and Maintainance Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Repair and Maintainance Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Asset Sale Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Asset Sale Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Sale Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Company Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Company Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Company Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Asset CostBreakup Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Asset CostBreakup Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset CostBreakup Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************AssetCategoryChange Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//AssetCategoryChange Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AssetCategoryChange Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Asset Category Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Asset Category Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Category Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Assetverifydetails Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//Assetverifydetails Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Assetverifydetails Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************AssetSplitDetails Log**************************

			// AuditLog Reports
			driver.findElement(By.xpath("//a[contains(text(),'AuditLog Reports ')]")).click();
			Thread.sleep(2000);

			//AssetSplitDetails Log
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AssetSplitDetails Log')]")).click();
			Thread.sleep(2000);

			//From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
		//***************************Logout***********************************
			
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Thread.sleep(5000);
			driver.close();
		
			
		}

	}
