package Test_Dinesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
				//To open the web browser
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "E:\\Docs\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.co.in");
				driver.manage().window().maximize();

			}

		}



