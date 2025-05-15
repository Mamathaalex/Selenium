package browserintiatiazation;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandle extends Base
{
	public void multipleWindowPract()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactusField=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactusField.click();
		WebElement loginField=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginField.click();
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		Set<String> childWindow=driver.getWindowHandles();
		String title="";
		for(String multiWindow:childWindow)
		{
			if (!multiWindow.equals(ParentWindow))
				
			
			{	
			//System.out.println(multiWindow);
				driver.switchTo().window(multiWindow);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
		}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstName.sendKeys("Mamatha");
				WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
				lastName.sendKeys("Alex");
				
	}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement userName=driver.findElement(By.xpath("//input[@id='text']"));
				userName.sendKeys("Mamatha");
				WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
				password.sendKeys("0101");
			}
		}
		
		
	}

	public static void main(String[] args) {
		MultipleWindowHandle multipleWindow = new MultipleWindowHandle();
		multipleWindow.initializerBrowser();
		multipleWindow.multipleWindowPract();

	}
}


