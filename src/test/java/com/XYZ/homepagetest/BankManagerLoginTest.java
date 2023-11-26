package com.XYZ.homepagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.XYZ.homepage.BankManagerLoginpage;
import com.XYZ.homepage.Homepage;

public class BankManagerLoginTest extends TestBase {
	Homepage homepage;
	BankManagerLoginpage bankManagePage;
	
	
	
WebDriver driver=null;
	
	@BeforeMethod
	public void openBrowser()
	{ 
		driver = setUp();
	}
	
	@Test(priority=1,enabled=true)
	public void addACustomer()
	{
      
		homepage = new Homepage(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homepage.clickBankManagerLoginBtn();
		bankManagePage = new BankManagerLoginpage(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bankManagePage.clickAddCustomerbtn();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bankManagePage.addCustomer("Sani", "Kumar", "DFHRF");
		
		
		
	}
	
	@Test(priority=2,enabled=false)
	public void searchCustomer() {
		

		homepage = new Homepage(driver);
		homepage.clickBankManagerLoginBtn();
		bankManagePage = new BankManagerLoginpage(driver);
		bankManagePage.clickshowCutomerBtn();
		bankManagePage.searchCustomer("Sani");
		

}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	


}
