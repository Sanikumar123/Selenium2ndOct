package com.XYZ.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement bankManagerLoginBtn;
	
	@FindBy(xpath="//button[@ng-click='customer()']")
	WebElement customerLoginBtn;
	
	
	public void clickBankManagerLoginBtn()
	{
		bankManagerLoginBtn.click();
	}
	
	public void clickCustomerLoginBtn()
	{
		customerLoginBtn.click();
	}
	

}
