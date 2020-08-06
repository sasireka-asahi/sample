package stepdefn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static WebDriver LaunchBrowser() {
		System.out.println("Lauching the borwser");
		System.setProperty("webdriver.chrome.driver","E:/Eclipse/bank/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

        
  // to  pass the values in the URL  
    public static void goToUrl(String url) {
		driver.get(url);
	}
    
    //enter email
    public static void insertValues(WebElement e, String s1) {
		e.sendKeys(s1);
	}
// click on create register btn
    public static void click(WebElement e) {

		e.click();
	}
    
    public void dropdown(WebElement state, String s8){
    	Select s = new Select(state);
		s.selectByVisibleText(s8);
    }
    
    public void dropdown1(WebElement country, String s9){
    	Select s = new Select(country);
		s.selectByVisibleText(s9);
    }
    
}
