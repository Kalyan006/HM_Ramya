package com.reports.bussinesslib;

//import org.openqa.selenium.By;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.reports.commonlib.Driver;
import com.reports.commonlib.ExcelLib;
import com.reports.commonlib.ReportLib;
import com.reports.commonlib.WebDriverLib;
import com.reports.pagelib.ITS_Summary;
import com.reports.pagelib.LoginPage;
import com.reports.pagelib.selectedIssues;

public class LoginHM {
	
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxProfileDriver();
	ExcelLib eLib = new ExcelLib();
	ReportLib rLib = new ReportLib();
	WebDriverLib wLib = new WebDriverLib();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	ITS_Summary ITS = PageFactory.initElements(driver, ITS_Summary.class);
	selectedIssues selectIssue = PageFactory.initElements(driver, selectedIssues.class);
	
	public void login(String username,String password) throws Throwable
	{
		driver.get("http://citscl-test1.test.intranet/its/ITSlogin.jsp");
		try
		{
		loginpage.getUserName().sendKeys(username);
		loginpage.getPassword().sendKeys(password);
		loginpage.getSubmit().click();
		
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			
			System.out.println("Failed navigated to ITS_Summary");
		}
		
	}
	
	
	}
	
	

//	
	


