package gitProgrm1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class girpRjt1 {
	@Test
	public void display(){
		System.setProperty("webdriver.chrome.driver", "F:/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String getTitle = driver.getTitle();
		System.out.println(driver.getTitle());
	
	}

}
