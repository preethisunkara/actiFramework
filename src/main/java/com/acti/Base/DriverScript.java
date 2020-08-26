package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DriverScript {
	
	public static WebDriver driver;
	static Properties prop;
	
	public DriverScript()
	{
		try
		{
			prop = new Properties();
			File src = new File("./acti.configaration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("File Not Found "+e.getMessage());
		}
	}
	
	
	public static void initBrowser()
	{
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./acti.browsers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./acti.browsers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No Proper Browser Specified : Please check the Properties file");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
	}

}






