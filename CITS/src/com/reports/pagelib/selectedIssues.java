package com.reports.pagelib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectedIssues {
	
	@FindBy(xpath = "//td[contains(text(),'Void')]")
	private WebElement void_label;
	
	@FindBy(xpath = "//td[contains(text(),'Closed')]")
	private WebElement closed;
	
	@FindBy(xpath = "//td[contains(text(),'Year End Close ')]")
	private WebElement Year_End_Close;
	
	@FindBy(linkText="Selected Issues")
	private WebElement selected_issue_tab;
	
	//@FindBy(xpath = "//td/a[contains(text(),'Issue # ')]")
	@FindBy(xpath = "//td/a[contains(text(),'Issue')]")
	private WebElement issueLink;
	
	@FindBy(xpath ="//div[1]/table/tbody/tr[3]/td[1]/a")
	private WebElement issLink1;
	
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[4]/td[1]/a")
	private WebElement issLink2;
	
	@FindBy(xpath ="//a[@id='lnkFIRST']/img")
	private WebElement First_tab;
	
	@FindBy(linkText="Export")
	private WebElement export;
	
	
	
	public WebElement getFirst_tab() {
		return First_tab;
	}

	public WebElement getExport() {
		return export;
	}

	public WebElement getIssLink1() {
		return issLink1;
	}

	public WebElement getIssLink2() {
		return issLink2;
	}

	public WebElement getIssueLink() {
		return issueLink;
	}

	public WebElement getVoid_label() {
		return void_label;
	}

	public WebElement getClosed() {
		return closed;
	}

	public WebElement getYear_End_Close() {
		return Year_End_Close;
	} 
	
	public WebElement getSelected_issue_tab() {
		return selected_issue_tab;
	}
			

}
