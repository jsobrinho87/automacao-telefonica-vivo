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
Feature: Execucao dos testes de precos dos cards de combo

#---------------------#
#---------B2C---------#
#---------------------#

@Cenario-G1-B2C
Scenario: Precos Cards de Combo - G1_FSP_3P_15_vdsl
	Given abre pg do navegador preco card combo
	And acessa pg de combo G1
	Then valida preco dos cards de combos G1
	
@Cenario-G2-B2C
Scenario: Precos Cards de Combo - G2_FSP_3P_50_vdsl
	Given abre pg do navegador preco card combo
	And acessa pg de combo G2
	Then valida preco dos cards de combos G2
	
@Cenario-G3-B2C
Scenario: Precos Cards de Combo - G3_FSP_50_GPON
	Given abre pg do navegador preco card combo
	And acessa pg de combo G3
	Then valida preco dos cards de combos G3

@Cenario-G4-B2C
Scenario: Precos Cards de Combo - G4_FSP_2P_15_vdsl
	Given abre pg do navegador preco card combo
	And acessa pg de combo G4
	Then valida preco dos cards de combos G4	
	
@Cenario-G5-B2C
Scenario: Precos Cards de Combo - G5_FSP_3P_50_vdsl_plus
	Given abre pg do navegador preco card combo
	And acessa pg de combo G5
	Then valida preco dos cards de combos G5
	
@Cenario-G6-B2C
Scenario: Precos Cards de Combo - G6_SP_3P_100_gpon
	Given abre pg do navegador preco card combo
	And acessa pg de combo G6
	Then valida preco dos cards de combos G6
	
@Cenario-G7-B2C
Scenario: Precos Cards de Combo - G7_SP_3P_50_vdsl
	Given abre pg do navegador preco card combo
	And acessa pg de G7
	And informa menu combo G7
	When na modal de consulta G7
	And informa botao consultar G7
	Then valida preco dos cards de combos G7
	
@Cenario-G9-B2C
Scenario: Precos Cards de Combo - G9_FSP_3P_gpon_lancamento
	Given abre pg do navegador preco card combo
	And acessa pg de combo G9
	Then valida preco dos cards de combos G9
	
@Cenario-G10-B2C
Scenario: Precos Cards de Combo - G10_FSP_3P_100_GPON
	Given abre pg do navegador preco card combo
	And acessa pg combo G10
	Then valida preco cards de combos G10
	
@Cenario-OFFNET-B2C
Scenario: Precos Cards de Combo - OFFNET-B2C
	Given abre pg do navegador preco card combo
	And acessa pg combo Offnet
	Then valida preco cards de combos Offnet
	
@Cenario-MassivoSP-B2C
Scenario: Precos Cards de Combo - Massivo SP-B2C
	Given abre pg do navegador preco card combo
	And acessa pg de Massivo SP
	And informa menu combo Massivo SP
	When na modal de consulta Massivo SP
	And informa botao consultar Massivo SP
	Then valida preco dos cards de combos Massivo SP
	
@Cenario-DefautSP-B2C
Scenario: Precos Cards de Combo - Defaut SP-B2C
	Given abre pg do navegador preco card combo
	And acessa pg de Defaut SP
	And informa menu combo Defaut SP
	When na modal de consulta Defaut SP
	And informa botao consultar Defaut SP
	Then valida preco dos cards de combos Defaut SP
	
@Cenario-OnnetPadrao-B2B
Scenario: Precos Cards de Combo - Onnet_padrao
	Given abre pg do navegador preco card combo
	And acessa pg combo Onnet_padrao
	Then valida preco cards de combos Onnet_padrao
	
@Cenario-OnnetSemTV-B2B
Scenario: Precos Cards de Combo - Onnet_sem_tv
	Given abre pg do navegador preco card combo
	And acessa pg combo Onnet_sem_tv
	Then valida preco cards de combos Onnet_sem_tv
	
@Cenario-OnnetPlus-B2B
Scenario: Precos Cards de Combo - Onnet_plus
	Given abre pg do navegador preco card combo
	And acessa pg combo Onnet_plus
	Then valida preco cards de combos Onnet_plus
	
@Cenario-G7-B2B
Scenario: Precos Cards de Combo - G7_SP_3P_50_vdsl - B2B
	Given abre pg do navegador preco card combo
	And acessa pg combo G7_SP_B2B
	Then valida preco cards de combos G7_SP_B2B
	
@Cenario-G9-B2B
Scenario: Precos Cards de Combo - G9_FSP_3P_gpon_lançamento - B2B
	Given abre pg do navegador preco card combo
	And acessa pg combo G9_FSP_B2B
	Then valida preco cards de combos G9_FSP_B2B

@Cenario-Default-SP-Soft-B2B
Scenario: Precos Cards de Combo - Default-SP-Soft-B2B
	Given abre pg do navegador preco card combo
	And acessa pg combo Default SP B2B
	Then valida preco cards combos Default SP B2B
	
@Cenario-OFFNET-B2B
Scenario: Precos Cards de Combo - Offnet_B2B
	Given abre pg do navegador preco card combo
	And acessa pg combos Offnet B2B
	Then valida preco cards combos Offnet B2B