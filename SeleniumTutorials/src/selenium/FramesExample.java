//Program 12 : Handling Frames
//AIM:- http://www.leafground.com/pages/frame.html.
//What is Frame?? Advertisements are called frames. eg:www.guru99.com
//Oru html code kulla inoru sub html code is called frames which are indicated by iframe. Eg: ad's
//Guru99 is a html code, ad's is also html code. we are embedding one html code to another html code.
//getText() : Returns In-between tag's text.
//getAttribute() : eg: <button id = "Click".... here id is attribute.
//if they ask to find the count in frames always use tagname("iframe"). It will give the count.
//NOTE: Very very imporatant...
//When you come with frames..always check with <div id="wrapframe"> . this is the heading 
//

package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/frame.html"); //It will get the google page
		
	//1st opeartion:I am inside a frame
		driver.switchTo().frame(0); //here 0 denotes the first iframe..since we dont have [id] very very important.
		WebElement button1=driver.findElement(By.id("Click"));
		button1.click();
		//If i run now.. i will get nosuchelementexception bcoz driver cannot identify frames. 
		//It will store only the native html or original html which will be at the very top. It will retrieve only that data.
		//iframes are all external html. driver cannot identify the interior html's present in iframe.
		//so we use driver.switchto().frame(); as first line.
		
		//Now after clicking the frame button I need to confirm whethere i retrieved the correct frame's html code.
		//For that I'm retrieving the "Hurray! You Clicked Me".
		
		String Text=driver.findElement(By.id("Click")).getText(); //Here I am getting the value of the "Click" button. So I'm using driver.findElement(By.id("Click")). 
		System.out.println(Text);
		
		driver.switchTo().defaultContent(); //If we dont give this line it will throw NoSuchFrameException in 2nd Operation ..first line.
		
	//2st opeartion:I am inside a nested frame.
		driver.switchTo().frame(1); //here 1 denotes the second iframe..since we dont have [id] very very important.
		driver.switchTo().frame("frame2"); //this denotes the nested iframe. here "frame2" denotes the id of nested frame.
		WebElement button2=driver.findElement(By.id("Click1"));
		button2.click();
		
		String Text1=button2.getText(); //Here I am getting the value of the "Click" button. So I'm using driver.findElement(By.id("Click")). 
		System.out.println(Text1);
		
		driver.switchTo().defaultContent();
		
	//3rd Operation: Find total number of frames.
	//To find size / total / count . always use List
	   List<WebElement> totalframes=driver.findElements(By.tagName("iframe")); 
	   int size=totalframes.size();
	   System.out.println(size);
	
	}
	
	

}
