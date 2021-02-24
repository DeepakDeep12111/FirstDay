package org.testng.sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGtask1 {
	
	@Parameters ({"email","pass"})
	@Test()
	private void tc0( String s, String s1) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(s);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s1);
		
		String userAtt = txtUser.getAttribute("value");
		System.out.println(userAtt);
		
		String passAtt = txtPass.getAttribute("value");
		System.out.println(passAtt);
		
		
			
		
			
}

}
