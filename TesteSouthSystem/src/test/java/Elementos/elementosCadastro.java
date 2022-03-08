package Elementos;

import org.openqa.selenium.By;

public class elementosCadastro {

	private By cpCustomerName = By.name("customerName");

	private By cpContactLastName = By.name("contactLastName");

	private By cpContactFirstName = By.name("contactFirstName");

	private By cpPhone = By.name("phone");

	private By cpAddressLine1 = By.name("addressLine1");

	private By cpAddressLine2 = By.name("addressLine2");

	private By cpCity = By.name("city");

	private By cpState = By.name("state");

	private By cpPostalCode = By.name("postalCode");

	private By cpCountry = By.name("country");

	private By cpSalesRepEmployeeNumber = By.name("salesRepEmployeeNumber");

	private By cpCreditLimit = By.name("creditLimit");

	private By btnGoToList = By.xpath("//*[@id=\"report-success\"]/p/a[2]");

	public By getCpCustomerName() {
		return cpCustomerName;
	}

	public By getCpContactLastName() {
		return cpContactLastName;
	}

	public By getCpContactFirstName() {
		return cpContactFirstName;
	}

	public By getCpPhone() {
		return cpPhone;
	}

	public By getCpAddressLine1() {
		return cpAddressLine1;
	}

	public By getCpAddressLine2() {
		return cpAddressLine2;
	}

	public By getCpCity() {
		return cpCity;
	}

	public By getCpState() {
		return cpState;
	}

	public By getCpPostalCode() {
		return cpPostalCode;
	}

	public By getCpCountry() {
		return cpCountry;
	}

	public By getCpSalesRepEmployeeNumber() {
		return cpSalesRepEmployeeNumber;
	}

	public By getCpCreditLimit() {
		return cpCreditLimit;
	}

	public By getBtnGoToList() {
		return btnGoToList;
	}

}
