package browserintiatiazation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSection {
	public WebDriver driver;
	public void framePract()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement jmeterIFrame=driver.findElement(By.xpath("//iframe[@id='a077aa5a']"));
		driver.switchTo().frame(jmeterIFrame);
		WebElement jmeterFrame=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeterFrame.click();
	}

	public static void main(String[] args) {
		FramesSection framessection=new FramesSection();
		framessection.framePract();
		
		

	}

}
