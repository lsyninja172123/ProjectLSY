package SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;
import javax.swing.text.Position;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.Select;

public class Basic_Selenium {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_96\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com");
	}

	public static void edit() {
		launchBrowser();
		WebElement editBtn = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[1]"));
		editBtn.click();
		// Enter your email address
		driver.findElement(By.id("email")).sendKeys("senthil@123");
		// Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" Appended");

		// Get default text entered
		WebElement getENteredText = driver.findElement(By.xpath("//input[@name='username']"));
		String text = getENteredText.getAttribute("value");
		System.out.println("Entered Text is " + text);

		// Clear the text
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/input")).clear();

		// Confirm that edit field is disabled
		WebElement disabled = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/div/div/input"));
		boolean enabled = disabled.isEnabled();
		System.out.println(enabled);

	}

	public static void button() {
		launchBrowser();
		// Click button to travel home page
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[2]")).click();
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[2]")).click();
		// Find position of button (x,y)
		WebElement position = driver.findElement(By.id("position"));
		org.openqa.selenium.Point p = position.getLocation();
		double x = p.getX();
		double y = p.getY();
		System.out.println("position x= " + x);
		System.out.println("position y= " + y);
		// Find button color
		WebElement btn = driver.findElement(By.id("color"));
		String cssValue = btn.getCssValue("background-color");

		System.out.println("Background color is " + cssValue);

		// background-color
		WebElement f = driver.findElement(By.id("size"));
		Dimension size = f.getSize();
		System.out.println(size);

	}

	public static void hyperLink() throws IOException {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[3]")).click();
		// Go to Home Page
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[3]")).click();
		// Find where am supposed to go without clicking me?

		// Verify am I broken?

		WebElement link = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		String s = link.getAttribute("href");
		URL url = new URL(s);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		int responseCode = con.getResponseCode();
		if (responseCode == 200) {
			System.out.println("Normal link");
		} else
			System.out.println("Broken link");
		// How many links are available in this page?
		int count = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement l : links) {
			String attribute = l.getAttribute("href");
			System.out.println(attribute);
			count++;
		}
		System.out.println("Total links " + count);

	}

	public static void imageHandling() throws InterruptedException, AWTException {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[4]")).click();
		// Click on this image to go home page
		driver.findElement(By.xpath("//div[@class='wrapper-outer']/div[3]/section/div[1]/div/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[4]")).click();
		// Am I Broken Image?
		WebElement image = driver
				.findElement(By.xpath("//div[@class='wrapper-outer']/div[3]/section/div[2]/div/div/img"));
		if (image.getAttribute("naturalwidth").equals("0")) {
			System.out.println("The is broken");
		} else
			System.out.println("Not broken");

		// Click me using Keyboard or Mouse
		WebElement elment = driver
				.findElement(By.xpath("//div[@class='wrapper-outer']/div[3]/section/div[3]/div/div/img"));
		Actions a = new Actions(driver);
		a.moveToElement(elment).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void dropDown() {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[5]")).click();
		WebElement element = driver.findElement(By.id("dropdown1"));
		Select s = new Select(element);
		s.selectByIndex(4);

		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));

		Select s1 = new Select(dropdown2);
		s1.selectByVisibleText("Selenium");

		WebElement dropdown3 = driver.findElement(By.name("dropdown3"));
		Select s2 = new Select(dropdown3);
		s2.selectByValue("2");

		WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(dropdown4);
		List<WebElement> options = s3.getOptions();
		for (WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}

		WebElement dropdown5 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]"));
		dropdown5.sendKeys("Selenium");// pending
	}

	public static void radioBtn() {
		launchBrowser();
		WebElement element = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[6]"));
		element.click();
		// Are you enjoying the classes?
		driver.findElement(By.id("yes")).click();
		// Find default selected radio button
		WebElement element2 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/label[2]"));
		WebElement unchecked = driver.findElement(By.xpath("//label[@for='Unchecked']"));
		WebElement checked = driver.findElement(By.xpath("//label[@for='Checked']"));

		if (unchecked.isSelected()) {
			System.out.println("Selected option is " + unchecked.getText());
		} else {
			System.out.println("Selected option is " + checked.getText());
		}

		// Select your age group (Only if choice wasn't selected)
		String range = " 1 - 20 years\r\n" + "                                ";
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='innerblock']/div[3]/descendant::input"));
		for (WebElement age : options) {
			/*
			 * if(age.getText().contains("20")) { age.click(); }
			 */

			System.out.println(age.getText());
		}
	}

	public static void checkBox() {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[7]")).click();
		// Select the languages that you know?
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='innerblock']/div[1]/child::div/input"));
		for (WebElement check : options) {
			check.click();
		}

		// Confirm Selenium is checked
		WebElement isSelected = driver.findElement(By.xpath("//*[@class='innerblock']/div[2]/child::div/input"));
		if (isSelected.isSelected() == true) {
			System.out.println("Selected");
		} else {
			System.out.println("Not Selected");
		}

		// DeSelect only checked
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='innerblock']/div[3]/child::div/input"));
		for (WebElement e : elements) {
			if (e.isSelected() == false) {
				e.click();
			}
		}
	}

	public static void webTables() {
		launchBrowser();
		WebElement element = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[8]"));
		element.click();
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			List<WebElement> data = row.findElements(By.tagName("td"));
			for (WebElement td : data) {
				System.out.println(td.getText());
			}
		}
		// Get the progress value of learn to interact with elements
		WebElement e = driver.findElement(
				By.xpath("//*[normalize-space(text())='Learn to interact with Elements']/following::td[1]"));

		System.out.println("Progress value of Learn to interact with Elements " + e.getText());

		// Check the vital task for the least completed progress
		List<String> li = new ArrayList<String>();
		WebElement table1 = driver.findElement(By.tagName("table"));
		List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
		for (WebElement row : rows1) {
			List<WebElement> th = row.findElements(By.tagName("th"));
			for (WebElement td : th) {
				String text = td.getText();
				// System.out.println(text);
				li.add(text);
			}
		}
		String s = "Progress";
		System.out.println(li.indexOf(s));

		List<WebElement> task = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		int min = 101;
		for (WebElement value : task) {
			String s1 = value.getText();
			s1 = s1.replace("%", "");
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
			if (parseInt < min) {
				min = parseInt;
			}
		}
		System.out.println("minimum percentage " + min);
		System.out.println("//td[contains(text(),'" + min + "')]/following-sibling::td[1]");

		driver.findElement(By.xpath("//td[contains(text(),'" + min + "')]/following-sibling::td[1]/input")).click();

		// td[contains(text(),'100')]

	}

	public static void alertExample() throws InterruptedException {
		launchBrowser();
		WebElement element = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[9]"));
		element.click();

		// Click the button to display a alert box.

		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// Click the button to display a confirm box.

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		// Click the button to display a prompt box.

		WebElement confirmBox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		confirmBox.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("pakki tension pannatha");
		Thread.sleep(2000);
		// driver.switchTo().alert().accept();

	}

	public static void promptAlert() throws InterruptedException {
		launchBrowser();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Senthil");
		Thread.sleep(2000);
		System.out.println(a1.getText());
		Thread.sleep(2000);
		a1.accept();
	}

	public static void iFramesEx() {
		launchBrowser();

		// I am inside a frame
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[10]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();

		// I am inside a nested frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		// total frames
		List<WebElement> totalFrmaes = driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrmaes.size());

	}

	public static void windowsHandling() {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[11]")).click();
		driver.findElement(By.id("home")).click();
		System.out.println("Now am in home page");

		// Find the number of opened windows
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println("Total windows " + windowHandles.size());

	}

	public static void dragAndDrop() {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[14]")).click();

		WebElement dragable = driver.findElement(By.id("draggable"));

		WebElement droppable = driver.findElement(By.id("droppable"));

		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragable, droppable).build().perform();

	}

	public static void autoSuggestion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\Chrome_96\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("chen");
		Thread.sleep(2000);
		List<WebElement> cities = driver
				.findElements(By.xpath("//div[@class='OBMEnb'][1]/ul/li/div/descendant::span[1]"));
		for (WebElement name : cities) {
			String text = name.getText();
			System.out.println(text);
		}
	}

	public static void mouseHover() {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[25]")).click();

		WebElement courses = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']]"));

		Actions ac = new Actions(driver);

		ac.moveToElement(courses);

	}

	public static void toolTip() throws InterruptedException {
		launchBrowser();
		driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[20]")).click();
		WebElement tip = driver.findElement(By.id("age"));
		Actions ac = new Actions(driver);
		ac.moveToElement(tip);
		Thread.sleep(3000);
		String title = tip.getAttribute("title");
		System.out.println(title);
	}

	public static void screenshot() throws IOException{
		launchBrowser();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("Screenshot.png");
		FileUtils.copyFile(src, des);
		
	}
	
	
	public static void fullscreenshot() throws AWTException, IOException {
		launchBrowser();
		java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(size);
		Robot r=new Robot();
		BufferedImage img = r.createScreenCapture(rec);
		File f=new File("fullss.png");
		ImageIO.write(img, "png", f);
	}
	
	public static void elementSS() throws IOException {
		launchBrowser();
		WebElement edit = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/ul/li[1]"));
		File src = edit.getScreenshotAs(OutputType.FILE);
		File des=new File("elementss.jpg");
		org.openqa.selenium.io.FileHandler.copy(src, des);
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// launchBrowser();
		// edit();
		// button();
		// hyperLink();
		// imageHandling(); one error
		// dropDown();
		// radioBtn();
		// checkBox();
		// webTables();
		// alertExample();
		// promptAlert();
		// iFramesEx();
		// windowsHandling();
		// dragAndDrop();
		// autoSuggestion();
		// mouseHover();
		//toolTip();
		//screenshot();
		//fullscreenshot();
		elementSS();

	}
}
