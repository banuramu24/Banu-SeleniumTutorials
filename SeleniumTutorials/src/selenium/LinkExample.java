//PROGRAM :3 (VIDEO :4) In notebook
//How to work with Links in selenium? Mainly deals with LinkText & partialLinkText
//AIM: In http://www.leafground.com/pages/Link.html
//Click Go to Home Page.
//Performed Only 1st operation in that link.
//Check for 1)ID,2)NAME,3)CLASSNAME,4)XPATH,5)CSSSELECTOR

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.get("http://www.leafground.com/pages/Link.html"); //It will get the google page
		
		//For LinkText : Use linktext or Partiallinktext
		//driver.findElement(By.linkText("Go to Home Page")).click();
		//or
		driver.findElement(By.partialLinkText("Go to")).click();
		
 	}

}
