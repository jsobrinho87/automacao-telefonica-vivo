#Author: jonathan.sobrinho@zero-defect.com.br
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Testes diários portal assine B2C e B2B.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Execucao dos testes de regressao do release

#---------------------#
#---------B2C---------#
#---------------------#

@CenarioCombo3P-B2C
Scenario: Combo 3P - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de combo 3P	
	And seleciona opcao de combo 3P
	When na modal de consulta cobertura informa os dados do Cliente
	And na modal de Identificacao clica em Receber Ligacao
	And na modal de Identificacao clica em Adicionar
	When na tela dados do cliente complete o pedido
	And na tela dados do cliente clica em Proximo Passo
	And na tela Endereco de Instalacao clica em Proximo Passo
	When na tela de Pagamentos informa os dados
	And na tela de Pagamento clica em Finalizar Pedido
	Then na tela sera exibida mensagem de sucesso ou erro

@CenarioCombo2P-B2C
Scenario: Combo 2P - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de combo 2P
	And seleciona opcao de combo 2P
	When na modal de consulta cobertura dados do Cliente - combo 2P
	And na modal de Identifica clica em Receber Ligacao - combo 2P
	When cliente complete o pedido - combo 2P
	And cliente clica em Proximo Passo - combo 2P
	And na tela Endereco Instalacao clica Proximo Passo - combo 2P
	When em Pagamentos informa os dados combo 2P
	And em Pagamento clica em Finalizar Pedido combo 2P
	Then na tela mensagem de sucesso ou erro - combo 2P
		
@CenarioBL-B2C
Scenario: Banda Larga Avulsa - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de Avulso BL
	And seleciona card de Avulso BL
	When na modal de consulta cobertura dados do Cliente - Avulso BL
	And na modal de Identifica clica em Receber Ligacao - Avulso BL
	And informa bt comprar internet avulsa BL
	When cliente complete o pedido - Avulso BL
	And cliente clica em Proximo Passo - Avulso BL
	And na tela Endereco Instalacao clica Proximo Passo - Avulso BL
	When em Pagamentos informa os dados Avulso BL
	And em Pagamento clica em Finalizar Pedido Avulso BL
	Then na tela mensagem de sucesso ou erro - Avulso BL
	
@CenarioFixa-B2C
Scenario: Telefonia Avulsa Fixa - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de Avulso Fixa
	And seleciona opcao de Avulso Fixa
	When na modal de consulta cobertura dados do Cliente - Avulso Fixa
	And na modal de Identifica clica em Receber Ligacao - Avulso Fixa
	And seleciona botao comprar internet avulsa Fixa
	When cliente complete o pedido - Avulso Fixa
	And cliente clica em Proximo Passo - Avulso Fixa
	And na tela Endereco Instalacao clica Proximo Passo - Avulso Fixa
	When em Pagamentos informa os dados Avulso Fixa
	And em Pagamento clica em Finalizar Pedido Avulso Fixa
	Then na tela mensagem de sucesso ou erro - Avulso Fixa

@CenarioTV-B2C
Scenario: TV por Assinatura Avulsa - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de Avulso TV
	And seleciona opcao de Avulso TV
	When na modal de consulta cobertura dados do Cliente - Avulso TV
	And na modal de Identifica clica em Receber Ligacao - Avulso TV
	And seleciona botao comprar internet avulsa TV
	When cliente complete o pedido - Avulso TV
	And cliente clica em Proximo Passo - Avulso TV
	And na tela Endereco Instalacao clica Proximo Passo - Avulso TV
	When em Pagamentos informa os dados Avulso TV
	And em Pagamento clica em Finalizar Pedido Avulso TV
	Then na tela mensagem de sucesso ou erro - Avulso TV

@CenarioSimu3P-B2C
Scenario: Simulador 3P - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de simulador 3P
	And seleciona opcao de simulador 3P
	When na modal de consulta cobertura dados do Cliente simulador 3P
	And na modal de Identifica clica em Consultar simulador 3P
	And seleciona botao comprar simulador 3P
	And seleciona banda larga simulador 3P
	And seleciona TV por Assinatura simulador 3P
	And informa pontos adicionais TV simulador 3P
	And informa Telefonia simulador 3P
	When cliente complete o pedido - simulador 3P
	And cliente clica em Proximo Passo - simulador 3P
	And na tela Endereco Instalacao clica Proximo Passo simulador 3P
	When em Pagamentos informa os dados simulador 3P
	And em Pagamento clica em Finalizar Pedido simulador 3P
	Then na tela mensagem de sucesso ou erro - simulador 3P

@CenarioFixa02-B2C
Scenario: Telefonia Fixa Avulsa Dois - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pg de Avulso Fixa Dois
	And informar op de Avulso Fixa Dois
	When modal consulta cobertura dados do Avulso Fixa Dois
	And modal Identifica clica em consultar Avulso Fixa Dois
	And botao comprar internet avulsa Fixa Dois
	When completando pedido checkout Avulso Fixa Dois
	And seleciona Proximo Passo Avulso Fixa Dois
	And endereco Instalacao clica Proximo Passo Avulso Fixa Dois
	When pagamentos informa dados Avulso Fixa Dois
	And pagamento clica Finalizar Pedido Avulso Fixa Dois
	Then mensagem sucesso ou erro Avulso Fixa Dois
	
@CenarioSimu2P-B2C
Scenario: Simulador 2P - Portal Assine
	Given abre uma nova pagina do navegador
	And acessa pagina de simulador 2P
	And seleciona opcao de simulador 2P
	When na modal de consulta cobertura dados do Cliente simulador 2P
	And na modal de Identifica clica em Consultar simulador 2P
	And seleciona botao comprar simulador 2P
	And seleciona banda larga simulador 2P
	And seleciona Telefonia Fixa simulador 2P
	When cliente complete o pedido - simulador 2P
	And cliente clica em Proximo Passo - simulador 2P
	And na tela Endereco Instalacao clica Proximo Passo simulador 2P
	When em Pagamentos informa os dados simulador 2P
	And em Pagamento clica em Finalizar Pedido simulador 2P
	Then na tela mensagem de sucesso ou erro - simulador 2P

#---------------------#
#---------B2B---------#
#---------------------#

@CenarioSimu2P-B2B
Scenario: Simulador 2P - Portal Assine B2B
	Given abre uma nova pagina do navegador
	And acessa pg de simulador 2P B2B
	And seleciona opcao simulador 2P B2B
	When modal consulta dados do Cliente simulador 2P B2B
	And modal Identifica clica em Consultar simulador 2P B2B
	And seleciona botao compra simulador 2P B2B
	And seleciona card banda larga simulador 2P B2B
	And seleciona card Telefonia Fixa simulador 2P B2B
	When cliente informa dados pedido simulador 2P B2B
	And cliente seleciona Proximo Passo simulador 2P B2B
	And tela Endereco Instalacao seleciona Proximo Passo simulador 2P B2B
	When informa os dados de pagamentos simulador 2P B2B
	And em Pagamento clica em Finalizar Pedido simulador 2P
	Then valida retorno de mensagem de sucesso ou erro simulador 2P B2B
	
@CenarioCombo3P-B2B
Scenario: Combo 3P - Portal Assine B2B
	Given abre uma nova pagina do navegador
	And acessa pg de combo 3P B2B
	And seleciona card combo 3P B2B
	When modal informa os dados do Cliente B2B
	And modal de Identificacao combo clica Consulta B2B
	When informa dados do cliente complete o pedido B2B
	And tela dados do cliente clica em Proximo Passo B2B
	And tela Endereco de Instalacao clica em Proximo Passo B2B
	When pagina de Pagamentos informa os dados B2B
	And pagina de Pagamento clica em Finalizar Pedido B2B
	Then pagina exibida mensagem de sucesso ou erro B2B
	
@CenarioSimu2PSP-B2B
Scenario: Combo 2P SP - Portal Assine B2B
	Given abre uma nova pagina do navegador
	And acessa pg simulador 2P B2B SP
	And seleciona simulador 2P B2B SP
	When modal consulta dados Cliente simu 2P B2B SP
	And modal Identifica clica em Consultar simu 2P B2B SP
	And seleciona botao compra simu 2P B2B SP
	And seleciona card banda larga simu 2P B2B SP
	And seleciona card Telefonia Fixa simu 2P B2B SP
	When cliente informa dados pedido simu 2P B2B SP
	And cliente seleciona proximo Passo simu 2P B2B SP
	And tela endereco seleciona proximo passo simu 2P B2B SP
	When informa dados pagamentos simu 2P B2B SP
	And seleciona finalizar pedido simu 2P B2B SP
	Then valida retorno mensagem sucesso ou erro simu 2P B2B SP

@CenarioCombo3PSP-B2B
Scenario: Combo 3P SP- Portal Assine B2B
	Given abre uma nova pagina do navegador
	And acessa pg combo 3P B2B SP
	And assine card combo 3P B2B SP
	When modal informa dados Cliente 3P B2B SP
	And modal identificacao clica em Consultar 3P B2B SP
	When informa dados cliente checkout 3P B2B SP
	And tela dados cliente clica proximo passo 3P B2B SP
	And tela endereco instalacao seleciona Proximo Passo 3P B2B SP
	When pg pagamentos informa dados 3P B2B SP
	And pg pagamento clica Finalizar Pedido 3P B2B SP
	Then pg exibida mensagem sucesso ou erro 3P B2B SP