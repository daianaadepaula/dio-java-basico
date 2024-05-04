package edu.daiana.anatomiaclasses.aula2;

public class CalculadoraCientifica {
	// Existe uma regra adicional para variáveis, quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome br sempre representará "Brasil" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:
		
	String BR = "Brasil";
	double PI = 3.14;
	int ESTADOS_BRASILEIRO = 27;
	int ANO_2000 = 2000;


	// Declação inválida de variáveis

	int numero&um = 1; //Os únicos símbolos permitidos são _ e $
	int 1numero = 1;    //Uma variável não pode começar com númerico
	int numero um = 1; //Não pode ter espaço no nome da variável
	int long = 1; //long faz parte das palavras reservadas da linguagem
	int #numero = 1

 	// Declaração válida de veriáveis
	int numero$um = 1;
	int numero1 = 1;
	int numeroum = 1;
	int longo = 1;

}
