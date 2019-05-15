package com.myassignment.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentPropertyDetailsPageObject {

	WebDriver driver;

	public AgentPropertyDetailsPageObject(WebDriver driver) {
		this.driver = driver;
	}

	By agentDetailsElement = By.xpath("//img[@class='agent_logo']");

	public void getPropertyConfirmation(String agentName) {

		if (driver.findElement(agentDetailsElement).getAttribute("alt").contains(agentName)) {
			System.out.println("Property belongs to correct agent");
		} else {
			System.out.println("Property does not belong to correct agent");
		}
	}

}
