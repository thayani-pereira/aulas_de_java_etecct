
public class Cont {
	//Fazer os atributos da classe
	double saldo;
	int agencia;
	int conta;
	String titular;
	void depositar(double valor) {
		saldo = saldo + valor;	
	}
	double extrato() {
		return saldo;
	}
	String sacar(double valor) {
		if(saldo>=valor) {
			saldo = saldo - valor;
			return "Valor sacado com sucesso!";
		}
		return "Conta não tem saldo para esse saque!";
	}
}
