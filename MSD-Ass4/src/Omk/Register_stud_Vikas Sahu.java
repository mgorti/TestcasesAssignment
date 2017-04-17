package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viks_stud {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omk.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/register']")).click();
		driver.findElement(By.id("name")).sendKeys("vikas_student");//change the code here
		driver.findElement(By.id("email")).sendKeys("vikas_student@omk.com");//change the code here
		driver.findElement(By.id("password")).sendKeys("test1234");//change the code here
		driver.findElement(By.id("password-confirm")).sendKeys("test1234");//change the code here
		driver.findElement(By.xpath("//input[@value='student']")).click();
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[6]/div/button")).click();
		
	}

}
