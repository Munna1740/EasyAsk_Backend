package orders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Authentication.BaseClass;

public class Payments {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();
		
		//login
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		Thread.sleep(1000);
		
		//set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		Thread.sleep(2000);
		
		//find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		Thread.sleep(2000);
		
		WebElement orders = driver.findElement(By.cssSelector("body > div.app-body > div > nav > ul > li:nth-child(7) > a"));
		orders.click();
		Thread.sleep(2000);
		
		WebElement payments = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/payment']"));
		payments.click();
		Thread.sleep(2000);
		driver.close();

	}

}
