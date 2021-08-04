package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompraPage extends BasePage {

	public CompraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	final String USER = "#user-name";
	final String PASSWORD = "#password";
	final String LOGIN = "#login-button";

	public void login() throws InterruptedException {
		driver.findElement(By.cssSelector(USER)).sendKeys("problem_user");
		driver.findElement(By.cssSelector(PASSWORD)).sendKeys("secret_sauce");;
		driver.findElement(By.cssSelector(LOGIN)).click();
		Thread.sleep(5000);
	}
}