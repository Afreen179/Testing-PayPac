package FAMS;

	import java.util.ArrayList;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class ReportsFAMS {


		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://localhost:88/Account/Login");

	//***************************************Login********************************************
			// Company Code
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

			// ************Fixed Assets Register**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Fixed Assets Register
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Assets Register')]")).click();
			Thread.sleep(2000);

			// Book
			WebElement e1 = driver.findElement(By.xpath("//select[@id='BookID']"));
			Select Book = new Select(e1);
			Book.selectByVisibleText("Company Book");
			Thread.sleep(2000);

			// Assets Used Up to
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// Exclude Sale / Transferred Out Assets
			driver.findElement(By.xpath("//input[@id='ExcludeSaleTransferredOut']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='ExcludeSaleTransferredOut']")).click();
			Thread.sleep(2000);

			// With Depreciation Details
			driver.findElement(By.xpath("//input[@id='WithDepreciationDetail']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='WithDepreciationDetail']")).click();
			Thread.sleep(2000);

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement DownloadPDF = driver.findElement(By.xpath("//input[@id='btnSavePDF']"));
			JavascriptExecutor je25 = (JavascriptExecutor) driver;
			je25.executeScript("arguments[0].scrollIntoView()", DownloadPDF);

//			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
//			Thread.sleep(2000);

			//*******************************AMCReport**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			//AMC Report
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'AMCReport')]")).click();
			Thread.sleep(2000);
			
			// Month Wise Radio button
			driver.findElement(By.xpath("(//input[@id='IsSelected'])[2]")).click();
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

			// Export Excel Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			
			//*******************************Insurance Reports**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Insurance Reports
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Insurance Reports')]")).click();
			Thread.sleep(2000);

			// Month Wise Radio button
			driver.findElement(By.xpath("(//input[@id='IsSelected'])[2]")).click();
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

			// Export Excel Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*******************************Warranty Report**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Warranty Report
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Warranty Report')]")).click();
			Thread.sleep(2000);
			
			// Month Wise Radio button
			driver.findElement(By.xpath("(//input[@id='IsSelected'])[2]")).click();
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

			// Export Excel Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
			//*********************Fixed Asset Depreciation Statement*************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Fixed Asset Depreciation Statement
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Asset Depreciation Statement')]")).click();
			Thread.sleep(2000);
							
			// Book Id
			Thread.sleep(2000);
			WebElement BookId = driver.findElement(By.xpath("//select[@id='BookId']"));
			Select e2 = new Select(BookId);
			e2.selectByVisibleText("Company Book");
			Thread.sleep(2000);
			
			// From Date
//			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
//			Thread.sleep(2000);

			// To Date
//			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
//			Thread.sleep(2000);
			
			// Grouping On
			WebElement GroupingOn = driver.findElement(By.xpath("//select[@id='GroupOne']"));
			Select c13 = new Select(GroupingOn);
			c13.selectByVisibleText("Asset Category Level I");
			Thread.sleep(2000);
			
//			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
			
			// *****************Asset Sold / Discarded**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Asset Sold / Discarded
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Asset Sold / Discarded')]")).click();
			Thread.sleep(2000);

			// From Date
			driver.findElement(By.xpath("//input[@id='ReportFromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ReportToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
			Thread.sleep(2000);
			
			// Book Id
			WebElement BookId1 = driver.findElement(By.xpath("//select[@id='BookID']"));
			Select e3 = new Select(BookId1);
			e3.selectByVisibleText("Company Book");
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//			Thread.sleep(2000);

			// Download PDF Button
			//driver.findElement(By.xpath("//input[@id='proceed']")).click();
			//Thread.sleep(2000);
			
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(0));
			
			// *****************Depreciation Amount Mismatch**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Depreciation Amount Mismatch
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Depreciation Amount Mismatch')]")).click();
			Thread.sleep(2000);

			// Book Id
			WebElement BookId2 = driver.findElement(By.xpath("//select[@id='BookID']"));
			Select e4 = new Select(BookId2);
			e4.selectByVisibleText("Company Book");
			Thread.sleep(2000);

//			// From Date
//			driver.findElement(By.xpath("//input[@id='ReportFromDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
//			Thread.sleep(2000);

//			// To Date
//			driver.findElement(By.xpath("//input[@id='ReportToDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
//			Thread.sleep(2000);

//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
			
			// *****************Fixed Asset Schedule-Income Tax Act**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Fixed Asset Schedule-Income Tax Act
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Asset Schedule-Income Tax Act')]")).click();
			Thread.sleep(2000);

//			// Financial Year
//			WebElement FinancialYear = driver.findElement(By.xpath("//select[@id='BookAccYear']"));
//			Select e5 = new Select(FinancialYear);
//			e5.selectByVisibleText("");
//			Thread.sleep(2000);

//			// Quarter
//			WebElement Quarter = driver.findElement(By.xpath("//select[@id='QuarterDdl']"));
//			Select e6 = new Select(Quarter);
//			e6.selectByVisibleText("");
//			Thread.sleep(2000);

			// Include Block with Zero Depreciation value
			driver.findElement(By.xpath("//input[@id='EnableTotalDepZero']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='EnableTotalDepZero']")).click();
			Thread.sleep(2000);

//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);

			// ***************Asset Sent For Repair Detail******************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Asset Sent For Repair Detail
			driver.findElement(By.xpath("//a[contains(text(),'Asset Sent For Repair Detail')]")).click();
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
			
			
			// *****************Print Bar Code**************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Print Bar Code
			driver.findElement(By.xpath("//a[contains(text(),'Print Bar Code')]")).click();
			Thread.sleep(2000);

			// Set Up
			// Selection
			WebElement Selection = driver.findElement(By.xpath("//select[@id='Selection']"));
			Select e7 = new Select(Selection);
			e7.selectByVisibleText("Purchase Order No");
			Thread.sleep(2000);
			
			// Number of Label
			driver.findElement(By.xpath("//input[@id='NumberofLabel']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='NumberofLabel']")).sendKeys("3");
			Thread.sleep(2000);
			
			// Sort By
			WebElement SortBy = driver.findElement(By.xpath("//select[@id='SortBy']"));
			Select e8 = new Select(SortBy);
			e8.selectByVisibleText("Physical Location");
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement Save = driver.findElement(By.xpath("//input[@id='SaveText']"));
			JavascriptExecutor je26 = (JavascriptExecutor) driver;
			je26.executeScript("arguments[0].scrollIntoView()", Save);

			// Save Button
			driver.findElement(By.xpath("//input[@id='SaveText']")).click();
			Thread.sleep(2000);
			
			// Succcessful Message pop-up screen
			driver.findElement(By.xpath("//a[@class='close']")).click();
			Thread.sleep(2000);
			
			// *****************Fixed Asset Classification - Income Tax Act************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Fixed Asset Classification - Income Tax Act
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Asset Classification - Income Tax Act')]")).click();
			Thread.sleep(2000);
		
//			// Financial Year
//			WebElement FinancialYear1 = driver.findElement(By.xpath("//select[@id='BookAccountingYearID']"));
//			Select e8 = new Select(FinancialYear1);
//			e8.selectByVisibleText("");
//			Thread.sleep(2000);
			
			// With Proposed Depreciation Amount
			driver.findElement(By.xpath("//input[@id='WithDepreciationDetail']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='WithDepreciationDetail']")).click();
			Thread.sleep(2000);
			
			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
			
			
			// *****************Transaction Listing - 1. Transfer Acceptance Report ************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL = new Actions(driver);
			WebElement TransactionListing = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL.moveToElement(TransactionListing).build().perform();
			
			// Transfer Acceptance Report
			driver.findElement(By.xpath("//a[contains(text(),'Transfer Acceptance Report')]")).click();
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

			// Export Button
			driver.findElement(By.xpath("//input[@id='Export']")).click();
			Thread.sleep(2000);
			
			// Error Message pop-up screen
			driver.findElement(By.xpath("//a[@class='close']")).click();
			Thread.sleep(2000);
			
			// *****************Transaction Listingg - 2. Asset Shifted ************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL1 = new Actions(driver);
			WebElement TransactionListing1 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL1.moveToElement(TransactionListing1).build().perform();
			
			// Asset Shifted
			driver.findElement(By.xpath("//a[contains(text(),'Asset Shifted')]")).click();
			Thread.sleep(2000);
			
			// Unit
			WebElement Unit = driver.findElement(By.xpath("//select[@id='Unit']"));
			Select e9 = new Select(Unit);
			e9.selectByVisibleText("Within Different Unit");
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

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			
			// Proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);
			
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//			Thread.sleep(2000);

			// Download PDF Button
			//driver.findElement(By.xpath("//input[@id='proceed']")).click();
			//Thread.sleep(2000);
			
			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs1.get(1));
			driver.close();
			driver.switchTo().window(tabs1.get(0));
			
			// *****************Transaction Listing - 3. Asset Cost BreakUp ************************

			// Reports Title
					driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
					Thread.sleep(2000);
					
					// Transaction Listing
					Actions TL3 = new Actions(driver);
					WebElement TransactionListing3 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
					Thread.sleep(2000);
					TL3.moveToElement(TransactionListing3).build().perform();
							
					// Asset Cost BreakUp
					driver.findElement(By.xpath("//a[contains(text(),'Asset Cost BreakUp')]")).click();
					Thread.sleep(2000);
					
					// Purchase Order Date  
					driver.findElement(By.xpath("//input[@id='chkAssetPODate']")).click();
					Thread.sleep(2000);
					
					//Purchase Date     
					driver.findElement(By.xpath("//input[@id='ReportFromDate']")).click();
					Thread.sleep(2000);
					
					//Date Put To Use
					driver.findElement(By.xpath("//input[@id='chkAssetDatePutToUse']")).click();
					Thread.sleep(2000);
					
					// From Date
					driver.findElement(By.xpath("//input[@id='ReportFromDate']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'17')]")).click();
					Thread.sleep(2000);

					// To Date
					driver.findElement(By.xpath("//input[@id='ReportToDate']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[contains(text(),'25')]")).click();
					Thread.sleep(2000);

					// Print Headings On All pages
					driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
					Thread.sleep(2000);
					
					// Download PDF Button
					driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
					Thread.sleep(2000);
					
//					// Error Message pop-up screen
//					driver.findElement(By.xpath("//a[@class='close']")).click();
//					Thread.sleep(2000);
					
					ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs3.get(1));
					driver.close();
					driver.switchTo().window(tabs3.get(0));
					
					// *****************Transaction Listing - 4. Asset Splited ************************

					// Reports Title
					driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
					Thread.sleep(2000);
					
					// Transaction Listing
					Actions TL2 = new Actions(driver);
					WebElement TransactionListing2 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
					Thread.sleep(2000);
					TL2.moveToElement(TransactionListing2).build().perform();
							
					// Asset Splited
					driver.findElement(By.xpath("//a[contains(text(),'Asset Splited')]")).click();
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

//					// Export to Excel Button
//					driver.findElement(By.xpath("//input[@id='proceed']")).click();
//					Thread.sleep(2000);

			
			// *****************Transaction Listing - 5. Asset Acquired-Vendorwise ************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Transaction Listing
			Actions TL4 = new Actions(driver);
			WebElement TransactionListing4 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL4.moveToElement(TransactionListing4).build().perform();

			// Asset Acquired-Vendorwise
			driver.findElement(By.xpath("//a[contains(text(),'Asset Acquired-Vendorwise')]")).click();
			Thread.sleep(2000);

			// Group One
			WebElement GroupOne = driver.findElement(By.xpath("//select[@id='Group2']"));
			Select e10 = new Select(GroupOne);
			e10.selectByVisibleText("Vendorwise");
			Thread.sleep(2000);

			// Group Two
			WebElement GroupTwo = driver.findElement(By.xpath("//select[@id='GroupOne']"));
			Select e11 = new Select(GroupTwo);
			e11.selectByVisibleText("Asset Category Level III");
			Thread.sleep(2000);

			// Selection of Vendor from the existing list
			driver.findElement(By.xpath("//input[@id='3']")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement DownloadPDF1 = driver.findElement(By.xpath("//input[@id='btnSavePDF']"));
			JavascriptExecutor je27 = (JavascriptExecutor) driver;
			je27.executeScript("arguments[0].scrollIntoView()", DownloadPDF1);

			// Purchase Date
			driver.findElement(By.xpath("//input[@id='chkAssetPurchaseDate']")).click();
			Thread.sleep(2000);

			// Use Date
			driver.findElement(By.xpath("//input[@id='chkAssetUseDate']")).click();
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

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

//			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
//			Thread.sleep(2000);

			// *****************Transaction Listing - 6. Asset Insurance Report ************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL5 = new Actions(driver);
			WebElement TransactionListing5 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL5.moveToElement(TransactionListing5).build().perform();
					
			// Asset Insurance Report
			driver.findElement(By.xpath("//a[contains(text(),'Asset Insurance Report')]")).click();
			Thread.sleep(2000);
										
			// From Date
			driver.findElement(By.xpath("//input[@id='ReportFromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ReportToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

		    //Assets Covered Under Insurance
			driver.findElement(By.xpath("//input[@id='chkAssetCovered']")).click();
			Thread.sleep(2000);
			
			//Assets Where Insurance is Expiring between
			driver.findElement(By.xpath("//input[@id='chkAssetCovered']")).click();
			Thread.sleep(2000);
			
			//Assets not covered Under Insurance
			driver.findElement(By.xpath("//input[@id='chkAssetNotCovered']")).click();
			Thread.sleep(2000);
			
			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='downloadPDF']")).click();
//			Thread.sleep(2000);
//			
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[contains(text(),'×')]")).click();
//			Thread.sleep(2000);
			
			
			// *****************Transaction Listing - 7. Additions made to an asset************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL6 = new Actions(driver);
			WebElement TransactionListing6 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL6.moveToElement(TransactionListing6).build().perform();
					
			// Additions made to an asset
			driver.findElement(By.xpath("//a[contains(text(),'Additions made to an asset')]")).click();
			Thread.sleep(2000);
					
			// Assets Used Up to
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'5')]")).click();
			Thread.sleep(2000);
					
			//Include Dependent Child - Acquired as purchased
			driver.findElement(By.xpath("//input[@id='DependentChildAcuiredPurchased']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='DependentChildAcuiredPurchased']")).click();
			Thread.sleep(2000);
			
			//Include Dependent Child - Acquired as Foreign Exchange
			driver.findElement(By.xpath("//input[@id='DependentChildAcuiredForeignExchange']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='DependentChildAcuiredForeignExchange']")).click();
			Thread.sleep(2000);
			
			//Include Independent Child
			driver.findElement(By.xpath("//input[@id='IndependentChild']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='IndependentChild']")).click();
			Thread.sleep(2000);
			
//			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='downloadPDF']")).click();
//			Thread.sleep(2000);
			
			// *****************Transaction Listing - 8. Asset Acquisition - Datewise************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL7 = new Actions(driver);
			WebElement TransactionListing7 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL7.moveToElement(TransactionListing7).build().perform();
					
			// Asset Acquisition - Datewise
			driver.findElement(By.xpath("//a[contains(text(),'Asset Acquisition - Datewise')]")).click();
			Thread.sleep(2000);
				
			// Purchase Order Date
			driver.findElement(By.xpath("(//input[@id='DateWise'])[1]")).click();
			Thread.sleep(2000);

//			// Purchase Date
//			driver.findElement(By.xpath("(//input[@id='DateWise'])[2]")).click();
//			Thread.sleep(2000);
	//
//			// Voucher Date
//			driver.findElement(By.xpath("(//input[@id='DateWise'])[3]")).click();
//			Thread.sleep(2000);
	//
//			// Date Put To Use
//			driver.findElement(By.xpath("(//input[@id='DateWise'])[4]")).click();
//			Thread.sleep(2000);

			//Assets Not Put to Use
			driver.findElement(By.xpath("//input[@id='NotDatePutToUse']")).click();
			Thread.sleep(2000);
			
			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// Grouping On
			WebElement GroupingOn1 = driver.findElement(By.xpath("//select[@id='GroupOne']"));
			Select e13 = new Select(GroupingOn1);
			e13.selectByVisibleText("Asset Category Level III");
			Thread.sleep(2000);

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

			// Javascript executor- Scroll Down Page
			WebElement DownloadPDF3 = driver.findElement(By.xpath("//input[@id='btnSavePDF']"));
			JavascriptExecutor je29 = (JavascriptExecutor) driver;
			je29.executeScript("arguments[0].scrollIntoView()", DownloadPDF3);

//			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
//			Thread.sleep(2000);
			
			// *****************Transaction Listing - 9. Asset Costing Rs************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
			
			// Transaction Listing
			Actions TL8 = new Actions(driver);
			WebElement TransactionListing8 = driver.findElement(By.xpath("//a[contains(text(),'Transaction Listing')]"));
			Thread.sleep(2000);
			TL8.moveToElement(TransactionListing8).build().perform();
					
			// Asset Costing Rs
			driver.findElement(By.xpath("//a[contains(text(),'Asset Costing Rs')]")).click();
			Thread.sleep(2000);
					
			// Use Date From
			driver.findElement(By.xpath("//input[@id='UseDateFrom']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);
			
			//Use Date UpTo
			driver.findElement(By.xpath("//input[@id='UseDateUpTo']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);
					
			//GroupOne
			WebElement GroupingOne = driver.findElement(By.xpath("//select[@id='GroupOne']"));
			Select e14 = new Select(GroupingOne);
			e14.selectByVisibleText("Asset Category Level III");
			Thread.sleep(2000);
			
			//Cost of Asset 
			WebElement CostOfAsset = driver.findElement(By.xpath("//select[@id='CostofAsset']"));
			Select e15 = new Select(CostOfAsset);
			e15.selectByVisibleText(">=");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='CostofAssetAmount']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='CostofAssetAmount']")).sendKeys("50000");
			Thread.sleep(2000);
			
			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='downloadPDF']")).click();
//			Thread.sleep(2000);

			// *****************Fixed Asset Listing************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Fixed Asset Listing
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Asset Listing')]")).click();
			Thread.sleep(2000);
					
			// Define Column Listing Button
			driver.findElement(By.xpath("//a[contains(text(),'Define Column Listing')]")).click();
			Thread.sleep(2000);
			
			// Add Button
			driver.findElement(By.xpath("//a[@id='btnAdd']")).click();
			Thread.sleep(2000);
			
			// Create Fixed Asset Listing pop-up screen
			// Code
			driver.findElement(By.xpath("//input[@id='Code']")).sendKeys("Test");
			Thread.sleep(2000);
			
			// Name
			driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Test Test");
			Thread.sleep(2000);
			
			// Select All Basic Details
			driver.findElement(By.xpath("//input[@id='ColumnscheckallBasic']")).click();
			Thread.sleep(2000);
			
			//  Select All UDM Details
			driver.findElement(By.xpath("//input[@id='ColumnscheckallUDM']")).click();
			Thread.sleep(2000);
			
			//  Select All Cost & Depreciation Details
			driver.findElement(By.xpath("//input[@id='ColumnscheckallCost']")).click();
			Thread.sleep(2000);
			
			// Cancel Button
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(2000);
			
			// *****************Report - Form 3CD************************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Report - Form 3CD
			driver.findElement(By.xpath("//a[contains(text(),'Report - Form 3CD')]")).click();
			Thread.sleep(2000);
			
//			//Financial Year
//			WebElement FY = driver.findElement(By.xpath("//select[@id='BookAccYear']"));
//			Select e14 = new Select(FY);
//			e14.selectByVisibleText("");
//			Thread.sleep(2000);
			
			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
			
			// *****************Asset Category Change Report***********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Asset Category Change Report
			driver.findElement(By.xpath("//a[contains(text(),'Asset Category Change Report')]")).click();
			Thread.sleep(2000);
			
			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
			Thread.sleep(2000);

			// Exclude Sale / Transferred Out Assets
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			
//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
//			
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//			Thread.sleep(2000);
//			
			
			// *****************Back Dated Report***********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Asset Category Change Report
			driver.findElement(By.xpath("//a[contains(text(),'Back Dated Report')]")).click();
			Thread.sleep(2000);
			
			// Book
			WebElement Book1 = driver.findElement(By.xpath("//select[@id='BookID']"));
			Select e16 = new Select(Book1);
			e16.selectByVisibleText("Company Book");
			Thread.sleep(2000);
					
			// Group One
			WebElement GroupOne1 = driver.findElement(By.xpath("//select[@id='GroupOne']"));
			Select e17 = new Select(GroupOne1);
			e17.selectByVisibleText("Asset Category Level II");
			Thread.sleep(2000);

//			// From Date
//			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
//			Thread.sleep(2000);
	//
//			// To Date
//			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
//			Thread.sleep(2000);
//			
//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000)

			// *****************Fixed Asset Ledger***********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);

			// Fixed Asset Ledger
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Asset Ledger')]")).click();
			Thread.sleep(2000);

			// Check-Box
			driver.findElement(By.xpath("//input[@id='_inpChkAll']")).click();
			Thread.sleep(2000);

			// Print Headings On All pages
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='PrintHeadingOnAllpages']")).click();
			Thread.sleep(2000);

			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
//			Thread.sleep(2000);				

			// *****************Asset Under Custody***********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Asset Under Custody
			driver.findElement(By.xpath("//a[contains(text(),'Asset Under Custody')]")).click();
			Thread.sleep(2000);
			
//		    // Assets Used Up to
//			driver.findElement(By.xpath("//*[@id=\"AssetUsedUpto\"]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
//			Thread.sleep(2000);
			
//			//Acknowledge Before
//			driver.findElement(By.xpath("//input[@id='AckBefore']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
//			Thread.sleep(2000);
			
//			//Generated By
//			WebElement GeneratedBy = driver.findElement(By.xpath("//select[@id='GeneratedBy']"));
//			Select e18 = new Select(GeneratedBy);
//			e18.selectByVisibleText("venkat Admin (venk)");
//			Thread.sleep(2000);
			
//			//User To
//			WebElement UserTo = driver.findElement(By.xpath("//select[@id='UserTo']"));
//			Select e19 = new Select(UserTo);
//			e19.selectByVisibleText("venkat Admin (venk)");
//			Thread.sleep(2000);
//			
//			//Selection  
//			WebElement Selection1 = driver.findElement(By.xpath("//select[@id='Selection']"));
//			Select e20 = new Select(Selection1);
//			e20.selectByVisibleText("Acknowledge Before");
//			Thread.sleep(2000);		
//			
//			// Javascript executor- Scroll Down Page
//			WebElement Proceed = driver.findElement(By.xpath("//input[@id='proceed']"));
//			JavascriptExecutor je30 = (JavascriptExecutor) driver;
//			je30.executeScript("arguments[0].scrollIntoView()", Proceed);
//			Thread.sleep(4000);		
		
//			// Proceed Button
//			driver.findElement(By.xpath("//input[@id='proceed']")).click();
//			Thread.sleep(2000);
//			
//			// Error Message pop-up screen
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//			Thread.sleep(2000);
		
			// *****************Fixed Assets Register Groupwise**********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Fixed Assets Register Groupwise
			driver.findElement(By.xpath("//a[contains(text(),'Fixed Assets Register Groupwise')]")).click();
			Thread.sleep(2000);
			
//			// Book
//			WebElement Book1 = driver.findElement(By.xpath("//select[@id='BookID']"));
//			Select e16 = new Select(Book1);
//			e16.selectByVisibleText("Company Book");
//			Thread.sleep(2000);
		
//			// From Date
//			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
//			Thread.sleep(2000);

//			// To Date
//			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
//			Thread.sleep(2000);
			
			// Download PDF Button
//			driver.findElement(By.xpath("//input[@id='btnSavePDF']")).click();
//			Thread.sleep(2000);
			
			// *****************GLCredit and Debit Report**********************

//			// Reports Title
//			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
//			Thread.sleep(2000);
//							
//			// GLCredit and Debit Report
//			driver.findElement(By.xpath("//a[contains(text(),'GLCredit and Debit Report')]")).click();
//			Thread.sleep(2000);
//			
//			//SERVER ERROR
			
			// *****************Login Log Report**********************

			// Reports Title
			driver.findElement(By.xpath("//a[contains(text(),'Reports ')]")).click();
			Thread.sleep(2000);
							
			// Login Log Report
			driver.findElement(By.xpath("//a[contains(text(),'Login Log Report')]")).click();
			Thread.sleep(2000);
			
			// From Date
			driver.findElement(By.xpath("//input[@id='FromDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[contains(text(),'1')])[3]")).click();
			Thread.sleep(2000);

			// To Date
			driver.findElement(By.xpath("//input[@id='ToDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'31')]")).click();
			Thread.sleep(2000);

			// Is Mobile
			// Yes
			driver.findElement(By.xpath("(//input[@id='IsMobile'])[1]")).click();
			Thread.sleep(2000);
			
//			// No
//			driver.findElement(By.xpath("(//input[@id='IsMobile'])[1]")).click();
//			Thread.sleep(2000);
					
			// proceed Button
			driver.findElement(By.xpath("//input[@id='proceed']")).click();
			Thread.sleep(2000);

			ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs4.get(1));
			driver.close();
			driver.switchTo().window(tabs4.get(0));
			Thread.sleep(2000);
			
			//-------------------------Logout--------------
			
			// Logout
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Thread.sleep(5000);
			driver.close();
			
			
		}

	}
