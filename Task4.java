package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	     driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		String ss = driver.getCurrentUrl();
		
		if(ss.contains("dashboard")){
			System.out.println("url contains dashboard");
		}else {
			System.out.println("url not contains dashboard");
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
