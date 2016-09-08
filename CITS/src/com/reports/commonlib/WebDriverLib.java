package com.reports.commonlib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverLib extends Driver {
	
	public void waitForPageToLoad() 
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	public void acceptAlert()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public boolean verifyText(String expected,String actual)
	{
		boolean flag = false;
		if(expected.equals(actual))
		{
			flag=true;
		}
		return flag;
	}

	public void frameHandle(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void SwitchWindow()
	{
		String Mainwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for(String currenwindow:allwindow)
		{
			if(!Mainwindow.equals(currenwindow))
			{
				driver.switchTo().window(currenwindow);
				
			}
		}
	}
}
