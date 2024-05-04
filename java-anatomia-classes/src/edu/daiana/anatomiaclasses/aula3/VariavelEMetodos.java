package edu.daiana.anatomiaclasses.aula3;

public class VariavelEMetodos {
	
	public static void main(String[] args)  { 				

		String meuNome = "Daiana";
		int anoFabricacao = 2023;
		double altura = 1.62;
		boolean verdadeira;
		boolean verdadeira2 = false;
		Dog spike; //observe que aqui a variável spike não tem valor, é normal

		anoFabricacao = 2018; 

		String primeiroNome = "Daiana";
		String segundoNome = "Araujo"; 

		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);

	}

	public static String nomeCompleto (String primeiroNome, String segundoNome){
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}
}
