//Program 23 : Working With Sortables :- 
//AIM:- http://www.leafground.com/pages/sortable.html.
//It mainly comes with the drag and drop operations.
//So Actions Class will come.
//AIM:- Write a program to reverse the order of diplay with item7 at top and item1 at bottom.
//But here we only do,item7 at top.
//AIM:- we need to take the whole list, so use xpath.
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/sortable.html"); //It will get the google page

	//1st Operation : take the whole list first
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"sortable\"]//li"));
	
	//Put it in reverse order
		WebElement fromElement0=elements.get(6);
		WebElement toElement0=elements.get(0);   
		Actions actions0=new Actions(driver);
		actions0.dragAndDrop(fromElement0, toElement0).build().perform();
		
		//Thread.sleep(3000);
		
		WebElement fromElement1=elements.get(5);
		WebElement toElement1=elements.get(0);
		Actions actions1=new Actions(driver);
		actions1.dragAndDrop(fromElement1, toElement1).build().perform();
		
		WebElement fromElement2=elements.get(4);
		WebElement toElement2=elements.get(0);
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(fromElement2, toElement2).build().perform(); 
		
		WebElement fromElement3=elements.get(3);
		WebElement toElement3=elements.get(0);
		Actions actions3=new Actions(driver);
		actions3.dragAndDrop(fromElement3, toElement3).build().perform(); 
		
		WebElement fromElement4=elements.get(2);
		WebElement toElement4=elements.get(0);
		Actions actions4=new Actions(driver);
		actions4.dragAndDrop(fromElement4, toElement4).build().perform(); 
		
		WebElement fromElement5=elements.get(1);
		WebElement toElement5=elements.get(0);
		Actions actions5=new Actions(driver);
		actions5.dragAndDrop(fromElement5, toElement5).build().perform(); 
		
		//WebElement fromElement6=elements.get(0);
		//WebElement toElement6=elements.get(6);
	//for drag and drop
		
		//Actions actions0=new Actions(driver);
		//actions0.clickAndHold(fromElement0);
		//actions0.moveToElement(toElement0);
		//actions0.release(toElement0);
		//actions0.build().perform();
		//Thread.sleep(3000);
		//Actions actions1=new Actions(driver);
		//actions1.clickAndHold(fromElement1);
		//actions1.moveToElement(toElement1);
		//actions1.release(toElement1);
		//actions1.build().perform();
		
		//Actions actions2=new Actions(driver);
		//actions2.clickAndHold(fromElement2);
		//actions2.moveToElement(toElement2);
		//actions2.release(toElement2);
		//actions2.build().perform();
		
		//Actions actions3=new Actions(driver);
		//actions3.clickAndHold(fromElement3);
		//actions3.moveToElement(toElement3);
		//actions3.release(toElement3);
		//actions3.build().perform();
		
		//Actions actions4=new Actions(driver);
		//actions4.clickAndHold(fromElement4);
		//actions4.moveToElement(toElement4);
		//actions4.release(toElement4);
		//actions4.build().perform();
		
		//Actions actions5=new Actions(driver);
		//actions5.clickAndHold(fromElement5);
		//actions5.moveToElement(toElement5);
		//actions5.release(toElement5);
		//actions5.build().perform();
		
		//Actions actions6=new Actions(driver);
		//actions6.clickAndHold(fromElement6);
		//actions6.moveToElement(toElement6);
		//actions6.release(toElement6);
		//actions6.build().perform();
		
	}

}
