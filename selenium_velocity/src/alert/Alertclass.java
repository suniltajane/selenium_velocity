package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {
	
	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Sunil\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
        driver.findElement(By.name("alert")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.name("confirmation")).click();	
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.name("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("avdhut");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
	}
		
}
