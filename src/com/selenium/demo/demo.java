package com.selenium.demo;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class demo {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Bhuvi\\eclipse-workspace\\Selenium_Testing\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement drs=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions a= new Actions(driver);
		a.click(drs).build().perform();
		Robot k=new Robot();
		WebElement Tshirt=driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		a.contextClick(Tshirt).build().perform();
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		}
	
}
