//Program 22 : Working With Calendars :- 
//AIM:- http://www.leafground.com/pages/Calendar.html.
//It is very crucial component for ticket booking applications.
//xpath mainly plays here.
//AIM :- Select 10th day of following month,means adutha month oda 10th day.

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html"); //It will get the google page

//1st Operation :
		WebElement calendar=driver.findElement(By.id("datepicker"));
	//Using SendKeys:
		//calendar.sendKeys("04/10/2020" +Keys.ENTER);
		//or
	//I want to go to that pop-up calendar and want to select means,
    //[using Traverse/next click panni edukanum means]
	//AIM : Click the next daelement.
	//      Click the 10 y.
		
		calendar.click();
		WebElement nextButton=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		nextButton.click();
	
		WebElement dateToBeGiven=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a"));
		dateToBeGiven.click();
		
		
	}

}
