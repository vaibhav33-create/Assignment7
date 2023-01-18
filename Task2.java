package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		 driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	     driver.findElement(By.xpath("//*[@name='password']"));
		
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		WebElement el = driver.findElement(By.xpath("//*[text()='Required']"));
		
		String ss = el.getText();
		if(ss.contains("Required")) {
			System.out.println("Required error message diplay");
		}else {
			System.out.println("Error message not display");
		}

		
	}

}
