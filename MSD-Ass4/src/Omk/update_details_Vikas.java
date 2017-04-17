package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class viks_update {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omk.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("vikas@omk.com");//change the code here
		driver.findElement(By.id("password")).sendKeys("password");//change the code here
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div/div[2]/form/div[4]/div/button")).click();
		driver.findElement(By.xpath("//a[@href='http://omk.herokuapp.com/mentors']")).click();
		driver.findElement(By.xpath(".//a[@href='http://omk.herokuapp.com/mentors/31/edit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("address")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("S 70th PLAZA");
		driver.findElement(By.xpath("html/body/div[1]/form/div[7]/input")).click();
		
		
		
		
	}

}
