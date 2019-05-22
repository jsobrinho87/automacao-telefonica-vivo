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
Feature: Execucao dos cenarios de testes diarios assine vivo

@CenarioC2CR-01
Scenario: Valida C2CR FSP - Testes Diarios
	Given abre pg do navegador TD
	And acessa pagina teste C2RC FSP
	And valida botao C2RC FSP
	When modal de consulta cobertura C2RC FSP
	And clica em Receber Ligacao C2RC FSP
	Then retorno da msg da pag C2RC FSP

@CenarioCombo-3P
Scenario: Combo 3P - Testes Diarios
	Given abre pg do navegador TD
	And acessa pagina combo 3P TD
	And informa opcao de combo 3P TD
	When modal de consulta cobertura informa os dados TD
	And modal de Identificacao clica em Receber Ligacao TD
	And modal de Identificacao clica em Adicionar TD
	When tela dados do cliente complete o pedido TD
	And dados do cliente clica em Proximo Passo TD
	And tela Endereco de Instalacao clica em Proximo Passo TD
	When tela de Pagamentos informa os dados TD
	And tela de Pagamento clica em Finalizar Pedido TD
	Then tela exibi mensagem de sucesso ou erro TD

@CenarioBL-Avulsa
Scenario: Banda Larga Avulsa - Testes Diarios
	Given abre pg do navegador TD
	And acessa pg de Avulso BL TD
	And informa opcao de Avulso BL TD
	When modal de consulta cobertura dados do Cliente Avulso BL TD
#	And modal de Identifica clica Receber Ligacao Avulso BL TD
#	And informa botao comprar internet avulsa BL TD
	When completa o pedido Avulso BL TD
	And clica em Proximo Passo Avulso BL TD
	And tela Endereco Instalacao clica Proximo Passo Avulso BL TD
	When pagamentos informa os dados Avulso BL TD
	And pagamento clica em Finalizar Pedido Avulso BL TD
	Then mensagem de sucesso ou erro Avulso BL TD

@CenarioFixa-Avulsa
Scenario: Telefonia Avulsa - Testes Diarios
	Given abre pg do navegador TD
	And acessa pg de Avulso Fixa TD
	And informa opcao de Avulso Fixa TD
	When modal de consulta cobertura dados do Cliente Avulso Fixa TD
	And modal de Identifica clica em Receber Ligacao Avulso Fixa TD
	And informa botao comprar internet avulsa Fixa TD
	When completa o pedido Avulso Fixa TD
	And clica em Proximo Passo Avulso Fixa TD
	And tela Endereco Instalacao clica Proximo Passo Avulso Fixa TD
	When pagamentos informa os dados Avulso Fixa TD
	And pagamento clica em Finalizar Pedido Avulso Fixa TD
	Then mensagem de sucesso ou erro Avulso Fixa TD
	
@CenarioTV-Avulsa
Scenario: TV por Assinatura Avulsa - Testes Diarios
	Given abre pg do navegador TD
	And acessa pg de Avulso TV TD
	And acessa opcao de Avulso TV TD
	When modal de consulta cobertura dados do Cliente Avulso TV TD
	And modal de Identifica clica em Receber Ligacao Avulso TV TD
	And informa botao comprar internet avulsa TV TD
	When completa o pedido Avulso TV TD
	And clica em Proximo Passo Avulso TV TD
	And tela Endereco Instalacao clica Proximo Passo Avulso TV TD
	When pagamentos informa os dados Avulso TV TD
	And pagamento clica em Finalizar Pedido Avulso TV TD
	Then mensagem de sucesso ou erro Avulso TV TD

@CenarioSimulador-3P
Scenario: Simulador 3P - Testes Diarios
	Given abre pg do navegador TD
	And acessa pg simulador 3P TD
	And confirma consulta simulador 3P TD
	When modal de consulta cobertura informa dados simulador 3P TD
	And na modal clica em Consultar simulador 3P TD
	And valida botao simulador 3P TD
	And informa banda larga simulador 3P TD
	And informa TV simulador 3P TD
	And informa adicionais TV simulador 3P TD
	And informa Fixa simulador 3P TD
	And informa Amazon Prime Video simulador 3P TD
	When cliente informa o pedido simulador 3P TD
	And cliente clica Proximo Passo simulador 3P TD
	And tela Endereco Instalacao clica Proximo Passo simulador 3P TP
	When pagamentos informa dados simulador 3P TD
	And pagamento clica Finalizar Pedido simulador 3P TD
	Then mensagem de sucesso ou erro simulador 3P TD

@CenarioLP-BL
Scenario: LP Oferta Banda Larga - Testes Diarios
	Given abre pg do navegador TD
	And acessa pagina LP Oferta BL TD
	And informa botao Assine ja LP Oferta BL TD
	When modal consulta cobertura informa dados LP Oferta BL TD
	And modal clica em Consultar LP Oferta BL TD
	And modal pontos adicionais clica em Adicionar LP Oferta BL TD
	When complete dados do cliente de pedido LP Oferta BL TD
	And clica em Proximo Passo LP Oferta BL TD
	And endereco de Instalacao clica em Proximo Passo LP Oferta BL TD
	When em Pagamentos informa os dados LP Oferta BL TD
	And em Pagamento clica em Finalizar Pedido LP Oferta BL TD
	Then mensagem de sucesso ou erro LP Oferta BL TD
	
@CenarioCom3P-B2B
Scenario: Combo 3P - Portal Assine B2B SP
	Given abre pg do navegador TD
	And acessa cb 3P B2B SP
	And valida card combo 3P B2B SP
	When informa dados Cliente 3P B2B SP
	And identificacao clica em Consultar 3P B2B SP
	When dados cliente checkout 3P B2B SP
	And dados cliente clica proximo passo 3P B2B SP
	And endereco instalacao seleciona Proximo Passo 3P B2B SP
	When pagamentos informa dados 3P B2B SP
	And pagamento clica Finalizar Pedido 3P B2B SP
	Then exibida mensagem sucesso ou erro 3P B2B SP
	
@CenarioSimu2PSP-B2B
Scenario: Simulador 2P SP - Portal Assine B2B
	Given abre pg do navegador TD
	And acessa novo simulador 2P B2B SP
	And teste simulador 2P B2B SP
	When consulta dados Cliente simu 2P B2B SP
	When dados pedido simu 2P B2B SP
	And proximo Passo simu 2P B2B SP
	And proximo passo 2 simu 2P B2B SP
	When dados pagamentos simu 2P B2B SP
	And fecha pedido simu 2P B2B SP
	Then mensagem sucesso ou erro simu 2P B2B SP

@CenarioC2CR-02
Scenario: Valida C2CR FSP - Testes Diarios
	Given abre pg do navegador TD
	And acessa pagina teste C2RC FSP
	And valida botao C2RC FSP
	When modal de consulta cobertura C2RC FSP
	And clica em Receber Ligacao C2RC FSP
	Then retorno da msg da pag C2RC FSP
	
@CenarioConsultaSP-G6
Scenario: Consulta cobertura SP - G6_SP_3P_100_gpon
	Given abre pg do navegador TD
	And acessa pg de cobertura SP G6
	And seleciona opcao de combo SP G6
	When na modal de consulta cobertura SP G6
	And seleciona botao consultar SP G6
	Then valida retorno de sucesso ou erro SP G6
	
@CenarioConsultaSP-Defalt
Scenario: Consulta cobertura - Defaut SP
	Given abre pg do navegador TD
	And acessa pg de cobertura SP Defaut
	And seleciona opcao de combo SP Defaut
	When na modal de consulta cobertura SP Defaut
	And seleciona botao consultar SP Defaut
	Then valida retorno de sucesso ou erro SP Defaut
	
@CenarioChatOracle
Scenario: Acesso Chat Oracle
	Given abre pg do navegador TD
	And acessa pg de home FSP Chat
	And seleciona opcao de Compre pelo chat
	And na modal seleciona chat Oracle
#	When na modal informa Cep e numero chat
#	And seleciona botao consultar Chat
	And modal informa dados para acesso ao chat
	Then valida acesso chat oracle