package assignment7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("mukesh");
		
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		String cc =driver.findElement(By.xpath("//*[text()='Invalid credentials']")).getText();
		System.out.println(cc);
	}

}
