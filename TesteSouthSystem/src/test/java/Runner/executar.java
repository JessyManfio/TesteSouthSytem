package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/feature/",
		// mostrar pacote estão os steps para execução
		glue = "Tests",
		//tags para direcionar a execusão dos testes
		tags = "@tag1",
		// formatacão do console cucumber | report html
		plugin = {"pretty", "html:target/report.html"},
		// monchrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os metodos com padrao da linguagem Java ao inves de underline 
		snippets = SnippetType.CAMELCASE,
		// não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
		dryRun = false
		)
public class executar {

}
