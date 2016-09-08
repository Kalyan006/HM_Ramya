package com.reports.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ITS_Summary {
	
	@FindBy(linkText ="ITS Summary")
	private WebElement ITSlink;
	
	@FindBy(linkText = "VOID")
	private WebElement voidLink;
	
	@FindBy(linkText="CLOSED")
	//@FindBy(xpath = "//td/a[contains(text(),'CLOSED')]")
	private WebElement closedLink;
	
	//@FindBy(linkText="YEAR END CLOSEOUT")
	@FindBy(xpath = "//td/a[contains(text(),'YEAR END CLOSEOUT')]")
	private WebElement yearEndCloseout;
	
	
	public WebElement getITSlink() {
		return ITSlink;
	}

	public WebElement getYearEndCloseout() {
		return yearEndCloseout;
	}

	public WebElement getVoidLink() {
		return voidLink;
	}

	public WebElement getClosedLink() {
		return closedLink;
	}
	
	
	
			

}
