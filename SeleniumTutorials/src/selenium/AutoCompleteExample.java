//Program 16 : Working with AutoCompletion.
//AIM:- http://www.leafground.com/pages/autoComplete.html.
//In course name text box. whatever letter i give eg:s then it will show all course name related to s.
//again eg:a then it will show all course name related to a.
//AIM: I am pressing letter 'S' it will list all options. there we are gng to select 4th option. "Web Services".
//So what to do?
//First find the text box and give send keys with 's'.
//whatever list are listed below.. first take ellaa options.
//then select the 4th option "web services".
//So here i m seeing web services as 4th option..so i should not hardcode like list la irukura 4th option eh poi edu.
//bcoz tomm 4th option may change to some other option.
//So write the code based on edha select pannanum..not based on ethanaadhu option la irukura..
//So what to do....
//First copy the xpath of <ul> list which will list below when you type char 's'. then end with /li

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/autoComplete.html"); //It will get the google page
		

		
	//1st Operation: Course Name
		WebElement button1=driver.findElement(By.id("tags"));
		button1.sendKeys("s");
		Thread.sleep(4000); //Why we give thread.sleep here bcoz after typing "s" it may take tym to list the options. so andha list varaamaley namma poi store pannaaa.. o/p varadhu.
		
	//2nd Operation: We need to take all the lists which we are seeing after when we type 's'.
	  //Why we are using findElements here. bcoz we are taking more than 1 elements from the list to store it first.
		//List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		//System.out.println(optionsList.size());
		
		//for (WebElement webElement : optionsList) {
			//if(webElement.getText().equals("Selenium"))
			//{
				//webElement.click();
				//System.out.println("Selected Web Element is :" + webElement.getText());
				//break;  //Why we use break statement here? bcoz If we dont give,wastly after selecting "Web Services" also the iteration goes.
			//}else {
				//System.out.println("Selected Web Element is else part :" );
			//}
					
			
		//}
		
		//or
		
	//We can use Actions class without using sendkeys.
		List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println(optionsList.size());
		Actions actions=new Actions(driver);
		actions.click(optionsList.get(0));
        actions.build().perform();
		
	}

}
