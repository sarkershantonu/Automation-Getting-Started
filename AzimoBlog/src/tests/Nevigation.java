package tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Azimo.com.pages.HomePage;
import browserAPI.Browser;

public class Nevigation {

	private Browser myBrowser; 
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public void init() {
		myBrowser = Browser.getBrowser();
	}
	@AfterClass
	public void End(){
		myBrowser.QuitBrowser();	    
	}

	@Test
	public void test() {
		HomePage myHomepage = new HomePage(); 
		myHomepage.selectDeutschVersion();
		myHomepage.selectEnglighVersion();
		
		Assert.assertEquals("International Money Transfer - Send Money Online with Azimo", myHomepage.getTitle());
	}

}
