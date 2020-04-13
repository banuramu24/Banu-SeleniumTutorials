//Program 15 : Working with Selectable.
//AIM:- http://www.leafground.com/pages/selectable.html.
//AIM:CTRL+CLICK Multiple Elements.
//Always use xpath here. eventhough we have id.
//xpath ending with /li
//we need actions class. ACTIONS class are mainly for mouse interactions simulations.
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/selectable.html"); //It will get the google page
		
	//1st Operation:
		//To do CTRL+CLICK opeartion..Take all the ITEMS from the list first.
		//Here eventhough we have id in inspect we will take xpath only. because if we take id. It will count as 1.
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int size=selectable.size();
		System.out.println(size);
		
	//NOTE:If we run without putting /li we will get o/p as 1 only.

    //2nd Operation:
		//Select first 3 elements.
		Actions actions=new Actions(driver);
		//actions.keyDown(Keys.CONTROL).click(selectable.get(0)).
		//click(selectable.get(1)).click(selectable.get(2)).build().perform();
		
		             //or
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
		
	}

}
