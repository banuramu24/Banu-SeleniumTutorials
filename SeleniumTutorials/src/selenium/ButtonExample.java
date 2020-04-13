//PROGRAM :5 (VIDEO :6) In notebook.
//Working with Buttons.
//AIM:- http://www.leafground.com/pages/Button.html
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Button.html"); //It will get the google page
		
	//1)Click button to travel home page
		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();
		driver.navigate().back();
	//2)Find position of button (x,y).
	//To find the location/position of (x,y) co-ordinates we use getLocation() & 
	//Point class.
		WebElement getPositionButton=driver.findElement(By.id("position"));
		Point xypoint=getPositionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		System.out.println("X value is "+xValue);
		System.out.println("Y value is "+yValue);
		
	//3)Find button color
		WebElement colorButton=driver.findElement(By.id("color"));
		String color=colorButton.getCssValue("background-color");
		System.out.println(color);
	//4)Find the height and width
		WebElement sizeButton=driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width=sizeButton.getSize().getWidth();
		System.out.println("Height is :"+height);
		System.out.println("Width is :"+width);
		
	}

}
