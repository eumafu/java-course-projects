
---
## Comandos PRINT

printLN = Faz a quebra de linha
print = faz a escrita na mesma linha
printF = imprime o valor FORMATADO 
	ou seja, com 2 casas decimais ou quantas quiser
		necessário usar (%.2f%n)
			o %n no final significa a quebra de linha

| Símbolo | Tipo                       | Exemplo                        |
| ------- | -------------------------- | ------------------------------ |
| `%d`    | Inteiro (`int`)            | `System.out.printf("%d", 10);` |
| `%f`    | Decimal (`float`/`double`) | `%.2f` para 2 casas            |
| `%s`    | Texto (`String`)           | `"%s"`                         |
| `%n`    | Quebra de linha            | Em vez de `\n` (recomendado)   |
## Escrever o conteúdo de uma variável de algum tipo básico

int y = 32;

System.out.println(y);



