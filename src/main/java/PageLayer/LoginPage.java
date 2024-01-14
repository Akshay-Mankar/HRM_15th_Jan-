package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseLayer.BaseClass;
import UtilLayer.Wait;

public class LoginPage extends BaseClass {

	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginButton;

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loingFunctionlity(String uname,String pass)
	{
		System.out.println("20LPA to all Trinity Members");
		System.out.println("This is Dushyant update");
		System.out.println("This Dushyant Update 2nd Time");
		System.out.println("This is Sushant Update");
		System.out.println("This is Sushant Update for 2nd time");
		
		Wait.sendKeys(username,uname);
		Wait.sendKeys(password,pass);
		Wait.click(loginButton);	
	}
}
