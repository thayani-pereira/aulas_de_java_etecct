package hhhhh;

public class CriarConta { // criando a classe do tipo Conta
	
	double saldo; //atributos da classe conta
	int agencia; //atributos da classe conta
	int conta; //atributos da classe conta
	String titular; //atributos da classe conta
	
	// Cria��o de um m�todo que recebe um par�metro e n�o retorna nada.
	void deposita(double valor) { 
	
		saldo = saldo + valor; // instru��o que � executada dentro deposita
	}
	
	// Cria��o de um m�todo que recebe um par�metro e retorna uma String

	String saca(double valor) { 
		//Instru��o que � executada dentro do saca
		 if(saldo >= valor) {
			 saldo = saldo -valor;
			 
			 return "Valor sacado com sucesso";
		 }
		 else
			 return "voc� n�o tem saldo suficiente";
	}
}
