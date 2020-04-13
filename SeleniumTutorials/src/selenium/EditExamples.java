//PROGRAM :4 (VIDEO :5) In notebook
//Working with Text Box/Edit Box...Mainly deals with the send keys or clear operations.
//AIM: In http://www.leafground.com/pages/Edit.html
//Performing all operations.
//Check for 1)ID,2)NAME,3)CLASSNAME,4)XPATH,5)CSSSELECTOR
//XPATH:- "//" - Relative XPATH.
//NOTE:In Selenium,In one text box,Already text is there means,If i try to append with any value
//it will not overwrite,it will append only.that's why we are using sendkeys() operation only.
//Now if i want to overwrite the text means,I will clear() the value and then use sendkeys.
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.get("http://www.leafground.com/pages/Edit.html"); //It will get the google page
		
	//1)Enter your email address
        WebElement emailBox=driver.findElement(By.id("email"));
        emailBox.sendKeys("test@gmail.com");
        

	//2)Append a text and press keyboard tab
		WebElement appendbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("Text");
		
	//3)Get default text entered
		WebElement getTextBox=driver.findElement(By.name("username"));
		String value=getTextBox.getAttribute("value");
		System.out.println(value);
		
	//4)Clear the text
		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear(); 
			
	//5)Confirm that edit field is disabled
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		disabledBox.isDisplayed(); 
		System.out.println(disabledBox); 
		
	}
 
}
