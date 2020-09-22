package com.glp.demo;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.common.io.Files;

@SpringBootTest
class GlpProjectApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void openURL() {
		System.out.println("Inside open url");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Naga.Gundabathula\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8080/GLPProject-0.0.1-SNAPSHOT/");
		driver.findElement(By.xpath("//a[text()='Click Me']")).click();
		System.out.println("After testing");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("verifyAppStatus.jpg");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
