package SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_96\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
		String parentId= driver.getWindowHandle();
		WebElement editBtn = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[1]"));
		Actions ac=new Actions(driver);
		ac.contextClick(editBtn).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement button = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[3]"));
		Actions ac1=new Actions(driver);
		ac1.contextClick(button).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId.size());
		for (String id : allId) {
			if (id.equals(parentId)) {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println("Parent window "+title);
			}
			else {
				String title = driver.switchTo().window(id).getTitle();
				System.out.println("child window" +title);
			}
		}
		
		int i=0;
		for (String id1 : allId) {
			
			String t = driver.switchTo().window(id1).getTitle();
			if (t.equals("TestLeaf - Selenium Playground")) {
				System.out.println(t+" i am in parent window");
			}
			else {
				i++;
				System.out.println(t+ "i am in "+i+" child window");
				if (i==2) {
					driver.close();
					driver.switchTo().window(parentId);
					System.out.println(driver.getTitle()+" after closing 2nd child parent");
				}
			}
			
		}
		
		
	}

}
