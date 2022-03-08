#Author: jessicamanfiosilva@yahoo.com.br

@tag
Feature: Validar fluxo de cadastro no site

  @tag1
  Scenario: Validar fluxo de cadastro
    Given que eu acesse o site "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
    When clico na versao desejada 
    And clico no botao de adcionar novo cadastro
    And Preencho todos os campos os dados para cadastro
    And clico no botao para salvar
    Then e cadastrado com sucesso
    

 