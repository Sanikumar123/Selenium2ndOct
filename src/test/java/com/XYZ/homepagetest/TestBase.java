package com.XYZ.homepagetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	
	public WebDriver setUp()
	{
		
		//Open a file to read - FileInputStream
		//Open a file to write - FileOutputStream
		
		FileInputStream file=null;
		try {
			file = new FileInputStream("D:\\javasesion\\SeleniumProject\\src\\test\\resources\\configuration\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop= new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(prop.getProperty("BrowserName").equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "D:\\javasesion\\SeleniumProject\\src\\test\\resources\\driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("TestURL"));
			
		}
		else if(prop.getProperty("BrowserName").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "provier gecko driver location");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("TestURL"));
		}
		
		return driver;
		
	}

}
