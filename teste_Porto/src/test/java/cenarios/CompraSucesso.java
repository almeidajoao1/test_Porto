package cenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CompraSucessoPage;

public class CompraSucesso {

	WebDriver driver;
	CompraSucessoPage compra;

	/**
	 * Este método visa confrigurar o drive. Esta classe será possível ser excutada
	 * em ambiente windows e Linux.
	 */
	public void verificaSistemaOperacionalESetaChromeDriver() {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.setProperty("webdriver.chrome.driver", "chromedriverWin/chromedriver.exe");
		} else {
			System.setProperty("webdriver.chrome.driver", "chromedriverLix/chromedriver");
		}
	}

	public void setupChrome() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Before
	public void abrirJanela() {
		verificaSistemaOperacionalESetaChromeDriver();
		setupChrome();
		compra = new CompraSucessoPage(driver);
		compra.abrirURL("https://www.saucedemo.com/");
	}

	@Test
	public void efetuarCompraSucesso() {
		compra.login();
	}

	@After
	public void fecharPagina() {
		driver.quit();
	}
}