
public class Contass {
	double saldo;
	int conta;
	int agencia;
	String titular;
	void depositar (double valor) {//Métado sem retorno mas com parametro
		saldo =saldo +valor;
	}
	double extrato() { //metado com retorno mas sem o parametro
		return saldo;
	}
	String sacar (double valor) {
		if(valor>=valor) {
			saldo = saldo - valor;
			return "Saque realizado com sucesso!";
		}
		return "Sem saldo em conta";
	}
}
