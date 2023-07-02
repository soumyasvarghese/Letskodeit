package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Coursepage {
	WebDriver driver;
	By course=By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[2]");
	public Coursepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void read()
	{
		driver.findElement(course).click();
	}
	public void dropdown()
	{
		Select category=new Select(driver.findElement(By.xpath("//*[@id=\"zen_all_courses_dynamic\"]/div[2]/div[1]/select")));
		category.selectByValue("1604");
	}
	
	public void back()
	{
		driver.navigate().back();
	}

}

