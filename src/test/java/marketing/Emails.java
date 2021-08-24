package marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Authentication.BaseClass;

public class Emails {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();

		// login
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

		WebElement marketing = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[16]/a"));
		marketing.click();
		Thread.sleep(2000);

		WebElement emails = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/email']"));
		emails.click();
		Thread.sleep(2000);
		driver.close();

	}

}
