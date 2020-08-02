package hhhhh;

public class CriarConta { // criando a classe do tipo Conta
	
	double saldo; //atributos da classe conta
	int agencia; //atributos da classe conta
	int conta; //atributos da classe conta
	String titular; //atributos da classe conta
	
	// Criação de um método que recebe um parâmetro e não retorna nada.
	void deposita(double valor) { 
	
		saldo = saldo + valor; // instrução que é executada dentro deposita
	}
	
	// Criação de um método que recebe um parâmetro e retorna uma String

	String saca(double valor) { 
		//Instrução que é executada dentro do saca
		 if(saldo >= valor) {
			 saldo = saldo -valor;
			 
			 return "Valor sacado com sucesso";
		 }
		 else
			 return "você não tem saldo suficiente";
	}
}
