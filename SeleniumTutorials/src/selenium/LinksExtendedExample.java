//Program 20 : Working With Links/HyperLinks :- 
//AIM:- http://www.leafground.com/pages/Link.html.

//StaleElementReferenceException??
//My page was already loaded/re-directed/ it was refreshed using homePageLink.
//So namma diver find panni vechirundha 1st link oda property maaridichi.
//Thiripi andha page ku pudhusaa load aagi varapo, refresh/edho oru reason kaaga 
//indha page again load aagurapo indhoda properties laam 1st landhu marubadi initialize aagum.
//To overcome this we use 4th operation homePageLink1 again.

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/Link.html"); //It will get the google page

		
//1st Operation : Go to Home Page
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		driver.navigate().back();

//2nd Operation : Find where am supposed to go without clicking me?
		//getAttribute("href") :- href will store the target info of the link.
		WebElement whereToGo=driver.findElement(By.partialLinkText("Find where"));
		String where=whereToGo.getAttribute("href");
		System.out.println("This link is going to " + where);
		//driver.navigate().back(); //Why we removed this here? bcoz we are already in home page only.
//3rd Operation : Verify am I broken?
		//How to check? Click that link you will get error as HTTP Status 404 – Not Found
        WebElement brokenLink=driver.findElement(By.linkText("Verify am I broken?"));
        brokenLink.click();
        
        String title=driver.getTitle();
        if(title.contains("404")) {
        	System.out.println("Link is Broken");
        }
        driver.navigate().back();
//4th Operation : Go to Home Page (Interact with same link name)
        WebElement homePageLink1=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink1.click();
		driver.navigate().back();
//5th Operation : How many links are available in this page?
		//Now we have to find the counts, so we use find elements. also List.
		//<a> will give the number of Links
		List<WebElement> totalLinks=driver.findElements(By.tagName("a")); //or (By.tagName("img")); :- For images count
		int linkcount=totalLinks.size();
		System.out.println("Total Links " + linkcount);
		
//After i ran i get o/p as Total Links 6 why 6? when we have 5?
//Bcoz logo is there.that'y why..
	}

}
