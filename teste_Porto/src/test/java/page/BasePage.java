package page;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Abrir a URL
	 * 
	 * @param url a ser aberta
	 */
	public void abrirURL(String url) {
		driver.get(url);
	}

}