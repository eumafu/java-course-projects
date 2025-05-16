
---

## Conceito

É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição

Ou seja: Baseado em uma condição(Verdadeira ou Falsa), eu posso direcionar o rumo do fluxo do programa.

---
Basicamente, tenho dois tipos de estruturas condicionais
	Simples e composta

Simples:       (Tradução de "if" = SE)
	if (<condição>){
		"comando1"
		"comando2"
	}
	REGRAS:
	Se a condição for verdadeira: executa o bloco de comandos
	Se a condição for falsa: pula o bloco de comando

Composta:        (Tradução de "else' = SE NAO)
	if (<condição>){
	 "comando1"
	 "comando2"
	}
	else{
	"comando3"
	"comando4"
	}
	REGRAS:
	Condição verdadeira: executa somente bloco if
	Condição falsa: executa somente bloco else

---
# Encadeamento de estruturas condicionais

Para fazer mais de duas condições, basta repetir dentro da estrutura Else, outro if - else

if (<condição>){
	 "comando1"
	 "comando2"
	}
	else{
		if (<condição>){
		 "comando3"
		 "comando4"
		}
		else{
		"comando5"
		"comando6"
		}
	}