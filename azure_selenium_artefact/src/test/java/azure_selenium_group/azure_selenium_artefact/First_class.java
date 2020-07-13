package azure_selenium_group.azure_selenium_artefact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\LEAPWORK\\Studio\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mendix.com");
		driver.manage().window().maximize();

	}

}
