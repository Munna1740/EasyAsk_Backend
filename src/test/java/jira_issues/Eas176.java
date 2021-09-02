package jira_issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Authentication.BaseClass;

public class Eas176 {

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
		
		WebElement catalogue = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[3]/a"));
		catalogue.click();
		Thread.sleep(2000);
		
		WebElement options = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/option']"));
		options.click();
		Thread.sleep(2000);
		
		WebElement add_option = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/option/create']"));
		add_option.click();
		Thread.sleep(2000);
		
		
		//putting value
		WebElement name = driver.findElement(By.name("name"));
		WebElement description = driver.findElement(By.name("description"));
		WebElement default_value = driver.findElement(By.name("default_value"));
		WebElement limit_min = driver.findElement(By.name("limit_min"));
		WebElement limit_max = driver.findElement(By.name("limit_max"));
		
		name.sendKeys("Demo Option");
		description.sendKeys("This is demo option");
		default_value.sendKeys("Demo");
		limit_min.sendKeys("4");
		limit_max.sendKeys("1");
		
		
		Thread.sleep(2000);
		
		//click on save and back button
		WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/button[1]"));
		save.click();
		Thread.sleep(3000);
		
		driver.close();

	}


}
