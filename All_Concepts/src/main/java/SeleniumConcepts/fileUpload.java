package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_98\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[19]")).click();
	driver.findElement(By.xpath("//div[@id='mydiv']")).sendKeys("C:\\Users\\live\\Documents\\Git_Token.txt");
}
}
