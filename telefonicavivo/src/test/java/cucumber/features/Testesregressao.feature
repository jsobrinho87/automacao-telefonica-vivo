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

Scenario: Apresenta paginas - Testes Regressivos
	Given abre uma nova pagina do navegador
	And acessa pg cb 3P regressao
	Given abre uma nova pagina do navegador
	And acessa pg cb 2P regressao
	Given abre uma nova pagina do navegador
	And acessa pg Banda Larga regressao
	Given abre uma nova pagina do navegador
	And acessa pg Fixa regressao
	Given abre uma nova pagina do navegador
	And acessa pg TV regressao
	Given abre uma nova pagina do navegador
	And acessa pg Simulador 3P regressao
	Given abre uma nova pagina do navegador
	And acessa pg fixa dois regressao
	Given abre uma nova pagina do navegador
	And acessa pg Simulador 2P regressao

##Cenário 01	
#Scenario: Combo 3P - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de combo 3P
#	And seleciona opcao de combo 3P
#	When na modal de consulta cobertura informa os dados do Cliente
#	And na modal de Identificacao clica em Receber Ligacao
#	And na modal de Identificacao clica em Adicionar
#	When na tela dados do cliente complete o pedido
#	And na tela dados do cliente clica em Proximo Passo
#	And na tela Endereco de Instalacao clica em Proximo Passo
#	When na tela de Pagamentos informa os dados
#	And na tela de Pagamento clica em Finalizar Pedido
#	Then na tela sera exibida mensagem de sucesso ou erro
#
##Cenário 02
#Scenario: Combo 2P - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de combo 2P
#	And seleciona opcao de combo 2P
#	When na modal de consulta cobertura dados do Cliente - combo 2P
#	And na modal de Identifica clica em Receber Ligacao - combo 2P
#	When cliente complete o pedido - combo 2P
#	And cliente clica em Proximo Passo - combo 2P
#	And na tela Endereco Instalacao clica Proximo Passo - combo 2P
#	When em Pagamentos informa os dados combo 2P
#	And em Pagamento clica em Finalizar Pedido combo 2P
#	Then na tela mensagem de sucesso ou erro - combo 2P
#		
##Cenário 03
#Scenario: Banda Larga Avulsa - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de Avulso BL
#	And seleciona opcao de Avulso BL
#	When na modal de consulta cobertura dados do Cliente - Avulso BL
#	And na modal de Identifica clica em Receber Ligacao - Avulso BL
#	And seleciona botao comprar internet avulsa BL
#	When cliente complete o pedido - Avulso BL
#	And cliente clica em Proximo Passo - Avulso BL
#	And na tela Endereco Instalacao clica Proximo Passo - Avulso BL
#	When em Pagamentos informa os dados Avulso BL
#	And em Pagamento clica em Finalizar Pedido Avulso BL
#	Then na tela mensagem de sucesso ou erro - Avulso BL
#	
##Cenário 04
#Scenario: Telefonia Avulsa Fixa - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de Avulso Fixa
#	And seleciona opcao de Avulso Fixa
#	When na modal de consulta cobertura dados do Cliente - Avulso Fixa
#	And na modal de Identifica clica em Receber Ligacao - Avulso Fixa
#	And seleciona botao comprar internet avulsa Fixa
#	When cliente complete o pedido - Avulso Fixa
#	And cliente clica em Proximo Passo - Avulso Fixa
#	And na tela Endereco Instalacao clica Proximo Passo - Avulso Fixa
#	When em Pagamentos informa os dados Avulso Fixa
#	And em Pagamento clica em Finalizar Pedido Avulso Fixa
#	Then na tela mensagem de sucesso ou erro - Avulso Fixa
#
##Cenário 05	
#Scenario: TV por Assinatura Avulsa - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de Avulso TV
#	And seleciona opcao de Avulso TV
#	When na modal de consulta cobertura dados do Cliente - Avulso TV
#	And na modal de Identifica clica em Receber Ligacao - Avulso TV
#	And seleciona botao comprar internet avulsa TV
#	When cliente complete o pedido - Avulso TV
#	And cliente clica em Proximo Passo - Avulso TV
#	And na tela Endereco Instalacao clica Proximo Passo - Avulso TV
#	When em Pagamentos informa os dados Avulso TV
#	And em Pagamento clica em Finalizar Pedido Avulso TV
#	Then na tela mensagem de sucesso ou erro - Avulso TV
#
##Cenário 06	
#Scenario: Simulador 3P - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de simulador 3P
#	And seleciona opcao de simulador 3P
#	When na modal de consulta cobertura dados do Cliente simulador 3P
#	And na modal de Identifica clica em Consultar simulador 3P
#	And seleciona botao comprar simulador 3P
#	And seleciona banda larga simulador 3P
#	And seleciona TV por Assinatura simulador 3P
#	And seleciona Telefonia simulador 3P
#	When cliente complete o pedido - simulador 3P
#	And cliente clica em Proximo Passo - simulador 3P
#	And na tela Endereco Instalacao clica Proximo Passo simulador 3P
#	When em Pagamentos informa os dados simulador 3P
#	And em Pagamento clica em Finalizar Pedido simulador 3P
#	Then na tela mensagem de sucesso ou erro - simulador 3P
#
##Cenário 07	
#Scenario: Telefonia Fixa Avulsa Dois - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pg de Avulso Fixa Dois
#	And informar op de Avulso Fixa Dois
#	When modal consulta cobertura dados do Avulso Fixa Dois
#	And modal Identifica clica em consultar Avulso Fixa Dois
#	And botao comprar internet avulsa Fixa Dois
#	When completando pedido checkout Avulso Fixa Dois
#	And seleciona Proximo Passo Avulso Fixa Dois
#	And endereco Instalacao clica Proximo Passo Avulso Fixa Dois
#	When pagamentos informa dados Avulso Fixa Dois
#	And pagamento clica Finalizar Pedido Avulso Fixa Dois
#	Then mensagem sucesso ou erro Avulso Fixa Dois
#	
##Cenário 08	
#Scenario: Simulador 2P - Portal Assine
#	Given abre uma nova pagina do navegador
#	And acessa pagina de simulador 2P
#	And seleciona opcao de simulador 2P
#	When na modal de consulta cobertura dados do Cliente simulador 2P
#	And na modal de Identifica clica em Consultar simulador 2P
#	And seleciona botao comprar simulador 2P
#	And seleciona banda larga simulador 2P
#	And seleciona Telefonia Fixa simulador 2P
#	When cliente complete o pedido - simulador 2P
#	And cliente clica em Proximo Passo - simulador 2P
#	And na tela Endereco Instalacao clica Proximo Passo simulador 2P
#	When em Pagamentos informa os dados simulador 2P
#	And em Pagamento clica em Finalizar Pedido simulador 2P
#	Then na tela mensagem de sucesso ou erro - simulador 2P
#
##---------------------#
##---------B2B---------#
##---------------------#
#
#Scenario: Apresenta paginas - Testes Regressivos B2B
#	Given abre uma nova pagina do navegador
#	And acessa pg simu 2P regressao B2B
#	Given abre uma nova pagina do navegador
#	And acessa pg simu 2P regressao B2B
#
##Cenário 09	
#Scenario: Simulador 2P - Portal Assine B2B
#	Given abre uma nova pagina do navegador
#	And acessa pg de simulador 2P B2B
#	And seleciona opcao simulador 2P B2B
#	When modal de consulta dados do Cliente simulador 2P B2B
#	And modal Identifica clica em Consultar simulador 2P B2B
#	And seleciona botao compra simulador 2P B2B
#	And seleciona card banda larga simulador 2P B2B
#	And seleciona card Telefonia Fixa simulador 2P B2B
#	When cliente informa dados pedido simulador 2P B2B
#	And cliente seleciona Proximo Passo simulador 2P B2B
#	And tela Endereco Instalacao seleciona Proximo Passo simulador 2P B2B
#	When informa os dados de pagamentos simulador 2P B2B
#	And em Pagamento clica em Finalizar Pedido simulador 2P
#	Then valida retorno de mensagem de sucesso ou erro simulador 2P B2B
#	
##Cenário 10	
#Scenario: Combo 3P - Portal Assine B2B
#	Given abre uma nova pagina do navegador
#	And acessa pg de combo 3P B2B
#	And seleciona card combo 3P B2B
#	When modal informa os dados do Cliente B2B
#	And modal de Identificacao clica em Consulta B2B
#	When informa dados do cliente complete o pedido B2B
#	And tela dados do cliente clica em Proximo Passo B2B
#	And tela Endereco de Instalacao clica em Proximo Passo B2B
#	When pagina de Pagamentos informa os dados B2B
#	And pagina de Pagamento clica em Finalizar Pedido B2B
#	Then pagina exibida mensagem de sucesso ou erro B2B