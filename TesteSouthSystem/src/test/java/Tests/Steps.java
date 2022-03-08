package Tests;

import Elementos.elementosCadastro;
import Elementos.elementosHome;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	elementosHome home = new elementosHome();
	elementosCadastro cad = new elementosCadastro();
	metodos met = new metodos();
	
	
	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		met.abrirSite(site , "CHROME");
	   
	}

	@When("^clico na versao desejada$")
	public void clico_na_versao_desejada() throws Throwable {
	    
	}

	@When("^clico no botao de adcionar novo cadastro$")
	public void clico_no_botao_de_adcionar_novo_cadastro() throws Throwable {
	    
	}

	@When("^Preencho todos os campos os dados para cadastro$")
	public void preencho_todos_os_campos_os_dados_para_cadastro() throws Throwable {
	   
	}

	@When("^clico no botao para salvar$")
	public void clico_no_botao_para_salvar() throws Throwable {
	    
	}

	@Then("^e cadastrado com sucesso$")
	public void e_cadastrado_com_sucesso() throws Throwable {
	   
	}



}
