package com.reports.AllTest;


import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.reports.bussinesslib.ITS_Summary_Navigate;
import com.reports.bussinesslib.LoginHM;
import com.reports.commonlib.ExcelLib;
import com.reports.commonlib.WebDriverLib;

public class ITS_Summary_Page_Year_End_CloseOut_Link   {

	ExcelLib eLib;
	WebDriverLib wLib;
	LoginHM LoginHM;
	ITS_Summary_Navigate ITS_navi;
	
	@BeforeClass
	 public void configBeforeClass() {
		
		  //Object Initialization
		  
		  wLib = new WebDriverLib();
		  eLib = new ExcelLib();
		  LoginHM = new LoginHM();
		  ITS_navi = new ITS_Summary_Navigate();
		  
		  }
	@Test
	public void configureBeforeMethod() throws Throwable
	{
		
		String username = eLib.getExcelData("sheet1", 1, 1);
		String password = eLib.getExcelData("sheet1", 1, 2);
		
		LoginHM.login(username, password);
		ITS_navi.yearEndClose();
		
		
	}
	

	
	
}
	