import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPush {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();  //withought perform() mousehover action not perform
		Thread.sleep(2000);
		WebElement hidden = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		action.moveToElement(hidden).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}
}