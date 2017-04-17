package Example;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kish_mentor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omk.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/register']")).click();
		driver.findElement(By.id("name")).sendKeys("vikas_mentor");//change the code here
		driver.findElement(By.id("email")).sendKeys("vikas_mentor@omk.com");//change the code here
		driver.findElement(By.id("password")).sendKeys("testmentor");//change the code here
		driver.findElement(By.id("password-confirm")).sendKeys("testmentor");//change the code here
		driver.findElement(By.xpath("//input[@value='mentor']")).click();
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[6]/div/button")).click();
		
		
		
		
		
	}

}
