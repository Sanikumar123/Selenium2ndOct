package com.XYZ.homepage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginpage {
	WebDriver driver;
	
	public BankManagerLoginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement addCustomerBtn;
	

	@FindBy(xpath="//button[@ng-click='openAccount()']")
	WebElement openAccountBtn;
	
	@FindBy(xpath="//button[@ng-click='showCust()']")
	WebElement showCutomerBtn;
	
	
	@FindBy(xpath="//input[@ng-model='fName']")
	WebElement fName;
	
	@FindBy(xpath="//input[@ng-model='lName']")
	WebElement lName;
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	WebElement postCode;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	WebElement clickAddCustomerBtn;
	
	
	@FindBy(xpath="//input[@ng-model='searchCustomer']")
	WebElement searchCustomerBox;
	
	
	
	
	
	
	
	public void clickAddCustomerbtn()
	{
		addCustomerBtn.click();
	}
	
	
	public void clickopenAccountBtn()
	{
		openAccountBtn.click();
	}
	
	public void clickshowCutomerBtn()
	{
		showCutomerBtn.click();
	}
	
	public void addCustomer(String fname,String lname,String postcode)
	{
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		postCode.sendKeys(postcode);
		clickAddCustomerBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
				
		
	}
	
	public void searchCustomer(String CustName)
	{
		searchCustomerBox.sendKeys(CustName);
	}
	

}
