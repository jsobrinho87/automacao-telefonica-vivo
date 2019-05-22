#Author: jonathan.sobrinho@zero-defect.com.br
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Testes de consulta cobertura portal assine B2C e B2B.
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
Feature: Consulta cobertura

#---------------------#
#---------B2C---------#
#---------------------#

@Cenario-G1-B2C
Scenario: G1_FSP_3P_15_vdsl
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G1
	And seleciona opcao de combo G1
	When na modal de consulta cobertura G1
	And seleciona botao consultar G1
	Then valida retorno de sucesso ou erro G1

@Cenario-G2-B2C	
Scenario: G2_FSP_3P_50_vdsl
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G2
	And seleciona opcao de combo G2
	When na modal de consulta cobertura G2
	And seleciona botao consultar G2
	Then valida retorno de sucesso ou erro G2
	
@Cenario-G3-B2C
Scenario: G3_FSP_50_GPON
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G3
	And seleciona opcao de combo G3
	When na modal de consulta cobertura G3
	And seleciona botao consultar G3
	Then valida retorno de sucesso ou erro G3
	
@Cenario-G4-B2C
Scenario: G4_FSP_2P_15_vdsl
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G4
	And seleciona opcao de combo G4
	When na modal de consulta cobertura G4
	And seleciona botao consultar G4
	Then valida retorno de sucesso ou erro G4
	
@Cenario-G5-B2C
Scenario: G5_FSP_3P_50_vdsl_plus
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G5
	And seleciona opcao de combo G5
	When na modal de consulta cobertura G5
	And seleciona botao consultar G5
	Then valida retorno de sucesso ou erro G5
	
@Cenario-G6-B2C
Scenario: G6_SP_3P_100_gpon
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G6
	And seleciona opcao de combo G6
	When na modal de consulta cobertura G6
	And seleciona botao consultar G6
	Then valida retorno de sucesso ou erro G6
	
@Cenario-G7-B2C
Scenario: G7_SP_3P_50_vdsl
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G7
	And seleciona opcao de combo G7
	When na modal de consulta cobertura G7
	And seleciona botao consultar G7
	Then valida retorno de sucesso ou erro G7
	
@Cenario-G9-B2C
Scenario: G9_FSP_3P_gpon_lancamento
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G9
	And seleciona opcao de combo G9
	When na modal de consulta cobertura G9
	And seleciona botao consultar G9
	Then valida retorno de sucesso ou erro G9

@Cenario-G10-B2C
Scenario: G10_FSP_3P_100_GPON
	Given abre pg do navegador cobertura
	And acessa pg grupo G10
	And seleciona opcao combo G10
	When na modal consulta cobertura G10
	And seleciona botao consulta G10
	Then valida retorno sucesso ou erro G10

@Cenario-OFFNET-B2C
Scenario: OFFNET B2C
	Given abre pg do navegador cobertura
	And acessa pg grupo OFFNET 
	And seleciona opcao combo OFFNET
	When na modal consulta cobertura OFFNET
	And seleciona botao consulta OFFNET
	Then valida retorno sucesso ou erro OFFNET
	
@Cenario-MassivoSP-B2C
Scenario: Massivo SP B2C
	Given abre pg do navegador cobertura
	And acessa pg de cobertura Massivo
	And seleciona opcao de combo Massivo
	When na modal de consulta cobertura Massivo
	And seleciona botao consultar Massivo
	Then valida retorno de sucesso ou erro Massivo
	
@Cenario-DefautSP-B2C
Scenario: Defaut SP B2C
	Given abre pg do navegador cobertura
	And acessa pg de cobertura Defaut
	And seleciona opcao de combo Defaut
	When na modal de consulta cobertura Defaut
	And seleciona botao consultar Defaut
	Then valida retorno de sucesso ou erro Defaut
	
@Cenario-OnnetPadrao-B2B
Scenario: Onnet Padrao
	Given abre pg do navegador cobertura
	And acessa pg de cobertura Onnet
	And seleciona opcao de combo Onnet
	When na modal de consulta cobertura Onnet
	And seleciona botao consultar Onnet
	Then valida retorno de sucesso ou erro Onnet
	
@Cenario-OnnetSemTV-B2B
Scenario: Onnet Sem TV
	Given abre pg do navegador cobertura
	And acessa pg de cobertura Sem TV
	And seleciona opcao de combo Sem TV
	When na modal de consulta cobertura Sem TV
	And seleciona botao consultar Sem TV
	Then valida retorno de sucesso ou erro Sem TV
	
@Cenario-OnnetPlus-B2B
Scenario: Onnet Plus
	Given abre pg do navegador cobertura
	And acessa pg de cobertura Plus
	And seleciona opcao de combo Plus
	When na modal de consulta cobertura Plus
	And seleciona botao consultar Plus
	Then valida retorno de sucesso ou erro Plus
	
@Cenario-G7-B2B
Scenario: G7_SP_3P_50_vdsl B2B
	Given abre pg do navegador cobertura
	And acessa pg do grupo G7 B2B
	And seleciona opcao barra G7 B2B
	When valida de consulta cobertura G7 B2B
	And valida botao consultar G7 B2B
	Then valida retorno sucesso ou erro G7 B2B
	
@Cenario-G9-B2B
Scenario: G9_FSP_3P_gpon_lancamento B2B
	Given abre pg do navegador cobertura
	And acessa pg de G9 B2B
	And seleciona opcao de G9 B2B
	When valida consulta cobertura G9 B2B
	And preciona botao consultar G9 B2B
	Then valida retorno sucesso ou erro G9 B2B
	
@Cenario-OFFNET-B2B
Scenario: Offnet B2B
	Given abre pg do navegador cobertura
	And acessa pg de Offnet B2B
	And seleciona opcao de Offnet B2B
	When valida consulta cobertura Offnet B2B
	And preciona botao consultar Offnet B2B
	Then valida retorno sucesso ou erro Offnet B2B
	
@Cenario-Default-SP-Soft-B2B
Scenario: Default SP B2B
	Given abre pg do navegador cobertura
	And acessa pg do grupo Default SP B2B
	And seleciona opcao barra Default SP B2B
	When valida de consulta cobertura Default SP B2B
	And valida botao consultar Default SP B2B
	Then valida retorno sucesso ou erro Default SP B2B