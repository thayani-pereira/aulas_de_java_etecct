
public class Simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// realizando uma chamada
	  String valor =	Ola();
	  System.out.println(valor);
	  
	  Carro meuCarro = new Carro("Nome");
	  
	  System.out.println(meuCarro.Modelo);
	  
	  meuCarro.Andar();
	  
	  double minhaVelocidade = meuCarro.ObterVelocidade();
	  
	  System.out.println(minhaVelocidade);
	  
	}
	
	public static String Ola() {
		System.out.println("ola");
		return "";
	}

}
