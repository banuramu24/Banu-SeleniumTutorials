/*//VIDEO :9 Executing TestCases in Parallel Fashion using testNG.
//AIM:Google,Bing are independant testcases.
//To make above 2 test to run parallely.
//When Parallel testing is used?
//previous eg: DependanciesManagment la oru method is dependant to other to get the desired result.
//But here, we have Google, Bing . Is there any dependancies whether both has?? to each other? NO
//Like after Google open aana apram oly Bing has to open or Bing open aana apram oly Google has to open nu.
//or Google open aanaa Bing affect aagumaa, illa Bing open aana Google dhan affect aagumaaa.. NOOOOOOOO
//So indha case we dont need to run one pinadi innonu.. by doing @test with alphabetical order.
//So indha maari case la if we do parallel fashion we can achieve more time efficiency.
//Another Eg: Amazon site additinally included some new feature means,
//adha namma chrome la thaniya test pananum,IE la thaniya test pananum,Firefox la thaniya test pananum means..
//chrome la run aagituruka test edhuvumey IE ah run aagituruka test eh endha vidhadhilum affect pana poradhilla,
//similarly IE la run aagituruka test edhuvumey firefox la run aagituruka test eh affect pana poradhilla.
//3 browser la thani thani ya andha test case vandhu independant t.cases ah endha prb irukadha varikum run aaga podhu.
//Google nadakura varikum Bing wait panni aganum?? why this concept? 
//3 mey parallel ah nadandhaa enna..
//To solve this kind of requirement we have grid in selenium.
//But testNG use panni epdi parallel execution panalam nu we will do..
//selenium use panni eh paathudalaam.
//Mainly to save time only we execute independant test cases.
*/
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
		
        @Test
		public void openGoogle() {
         System.setProperty("webdriver.chrome.driver","E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
         WebDriver driver=new ChromeDriver(); //It will launch the chrome browser. 
         driver.get("http://www.google.con.in"); 
         driver.quit();
         
		}
	
        @Test
		public void openBing() {
        	System.setProperty("webdriver.chrome.driver","E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
            WebDriver driver=new ChromeDriver(); //It will launch the chrome browser. 
            driver.get("http://www.bing.com"); 
            driver.quit();
		}
	
	}
	
/*
 * //To run both Google and Bing methods parallely goto testNG.xml and add
 * //<suite name="Test Suite" verbose="2" parallel="methods" thread-count="2">
 * --> indicates method level la parallel ah nadakanum.
 */