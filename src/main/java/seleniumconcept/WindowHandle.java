package seleniumconcept;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	
	WebDriver driver;

	@Test
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\eclipse-workspace\\FirstSeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("xpath");
		driver.findElement(By.xpath("//*[@id=\"ybar-sf\"]/input[2]")).click();
		
		
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		for(String i : driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		
}
}