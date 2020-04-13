//PROGRAM :9 (VIDEO :10) In notebook.
//Working with CheckBoxes...
//AIM:- http://www.leafground.com/pages/checkbox.html.
//First identify what are all the buttons are clicked.

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html"); //It will get the google page
		
	//1)Select the languages that you know?
        WebElement java=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
        java.click();
        WebElement Cplusplus=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[5]/input"));
        Cplusplus.click();
        
    //2)Confirm Selenium is checked
        WebElement Selenium=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
        boolean status=Selenium.isSelected();
        System.out.println("Selenium status :" +status);
        
    //3)DeSelect only checked
        WebElement NotSelected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
        WebElement IamSelected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
        if(NotSelected.isSelected()) {
        	NotSelected.click();
        }
        if(IamSelected.isSelected()) {
        	IamSelected.click();
        }
        
     //4)Select all below checkboxes
		WebElement Options1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		Options1.click();
		WebElement Options2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		Options2.click();
		WebElement Options3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		Options3.click();
		WebElement Options4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		Options4.click();
		WebElement Options5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		Options5.click();
		
     //5)Exercise : but not works :) :)
		//WebElement alloptions=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]"));
		//if(!alloptions.isSelected()) {
			//alloptions.click();
		//}
				
		
	}

}


////*[@id="contentblock"]/section/div[4]/div