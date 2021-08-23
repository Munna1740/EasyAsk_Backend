package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndLogout {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();

		// login
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));

		Thread.sleep(2000);

		// set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		Thread.sleep(2000);

		// find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		Thread.sleep(5000);

		WebElement account = driver.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
		account.click();

		WebElement logout = driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
		logout.click();
		driver.close();

	}

}
