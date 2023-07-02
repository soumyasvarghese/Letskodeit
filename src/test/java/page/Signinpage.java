package page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Signinpage {
	WebDriver driver;
	By link=By.xpath("//*[@id=\"navbar-inverse-collapse\"]/div/div");
	By email=By.id("email");
	By pwd=By.id("login-password");
	By btn=By.id("login");

	public Signinpage(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver=driver;
	}
	public void read(String e,String p)
	{
		driver.findElement(link).click();
		driver.findElement(email).sendKeys(e,Keys.ENTER);
		driver.findElement(pwd).sendKeys(p,Keys.ENTER);
	}
	public void button()
	{
		driver.findElement(btn).click();

	}
	public void back()
	{
		driver.navigate().back();
	}

}
