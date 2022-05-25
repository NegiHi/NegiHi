package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver instancedriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\sabyasachi.ghosh\\Selenium\\Selenium-java-New\\src\\main\\java\\resources\\data.properties");
		prop.load(fs);
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sabyasachi.ghosh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	} 
	

}
