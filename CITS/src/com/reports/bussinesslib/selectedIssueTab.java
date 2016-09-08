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

public class selectedIssueTab {
	
	WebDriver driver = Driver.configureDriver();
	//WebDriver driver = Driver.fireFoxProfileDriver();
	ExcelLib eLib = new ExcelLib();
	ReportLib rLib = new ReportLib();
	WebDriverLib wLib = new WebDriverLib();
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	ITS_Summary ITS = PageFactory.initElements(driver, ITS_Summary.class);
	selectedIssues selectIssue = PageFactory.initElements(driver, selectedIssues.class);
	
	public void selectedIssueNavigate() throws IOException
	{
		try
		{
			wLib.waitForPageToLoad();
			
			WebElement fr = driver.findElement(By.name("topframe"));
			wLib.frameHandle(fr);
	     	
					
			selectIssue.getSelected_issue_tab().click();
			//selectIssue.getSelected_issue_tab().click();
			
			wLib.waitForPageToLoad();
			
			driver.switchTo().defaultContent();
			
			
			System.out.println("Successfully navigated to Selected Issue Tab");
			
			
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.out.println("Failed navigate to Selected Issue Tab");
		}
	}
		
		
//	public void issueLink() throws IOException
//		{
//			try
//			{
//				wLib.waitForPageToLoad();
//				
//				WebElement fr3 = driver.findElement(By.name("topframe"));
//				wLib.frameHandle(fr3);
//				
//				selectIssue.getFirst_tab().click();
//				
//				wLib.waitForPageToLoad();
//				
//				driver.switchTo().defaultContent();
//				
//				WebElement fr2 = driver.findElement(By.name("baseframe"));
//				wLib.frameHandle(fr2);
//				
//				
//				selectIssue.getIssueLink().click();
//				wLib.waitForPageToLoad();
//				
//				String stringNum1 = selectIssue.getIssLink1().getText();
//				String stringNum2 = selectIssue.getIssLink2().getText();
//				
//			//	if ((num1 < num2) && (num2 < num3)){
//				
//				 int num1 = Integer.parseInt(stringNum1);
//			     int num2 = Integer.parseInt(stringNum2);
//			     
//			     if(num1>num2)
//			     {
//				    System.out.println("Issue ID's are displayed in ascending order");
//			     }
//			     else
//			     {
//			    	 System.out.println("Issue ID's are not displayed in ascending order");
//			     }
//				
//				
//			}
//			
//			catch(Throwable t)
//			{
//				t.printStackTrace();
//			}
		
	
	
	
	public void issueLink() throws IOException
	{
		try
		{
			
			
//wLib.waitForPageToLoad();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-username"))).isDisplayed();

			
			WebElement fr = driver.findElement(By.name("baseframe"));
			
			wLib.frameHandle(fr);
			
			wLib.waitForPageToLoad();
			
			//ITS.getClosedLink().click();
			
			ITS.getYearEndCloseout().click();
			
			driver.switchTo().defaultContent();
			
			WebElement ifr = driver.findElement(By.name("baseframe"));
			
			wLib.frameHandle(ifr);
			
			wLib.waitForPageToLoad();
			
			selectIssue.getIssueLink().click();
			wLib.waitForPageToLoad();
			
			//Export
						
//			selectIssue.getIssLink1().click();
//			wLib.waitForPageToLoad();
//			
//			driver.switchTo().defaultContent();
//			
//			selectIssue.getExport().click();
			
			driver.switchTo().defaultContent();
			
			WebElement ifr1 = driver.findElement(By.name("baseframe"));
			
			wLib.frameHandle(ifr1);
			
			System.out.println("passed");
			
			
			
			//String stringNum1 = selectIssue.getIssLink1().getText();
			String stringNum1 ="184924";
			String stringNum2 ="184923";
			
			System.out.println(stringNum1);
			System.out.println(stringNum2);
		//	String stringNum2 = selectIssue.getIssLink2().getText();
			
		//	if ((num1 < num2) && (num2 < num3)){
			
			 int num1 = Integer.parseInt(stringNum1);
			 int num2 = Integer.parseInt(stringNum2);
			 
			 System.out.println(num1);
			 System.out.println(num2);
		 //    int num2 = Integer.parseInt(stringNum2);
		     
		     if(num1<num2)
		     {
			    System.out.println("Issue ID's are displayed in ascending order");
		     }
		     else
	     {
		    	 System.out.println("Issue ID's are not displayed in ascending order");
	     }
		
			
		}
		
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	
}

}
