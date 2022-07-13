package WebeElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium1\\Chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Dhanu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	}

}
