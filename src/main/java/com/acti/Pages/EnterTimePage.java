package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class EnterTimePage  extends DriverScript{
//****************************** Page/Object Initialization ********************************************* //
	
		public EnterTimePage()
		{
			PageFactory.initElements(driver, this);
		}
		
//****************************** Object/page repository***************************************************//
	
		@FindBy(id="logoutLink") WebElement logoutLnk;
		@FindBy(xpath="//div[text()='TASKS']") WebElement taskMenu;

//*******************************Actions/methods**************************************************//
		public void clickLogout()
		{
			logoutLnk.click();
		}
		public boolean verifytaskMenuDisplay()
		{
			return taskMenu.isDisplayed();
		}
        public void clickTaskMenu()
        {
        	taskMenu.click();
        }
}
