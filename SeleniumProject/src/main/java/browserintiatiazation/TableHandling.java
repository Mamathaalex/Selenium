package browserintiatiazation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
public void getFullTabledata()
{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement fullTable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(fullTable.getText());
	
}
public void selectRaw()
{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement rowdata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
	System.out.println(rowdata.getText());
}
public void selectColumndata()
{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	List<WebElement> columnData=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement columnFull:columnData)
	{
		System.out.println(columnFull.getText());
	}
}
public void selectParticularData()
{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	WebElement ParticularData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tdbody/tr[4]/td[1]"));
	System.out.println(ParticularData.getText());
}
public void searchData()
{
	driver.navigate().to("http://selenium.qabible.in/table-pagination.php");
	String input="Software Engineer";
	List<WebElement> columnsearch=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement onedata:columnsearch)
	{
		if (onedata.getText().equals(input))
		{
		System.out.println(onedata.getText());	
	}
	}
	
}
	public static void main(String[] args) {
		TableHandling tableHandle=new TableHandling();
		tableHandle.initializerBrowser();
		//tableHandle.getFullTabledata();
		//tableHandle.selectRaw();
		//tableHandle.selectColumndata();
		//tableHandle.selectParticularData();
		tableHandle.searchData();
		

	}

}
