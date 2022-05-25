package Selenium.Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static String URL = "https://www.freecodecamp.org/news/html-tables-table-tutorial-with-css-example-code/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sabyasachi.ghosh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		List<WebElement> row = driver.findElements(By.xpath("//table[5]/tbody[1]/tr"));

		for (int i = 0; i < row.size(); i++) {
			List<WebElement> st = driver.findElements(By.xpath("//table[5]/tbody[1]/tr[" + i + "]/td"));
			for (int j = 0; j < st.size(); j++) {
				if (st.get(j).getText().equals("Hillary")) {
					for (WebElement s : st) {
						System.out.println(s.getText());
					}
				}
			}

		}

	}

}
