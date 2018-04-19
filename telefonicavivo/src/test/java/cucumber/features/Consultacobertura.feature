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
Feature: Execucao dos testes de consulta cobertura

#---------------------#
#---------B2C---------#
#---------------------#

#Cenário 01	
Scenario: Consulta cobertura - G1_FSP_3P_15_vdsl
	Given abre pg do navegador cobertura
	And acessa pg de cobertura G1
	And seleciona opcao de combo G1
	When na modal de consulta cobertura G1
	And seleciona botao consultar G1
	Then valida retorno de sucesso ou erro G1

#Cenário 02	
#Scenario: Consulta cobertura - G2_FSP_3P_50_vdsl
#	Given abre pg do navegador cobertura
	And acessa pg de cobertura G2
	And seleciona opcao de combo G2
	When na modal de consulta cobertura G2
	And seleciona botao consultar G2
	Then valida retorno de sucesso ou erro G2
	
##Cenário 03
#Scenario: Consulta cobertura - G3_FSP_50_GPON
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G3
#	And seleciona opcao de combo G3
#	When na modal de consulta cobertura G3
#	And seleciona botao consultar G3
#	Then valida retorno de sucesso ou erro G3
#	
##Cenário 04
#Scenario: Consulta cobertura - G4_FSP_2P_15_vdsl
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G4
#	And seleciona opcao de combo G4
#	When na modal de consulta cobertura G4
#	And seleciona botao consultar G4
#	Then valida retorno de sucesso ou erro G4
#	
##Cenário 05
#Scenario: Consulta cobertura - G5_FSP_3P_50_vdsl_plus
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G5
#	And seleciona opcao de combo G5
#	When na modal de consulta cobertura G5
#	And seleciona botao consultar G5
#	Then valida retorno de sucesso ou erro G5
#	
##Cenário 06
#Scenario: Consulta cobertura - G6_SP_3P_100_gpon
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G6
#	And seleciona opcao de combo G6
#	When na modal de consulta cobertura G6
#	And seleciona botao consultar G6
#	Then valida retorno de sucesso ou erro G6
#	
##Cenário 07
#Scenario: Consulta cobertura - G7_SP_3P_50_vdsl
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G7
#	And seleciona opcao de combo G7
#	When na modal de consulta cobertura G7
#	And seleciona botao consultar G7
#	Then valida retorno de sucesso ou erro G7
#	
##Cenário 08
#Scenario: Consulta cobertura - G9_FSP_3P_gpon_lancamento
#	Given abre pg do navegador cobertura
#	And acessa pg de cobertura G9
#	And seleciona opcao de combo G9
#	When na modal de consulta cobertura G9
#	And seleciona botao consultar G9
#	Then valida retorno de sucesso ou erro G9
#
##Cenário 09
#Scenario: Consulta cobertura - G10_FSP_3P_100_GPON
#	Given abre pg do navegador cobertura
#	And acessa pg grupo G10
#	And seleciona opcao combo G10
#	When na modal consulta cobertura G10
#	And seleciona botao consulta G10
#	Then valida retorno sucesso ou erro G10