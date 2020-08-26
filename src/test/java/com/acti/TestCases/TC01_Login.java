package com.acti.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

public class TC01_Login extends DriverScript{
	
	LoginPage lp;
	
	public TC01_Login()
	{
		//super keyword is used to call base class constructor
		super();
	}
	@BeforeMethod
	public 	void preTest()
	{
		initBrowser();
		lp=new LoginPage();
	}
	@AfterMethod
	public 	void postTest()
	{
		driver.close();
	}
	@Test(priority=1)
		public 	void testVerifyTitle()
	{
		
		String title=lp.verifyTitle();
		System.out.println(title);
		}
	@Test(priority=2)
	public void testVerifyLogoisDisplayed()
	{
		boolean res=lp.verifyLogoisDisplayed();
		System.out.println(res);
	}
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLoginFunction("admin","manager");
		
	}
	
}
