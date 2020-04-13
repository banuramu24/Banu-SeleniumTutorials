//Program 11 : Windows Handling
//Working with Windows...
//AIM:- http://www.leafground.com/pages/Window.html.
//Most Important for Interview point of view.
//Mainly we use getwindowhandle() , getwindowhandles() and driver.switchTo().window(..) 

package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Window.html"); //It will get the google page
		
	//1)Click button to open home page in New Window
		
		//To identify the current window/parent window .use getwindowhandle()
		String oldWindow=driver.getWindowHandle(); //To identify the current window/parent window .use getwindowhandle()
		
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		//To store all opened windows we use getWindowHandles() tat has Set Class.Ethana Window Open Aaanaalum store aagum.
		Set<String> handles=driver.getWindowHandles();
		
		//To switch the control to new window we use for iteration
        for (String newWindow  : handles) {
        	driver.switchTo().window(newWindow); //It will switch over the control to new window
			 
		}	
		
		WebElement editBox=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		//Thread.sleep(5000);
		driver.close();  //It will close the new window(focus window).
		
		driver.switchTo().window(oldWindow);  //Take back the control to the original window.
		
	//2)Find the number of opened windows
		WebElement openMultiple=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openMultiple.click();
		//Thread.sleep(5000);
		//Find the number of opened windows
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println("numberOfWindows Opened : " +numberOfWindows);
		
	//3)Close all except this window
		WebElement dontCloseMe=driver.findElement(By.id("color"));
		dontCloseMe.click();
		//Thread.sleep(5000);
		//To store all opened windows we use getWindowHandles() tat has Set Class.Ethana Window Open Aaanaalum store aagum.
		Set<String> newWindowshandles=driver.getWindowHandles();
		
		//To switch the control to new window we use for iteration
		for (String allWindows : newWindowshandles) { //allWindows is a name for newly opened windows
			if(!allWindows.equals(oldWindow)) {
			driver.switchTo().window(allWindows);
			driver.close();
			}
		}
		//Thread.sleep(5000);
		driver.switchTo().window(oldWindow); 
		
	//4)Wait for 2 new Windows to open
		WebElement wait=driver.findElement(By.xpath("//*[@id=\"color\"]"));
		wait.click();
		//Thread.sleep(5000);
		Set<String> newWindowshandles5sec=driver.getWindowHandles();
		
		for (String allwindows5sec : newWindowshandles5sec) {
		if(!allwindows5sec.equals(oldWindow)) {
			driver.switchTo().window(allwindows5sec);
			driver.close();	
		}
		}
		
		//Thread.sleep(5000);
		//driver.quit(); //It will close all windows opened by chromedriver.
	}

}
