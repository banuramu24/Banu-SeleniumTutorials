//PROGRAM :7 (VIDEO :8) In notebook.
//Working with Alerts/Types of Alerts/pop-ups...
//AIM:- http://www.leafground.com/pages/Alert.html.
package selenium;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Alert.html"); //It will get the google page
		
	//1)Click the button to display a alert box
		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert=driver.switchTo().alert(); //We have taken the control to alert box.i:e Switching driver to alert.
		Thread.sleep(3000);
		alert.accept(); //It will click the ok button.
		
	//2)Click the button to display a confirm box.
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss(); //It will click the cancel button.
		
	//3)Click the button to display a prompt box.
		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Duckling");
		Thread.sleep(3000);
		promptAlert.accept(); //It will click the ok button.
		
	//4)Click the button to learn line-breaks in an alert.
		//There is no explanation.
		
	//5)Click the below button and click OK.
		WebElement belowButton=driver.findElement(By.id("btn"));
		belowButton.click();
		try {
		Alert sweetAlert=driver.switchTo().alert();
		sweetAlert.accept();         //It will click the ok button.
		}
		catch(NoAlertPresentException e) {
			System.out.println("There is no Alert");
			Thread.sleep(3000);
			WebElement oklink=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
			oklink.click();
		}
		 
	}
		
}
