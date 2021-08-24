package sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Authentication.BaseClass;

public class AddSite {
	public void add_sites() throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();
		
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));

		Thread.sleep(1000);

		// set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		Thread.sleep(2000);

		// find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		Thread.sleep(2000);
		
		for( int i=0; i<=1; i++) {
		WebElement sites = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/site']"));
		sites.click();
		
		WebElement addSite = driver.findElement(By.className("ladda-label"));
		addSite.click();

		WebElement site_name = driver.findElement(By.name("site_name"));
		WebElement site_description = driver.findElement(By.name("site_description"));
		WebElement site_url = driver.findElement(By.name("url"));

		// set the element input
		site_name.sendKeys("Apple");
		site_description.sendKeys("This is apple website");
		site_url.sendKeys("https://www.apple.com/imac-24/why-mac/");

		WebElement add_site = driver.findElement(By.className("dropdown-toggle"));
		add_site.click();

		WebElement add_site_new = driver.findElement(By.xpath("//*[@id=\"saveActions\"]/div/button"));
		add_site_new.click();
		
//		WebElement site2 = driver.findElement(By.linkText("Sites"));
//		site2.click();
		}
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		AddSite add_site = new AddSite();
		add_site.add_sites();

	}

}
