package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckinID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Sunil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);

		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");

		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement btn = driver.findElement(By.cssSelector(".oxd-buttonoxd-button--mediumoxd-button--mainorangehrm-login-button"));
		btn.click();
		
		
		String actual = driver.getTitle();
		
		if(actual.equals(actual))
			
			System.out.println("test pass");
		else
			System.out.println("test fail");
	}
}
