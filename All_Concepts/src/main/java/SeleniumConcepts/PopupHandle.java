package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\live\\Desktop\\WebDrivers\\Chrome_96\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/live/Desktop/Popup.html");
	driver.findElement(By.id("PopUp")).click();
	driver.switchTo().alert().dismiss();
}
}
