package PageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By textBox = By.xpath("//input[@id='twotabsearchtextbox']");
	By SearchBox = By.xpath("//input[@id='nav-search-submit-button']");
	By LinkSearch = By.xpath("//span[contains(text(),'Honor MagicBook X 14, Intel Core i3')]");
	By Addtocart = By.xpath("//input[@title='Add to Shopping Cart']");
	By CartSubTotal = By.xpath("//*[@id='attach-sidesheet-view-cart-button']");
	By crossutton = By.xpath("//*[@id='attach-close_sideSheet-link']");
	By AmountValue = By.xpath("//span[@id='sc-subtotal-amount-buybox']//span//span[@class='a-price-whole']");
	

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement SendValueInTextBox() {
		return driver.findElement(textBox);
	}

	public WebElement ClickSearchBox() {
		return driver.findElement(SearchBox);
	}

	public WebElement ClickOnFirstLink() {
		return driver.findElement(LinkSearch);
	}

	public Set<String> SwitchToWindow() {

		return driver.getWindowHandles();

	}
	public WebElement ClickOnAddToCart() {
		return driver.findElement(Addtocart);
	}
	
	public WebElement CartTotal() {
		return driver.findElement(CartSubTotal);
	}
	
	public WebElement Clickcross() {
		return driver.findElement(crossutton);
	}

	public WebElement AmountValue() {
		return driver.findElement(AmountValue);
	}


}
