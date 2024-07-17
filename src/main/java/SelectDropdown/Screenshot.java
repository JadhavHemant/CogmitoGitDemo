package SelectDropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	
	TakesScreenshot src=(TakesScreenshot)driver;
	File Scr=src.getScreenshotAs(OutputType.FILE);
	File dest=new File(System.getProperty("user.dir")+"\\myScreenshot\\"+"abc.png");
	FileUtils.copyFile(Scr,dest);
	
	Thread.sleep(5000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.in/");
//	AShot a=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
	
	
	
	
}
}
