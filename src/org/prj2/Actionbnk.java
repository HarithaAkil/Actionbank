package org.prj2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionbnk {
	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\kavin\\eclipse-workspace\\Action\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement element2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(element1, element2).perform();
		WebElement element3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement element4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(element3, element4).perform();
		WebElement element5 = driver.findElement(By.xpath("(//a[text()=' 5000 '])"));
		WebElement element6 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(element5, element6).perform();
		WebElement element7 = driver.findElement(By.xpath("(//a[text()=' 5000 '])"));
		WebElement element8= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(element7, element8).perform();
		
		
		
	

}
}
