package com.myassignment.pages;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForSalePageObject {
	
	public WebDriver driver;
	ArrayList<String> prices = new ArrayList<String>();
	
	public ForSalePageObject(WebDriver driver){
		this.driver=driver;
	}
	
	By itemListElement = By.xpath("//li[@class='srp clearfix   ']");
	
	By priceElement = By.partialLinkText("£");
	
	By clickPriceLink=By.xpath("//a[@class='listing-results-price text-price']");
	
	By addressListElement=By.className("listing-results-address");
	
	
	public void getRequiredPriceAndClick(int order){
		
		List<WebElement> itemList=driver.findElements(itemListElement);
		
		//WebElement priceItem = driver.findElement(priceElement);
		
		//System.out.println(priceList.size());
		
		for (WebElement reqPrice : itemList)
		{	
			WebElement priceItem = reqPrice.findElement(priceElement);
			prices.add(priceItem.getText());
		}
		
		Collections.reverse(prices);
		System.out.println(prices);
		
		itemList.get(order-1).findElement(clickPriceLink).click();
	
	}
	

}
