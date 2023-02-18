package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HardAssert {
public static WebDriver driver;
	static String url = "http://dthahab.com/Setting/DeliveryMethod";
	@BeforeTest
	public void initbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();	
	}
	@Test (priority=0)
	void verifyUrlofpage() {
		String verifyUrl = driver.getCurrentUrl();
		SoftAssert softAsserts =new SoftAssert();
		softAsserts.assertEquals(verifyUrl, "url","verifying URL");
		System.out.println("next line after verifying test case hard assert");
		softAsserts.assertAll();
	}
		@Test (priority=1)
		void verifyTitlepage() {
		String verifyTitle = driver.getTitle();
		SoftAssert softassert = new  SoftAssert();
		SoftAssert.assertEquals(verifyTitle,"Login | Dthahab","verify title");
	    System.out.println("next line after verifying test case");
	    softAsserts.assertAll();
		
		} 
		@AfterTest
		void tearDown() {
			driver.quit();
	}
}
	
	
	
