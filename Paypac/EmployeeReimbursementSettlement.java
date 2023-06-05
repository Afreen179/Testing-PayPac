package com.Paypac;
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class EmployeeReimbursementSettlement {

		public static void main(String[] args) throws InterruptedException, IOException {

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

	//*******************************************************************************************************
//						EMPLOYEE REIMBURSEMENT SETTLEMENT TITLE
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
			//================================================Logout==================================================================	
//			// Logout
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[2]/a")).click();
//			Thread.sleep(5000);
////			driver.close();
	}
	}
