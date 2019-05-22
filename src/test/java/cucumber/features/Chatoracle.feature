#Author: jonathan.sobrinho@zero-defect.com.br
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Testes de cenários de Chat Oracle portal assine B2C e B2B.
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
Feature: Execucao dos cenarios de Chat Oracle

#---------------------#
#---------B2C---------#
#---------------------#

@Cenario-G1-B2C
Scenario: Chat Oracle - G1_FSP_3P_15_vdsl
	Given abre pg do navegador home chat
	And acessa pg de home Chat G1
	And seleciona opcao Compre pelo chat G1
	And na modal informa btao chat Oracle G1
	When na modal chat informa Cep e numero G1
	And modal informa dados de acesso ao chat G1
	Then realiza acesso chat oracle G1
	
@Cenario-G2-B2C
Scenario: Precos Cards de Combo - G2_FSP_3P_50_vdsl
	Given abre pg do navegador home chat
	And acessa pg de home Chat G2
	And seleciona opcao Compre pelo chat G2
	And na modal informa btao chat Oracle G2
	When na modal chat informa Cep e numero G2
	And modal informa dados de acesso ao chat G2
	Then realiza acesso chat oracle G2
	
@Cenario-G3-B2C
Scenario: Precos Cards de Combo - G3_FSP_50_GPON
	Given abre pg do navegador home chat
	And acessa pg home Chat G3
	And seleciona op Compre pelo chat G3
	And na modal informa btao chat Oracle G3
	When na modal chat informa Cep e numero G3
	And modal informa dados de acesso ao chat G3
	Then realiza acesso chat oracle G3

@Cenario-G4-B2C
Scenario: Precos Cards de Combo - G4_FSP_2P_15_vdsl
	Given abre pg do navegador home chat
	And acessa pg home Chat G4
	And seleciona op Compre pelo chat G4
	And na modal informa btao chat Oracle G4
	When na modal chat informa Cep e numero G4
	And modal informa dados de acesso ao chat G4
	Then realiza acesso chat oracle G4
	
@Cenario-G5-B2C
Scenario: Precos Cards de Combo - G5_FSP_3P_50_vdsl_plus
	Given abre pg do navegador home chat
	And acessa pg home Chat G5
	And seleciona op Compre pelo chat G5
	And na modal informa btao chat Oracle G5
	When na modal chat informa Cep e numero G5
	And modal informa dados de acesso ao chat G5
	Then realiza acesso chat oracle G5
	
@Cenario-G6-B2C
Scenario: Precos Cards de Combo - G6_SP_3P_100_gpon
	Given abre pg do navegador home chat
	And acessa pg home Chat G6
	And seleciona op Compre pelo chat G6
	And na modal informa btao chat Oracle G6
	When na modal chat informa Cep e numero G6
	And modal informa dados de acesso ao chat G6
	Then realiza acesso chat oracle G6
	
@Cenario-G7-B2C
Scenario: Precos Cards de Combo - G7_SP_3P_50_vdsl
	Given abre pg do navegador home chat
	And acessa pg home Chat G7
	And seleciona op Compre pelo chat G7
	And na modal informa btao chat Oracle G7
	When na modal chat informa Cep e numero G7
	And modal informa dados de acesso ao chat G7
	Then realiza acesso chat oracle G7
	
@Cenario-G9-B2C
Scenario: Precos Cards de Combo - G9_FSP_3P_gpon_lancamento
	Given abre pg do navegador home chat
	And acessa pg home Chat G9
	And seleciona op Compre pelo chat G9
	And na modal informa btao chat Oracle G9
	When na modal chat informa Cep e numero G9
	And modal informa dados de acesso ao chat G9
	Then realiza acesso chat oracle G9
	
@Cenario-G10-B2C
Scenario: Precos Cards de Combo - G10_FSP_3P_100_GPON
	Given abre pg do navegador home chat
	And acessa pg home Chat G10
	And seleciona op Compre pelo chat G10
	And modal informa btao chat Oracle G10
	When modal chat informa Cep e numero G10
	And modal informa dados de acesso chat G10
	Then realiza acesso no chat oracle G10
	
@Cenario-OFFNET-B2C
Scenario: Precos Cards de Combo - OFFNET-B2C
	Given abre pg do navegador home chat
	And acessa pg home Chat OFFNET
	And seleciona op Compre pelo chat OFFNET
	And modal informa btao chat Oracle OFFNET
	When modal chat informa Cep e numero OFFNET
	And modal informa dados de acesso chat OFFNET
	Then realiza acesso no chat oracle OFFNET
	
@Cenario-MassivoSP-B2C
Scenario: Precos Cards de Combo - Massivo SP-B2C
	Given abre pg do navegador home chat
	And acessa pg home Chat Massivo
	And seleciona op Compre pelo chat Massivo
	And modal informa btao chat Oracle Massivo
	When modal chat informa Cep e numero Massivo
	And modal informa dados acesso chat Massivo
	Then realiza acesso chat oracle Massivo
	
@Cenario-DefautSP-B2C
Scenario: Precos Cards de Combo - Defaut SP-B2C
	Given abre pg do navegador home chat
	And acessa pg home Chat Defaut
	And seleciona op Compre pelo chat Defaut
	And modal informa btao chat Oracle Defaut
	When modal chat informa Cep e numero Defaut
	And modal informa dados acesso chat Defaut
	Then realiza acesso chat oracle Defaut
	
#---------------------#
#---------B2B---------#
#---------------------#
	
@Cenario-OnnetPadrao-B2B
Scenario: Precos Cards de Combo - Onnet_padrao
	Given abre pg do navegador home chat
	And acessa pg home Chat Massivo
	And seleciona op Compre pelo chat Massivo
	And modal informa btao chat Oracle Massivo
	When modal chat informa Cep e numero Massivo
	Then realiza acesso chat oracle Defaut
	
@Cenario-OnnetSemTV-B2B
Scenario: Precos Cards de Combo - Onnet_sem_tv
	Given abre pg do navegador home chat
	And acessa pg home Chat Sem tv
	And seleciona op Compre pelo chat Sem tv
	And modal informa btao chat Oracle Sem tv
	When modal chat informa Cep e numero Sem tv
	Then realiza acesso chat oracle Sem tv
	
@Cenario-OnnetPlus-B2B
Scenario: Precos Cards de Combo - Onnet_plus
	Given abre pg do navegador home chat
	And acessa pg combo Onnet_plus
	Then valida preco cards de combos Onnet_plus
	
@Cenario-G7-B2B
Scenario: Precos Cards de Combo - G7_SP_3P_50_vdsl - B2B
	Given abre pg do navegador home chat
	And acessa pg combo G7_SP_B2B
	Then valida preco cards de combos G7_SP_B2B
	
@Cenario-G9-B2B
Scenario: Precos Cards de Combo - G9_FSP_3P_gpon_lançamento - B2B
	Given abre pg do navegador home chat
	And acessa pg combo G9_FSP_B2B
	Then valida preco cards de combos G9_FSP_B2B

@Cenario-Default-SP-Soft-B2B
Scenario: Precos Cards de Combo - Default-SP-Soft-B2B
	Given abre pg do navegador home chat
	And acessa pg combo Default SP B2B
	Then valida preco cards combos Default SP B2B
	
@Cenario-OFFNET-B2B
Scenario: Precos Cards de Combo - Offnet_B2B
	Given abre pg do navegador home chat
	And acessa pg combos Offnet B2B
	Then valida preco cards combos Offnet B2B