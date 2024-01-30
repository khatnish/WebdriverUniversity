package com.webdriveruniversity.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs {
	@Test
	public void clickContact() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='contact-us']/div/div/h1")).click();
		
		Set<String>	windows = driver.getWindowHandles();
		
		//using iterator
		
		Iterator<String> it= windows.iterator();
		String parent= it.next();
		String child= it.next();
		
		driver.switchTo().window(child);
		
	String title=	driver.getTitle();
	System.out.println(title);
	
	WebElement e=driver.findElement(By.xpath("//*[@id=\"contact_me\"]/div/div/div/h2"));
	Assert.assertEquals(e.getText(),"CONTACT US");
	
	driver.findElement(By.xpath("//form/input[@name='first_name']")).sendKeys("nisha");
	driver.findElement(By.xpath("//form/input[@name='last_name']")).sendKeys("khatiwada");
	driver.findElement(By.xpath("//form/input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//form/textarea[@name='message']")).sendKeys("I am doing selenium");
	driver.findElement(By.xpath("//form/div[@id='form_buttons']/input[@type='submit']")).click();
		
	
	 WebElement e1 = driver.findElement(By.xpath("//body/div/div/div/h1"));
	
	Assert.assertEquals(e1.getText(), "Thank You for your Message!");
	
//	driver.close();
	
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//a[@id='login-portal']/div/div/h1")).click();
	driver.quit();
//	driver.close();
	}
	
	
	

}
