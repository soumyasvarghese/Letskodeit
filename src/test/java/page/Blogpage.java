package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Blogpage {
	WebDriver driver;
	By blog=By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[5]");

	public Blogpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void read()
	{
		driver.findElement(blog).click();
	}
	public void searchcategory()
	{
		Select category=new Select(driver.findElement(By.name("blog-categories")));
		category.selectByValue("7016");

	}
		public void back()
	{
		driver.navigate().back();
	}


}
