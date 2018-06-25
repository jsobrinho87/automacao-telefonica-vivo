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