package SelectDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFramesTage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm1");
		
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@class='selectnav']")));
		List<WebElement> ls=sel.getOptions();
		
		int count=ls.size();
		System.out.println(count);
		
		for(WebElement abc:ls)
		{
			System.out.println(abc.getText());
			
		}
		sel.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("hindichbx")).click();
		
		
		
	}
}
