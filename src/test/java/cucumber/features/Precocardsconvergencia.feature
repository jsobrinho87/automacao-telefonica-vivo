#Author: jonathan.sobrinho@zero-defect.com.br
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Testes de Preços Cards de Convergncia portal assine B2C e B2B.
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
Feature: Execucao dos testes de precos dos Cards de Convergencia

#---------------------#
#---------B2C---------#
#---------------------#

@Cenario-G1-B2C
Scenario: Precos Cards de Convergencia - G1_FSP_3P_15_vdsl
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G1
	Then valida preco dos cards de convergencia G1
	
@Cenario-G2-B2C
Scenario: Precos Cards de Convergencia - G2_FSP_3P_50_vdsl
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G2
	Then valida preco dos cards de convergencia G2
	
@Cenario-G3-B2C
Scenario: Precos Cards de Convergencia - G3_FSP_50_GPON
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G3
	Then valida preco dos cards de convergencia G3
	
@Cenario-G4-B2C
Scenario: Precos Cards de Convergencia - G4_FSP_2P_15_vdsl
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G4
	Then valida preco dos cards de convergencia G4
	
@Cenario-G5-B2C
Scenario: Precos Cards de Convergencia - G5_FSP_3P_50_vdsl_plus
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G5
	Then valida preco dos cards de convergencia G5
	
@Cenario-G6-B2C
Scenario: Precos Cards de Convergencia - G6_SP_3P_100_gpon
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G6
	Then valida preco dos cards de convergencia G6
	
@Cenario-G7-B2C
Scenario: Precos Cards de Convergencia - G7_SP_3P_50_vdsl
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G7
	Then valida preco dos cards de convergencia G7
	
@Cenario-G9-B2C
Scenario: Precos Cards de Convergencia - G9_FSP_3P_gpon_lançamento
	Given abre navegador preco card convergencia
	And acessa pg de convergencia G9
	Then valida preco dos cards de convergencia G9
	
@Cenario-G10-B2C
Scenario: Precos Cards de Convergencia - G10_FSP_3P_100_GPON
	Given abre navegador preco card convergencia
	And acessa pg convergencia G10
	Then valida precos cards de convergencia G10
	
@Cenario-MassivoSP-B2C
Scenario: Precos Cards de Convergencia - Massivo SP
	Given abre navegador preco card convergencia
	And acessa pg convergencia Massivo SP
	Then valida precos cards de convergencia Massivo SP
	
@Cenario-DefautSP-B2C
Scenario: Precos Cards de Convergencia - Massivo SP
	Given abre navegador preco card convergencia
	And acessa pg convergencia Defaut SP
	Then valida precos cards de convergencia Defaut SP