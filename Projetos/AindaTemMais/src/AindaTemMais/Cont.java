package AindaTemMais;

public class Cont {
	//atributos da classe cont
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected int conta;
	private int agência;
	private int titular;
	
	void depositar (double valor) { //métado sem retorno porém tem parametro
		saldo = saldo + valor;
	}
	double extrado() { // métaado com retorno mas sem parametro
		return saldo;
	}
	String sacar(double valor) {
		if(saldo>=valor) {
			saldo = saldo -valor;
			return "Saque realizado com sucesso!";
		}
		return "Você não tem saldo em conta para realizar saque!";
	}

}
