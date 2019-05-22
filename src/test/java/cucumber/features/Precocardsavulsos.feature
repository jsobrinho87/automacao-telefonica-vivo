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
Feature: Execucao dos testes de Precos Cards Avulsos

#---------------------#
#---------B2C---------#
#---------------------#

@Cenario-G1-B2C
Scenario: Precos Cards Avulsos - G1_FSP_3P_15_vdsl
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G1
	Then valida preco dos cards de banda larga G1
	And acessa pg de fixa G1
	Then valida preco dos cards de Fixa G1
	And acessa pg de TV G1
	Then valida preco dos cards de TV G1
	
@Cenario-G2-B2C
Scenario: Precos Cards Avulsos - G2_FSP_3P_50_vdsl
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G2
	Then valida preco dos cards de banda larga G2
	And acessa pg de fixa G2
	Then valida preco dos cards de Fixa G2
	And acessa pg de TV G2
	Then valida preco dos cards de TV G2
	
@Cenario-G3-B2C
Scenario: Precos Cards Avulsos - G3_FSP_50_GPON
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G3
	Then valida preco dos cards de banda larga G3
	And acessa pg de fixa G3
	Then valida preco dos cards de Fixa G3
	And acessa pg de TV G3
	Then valida preco dos cards de TV G3
	
@Cenario-G4-B2C
Scenario: Precos Cards Avulsos - G4_FSP_2P_15_vdsl
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G4
	Then valida preco dos cards de banda larga G4
	And acessa pg de fixa G4
	Then valida preco dos cards de Fixa G4
			
@Cenario-G5-B2C
Scenario: Precos Cards Avulsos - G5_FSP_3P_50_vdsl_plus
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G5
	Then valida preco dos cards de banda larga G5
	And acessa pg de fixa G5
	Then valida preco dos cards de Fixa G5
	And acessa pg de TV G5
	Then valida preco dos cards de TV G5
	
@Cenario-G6-B2C
Scenario: Precos Cards Avulsos - G6_SP_3P_100_gpon
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G6
	Then valida preco dos cards de banda larga G6
	And acessa pg de fixa G6
	Then valida preco dos cards de Fixa G6
	And acessa pg de TV G6
	Then valida preco dos cards de TV G6
	
@Cenario-G7-B2C
Scenario: Precos Cards Avulsos - G7_SP_3P_50_vdsl
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G7
	Then valida preco dos cards de banda larga G7
	And acessa pg de fixa G7
	Then valida preco dos cards de Fixa G7
	And acessa pg de TV G7
	Then valida preco dos cards de TV G7
	
@Cenario-G9-B2C
Scenario: Precos Cards Avulsos - G9_FSP_3P_gpon_lanšamento
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga G9
	Then valida preco dos cards de banda larga G9
	And acessa pg de fixa G9
	Then valida preco dos cards de Fixa G9
	And acessa pg de TV G9
	Then valida preco dos cards de TV G9
	
@Cenario-G10-B2C
Scenario: Precos Cards Avulsos - G10_FSP_3P_100_GPON
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL G10
	Then valida preco dos cards de BL G10
	And acessa pg de telefonia G10
	Then valida preco dos cards de telefonia G10
	And acessa pg de TV Assinatura G10
	Then valida preco dos cards de TV Assinatura G10
	
@Cenario-OFFNET-B2C
Scenario: Precos Cards Avulsos - OFFNET-B2C
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL OFFNET
	Then valida preco dos cards de BL OFFNET
	And acessa pg de telefonia OFFNET
	Then valida preco dos cards de Fixa OFFNET
	
@Cenario-MassivoSP-B2C
Scenario: Precos Cards Avulsos - MassivoSP-B2C
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga Massivo SP
	Then valida preco dos cards de banda larga Massivo SP
	And acessa pg de fixa Massivo SP
	Then valida preco dos cards de Fixa Massivo SP
	And acessa pg de TV Massivo SP
	Then valida preco dos cards de TV Massivo SP
	
@Cenario-DefautSP-B2C
Scenario: Precos Cards Avulsos - DefautSP-B2C
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL Defaut SP
	Then valida preco dos cards de BL Defaut SP
	And acessa pg de fixa Defaut SP
	Then valida preco dos cards de Fixa Defaut SP
	And acessa pg de TV Defaut SP
	Then valida preco dos cards de TV Defaut SP
	
@Cenario-OnnetPadrao-B2B
Scenario: Precos Cards Avulsos - OnnetPadrao-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga Onnet_padrao
	Then valida preco dos cards de banda larga Onnet_padrao
	And acessa pg de fixa Onnet_padrao
	Then valida preco dos cards de Fixa Onnet_padrao
	And acessa pg de TV Onnet_padrao
	Then valida preco dos cards de Onnet_padrao

@Cenario-OnnetSemTV-B2B
Scenario: Precos Cards Avulsos - OnnetSemTV-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga Onnet_sem_tv
	Then valida preco dos cards de banda larga Onnet_sem_tv
	And acessa pg de fixa Onnet_sem_tv
	Then valida preco dos cards de Fixa Onnet_sem_tv
	
@Cenario-OnnetPlus-B2B
Scenario: Precos Cards Avulsos - OnnetPlus-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de banda larga Onnet_plus
	Then valida preco dos cards de banda larga Onnet_plus
	And acessa pg de fixa Onnet_plus
	Then valida preco dos cards de Fixa Onnet_plus
	And acessa pg de TV Onnet_plus
	Then valida preco dos cards de Onnet_plus
	
@Cenario-G7-B2B
Scenario: Precos Cards Avulsos - G7-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL G7_B2B
	Then valida preco dos cards de BL G7_B2B
	And acessa pg de telefonia fixa G7_B2B
	Then valida preco dos cards de telefonia fixa G7_B2B
	And acessa pg de TV por assinatura G7_B2B
	Then valida preco dos cards de TV por assinatura G7_B2B
	
@Cenario-G9-B2B
Scenario: Precos Cards Avulsos - G9-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL G9-B2B
	Then valida preco dos cards de BL G9-B2B
	And acessa pg de telefonia fixa G9-B2B
	Then valida preco dos cards de telefonia fixa G9-B2B
	And acessa pg de TV por assinatura G9-B2B
	Then valida preco dos cards TV por assinatura de G9-B2B
	
@Cenario-OFFNET-B2B
Scenario: Precos Cards Avulsos - OFFNET-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de Banda Larga OFFNET B2B
	Then valida preco cards Banda Larga OFFNET B2B
	And acessa pg de telefonia fixa OFFNET B2B
	Then valida preco dos cards de telefonia fixa OFFNET B2B

@Cenario-Default-SP-Soft-B2B
Scenario: Precos Cards Avulsos - Default-SP-Soft-B2B
	Given abre pg do navegador preco cards avulsos
	And acessa pg de BL Default SP B2B
	Then valida preco dos cards de BL Default SP B2B
	And acessa pg de telefonia fixa Default SP B2B
	Then valida preco dos cards de telefonia fixa Default SP B2B
	And acessa pg de TV Default SP B2B
	Then valida preco cards de TV Default SP B2B