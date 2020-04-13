//Program 18 : Upload a File
//AIM:- http://www.leafground.com/pages/upload.html.
//Actions Class : why we used here?
//bcoz I got error as org.openqa.selenium.InvalidArgumentException: 
//when i used ..
//WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
//uploadButton.click(); don't know why..:(:(
//But it is resolved after i used Actions Class.

package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/upload.html"); //It will get the google page

//First copy and store the contents.
	//1st Operation:
		Actions click = new Actions(driver);
		WebElement uploadbutton = driver.findElement(By.name("filename"));
		click.moveToElement(uploadbutton).click().build().perform();
		//WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		//uploadButton.click();
		Thread.sleep(3000);
	//Windows Controls Begins here
		//Desktop\testleaf.pdf  --> this is the location to upload a file in web app.
		//so what i do now?
		//store the above location in toolkit
		String file="Desktop\\testleaf.pdf";
	//2)StringSelection:Used to paste the contents./ It has capacity to transfer a normal javastring to a plain text format.	
		StringSelection selection=new StringSelection(file);
	//1)toolkit: To paste in clipboard store / to copy data we use setContents.
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

//Now we have to perform CTRL+V i:e paste operation.
		
	//ROBOT Class: It is used to perform any mouse/keyboard actions on windows.
	//ACTIONS Class: It is used to perform any mouse/keyboard actions on a web page.
		
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL); //VK : Virtual Key //It press the system virtual keyboard.
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL); //VK : Virtual Key //It press the system virtual keyboard.
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
