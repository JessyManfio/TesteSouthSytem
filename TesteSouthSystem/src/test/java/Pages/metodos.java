package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodos {
	

	WebDriver driver;

	/**
	 * escolher o navegador e escolher site
	 * 
	 * @author Jessica Manfio  
	 * @param abrir navegador
	 * @throws IOException
	 */

	public void abrirSite(String site, String navegador) {

		if (navegador == "CHROME" || navegador == "FIREFOX") {
			switch (navegador) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

				break;

			}
		} else {
			System.out.println("nao suporta outro navegador");
		}

	}

	/**
	 * preencher
	 * 
	 * @author Jessica Manfio  
	 * @param preecher elemento
	 * @throws IOException
	 * 
	 */
	public void prencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	/**
	 * fechar browser
	 * @author Jessica Manfio  
	 * @param fechar
	 * @throws IOException
	 */

	public void fechar() {
		driver.quit();

	}

	/**
	 * clicar
	 * 
	 * @author Jessica Manfio  
	 * @param clicar no elemento
	 * @throws IOException
	 */

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	/**
	 * Pausa 
	 * @author Jessica Manfio  
	 * @param Pausa,Tempo
	 * @param descricaoPasso
	 */
	public void pausa(int tempo) throws Exception {
		Thread.sleep(tempo);

	}
	/**
	 * tirar foto
	 * @author  Jessica Manfio  
	 * @param screenshot
	 */
public void screnShoot(String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencia/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}
public String getNome(String nome) {
	String geradorNome = RandomStringUtils.randomAlphabetic(3);
	return nome+geradorNome;
}
public String getCardholder(String nome) {
	String geradorNome = RandomStringUtils.randomAlphabetic(4);
	return nome+geradorNome;
}
public String getNumero() {
	String geradorNumero = RandomStringUtils.randomNumeric(6);
	return geradorNumero+"-2";
}
public String getCartao() {
	String geradorCartao = RandomStringUtils.randomNumeric(16);
	return geradorCartao;
}
public String getCVV() {
	String geradorCvv = RandomStringUtils.randomNumeric(3);
	return geradorCvv;
}
public String getEmail() {
	String geradorEmail = RandomStringUtils.randomAlphabetic(3);
	return geradorEmail+"@gmail.com" ;
}


	
}

	


	
	


