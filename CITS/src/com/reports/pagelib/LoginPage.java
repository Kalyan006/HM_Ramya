package com.reports.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author ab13539
 *
 */
public class LoginPage {
	
	@FindBy(name = "user")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
			
	
	

}
