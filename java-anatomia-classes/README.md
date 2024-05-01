# Anatomia de Classe

Uma classe bem estruturada, não quer guerra com ninguém!

A escrita de códigos de um programa é feita através da composição de, palavras pré-definidas pela linguagem, com as expressões que utilizamos para determinar o nome do nossos arquivos, classes, atributos e métodos.

É muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. 

### Sintaxe de declaração de uma nova classe

```
	public class MinhaClasse {
		// seu código aqui
	}
```

- As classes iniciarão com `public class`;
- Toda classe precisa de nome, exemplo `MinhaClasse`;
- O nome do arquivo deve ser idêntico ao nome da classe pública;
- Após o nome, definir o corpo `{}`, onde iremos compor a classe com atributos e métodos.

```
	public class MinhaClasse {
		// corpo da classe

		public static void main (String [] args) {
			// corpo do método main
		}

	}
```

- Recomenda-se que somente uma classe possua o método `main`, responsável por iniciar todo o nosso programa.

- O método main recebe seu nome `main`, sempre terá a visibilidade `public`, será difinido como `static`, não retornará nenhum valor com `void` e receberá um parâmetro do tipo array de caracteres `String[]`.

- Todas as classes precisam existir dentro do diretório `src`.

- Todo nome de classe DEVE começar com letra MAIÚSCULA.
