package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Java program\\QATester\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		WebElement we = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement we1 = driver.findElement(By.xpath("//*[@name='password']"));
		
		String ss = we.getCssValue("border");
		//System.out.println(ss);
		if(ss.contains("1px")) {
			System.out.println("border have 1px");
		}else {
			System.out.println("boder does not 1px");
		}
		
		String ss1 = we1.getCssValue("border");
		//System.out.println(ss1);
		if(ss1.contains("1px")) {
			System.out.println("border have 1px");
		}else {
			System.out.println("boder does not 1px");
		}
	}

}
