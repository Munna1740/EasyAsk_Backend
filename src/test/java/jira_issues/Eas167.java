package jira_issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Authentication.BaseClass;

public class Eas167 {
	
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
		
		WebElement categories = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[3]/ul/li[1]/a"));
		categories.click();
		Thread.sleep(2000);
		
		
		WebElement addCategory = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/category/create']"));
		addCategory.click();
		Thread.sleep(2000);
		
		
		WebElement products_tab = driver.findElement(By.xpath("//a[@href='#tab_products']"));
		products_tab.click();
		Thread.sleep(2000);
		
		
		
		driver.close();


	}

}
