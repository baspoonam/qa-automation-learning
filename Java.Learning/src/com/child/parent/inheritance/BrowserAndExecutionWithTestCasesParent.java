package com.child.parent.inheritance;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BrowserAndExecutionWithTestCasesParent extends AllMethodsDeclarationOnlyForTestNGChild {
	

	// Now we are calling the methods from parent class and executing test case according to our test case 

	
	// executing before each test case. Since first it has to launch the browser 
	// Since we are using TestNG no need to make the class main method here. TestNG will take care that
		@BeforeMethod
		public void launchBrowser() {
		System.setProperty("webdriver.chrome, driver" , "//Users//bashudevbaskota//Documents//AutomationLearingJava//chrome78//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
		
		// test case to get the title of the page
		@Test (enabled = false)
		
		public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(false);
		}
		
		// Now you can add any number of test cases here.. 

		// adding soft assert 
		@Test(enabled = false, description = "Verify register link on Mercury page")
		public  void verifyRegisterlink(){
			checkRigisterButton();
			SoftAssert poonam = new SoftAssert();
			
			poonam.assertTrue(true);
			poonam.assertTrue(false);
			poonam.assertTrue(true);
		}
		
		// BeforeMethod
		// Test
		// AfterMethod 
		
		@Test (enabled = false,  description = " verify regisgration is successfull")
		public void checkRegisterationSucceful(){
			
			// Click Register -- done
			// Fill all the Personal information / Contact information / username
			// click submit button
			// assert whether there is "Thank you for registering. " word is there
			clickRigister();
			ContacInformation( "Poonam", "Bas" , "1234567", "hello@email.com");
			MailingInformation("4816 McClellan" , "Frisco",  "TX","75036" );
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			clickDrop("NEPAL");
			UserInformation("hello@email.com","12345","12345" );
			clickSubmit();
			Assert.assertTrue(verifyingTextregistering());
	
		}
		
		
		
		@Test(enabled = false)
		public void testclickSubmitOnFlightBookingWhileSelectingRoundTrip(){
			clickContinueBottonOnBooking();	
			// verify the continue button is there or not ??
			Assert.assertTrue(verifyclickContinue());
			
		}
		
		
		@Test (description = " Verify DEPART key word on Flight detail page")
		public void testDepartOnSelectFlightPage(){
			clickContinueBottonOnBooking();
			clickContinue();		
			// verify the continue button is there or not ??
			Assert.assertTrue(verifyDepartKeyWordOnFlightPage());		
		}
		
		// test case 
		// 1. Check Round trip is selected or not ? 
		
		@Test
		public void testRoundTripRadioButtonIsSelectedOrNot(){
			Assert.assertTrue(verifyRoundTripButtonIsSelectedOrNot());
		}
		
		// 2. Check One way is selected or Not ? if Not select One way..
		
		@Test
		public void testonewayRadioButtonIsSelectedOrNot(){
			Assert.assertTrue(verifyonewayButtonIsSelectedOrNot());
		}
		
		
		
		// 3. Check the checkbox is selected or not on Booking page 
		
		
		@Test
		public boolean  testcheckboxTicketlessTravelRadioButtonIsSelectedOrNot(){
			Assert.assertTrue(testcheckboxTicketlessTravelRadioButtonIsSelectedOrNot());
			return true ;
			
	 	
		}
		
		//
		@DataProvider
		public Object [][] signOnDataWithHappyPath(){

		return new Object [] [] {
		{"bikey277", "Practice12"},
		{ "bhotebabu", "Cali123" },	
		{"binda" , "Binda123"}
		

		};
		}
		

		@Test(enabled = false,  dataProvider = "signOnDataWithHappyPath", description = " Sing In with various username and password with data provider")
		public void signingInWithDataProvider(String Username , String Password) {
		signOnMethod (Username, Password);
		Assert.assertTrue(verifySignOnmethodIsSuccessful());

		}
		
		
		// Negative test case data provider
		@DataProvider
		public Object [][] signOnDataWithNeagativePath(){

		return new Object [] [] {
		{ "kppanta" , "Hello1234$"},
		{"^%&*%^&* ", "  "},
		{"^%&*%^&* ", "0000000000000000000000000000"}

		};
		}
		
		@Test(enabled = false, priority = 1 , dataProvider = "signOnDataWithNeagativePath", description = " Sing In with Negative username and password with data provider")
		public void signingInWithDataProviderWithNegativeTesting(String Username , String Password) {
		signOnMethod (Username, Password);
		Assert.assertTrue(verifySignOnmethodIsNOTSuccessful());

		}
	

       @Test(enabled = false, description = "This test case will check the submit button after the Register link is clicked")
       public void testSubmitButton() {
       clickRigister();
       //verify the submit button
       //actuals
       Assert.assertEquals(verifySubmitButton(), true);
}


       	@Test (enabled = false, description = "User should able to book two way ticket From London to Paris on dated Dec 25 and return date Dec 30")
       	public void testItenaryIsBooked(){
       		signOnMethod("bhotebabu ", "Cali123");
       		// fill rest
       		
       		//securePurchase("Poonam", "Bas", "2", "London", "December", "20",
           		// "Paris", "30", "December", "Unified");	
       		Assert.assertTrue(verifyTheItenaryIsBooked());
       		Assert.assertTrue(verifyTwoPassangerNumber()); 		
       	}
		
		// verify "Unified" airline is present on drop down
       	@Test(enabled = false)
       	public void testAirlineName(){
       		//1...fill all the methods to reach up to airline
       		
       		Assert.assertTrue(verifyAirline("Unified Airline"));
       		
       	}
		
    	@Test ( description = "check the airline types are there ")
       	public void testBlueSkiesAirlineName( ){
    		SoftAssert softassert = new SoftAssert();
    		signOnMethod("bhotebabu ", "Cali123");
    		
       		//1...fill all the methods to reach up to airline
    		softassert.assertTrue(verifyAirline("Blue Skies Airlines"));
    		softassert.assertTrue(verifyAirline("Unified Airlines"));
       		
       		
       		
       	}
    	// test case 
    	// verify that vacation button is "under constructon"
    	//book a ticket for 4 passanger one way , from London to Zurich.
    	// 
		
		@AfterMethod
		public void closeBrowser(){
			driver.close();
		}

		
		
		
		
		
		
		
		
		
		
}

    


      



   	

    

		

    



		

 	
 		
 		
 		

 		

 	

	
		

		


