package pom;

	import java.util.Set;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class NaukriPopup {
		static{
			
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allTitles = driver.getWindowHandles();
		for(String h:allTitles) {
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	}
