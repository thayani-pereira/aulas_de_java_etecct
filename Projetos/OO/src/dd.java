
public class dd {
	double saldo;
	int conta;
	int agencia;
	String titular;
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	double extrato () {
		return saldo;
	}
	String sacar(double valor) {
		if (saldo>=valor) {
			saldo = saldo - valor;
			return "Saque realizado com sucesso!";
		}
		return "Não tem saldo em conta!";
	}
	

}
