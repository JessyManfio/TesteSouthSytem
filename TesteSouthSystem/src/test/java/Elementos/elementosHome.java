package Elementos;

import org.openqa.selenium.By;

public class elementosHome {

	private By versaoTheme = By.xpath("//*[@id=\"switch-version-select\"]/option[4]");

	private By btnAddRecord = By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a");

	public By getVersaoTheme() {
		return versaoTheme;
	}

	public By getBtnAddRecord() {
		return btnAddRecord;
	}
	
	
	

}
