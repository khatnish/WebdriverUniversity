package com.webdriveruniversity.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ButtonClicks {
	@Test
	public void clicButton() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[@id='button1']")).click();
		Thread.sleep(2000);
		

		
//		WebElement element = driver.findElement(By.cssSelector("span[id='button2']"));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		
		Thread.sleep(2000);
		
		WebElement e1= driver.findElement(By.xpath("//*[@id='button3']"));
		Actions action=new Actions(driver);
		action.moveToElement(e1).click().build().perform();
		
		
		driver.close();
		
		
		
		
	}

}
