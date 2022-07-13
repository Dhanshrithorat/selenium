package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locatortypes {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium1\\Chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Dhanu");
		//driver.findElement(By.xpath("//input[@id='radio1']")).click();
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		Thread.sleep(300);
		//System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		System.out.println("Title is "+Title);
		String url = driver.getCurrentUrl();
		System.out.println("Url is "+url);
		driver.manage().window().maximize();
		//driver.manage().window().minimize();

//		driver.navigate().to("https://www.google.co.in/");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();


		
	}

}
