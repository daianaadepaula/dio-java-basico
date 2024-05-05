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

## Padrão de nomeclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. 

- **Arquivo .java**: Todo arquivo .java DEVE começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:

Calculadora.java, CalculadoraCientifica.java

- **Nome da classe no arquivo**: A classe DEVE possuir o mesmo nome do arquivo.java, exemplo:

```
	// arquivo CalculadoraCientifica.java

	public class CalculadoraCientifica {

	}
```

- **Nome de variável**: Toda variável DEVE ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: `ano` e `anoFabricacao`. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

> Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem.

* DEVE conter apenas letras, _ (underline), $ ou os números de 0 a 9;
* DEVE **obrigatoriamente** se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
* DEVE iniciar com uma letra minúscula (boa prática – ver abaixo);
* NÂO pode conter espaços;
* NÂO podemos usar palavras-chave da linguagem;
* O nome DEVE ser **único** dentro de um escopo.

## Declarando variáveis e métodos
Como identificar a diferença entre, declaração de variáveis e métodos em nossa programa? Existe uma estrutura comum para ambas as finalidades, exemplo:

- Declarar uma **variável** em Java segue sempre a seguinte estrutura:

```
	// Estrutura

	Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)
```

```
	public class App {

    public static void main(String[] args)  { 			

			String meuNome = "Daiana";
			int anoFabricacao = 2023;
			double altura = 1.62;
			boolean verdadeira;
			boolean verdadeira2 = false;
			Dog spike; //observe que aqui a variável spike não tem valor, é normal

			anoFabricacao = 2018; 

    }

}
```

- Declarar **métodos** em Java segue uma estrutura bem simples:

```
	// Estrutura

	TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
```

```
	public class App {

    public static void main(String[] args)  { 			

			String primeiroNome = "Daiana";
			String segundoNome = "Araujo"; 

			String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
			System.out.println(nomeCompleto);

    }

		public static String nomeCompleto (String primeiroNome, String segundoNome){
			return "Resultado do método " + primeitoNome.concat(" ").concat(segundoNome);
		}

}
```

> Como parte da estrutura de declaração de **variáveis** e **métodos**, também temos o aspecto da **visibilidade**, mas ainda não é necessário nesta etapa de estudos.

## Indentação (indentation)

Indentar é escrever o código do programa de forma **hierárquica**, facilitando assim a visualização e o entendimento do programa.

#### Sem indentação

```
// arquivo BoletimEstudantil.java

public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 6;
if(mediaFinal<6)	
System.out.println("REPROVADO"); 
else if(mediaFinal==6)
System.out.println("PROVA MINERVA"); 
else
System.out.println("APROVADO"); 		
}
}
```

#### Com indentação

```
public class BoletimEstudantil {
	public static void main(String[] args) {
		int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}
```

## Organizando arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

![Exemplo de organizador de arquivos](https://glysns.gitbook.io/~gitbook/image?url=https%3A%2F%2F1693191620-files.gitbook.io%2F%7E%2Ffiles%2Fv0%2Fb%2Fgitbook-x-prod.appspot.com%2Fo%2Fspaces%252FjFR9F4NToQ6FD39fU3wC%252Fuploads%252Fgit-blob-0e8fc13c780314b11e9dde37119c40cfa8817b48%252Fimage%2520%282%29%2520%281%29.png%3Falt%3Dmedia&width=768&dpr=1&quality=100&sign=5f4b446301d9b79e21fa129728f0d7d706f5685ee07f9559c483fb80e45ed77c)

Com o uso de pacotes, as nossas classes (.java) passam a possuir duas identificações, o nome simples e nome qualificado:

- Nome Simples: Nome do arquivo, exemplo `ContaBanco`.

- Nome Qualificado: Nome do pacote + nome do arquivo, exemplo: `com.suaempresa.ContaBanco`.

### Padrão da nomenclatura dos pacotes

O padrão da Sun para dar nome aos pacotes é relativo ao nome da empresa que desenvolveou a classe:.

`br.com.nomedaempresa.nomedoprojeto.subpacote`
`br.com.nomedaempresa.nomedoprojeto.subpacote2`
`br.com.nomedaempresa.nomedoprojeto.subpacote2.subpacote3`

Os pacotes só têm letras minúsculas, não importa quantas palavras estejam contidas neles.

## Java Beans

Umas das maiores dificuldades na programação é escrever algoritmos legíveis, a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere através de convenções, uma escrita universal, para nossas classes, atributos, métodos e pacotes.

### Variáveis

- Uma variável DEVE ser clara, sem abreviações ou definição sem sentido;

- Uma variável é SEMPRE no singular, **exceto quando se referir a um array ou coleção**.

- Defina um idioma ÚNICO para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

#### Não recomendado

```
double salMedio = 1500.23  //variável abreviada, o que dificulta a compreensão
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail
String myName = "JOSEPH" //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não 
```

#### Recomendado

```
double salarioMedio=1500.23;
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com","professor@escola.com"}
String meuNome = "JOSEPH" 
```

### Métodos

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com **exceção** da primeira letra de cada palavra composta, a partir da segunda palavra.

Exemplos sugeridos para nomenclatura de métodos:

```
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findById(int id){} // não se assuste, você verá muito método em inglês em sua jornada

calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma única finalidade
```