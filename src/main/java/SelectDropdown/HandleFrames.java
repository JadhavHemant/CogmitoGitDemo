package SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
	
		driver.findElement(By.tagName("input")).sendKeys("jhdgshfhz");
		
		Thread.sleep(5000);
		driver.close();

	}

}
