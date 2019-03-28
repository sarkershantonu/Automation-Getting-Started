package Azimo.com.pages;

import browserAPI.Browser;


public abstract class AzimoPageBase {
	public  Browser myBrowser; 
	public String baseUrl;
	public AzimoPageBase(){
		baseUrl = "https://azimo.com";
		myBrowser = Browser.getBrowser(); 
		myBrowser.driver.get(baseUrl);
	}
	public AzimoPageBase clickOnLogo(){
		myBrowser.driver.get(baseUrl + "/pl/");
		return new HomePage();
	}

	public String getTitle(){
		return myBrowser.driver.getTitle();
	}
}
