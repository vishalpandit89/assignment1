package com.myassignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PropertyDetailsPageObject {

	WebDriver driver;
	String agentName;

	public PropertyDetailsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	By agentNameLinkElement = By.xpath("(//div[@class='ui-agent'])[1]//*[@class='ui-agent__name']");

	public String getAgentName() {
		
		WebElement agentNameLink = driver.findElement(agentNameLinkElement);
		
		agentName=agentNameLink.getText();
		
		agentNameLink.click();
		
		return agentName;

	}

}
