
public class prinn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Contass Thay = new Contass();//Instanciando
      Thay.saldo = 1230;// Passando o valor para conta
      System.out.println("Saldo incial da conta " + Thay.saldo);
     Thay.depositar(300);
     System.out.println("Saldo em conta após o deposito " + Thay.saldo);
     System.out.println("Saldo mais o deposito " + Thay.extrato());
      Thay.sacar(600);
      System.out.println("Saldo Final em conta " + Thay.extrato());
      System.out.println("Saldo Final em conta " + Thay.saldo);
      
	}

}
