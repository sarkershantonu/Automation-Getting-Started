package Azimo.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AzimoPageBase{
	
	private String URL = super.baseUrl+"/pl/";
	
	@FindBy(xpath="//header[@id='top-menu']/div/a/i")
	private WebElement languageSelectionCombo; //need to work on object link through API
	
	
	public HomePage(){
		super.myBrowser.driver.get(URL);
	}
	
	public void clickLanguageSelectionCombo(){
		
		
	}
	public void selectEnglighVersion(){
		clickLanguageSelectionCombo();
		super.myBrowser.driver.findElement(By.linkText("English")).click();
	}
	public void selectDeutschVersion(){
		clickLanguageSelectionCombo();
		super.myBrowser.driver.findElement(By.linkText("Deutsch")).click();
	}
	public void enterAmountTosent(double fromCurrency){
		
	}
	public void selectFromCurrencyGBP(){
		
	}
	public void typeRecipientCountry(String nameofCountry){
		
	}
	public void selectDeliveryMethod(String method)//should have enoum
	{
		
	}
	public void clickGetStarted(){
		
	}
}
