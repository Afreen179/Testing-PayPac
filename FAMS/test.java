package FAMS;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class test {
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
		}}
