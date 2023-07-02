package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Interviewpage {
	WebDriver driver;
	By link=By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[3]");
	By btn=By.xpath("//*[@id=\"cu-form-1687049812970\"]/div/a");
	By btn1=By.xpath("//*[@id=\"header19\"]/div[2]/div/div/div/div[3]");
	By downbtn=By.xpath("//*[@id=\"zen_cs_plans_dynamic_0\"]/div[1]/div/div/div[5]");

	public Interviewpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void read()
	{
		driver.findElement(link).click();
		driver.findElement(btn).click();
	}
	public void submit()
	{
	driver.findElement(btn1).click();
	driver.findElement(downbtn).click();
	
	}
	public void back()
	{
		driver.navigate().to("https://www.letskodeit.com/home");;
	}

}
