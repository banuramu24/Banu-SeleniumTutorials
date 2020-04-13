//PROGRAM :8 (VIDEO :9) In notebook.
//Working with RadioButtons...
//AIM:- http://www.leafground.com/pages/radio.html.
//First identify what are all the buttons are clicked.
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/radio.html"); //It will get the google page
		
	//1)Are you enjoying the classes?
		WebElement enjoyClass=driver.findElement(By.id("yes"));
		enjoyClass.click();
		
	//2)Find default selected radio button
		WebElement unchecked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
		WebElement checked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean status1=unchecked.isSelected();
		boolean status2=checked.isSelected();
		System.out.println("Unchecked : "+ status1);
		System.out.println("Checked : "+ status2);
		
	//3)Select your age group (Only if choice wasn't selected)
		WebElement below20=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[1]"));
		below20.click();
	}

}
//NOTE :While taking xpath..be careful...first click the radio button and then take xpath. 