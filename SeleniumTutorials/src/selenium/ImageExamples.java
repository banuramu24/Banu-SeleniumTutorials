//Program 19 : Working With Images :- getAttribute("naturalWidth").equals("0"))
//AIM:- http://www.leafground.com/pages/Image.html.
//I got error as org.openqa.selenium.NoSuchElementException:
//when we get??
//If we dont go back to the original page..after performing any operation.
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Image.html"); //It will get the google page

//1st Operation: Click on this image to go home page
		WebElement firstImage=driver.findElement
				(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		
		firstImage.click();
		driver.navigate().back();
//2nd Operation: Am I Broken Image? :- Natural Width --> CSS Property
		WebElement brokenImage=driver.findElement
				(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//"naturalWidth"=0, then it is broken Image. vv important : naturalWidth cannot be find on xpath or inspect.
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The Image is Broken");
		}else {
			System.out.println("The Image is not Broken");
		}
		
		
	}

}
