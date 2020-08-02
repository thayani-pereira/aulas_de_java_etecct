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
	private int ag�ncia;
	private int titular;
	
	void depositar (double valor) { //m�tado sem retorno por�m tem parametro
		saldo = saldo + valor;
	}
	double extrado() { // m�taado com retorno mas sem parametro
		return saldo;
	}
	String sacar(double valor) {
		if(saldo>=valor) {
			saldo = saldo -valor;
			return "Saque realizado com sucesso!";
		}
		return "Voc� n�o tem saldo em conta para realizar saque!";
	}

}
