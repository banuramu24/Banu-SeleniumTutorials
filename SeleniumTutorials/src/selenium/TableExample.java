//Program 21 : Working With Dynamic Tables :- 
//AIM:- http://www.leafground.com/pages/table.html.
//Refer HTML Table Structure @ Background in DeskTop. - Excel.
//NumberFormatException :- For String 100%
//When we try to change string 100% to number 100, it cannot identify special characters.
//So,use replace("%","");
//InvalidSelectorException :- ("//td[normalize-space()='Learn to interact with Elements']//following::td[1])")
//normalize-space() :- Truncates Space.
//Error in this program finally :( :( :(

package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/table.html"); //It will get the google page
		
		
//1st Operation : Get the count of number of columns
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnCount=columns.size();
		System.out.println("No of Cols " +columnCount);

//2st Operation : Get the count of number of rows
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowCount=rows.size();
		System.out.println("No of Rows " +rowCount);
		
//3rd Operation : Get the progress value of 'Learn to interact with Elements'
		//AIM :- 80% is the o/p value.
	//We should not inspect the 80% element field and hardcode it directly bcoz tomorrow 
	//'Learn to interact with Elements' may go to row1. So use below
	//We can achieve this by xpath only...
		
		//td[Learn to interact with Elements]//following::td[1]
		//td[normalize-space()='Learn to interact with Elements']//following::td[1] :- Put this in ctrl+f in inspect without fail.
		//td[.='Learn to interact with Elements'] :- .= denotes if we dont give normalize-space() we use '.' there.
	    
		WebElement getPercent=driver.findElement
				(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent=getPercent.getText();	
	    System.out.println("Percentage is " +percent);

//4th Operation : Check the vital task for the least completed progress.
	    //AIM :First we will take all the 3 values (i:e) 100%,80% and 20% in string format.
	    //Then we change those to number format. After this, we will see which one is least.
	    //Once we see which value is least, then using that value we will write an xpath.
	    //Adhuku apram irukura checkbox ah click pannu.
	    
	   //1)to store: all progress values.use td[2].
	    List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
		
	   //3)and to compare which one is least we need to store the elements la..so below
	    List<Integer> numberList=new ArrayList<Integer>();
	    
	   //2)to iterate:all 3 elements 1 by 1 
	    for (WebElement webElement : allProgress) {
	    	String individualValue=webElement.getText().replace("%",""); //getText() will return in String. we dont have function to return in integer.
	    //So individualValue la vara onnu onnu number ah numberList la store panni vekka poren.
	    //numberList.add(individualValue) :- This will show error bcoz i cant add a stringvalue directly to integer.
	    //so adhuku nan enna pana poren means Integer.parseInt(individualValue) :- change to integer.
	    	//Integer.parseInt(individualValue);
	    	numberList.add(Integer.parseInt(individualValue));
		}
	    System.out.println("Final List "+numberList);
	    
	   //4)To see which one is least
	    //we use collections in java.
	    
	    int smallValue=Collections.min(numberList);
	    System.out.println(smallValue);
	    
	   //5)Now I need to change the 30 to string value 30%. :- use Integer.toString()
	    
	   String smallValueString=Integer.toString(smallValue)+"%";
	   //Now write an xpath...
	   //td[normalise-space()='30%']//following::td[1]
	   String finalXpath="//td[normalize-space()="+"\""+smallValueString+"\""+"]"+"//following::td[1]";
	   //escape characters :- "\""
	   System.out.println(finalXpath);
	   
	   //6) finally to check the checkbox use below.
	   WebElement check=driver.findElement(By.xpath(finalXpath));
	   //System.out.println(".......");
	   check.click();
	   //System.out.println(".......1");
	}

}
