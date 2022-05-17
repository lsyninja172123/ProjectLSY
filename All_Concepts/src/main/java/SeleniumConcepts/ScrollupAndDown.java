package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		//to axis
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(250,250)");
		Thread.sleep(3000);
		
		// to end
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Thread.sleep(3000);
		
		//to element
		WebElement btn = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[24]"));
		js.executeScript("arguments[0].scrollIntoView();",btn);
		
		
	}

}
