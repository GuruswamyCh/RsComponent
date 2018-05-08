package com.uk.rs_online.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uk.rs.base.TestBase;

public class LandingPage extends TestBase
{
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	//By Search_box = By.id("searchTerm");
	//By search_Button = By.id("btnSearch");
	 
	@FindBy(id = "searchTerm")
	WebElement searchBox;

	@FindBy(id="btnSearch")
	WebElement searchButton;
	
	@FindBy(xpath="//form[@class='quickOrder']")
	WebElement QuickOrder;
	
	/*@FindBy(xpath="//form[@class='quickOrder']/div[2]/input[1]")
	WebElement StockNo1;
	
	@FindBy(xpath="//form[@class='quickOrder']/div[2]/input[2]")
	WebElement Qty1;
	
	@FindBy(xpath="//form[@class='quickOrder']/div[4]/input[1]")
	WebElement StockNo2;
	
	@FindBy(xpath="//form[@class='quickOrder']/div[4]/input[2]")
	WebElement Qty2;
	*/
	/*@FindBy(id="quickOrderBtn")
	WebElement AddToBasket;*/
	
	public LandingPage()
	{
		PageFactory.initElements(driver,this);
	}
//	
	public String validateLandingPage()
	{
		return driver.getTitle();
	}
	
	public SearchResultsPage LandingpageSearch(String RsStockNo )
	{
		searchBox.sendKeys(RsStockNo);
		js.executeScript("arguments[0].click()", searchButton);
		return new SearchResultsPage();
	}
	
}
