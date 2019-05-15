package com.myassignment.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myassignment.pages.AgentPropertyDetailsPageObject;
import com.myassignment.pages.ForSalePageObject;
import com.myassignment.pages.HomePageObject;
import com.myassignment.pages.PropertyDetailsPageObject;

public class AssignmentNaveen1 {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Computer\\Documents\\Java+Selenium\\chromedriver_74\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		driver=null;
	}
	
	@Test
	public void verifyPropertyDetails(){
		HomePageObject home = new HomePageObject(driver);
		ForSalePageObject forSale = new ForSalePageObject(driver);
		PropertyDetailsPageObject property = new PropertyDetailsPageObject(driver);
		AgentPropertyDetailsPageObject agent = new AgentPropertyDetailsPageObject(driver);
		String showPrice;
		String agentName;
		
		driver.get("https://www.zoopla.co.uk/");
		
		home.clickSearch("London");
		
		forSale.getRequiredPriceAndClick(3);
		
		agentName=property.getAgentName();
		
		agent.getPropertyConfirmation(agentName);
		
	}

}
