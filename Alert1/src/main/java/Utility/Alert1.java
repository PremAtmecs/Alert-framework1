package Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

public class Alert1 {
	public void webInspection() {
		Locatorinputs get=new Locatorinputs();
		Xlsheetmethods get1=new Xlsheetmethods();
		System.setProperty(get.getDriver(),get.getDriverpath());
		WebDriver driver=  new ChromeDriver();
		driver.get(get.getUrl());
		driver.manage().window().maximize();
		driver.findElement(By.xpath(get1.getXLsheet())).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert1=driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("arun");
		alert3.accept();
	}
}
