//PROGRAM :6 (VIDEO :7) In notebook.
//Working with Drop Downs/Selectable components...Mainly deals with Select class
//AIM:- http://www.leafground.com/pages/Dropdown.html.
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html"); //It will get the google page
		
	//1)Select training program using index
		WebElement dropDownUsingIndex=driver.findElement(By.id("dropdown1"));
		Select select1=new Select(dropDownUsingIndex);
		select1.selectByIndex(4);
		
	//2)Select training program using Text
		WebElement dropDownUsingText=driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropDownUsingText);
		select2.selectByVisibleText("Selenium");
		
	//3)Select training program using value
		WebElement dropDownUsingValue=driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropDownUsingValue);
		select3.selectByValue("2");
		
	//4)Get the number of dropdown options : If Count comes use LIST<>
		List<WebElement> listOfOptions=select1.getOptions();
		int size=listOfOptions.size();
		System.out.println("Number of Elements :" + size);
		
		//5)You can also use sendkeys to select
		WebElement dropDown5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		dropDown5.sendKeys("U");
		
	//6)Select your programs/ Multi-select
		WebElement dropDown6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select6=new Select(dropDown6);
		select6.selectByIndex(1);
		select6.selectByIndex(2);
		select6.selectByIndex(3);
		
	}

}


