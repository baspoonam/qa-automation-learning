package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryToursPage {
	
	WebDriver driver = null;
	
	public void ClickRegisterSite(){
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();	
	}
	
	public void ContactInformation(){
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("MrTest");
		driver.findElement(By.xpath("//input[@name='lastName'] ")).sendKeys("TestAgain");
		driver.findElement(By.xpath("//input[@name='phone'] ")).sendKeys("408432345");
		driver.findElement(By.xpath(" //input[@name='userName']")).sendKeys("Test@gmail.com");
	}

}
