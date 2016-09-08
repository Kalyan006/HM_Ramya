package com.reports.commonlib;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

	static WebDriver driver = null;
	
	public static WebDriver configureDriver()
	{
		if(driver!=null)
		{
			return driver;
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\jar\\IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		    ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			ieCapabilities.setCapability("requireWindowFocus", true);
			driver = new InternetExplorerDriver(ieCapabilities);
			driver.manage().window().maximize();
			return driver;
		}
		
		
	}
			
}
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
	
	static WebDriver driver = null;
	
	public static WebDriver fireFoxDriver()
	{
		if(driver != null)
		{
			return driver;
		}
		else
		{
			driver = new FirefoxDriver();
			return driver;
		}
	}

	public static WebDriver configureDriver(){
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\jar\\IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			ieCapabilities.setCapability("requireWindowFocus", true);
			driver = new InternetExplorerDriver(ieCapabilities);
			//driver = new InternetExplorerDriver();
			return driver;
		}
	}
	public static WebDriver fireFoxProfileDriver()
	{
		WebDriver driver=null;
		
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setPreference("browser.download.folderList",1);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xls");		
		driver = new FirefoxDriver(profile);
		return driver;
	}
	
	
}
	 
	




/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
static WebDriver driver = null;
	
	public static WebDriver fireFoxDriver()
	{
		if(driver != null)
		{
			return driver;
		}
		else
		{
			driver = new FirefoxDriver();
			return driver;
		}
	}

	public static WebDriver configureDriver(){
		if(driver != null)
		{
			return driver;
		}
		else
		{
			System.setProperty("webdriver.ie.driver","C:\\jar\\IEDriverServer.exe");
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			driver = new InternetExplorerDriver(ieCapabilities);
			//driver = new InternetExplorerDriver();
			return driver;
		}
	}
	
	public static WebDriver fireFoxProfileDriver()
	{
		WebDriver driver=null;
		//String downloadPath = "C:\\jar\\seleniumdownloads";
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setPreference("browser.download.folderList",1);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xls");		
		driver = new FirefoxDriver(profile);
		return driver;
	}
	
	
}*/
	 
	