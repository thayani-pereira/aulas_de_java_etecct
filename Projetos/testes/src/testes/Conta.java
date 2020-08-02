package testes;

public class Conta {
	public double ContaPublica;
	protected double ContaProtegida;
	private double ContaPrivada;
	
	private double Valor;
	
	double getValor() {
		Double valor = this.Valor;
		return valor;
	}
	
	void setValor(double Valor) {
		this.Valor = Valor;
	}
	
	Conta (double Valor) {
		this.Valor = Valor;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	
}
