package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Signinpage;
import page.Coursepage;
import page.Interviewpage;
import page.Blogpage;
public class Letskodeittest {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.letskodeit.com/");
}
	@Test
	public void home() throws InterruptedException
	{
		Signinpage obj=new Signinpage(driver);
		obj.read("abc12@gmail.com", "abcd@12");
		Thread.sleep(1000);
		obj.button();
	
		Coursepage c=new Coursepage(driver);
		c.read();
		c.dropdown();
		
		Interviewpage i=new Interviewpage(driver);
		i.read();
		i.submit();
		
		Blogpage b=new Blogpage(driver);
		b.read();
		b.searchcategory();
	}
	@Test
	public void test1() throws IOException
	{
		String expectedURL = "https://www.letskodeit.com/";
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equalsIgnoreCase(expectedURL))
			System.out.println("Test passed !!!!");
		else
			System.out.println("Test failed");
		
		driver.quit();
		
	}


}
