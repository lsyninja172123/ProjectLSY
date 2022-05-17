package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToFindDisappearedElement {
public static void main(String[] args) {
	// To find xpath of an element that disappears once cursor moves away from it
	//press F11 to freeze the screen
	
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_98\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	RemoteWebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/");
	w.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
	WebElement element = w.findElement(By.xpath("//div[@id='container']/div/div[2]/descendant::div[contains(@class,'eFQ30H')][4]"));
	Actions ac=new Actions(w);
	ac.moveToElement(element).perform();
	String text = w.findElement(By.xpath("//div[@class='_3XS_gI']/span/following::a[1]")).getText();
	System.out.println(text);
		
}
}
