
public class Contas {
	//atributos da classe
	double saldo;	
	int conta;
	int agencia;
	String titular;
	
	//metado sem retorno mas com parametro
	void depositar (double valor) {
		saldo=saldo+valor;
	}
	double extrato() {//m�tado com retorno sem parametro
		return saldo;
	}
	String sacar (double valor) {//m�tado com retorto e com parametro
		if (saldo>=valor) {
			saldo= saldo - valor;
			return "Saque efetuado com sucesso!";
		}
		return "Voc� n�o possue saldo em conta para efetuar o saque!";
	}

}
