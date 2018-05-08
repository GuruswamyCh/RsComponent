package com.uk.rs_online.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uk.rs.base.TestBase;

public class QuickOrderPage extends TestBase
{

JavascriptExecutor js= (JavascriptExecutor)driver;
	
	/*@FindBy(xpath="//form[@class='quickOrder']")
	WebElement QuickOrder;*/
	

	@FindBy(xpath="//form[@class='quickOrder']/div[2]/input[1]")
	WebElement StockNo;
	
	@FindBy(xpath="//form[@class='quickOrder']/div[2]/input[2]")
	WebElement Qty;
	
	/*@FindBy(xpath="//form[@class='quickOrder']/div[4]/input[1]")
	WebElement StockNo2;
	
	@FindBy(xpath="//form[@class='quickOrder']/div[4]/input[2]")
	WebElement Qty2;*/
	
	@FindBy(id="quickOrderBtn")
	WebElement AddToBasket;
	public QuickOrderPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void QuickOrder(String RsStockNo, String Quantity1)
	{
		//js.executeScript("arguments[0].scrollIntoView(true);",StockNo1 );
		StockNo.sendKeys(RsStockNo);
		Qty.sendKeys(Quantity1);
	}
	
	public void addtobasket()
	{
		js.executeScript("arguments[0].click()", AddToBasket);
	}
}
