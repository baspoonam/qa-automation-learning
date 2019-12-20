package MyLearningFirstJavaHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LunchingChromeBrowserJava {

	private static final String AmericanExpress = null;
	static WebDriver driver = null;
	//private static WebElement ;
	
	public static void main(String[]args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome, driver" , "//Users//bashudevbaskota//Documents//AutomationLearingJava//chrome78//chromedriver.exe");		
		driver = new ChromeDriver();
		driver .get("http://newtours.demoaut.com/");
		
		clickRigister(); 
		//ContacInformation();
		mailingInformation();
		UserInformation();	
		clickDrop();
		clickSubmit();
		flightclick();
		//driver.close();
		//driver.quit();
		selectRoundTrip();
		selectNumberOfPassanger("2");
		departingFrom("Acapulco");
		departingDateAndMonth("November", "18");
		arrivingin("Acapulco");
		returningDateAndMonth("January" , "1");
		//returning("January","1");
		Preferences();
		clickContinue();
		//bookingFlightPassanger();
		
		bookingFlightPassanger("Poonam" , "bas", "Hindu");
		//bookingFlightPassanger("Hari" , "bas", "NonVeg");
		
		passangerCreditCard("American Express", "123456","11/30","2010");
		
			
	}
		
		
	

		
	

		public static void clickRigister() {
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

	}
		 
		public static void ContacInformation(String firstName, String lastName , String phoneNumber, String emailAddress) {
		driver.findElement(By.xpath("//input[@name ='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name ='lastName']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name ='phone']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(emailAddress);

	}
			    
	  
	public static void mailingInformation() {
		driver.findElement(By.xpath("//input[@name = 'address1']")).sendKeys(
				"4816 McClellan Dr");
		driver.findElement(By.xpath("//input[@name ='city']")).sendKeys(
				"Frisco");
		driver.findElement(By.xpath("//input[@name ='state']")).sendKeys("TX");
		driver.findElement(By.xpath("//input[@name ='postalCode']")).sendKeys("75036");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	
	public static  void clickDrop() {
		
		Select poonam = new Select(driver.findElement(By.xpath("//select[@name='country']")));
				//poonam.selectByVisibleText("NEPAL");
			poonam.selectByIndex(1);
				
		
		
	}
	  
	public static void selectcountry() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// selecting NEPAL from drop down
		Select mySel = new Select(driver.findElement(By
				.xpath("//select[@name='country']")));
		mySel.selectByVisibleText("NEPAL");

	}
	      
	      
	public static void UserInformation() {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(
				"bharat@gmail.com");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys(
				"1234");
		driver.findElement(By.xpath("//input[@name ='confirmPassword']"))
				.sendKeys("1234");
	}
	  
	  
	  
	public static void clickSubmit(){
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
	}
	
		
	public static void flightclick(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		
	}
		
		
	
	// click radio
	
	public static void selectRoundTrip(){
		WebElement web = driver.findElement(By.xpath("//input[@name='tripType'][1]"));
		web.click();
		
	}
	
	public static void selectOneWayTrip(){
		WebElement web = driver.findElement(By.xpath("//input[@name='tripType'][2]"));
	
		web.click();
		
	}
	

	
	public static void selectNumberOfPassanger( String number){
		
		Select seRadio1 = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		seRadio1.selectByVisibleText(number);	
	}
	
	
	
	
	public static void departingFrom(String cityName){	
		Select seRadio2 = new Select(driver.findElement(By.xpath("//select[@name ='fromPort']")));
		seRadio2.selectByVisibleText(cityName);
	}
	
	
	public static void departingDateAndMonth(String month, String date){
		// selecting month
		Select seRadio3 = new Select(driver.findElement(By.xpath("//select[@name ='fromMonth']")));
		seRadio3.selectByVisibleText(month);
		
		// selecting day
		Select seRadio4 = new Select(driver.findElement(By.xpath("//select[@name = 'fromDay']")));
		seRadio4.selectByVisibleText(date);
		
		
		}
	
	public static void arrivingin(String cityName){
		Select seRadio5 = new Select(driver.findElement(By.xpath("//select[@name ='toPort']")));
		seRadio5.selectByVisibleText(cityName);
		
	}
	
	public static void returningDateAndMonth(String month,String date){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select seRadio6 = new Select(driver.findElement(By.xpath("//select[@name = 'toMonth']")));
		seRadio6.selectByVisibleText(month);		
	
	
	   Select seRadio7 = new Select(driver.findElement(By.xpath("//select[@name = 'toDay']")));
	   seRadio7.selectByVisibleText(date);
   }

	
	public static void Preferences(){
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			WebElement  ServiceClass = driver.findElement(By.xpath("//input[@name='servClass'][1]"));
		    ServiceClass.click();	
		
		 
		   Select seRadio9 = new Select(driver.findElement(By.xpath("//select[@name = 'airline']")));	   
		   seRadio9.selectByVisibleText("Blue Skies Airlines");
		
	}

    public static void clickFirstRadioButton(){
				
			// click radio while two same elements on page
			WebElement type = driver.findElement(By.xpath("/images/forms/continue.gif[2]"));
			type.click();
    }
			
        public static void selectTripType(){
			 		 
		 // to select radio button 
		 WebElement tripSelect  = driver.findElement(By.xpath(" "));
		 tripSelect.click();
		 }
		 
		 
		 public static void clickContinue(){
			 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		 }
		 
        
		 
		 // Booking Flights starts from here 
		 
		 // 1. automate booking flight 
		
		 
       public static void bookingFlightPassanger(String firstName , String lastName, String mealType){
        driver.findElement(By.xpath("//input[@name ='passFirst0']")).sendKeys(
        		firstName);
   		driver.findElement(By.xpath("//input[@name ='passLast0']")).sendKeys(
   				lastName);
   		driver.findElement(By.xpath("//select[@name = 'pass.0.meal']")).sendKeys(
   				mealType);
   		
       }
   		
     public static void passangerCreditCard(String creditCard, String creditnumber,String dayMonth,String Year){
    	 driver.findElement(By.xpath("//select[@name = 'creditCard']")).sendKeys("creditCard");
    	
    	 driver.findElement(By.xpath("//input[@name = 'creditnumber']")).sendKeys("creditNumber");
    	 
    	 driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_mn']")).sendKeys("DayMonth");
    	 
    	 driver.findElement(By.xpath("//select[@name = 'cc_exp_dt_yr']")).sendKeys("Year");
    
    	 driver.findElement(By.xpath("")).sendKeys("poonam");
    	 
    	 
     }
     
     
   		
       



//
//		  
////Method class 
////Log In with username and password
//
////this method will log on with username and password
//  
//public void signOnMethod (String userName, String password) {
//driver.findElements(USERNAME).sendKeys(userName);
//driver.findElement(PASSWORD).sendKeys(password);
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//clickSigIn();
//
//}
//
////this method will click SignIn buttton
//public void clickSigIn(){
//driver.findElement(LOG_IN).click();
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//}
//	
////checking the sumbit button is displayed or not ?
//public boolean verifySignOnmethodIsSuccessful(){
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[contains(text(),'Flight ')]")).isDisplayed();
//return true;
//}


//Browser class


//parameterization  with data provider , it will execute all the username and password one by one
//It help to run multiple test cases at a time.


//@DataProvider
public Object [][] signOnData(){

return new Object [] [] {
{"bikey277", "Practice12"},
{ "bhotebabu", "Cali123" },
{ "kppanta" , "Hello1234$"},
{"binda" , "Binda123"},
{"^%&*%^&* ", "  "}

};
}

//@Test(dataProvider = "signOnData")
//public void signingInWithDataProvider(String Username , String Password) {
//signOnMethod (Username, Password);
//Assert.assertTrue(verifySignOnmethodIsSuccessful());
//
//}

	  
		 
}	  
		  
		  
		
		  
		 
	  
	  
	  
	  
	  
	  

