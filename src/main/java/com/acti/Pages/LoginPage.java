package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class LoginPage extends DriverScript{
	//****************************** Objects Identification ***************************************************//	
		
	@FindBy(id="username") WebElement usernameTb;
	@FindBy(name="pwd") WebElement passwordTb;
	@FindBy(id="loginButton") WebElement loginBtn;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	
//****************************** Page/Object Initialization ********************************************* //
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//****************************** Actions/Methods ********************************************* //	
   public String verifyTitle()
   {
	   return driver.getTitle();
   }
   public boolean verifyLogoisDisplayed()
   {
	   return actiLogo.isDisplayed();
   }
   public void validateLoginFunction(String username,String password)
   {
	 
	usernameTb.sendKeys(username); 
	 passwordTb.sendKeys(password);
	 loginBtn.click();
   }
}
