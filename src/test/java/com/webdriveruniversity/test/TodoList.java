package com.webdriveruniversity.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TodoList {
	@Test
	public void checkingTodolist() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	WebElement e=	driver.findElement(By.xpath("//input[@type='text']"));
		e.sendKeys("jdjdfhdf");
		e.sendKeys(Keys.ENTER);
		
		WebElement add = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
		add.sendKeys("hello world");
		add.sendKeys(Keys.ENTER);
		
		List<WebElement> list = driver.findElements(By.xpath("//li"));
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			String value = list.get(i).getText();
			System.out.println(value);
			
			if(value.equals("Practice magic")) {
				list.get(i).click();
				driver.findElement(By.xpath("//li[@class='completed']//i[@class='fa fa-trash']")).click();
				Thread.sleep(3000);
			}
		}
		
		
		
		
		
		
//		driver.quit();
//		list.remove(0);
//		int size1 = list.size();
//		System.out.println(size1);
//		for(int i=0; i<list.size();i++) {
//			WebElement l=list.get(i);
//			
//			Actions a= new Actions(driver);
//			a.moveToElement(l).click().build().perform();
//			//System.out.println(l);
//			if(l.equals(list.size()-1)) {
//				list.remove(l);
//
//			}
			
			
			
//		}
		
		
		//System.out.println(list.size()-1) ;
		
//		Thread.sleep(2000);
		
		
		
	//	driver.close();
		
	}
	
	

}
