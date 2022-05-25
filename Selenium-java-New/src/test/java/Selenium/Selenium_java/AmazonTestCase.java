package Selenium.Selenium_java;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.base;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AmazonTestCase extends base {

	public static String Product = "Apple MacBook air 14inch";
	public static String ExpectedValue = "37,000";

	@BeforeTest
	public void beforeTest() throws IOException {

		driver = instancedriver();

	}

	@Test(description = "To Test this code")
	public void Test1() {

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		driver.manage().window().maximize();
		l.SendValueInTextBox().sendKeys(Product);
		l.ClickSearchBox().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		l.ClickOnFirstLink().click();
		Set<String> it = l.SwitchToWindow();
		Iterator<String> st = it.iterator();
		while (st.hasNext()) {
			driver.switchTo().window(st.next());
		}
		l.ClickOnAddToCart().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			l.CartTotal().click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String valueText = l.AmountValue().getText();
		// Handling the Expectation(Intentionally failing this Test case)
		Assert.assertEquals(valueText, ExpectedValue);

	}

	@AfterTest
	public void afterTest() {

		driver.close();
		driver = null;

	}

}
