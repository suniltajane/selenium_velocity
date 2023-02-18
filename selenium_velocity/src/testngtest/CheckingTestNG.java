package testngtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingTestNG {
	
	
	@Test(priority=1, enabled=false)
	public void ba() {
		
		System.out.println("2nd test case");
	}
	
	@Test(priority=-1)
	public void ab() {
		
		System.out.println("1st test case");
		
		Reporter.log("checking report",true);
	}
}
