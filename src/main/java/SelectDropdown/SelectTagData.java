package SelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagData {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	
		WebElement wb=driver.findElement(By.tagName("select"));
		Select sel=new Select(wb);
		
		List<WebElement> ls=sel.getOptions();
		
		for(WebElement abc:ls) {
			String x=abc.getText();
			System.out.println(x);
		}
		
		Thread.sleep(5000);
		sel.selectByIndex(5);
		
		Thread.sleep(5000);
		sel.selectByValue("BEN");
		
		Thread.sleep(5000);
		sel.getFirstSelectedOption();
		
		Thread.sleep(5000);
		sel.selectByVisibleText("India");
		
		Thread.sleep(5000);
		driver.close();
}

}
