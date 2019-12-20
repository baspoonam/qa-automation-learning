package com.execute.testng.flight;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;



public class MyTestNGExecutionWithBrowserChildClass extends MyTestNGExecutionParentClass {
	
	
	@BeforeMethod
	public void LaunchBrowser(){
	System.setProperty("webdriver.chrome, driver" , "//Users//bashudevbaskota//Documents//AutomationLearingJava//chrome78//chromedriver.exe");		
	driver = new ChromeDriver();
	driver .get("http://newtours.demoaut.com/");
	

	}
}