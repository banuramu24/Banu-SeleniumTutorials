//Program 14 : How to take ToolTip Text?
//AIM:- http://www.leafground.com/pages/tooltip.html.
//What is ToolTip? If we keep the cursor in text box... below it will show as [Enter your name] 
//This is called ToolTip.
//99% tooltip will exist in title attribute only.
//Error in this program :( :(

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/tooltip.html"); //It will get the google page

	//1st Operation:
		WebElement button1=driver.findElement(By.id("age"));
		button1.sendKeys("banu");
		String text=button1.getAttribute("title");
		System.out.println("text is :" + text);
	}

}
