package java_selenium_interview_topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public static void xPathLeanersList() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.xpath("//table[@id='table_id']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		int i = 0, j = 0;
		for (WebElement header : headers) {
			i++;
			if (header.getText().equalsIgnoreCase("Mentor Name")) {
				break;
			}
		}
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> datas = row.findElements(By.tagName("td"));
			j++;
			for (WebElement data : datas) {

				if (data.getText().equalsIgnoreCase("Learn XPath")) {
					String s = driver.findElement(By.xpath("//table//tbody//tr[" + j + "]//td[" + i + "]")).getText();
					System.out.println("//table//tbody//tr[" + j + "]//td[" + i + "]");
					System.out.println(s);
				}
			}
		}

	}

	public static void highestProgress() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_98\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.xpath("//table[@id='table_id']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		int i = 0;
		int max = 0;
		String x = "";
		for (WebElement header : headers) {
			i++;
			if (header.getText().equalsIgnoreCase("Progress")) {
				List<WebElement> datas = driver.findElements(By.xpath("//table/tbody/tr/td[" + i + "]"));
				for (WebElement data : datas) {
					String s = data.getText();
					String text = s.replaceAll("%", "");
					if (max < Integer.parseInt(text)) {
						max = Integer.parseInt(text);
						x = s;
					}
				}
			}

		}
		System.out.println("//*[normalize-space()='"+x+"']/following::td[1]");
		WebElement element = driver.findElement(By.xpath("//td[normalize-space()='"+x+"']/following::td[1]"));
		element.click();
	}

	public static void main(String[] args) {
		// sxPathLeanersList();
		highestProgress();
	}
}
