public class dddddd {
	//São atribuidos da classe
	double saldo;
	int agencia;
	int conta;
	String titular;
	void depositar(double valor) { //metado sem retorno mas com parametro
		saldo = saldo + valor;
	}
	double extrato () { //metado com retorno mas sem parametro
		return saldo;
	}
	String sacar(double valor) {//metado com retorno e com parametro
		if(saldo>=valor) {
			saldo = saldo - valor;
			return "Valor sacado com sucesso!";
		}
		return "Conta sem saldo para saque!";
		
	}
	

}
