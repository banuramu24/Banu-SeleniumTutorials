//Program 17 : How to download a file & verify its downloaded or not
//AIM:- http://www.leafground.com/pages/download.html.
//Mainly used components are File class and listFiles() method.
//Here only 1st operation we did.
//Error in this program. :( :(

package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe"); //to identify which browser is used.
		WebDriver driver=new ChromeDriver();  //It will launch the chrome browser.
		driver.navigate().to("http://www.leafground.com/pages/download.html"); //It will get the google page
		

	//1st Operation
		//i)
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		Thread.sleep(3000);
	
	    //ii)
	    //Here comes the Java. why File class we use? bcoz in windows .. file[] only we have testleaf file.
		File fileLocation=new File("C:\\Users\\Dinesh_Banu\\Downloads");
		//System.out.println("File is downloaded1");
		File[] totalFiles=fileLocation.listFiles(); 
		
		//listFiles() will list all the files present in the list.
		//If we keep cursor it will show array.
		for (File file : totalFiles) {
		 if(file.getName().equals("testleaf.xlsx"))
		 {
			 System.out.println("File is downloaded");
			 break;
		 }
			 //else {
				// System.out.println("File is not downloaded");
			// }
		//}
		
		
	//2nd Operation
		
	//	WebElement downloadPDF=driver.findElement(By.linkText("Download PDF"));
	//	downloadPDF.click();
		
	//	File fileLocation1=new File("C:\\Users\\Dinesh_Banu\\Downloads");
		//System.out.println("PDF is downloaded1");
	//	File[] totalPDF=fileLocation1.listFiles();
		//for (File file : totalPDF) {
			//if(file.getName().equals("testleaf.pdf"))
			//{
			//	System.out.println("PDF is downloaded");
				//break;
			//}
		}
		
	}

}
