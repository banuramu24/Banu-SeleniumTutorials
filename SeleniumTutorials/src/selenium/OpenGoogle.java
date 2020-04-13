//Starting With Selenium....this is the first program. Getting started with TEST AUTOMATION>
//PROGRAM :1 (VIDEO :1) In notebook
//First we need to install eclipse,then selenium,then chrome brower.
//AIM:
//1)OpenChrome
//2)Go to GoogleHomePage.
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.get("http://www.google.co.in"); //It will get the google page

	}

}
