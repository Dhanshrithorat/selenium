
package WebeElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledUse {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium1\\Chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		WebElement getOTPButton =driver.findElement(By.xpath("//button[text()='Get OTP']"));
		System.out.println(getOTPButton.isEnabled());
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		Thread.sleep(1000);
		System.out.println(getOTPButton.isEnabled());
		getOTPButton.click();
		

	}

}
