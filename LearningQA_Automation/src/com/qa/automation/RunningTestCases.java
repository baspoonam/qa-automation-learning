package com.qa.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
 
 
 
public class RunningTestCases {
 
 
 
   public static void main(String[] args) throws InterruptedException {
 
 // open chrome browser 
	   ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//driver.quit();
 
	
		// Running Test cases 
		
		// Register the site 
		
		//@Test
	//public void testContact(){
			
			
		}
 
 
 
 
   }
 
 
 
