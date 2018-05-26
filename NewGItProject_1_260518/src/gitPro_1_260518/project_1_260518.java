package gitPro_1_260518;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class project_1_260518 {
	
	
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
