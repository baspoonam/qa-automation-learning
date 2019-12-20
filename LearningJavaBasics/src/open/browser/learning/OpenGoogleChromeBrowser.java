package open.browser.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenGoogleChromeBrowser {
	
	static WebDriver  driver;

	public static void main(String[] args) {
		
		// calling method 
		//System.setProperty("webdriver.chrome.driver", "//Users//bashudevbaskota//Documents//AutomationLearningJava//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
		
		//System.setProperty("Webdriver.gecko.driver", "/Users/bashudevbaskota/Documents/AutomationLearningJava/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
//		DesiredCapabilities dc = DesiredCapabilities.firefox();
//		dc.setCapability("marionette", true);
//		@SuppressWarnings("deprecation")
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=0340f1b707f776c9c9e85452bb743a45");
 
		//FirefoxDriver driver = new FirefoxDriver(capabilities);
		
		//clickRegister();
		contactInformation();
		
		
		

	}
	
	// making Register method
	   public static void clickRegister( ){
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();	
		
	}
	   	// making contanct infomration method 
	   public static void contactInformation(){
		   driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Poonam");
		   driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Baskota");
		   driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(" 6507877203");
		   driver.findElement(By.xpath(" //*[@id='userName']")).sendKeys(" basnam@gmail.com");
		 driver.close();
	   }
	   
	
	   
	   
	   
	
}
