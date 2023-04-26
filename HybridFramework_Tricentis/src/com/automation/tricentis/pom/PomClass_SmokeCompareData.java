  package com.automation.tricentis.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass_SmokeCompareData {
	
	
	@FindBy(linkText = "Log in" )
	private WebElement login_link;
	
	
	@FindBy(id="Email")
	private WebElement email_textfield;
	
	
	@FindBy(id="Password")
	private WebElement password_textfield;
	
	
	
	@FindBy (xpath = "//input[@value = 'Log in']") 
	private WebElement  login_btn;
	
	@FindBy (xpath = "//ul[@class='top-menu']/li[1]/a" )
	private WebElement books_tab;
	
	
	public PomClass_SmokeCompareData (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement login_click()
	
	{
		return login_link;
		
   }
	public WebElement email_text()
	{
		return email_textfield;
		
	}
	
	
	public WebElement pass_text()
	{
		return password_textfield;
	}
	
	
	public WebElement login_button()
	{
		return login_btn;
	}
	
}
