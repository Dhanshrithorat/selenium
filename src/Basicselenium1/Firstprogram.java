package Basicselenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium1\\Chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");

	}

}
