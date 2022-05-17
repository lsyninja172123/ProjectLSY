package SeleniumConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSorting {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_96\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	List<WebElement> options = s.getOptions();
	List<String> li=new ArrayList<String>();
	String[] a=new String[12];
	int k=0;
	for (WebElement opt : options) {
		li.add(opt.getText());
		a[k]=opt.getText();
		k++;
		System.out.println(opt.getText());
	}
	
	for (int i = 0; i < a.length; i++) {
		String s1 = a[i];
		for (int j = i+1; j < li.size(); j++) {
			String s2=a[j];
			if (s1.compareTo(s2)>0) {
				String temp=s1;
				a[i]=s1;
				a[j]=temp;
			}
		}
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
