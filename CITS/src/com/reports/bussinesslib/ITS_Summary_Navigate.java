package com.reports.bussinesslib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.reports.commonlib.Driver;
import com.reports.commonlib.ExcelLib;
import com.reports.commonlib.ReportLib;
import com.reports.commonlib.WebDriverLib;
import com.reports.pagelib.ITS_Summary;
import com.reports.pagelib.LoginPage;
import com.reports.pagelib.selectedIssues;

public class ITS_Summary_Navigate {
	
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxProfileDriver();
	ExcelLib eLib = new ExcelLib();
	ReportLib rLib = new ReportLib();
	WebDriverLib wLib = new WebDriverLib();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	ITS_Summary ITS = PageFactory.initElements(driver, ITS_Summary.class);
	selectedIssues selectIssue = PageFactory.initElements(driver, selectedIssues.class);
	
public void yearEndClose() throws IOException
	
	{
		try
		{
			wLib.waitForPageToLoad();
			
			WebElement fr = driver.findElement(By.name("baseframe"));
			
			wLib.frameHandle(fr);
			
			//ITS.getClosedLink().click();
			
			ITS.getYearEndCloseout().click();
			
			driver.switchTo().defaultContent();
			
			WebElement ifr = driver.findElement(By.name("baseframe"));
			
			wLib.frameHandle(ifr);
			
			wLib.waitForPageToLoad();
			
			//Boolean b = selectIssue.getClosed().isDisplayed();
			
			Boolean b = selectIssue.getYear_End_Close().isDisplayed();
			
			if(b)
			{
				System.out.println("Successfully naviagted to Year End Close link");
			}
			else
			{
				System.out.println("Failed naviagted to Year End Close link");
			}
			
			
			
		}
			catch(Throwable t)
			{
				t.printStackTrace();
				
				System.out.println("Failed navigated to ITS_Summary");
			}
		
		}


public void voidlink() throws IOException {
	try
	{
		wLib.waitForPageToLoad();
		
		WebElement fr = driver.findElement(By.name("baseframe"));
		
     	wLib.frameHandle(fr);
     	
        ITS.getVoidLink().click();
		
		driver.switchTo().defaultContent();

		WebElement ifr = driver.findElement(By.name("baseframe"));
		
		wLib.frameHandle(ifr);
		
		wLib.waitForPageToLoad();
		
		Boolean b = selectIssue.getVoid_label().isDisplayed();
		
		if(b)
		{
			System.out.println("Successfully naviagted to void link");
		}
		else
		{
			System.out.println("Failed naviagted to void link");
		}
	}
	catch(Throwable t)
	{
		t.printStackTrace();
		
		System.out.println("Failed to navigated to ITS_Summary");
		
	}
	
}

public void closelink() throws IOException {
	try
	{
		wLib.waitForPageToLoad();
		
		WebElement fr = driver.findElement(By.name("baseframe"));
		
     	wLib.frameHandle(fr);
     	
        ITS.getClosedLink().click();
		
		driver.switchTo().defaultContent();

		WebElement ifr = driver.findElement(By.name("baseframe"));
		
		wLib.frameHandle(ifr);
		
		wLib.waitForPageToLoad();
		
		Boolean b = selectIssue.getClosed().isDisplayed();
		
		if(b)
		{
			System.out.println("Successfully naviagted to Close link");
		}
		else
		{
			System.out.println("Failed naviagted to Close link");
		}
	}
	catch(Throwable t)
	{
		t.printStackTrace();
		
		System.out.println("Failed to navigated to ITS_Summary");
		
	}
	
}
}
