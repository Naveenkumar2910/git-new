package org.lkg.lo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\JavaT\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	driver.manage().window().maximize();
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i < trows.size(); i++) {
		WebElement row = trows.get(i);
	System.out.println("naveen");
		
	}
	WebElement row = trows.get(2);
	System.out.println(row);
	List<WebElement> tdata = driver.findElements(By.tagName("td"));
	for (int i = 0; i < tdata.size(); i++) {
	WebElement data = tdata.get(i);
		String name = data.getText();
		System.out.println(name);
	}
	
	System.out.println("----------------------------------------");
	WebElement rows = trows.get(0);
	List<WebElement> r = rows.findElements(By.tagName("id"));
	System.out.println(r);
	
}
}
