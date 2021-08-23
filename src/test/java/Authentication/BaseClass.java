package Authentication;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	
	public static WebDriver getDriver() {
		//System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://18.209.122.163/admin");
		

		
		return driver;
	}



}
