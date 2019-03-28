package browserAPI;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Azimo.com.Managers.ExceptionManager;

public class Browser {
	  public static WebDriver driver;
	  private static Browser browser;
	  public static final int DEFAULT_WAIT_4_PAGE = 30; 
	  public static final int DEFAULT_WAIT_4_ELEMENT = 10;
	  
	  //if you are using browser stack
	  public static final String USERNAME = "";
	  public static final String AUTOMATE_KEY = "";	
	  public static final String Url = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
		
	  private static String browserName = "";
	  public static Browser getBrowser(String browsername)
	  {
		  browserName = browsername; 		 
			  if (browser==null){
				  browser = new Browser(browserName);
			  }
			  return browser; 
		 
	  }
	  public static Browser getBrowser()
	  {
		  if (browser==null){
			  browser = new Browser();
		  }
		  return browser;			  
	  }
	  public static void QuitBrowser()
	  {
		  try{
		  driver.quit();
		  }catch(Exception e){
			  ExceptionManager.performDefaultAction(e);
		  }
		  
	  }
	  private Browser(){
		  driver = new FirefoxDriver(); 
		  initilizeDriver(); 
	  }
	  private Browser(String browserName){
		  driver = browserFactory(browserName);
		  initilizeDriver(); 
	  }
	  
	  public void click(){
		
		  
	  }
	private WebDriver browserFactory(String browserName) {
		if(browserName=="FireFox"){
			return new FirefoxDriver();
			} 
		else if(browserName=="InternetExplorer"){
			return new InternetExplorerDriver();
		}
		else if(browserName=="Chrome"){
			return new ChromeDriver();
		}
		else if(browserName=="Safari"){
			return new SafariDriver();
		}
		else if(browserName=="Remote"){
			try {
				return  new RemoteWebDriver(new URL(Browser.Url),setCapabilities());
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				return new FirefoxDriver();
			}
		}
		else return new FirefoxDriver();		
		}
	
	//we need to convert this as reading from file and then enable in browser manager
	public DesiredCapabilities setCapabilities(){
		return null; 
	}
	public static void initilizeDriver() {
		resetImplicitWait();	
		makeFullScreen();
	}
	private static void makeFullScreen() {
		driver.manage().window().maximize();		
	}
	public static void resetImplicitWait(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void setImplicitWait(int newWaittime_InSeconds) {
		nullifyImplicitWait();
		driver.manage().timeouts().implicitlyWait(newWaittime_InSeconds, TimeUnit.SECONDS);
	}
	public static void nullifyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait() 
	} 
	private static boolean isTextPresent(WebDriver driver, By by, String text)
	{
		try {
				return driver.findElement(by).getText().contains(text);
		} catch (NullPointerException e) {
				return false;
		}
	}
	private static boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);//if it does not find the element throw NoSuchElementException, which calls "catch(Exception)" and returns false; 
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	private static boolean areElementsPresent(WebDriver driver, By by) {
		try {
			driver.findElements(by); 
			return true; 
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	private static boolean isElementPresentAndDisplay(WebDriver driver, By by) {
		try {			
			return driver.findElement(by).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public static boolean waitForJavaScriptCondition(final String javaScript, int timeOutInSeconds) {
		boolean jscondition = false; 
		try{	
			nullifyImplicitWait(); 
		new WebDriverWait(driver, timeOutInSeconds) {
		}.until(new ExpectedCondition<Boolean>() {
		
		@Override
		public Boolean apply(WebDriver driverObject) {
		return (Boolean) ((JavascriptExecutor) driverObject).executeScript(javaScript);
		}
		});
		jscondition =  (Boolean) ((JavascriptExecutor) driver).executeScript(javaScript); 
		resetImplicitWait();
		return jscondition; 
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		return false; 
	}
	public static boolean waitForJQueryProcessing(int timeOutInSeconds){
		
		return waitForJavaScriptCondition("return jQuery.active == 0",timeOutInSeconds); 
    }
	
	public static boolean waitForTextPresent(final By by, final String text, int timeOutInSeconds) {
		boolean isPresent = false; 
		try{	
			nullifyImplicitWait();  
	        new WebDriverWait(driver, timeOutInSeconds) {
	        }.until(new ExpectedCondition<Boolean>() {
	
	            @Override
	            public Boolean apply(WebDriver driverObject) {
	            	return isTextPresent(driverObject, by, text); //is the Text in the DOM
	            }
	        });
	        isPresent = isTextPresent(driver, by, text);
	        resetImplicitWait();
			return isPresent; 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false; 
	}
	public static WebElement waitForElementRefresh(final By by,int timeOutInSeconds) {
		WebElement element; 
		try{	
			nullifyImplicitWait(); 
			new WebDriverWait(driver, timeOutInSeconds) {}.until(new ExpectedCondition<Boolean>() {		
				@Override
				public Boolean apply(WebDriver driverObject) {
					driverObject.navigate().refresh(); //refresh the page ****************
					return isElementPresentAndDisplay(driverObject, by);
				}});
			element = driver.findElement(by);
			resetImplicitWait();
		return element; //return the element
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return null; 
		}
	public static List<WebElement> waitForListElementsPresent(final By by, int timeOutInSeconds) {
		List<WebElement> elements; 
		try{	
			nullifyImplicitWait(); 			  
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
			wait.until((new ExpectedCondition<Boolean>() {
	            @Override
	            public Boolean apply(WebDriver driverObject) {
	                return areElementsPresent(driverObject, by);
	            }
	        }));
			
			elements = driver.findElements(by); 
			resetImplicitWait();
			return elements; //return the element	
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null; 
	}
	public static WebElement waitForElementPresent(final By by, int timeOutInSeconds) {
		WebElement element; 
		try{
			nullifyImplicitWait(); 
			
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
			element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			
			resetImplicitWait();
			return element; //return the element
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null; 
	}
	public static WebElement waitForElement(final By by, int timeOutInSeconds) {
		WebElement element; 
		try{	
			nullifyImplicitWait(); 			  
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));			
			resetImplicitWait();
			return element; //return the element	
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null; 
	}
}
