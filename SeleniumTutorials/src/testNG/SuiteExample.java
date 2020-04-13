//Video:5 
//How to write a test suite in testNG?
//@BeforeSuite : Executes b4 all the t.cases execution. (also an anotation)
//Suite : Collection of t.cases,so here openGoogle(),openBing(),openYahoo() are all t.cases.
//@AfterSuite : Executes after all the t.cases execution is done. (also an anotation)
//When control goes initially??
//@Test ku varum,beforesuite irukaa nu paakum.Irundhaa adha dhan execute panum.
//So,beforesuite & AfterSuite ah vechi execution time ah koraika mudiyum (using testNG).
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	// AIM : Open Chrome and go to
	// 1)google.co.in 2)bing.com and
	// 3)yahoo.com and then close the browsers.

	
	WebDriver driver; 
	long startTime; 
	long endTime;
	
	
	 @BeforeSuite
	 public void launchBrowser() 
	 { 
     System.setProperty("webdriver.chrome.driver","E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
	 driver=new ChromeDriver(); //It will launch the chrome browser. 
	 }
	 

	@Test
	public void openGoogle() {
		/*
		 * long startTime = System.currentTimeMillis();
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Docs\\Selenium\\chromedriver.exe"); // to identify which // browser is
		 * used. WebDriver driver = new ChromeDriver(); // It will launch the chrome
		 * browser.
		 */		
		driver.get("http://www.google.con.in"); // It will get the google page
		/*
		 * driver.quit(); long endTime = System.currentTimeMillis(); long totalTime =
		 * endTime - startTime; System.out.println("Total time taken" + totalTime);
		 */
	}

	@Test
	public void openBing() {

		/*
		 * long startTime = System.currentTimeMillis();
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Docs\\Selenium\\chromedriver.exe"); // to identify which // browser is
		 * used. WebDriver driver = new ChromeDriver(); // It will launch the chrome
		 * browser.
		 */		
		driver.get("http://www.bing.com"); // It will get the google page
		/*
		 * driver.quit(); long endTime = System.currentTimeMillis(); long totalTime =
		 * endTime - startTime; System.out.println("Total time taken" + totalTime);
		 */
	}

	@Test
	public void openYahoo() {

		/*
		 * long startTime = System.currentTimeMillis();
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Docs\\Selenium\\chromedriver.exe"); // to identify which // browser is
		 * used. WebDriver driver = new ChromeDriver(); // It will launch the chrome
		 * browser.
		 */		
		driver.get("http://www.yahoo.com"); // It will get the google page

		/*
		 * driver.quit(); long endTime = System.currentTimeMillis(); long totalTime =
		 * endTime - startTime; System.out.println("Total time taken" + totalTime);
		 */

	}

	
	 @AfterSuite 
	 public void closeBrowser() { 
	 driver.quit(); 
	 long endTime=System.currentTimeMillis(); 
	 long totalTime=endTime-startTime;
	 System.out.println("Total time taken" + totalTime); 
	 }
	 
}
