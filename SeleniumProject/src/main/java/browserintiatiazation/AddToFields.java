package browserintiatiazation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class AddToFields extends Base {
	public void addTo()
	{
		
		driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
		WebElement firstA=driver.findElement(By.xpath("//input[@id='value-a']"));
		firstA.sendKeys("5");
		WebElement secondB=driver.findElement(By.xpath("//input[@id='value-b']"));
		secondB.sendKeys("4");
		WebElement button=driver.findElement(By.xpath("//button[@id='button-two']"));
		button.click();
		
		
	}

	public static void main(String[] args) {
		AddToFields addtofields=new AddToFields();
		addtofields.initializerBrowser();
		addtofields.addTo();
		

	}

}
