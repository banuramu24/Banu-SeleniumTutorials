//Program 13 : Drag and Drop
//AIM:- http://www.leafground.com/pages/drop.html.
//AIM: Click the first element hold . move . release [to perform these operations] 
//we need actions class. ACTIONS class are mainly for mouse interactions simulations.
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/drop.html"); //It will get the google page
		
   //1st operation
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));
   
		Actions actions=new Actions(driver);
		//actions.clickAndHold(From).moveToElement(To).release().build().perform();
		
                		//or
		
		actions.dragAndDrop(From, To).build().perform();
		
	}

}
