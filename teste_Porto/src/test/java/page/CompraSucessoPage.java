package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraSucessoPage extends BasePage {

	public CompraSucessoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	final String USER = "#user-name";
	final String PASSWORD = "#password";
	final String LOGIN = "#login-button";

	public void login() {
		driver.findElement(By.cssSelector(USER)).sendKeys("performance_glitch_user");
		driver.findElement(By.cssSelector(PASSWORD)).click();
		driver.findElement(By.cssSelector(LOGIN)).click();
	}
}