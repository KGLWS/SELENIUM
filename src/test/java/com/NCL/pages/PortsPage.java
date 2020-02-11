package com.NCL.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NCL.utilities.Driver;

public class PortsPage {
	
	public PortsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@class='linkNav' and @title='Explore']")
	public static WebElement exploreBnt;

	@FindBy(xpath = "//*[@class=\'linkItem\' and @title=\'Ports\']")
	public WebElement portsDrDwnBtn ;
	
	@FindBy(xpath = "//*[@class='linkItem' and @title='Shore Excursions']")
	public WebElement shoreExrBtn;
}
