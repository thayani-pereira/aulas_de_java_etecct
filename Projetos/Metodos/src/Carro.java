
public class Carro {
	int QtdRoda;
	String Modelo;
	
	public void Andar() {
		System.out.println("Andando");
	}
	
	public double ObterVelocidade() {
		return 101.5;
	}
	
	public Carro(String modelo) {
		// TODO Auto-generated method stub
		Modelo = modelo;
	}
}
