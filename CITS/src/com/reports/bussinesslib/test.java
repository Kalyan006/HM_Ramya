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

public class test {
	
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxProfileDriver();
	
	ExcelLib eLib = new ExcelLib();
	ReportLib rLib = new ReportLib();
	WebDriverLib wLib = new WebDriverLib();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	ITS_Summary ITS = PageFactory.initElements(driver, ITS_Summary.class);
	
	public void login(String username,String password) throws Throwable
	{
		//driver.get("http://hierarchymanager-test1.test.intranet/ccshms/HMlogin.jsp");
		driver.get("http://citscl-test1.test.intranet/its/ITSlogin.jsp");
		try
		{
		loginpage.getUserName().sendKeys("ab13539");
		loginpage.getPassword().sendKeys("india12@");
		loginpage.getSubmit().click();
		
	//String expectedText = "Hierarchy Id";
		//Boolean h = driver.findElement(By.xpath("//td[contains(text(),'Hierarchy Id')]")).isDisplayed();
		//Boolean h = driver.findElement(By.xpath("//*[@id='Layer2']/table[2]/tbody/tr[1]/td[2]")).isDisplayed();
	// Boolean logout =driver.findElement(By.xpath("//img[@src='/ccshms/images/logout.gif']")).isDisplayed();
		//if(logout)
		//if(expectedText.equals(actualText))
		//driver.findElement(By.xpath("//a[@href='/ccshms/hmsessionparamservlet?Role_HierId=ADMIN_2065_AFFILIATE']/img")).click();
//				if(h)
//		{
//			System.out.println("Login Successfull");
//		}
//		else
//		{
//			System.out.println("Login Unsuccessfull");
//			rLib.getScreenshot();
//		}
		wLib.waitForPageToLoad();
		
		WebElement fr = driver.findElement(By.name("baseframe"));
		
			
     	wLib.frameHandle(fr);
     	
        ITS.getVoidLink().click();
		
		driver.switchTo().defaultContent();
		
		wLib.waitForPageToLoad();
		
		System.out.println("Successfully navigated to ITS_Summary");
				
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			
			System.out.println("Failed navigated to ITS_Summary");
		}
	}
	
	

//	public void NavigateToITS_Summary() {
//		try
//		{
//			wLib.watiForPageToLoad();
//			
//			WebElement fr = driver.findElement(By.name("baseframe"));
//			
//	     	wLib.frameHandle(fr);
//	     	
//	        ITS.getVoidLink().click();
//			
//			driver.switchTo().defaultContent();
//			
//			wLib.watiForPageToLoad();
//			
//			System.out.println("Successfully navigated to ITS_Summary");
//		}
//		catch(Throwable p)
//		{
//			System.out.println("Failed to navigated to ITS_Summary");
//			
//		}
//		
//	}
	
}

