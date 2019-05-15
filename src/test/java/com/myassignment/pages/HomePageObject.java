package com.myassignment.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	public HomePageObject(WebDriver driver){
		this.driver=driver;
	}
	
	By inputCity=By.id("search-input-location");
	By searchButton=By.id("search-submit");
	
	
	public void clickSearch(String cityName){
		
		WebElement city = driver.findElement(inputCity);
		WebElement search = driver.findElement(searchButton);
		
		city.sendKeys(cityName);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Error loading city list"+e.getMessage());
		}
		
		//inputCity.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		search.click();
		
	}

}
