package azure_selenium_group.azure_selenium_artefact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Second_Test {
  @Test
  public void f() {
	  System.out.println("Hello World");
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\LEAPWORK\\Studio\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mendix.com");
		driver.manage().window().maximize();
  }
}
