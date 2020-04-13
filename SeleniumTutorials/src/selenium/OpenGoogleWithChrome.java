//PROGRAM :2 (VIDEO :3) In notebook
//First we need to install eclipse,then selenium,then chrome brower.
//AIM:
//1)OpenChrome
//2)Go to GoogleHomePage.
//3)In Google textbox i want to type "trichy" and
//open the "trichy Wikipedia" - link
//Finding web elements and interacting with them.
//Check for 1)ID,2)NAME,3)CLASSNAME,4)XPATH,5)CSSSELECTOR
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWithChrome {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
	WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
	driver.get("http://www.google.co.in"); //It will get the google page
	
	//Enter a search term.
	//Click the wikipedia link.
	
	driver.findElement(By.name("q")).sendKeys("Agni" +Keys.ENTER);
	
		
	}

}
