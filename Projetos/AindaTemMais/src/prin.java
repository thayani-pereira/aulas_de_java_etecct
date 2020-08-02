
public class prin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Contas thay = new Contas();
      thay.saldo = 300;
      System.out.println("Saldo Inicial de sua conta " + thay.saldo);
      thay.depositar(500);
      System.out.println("Saldo após o deposito em conta " + thay.saldo);
      System.out.println("Extrato de sua conta: " + thay.extrato());
      
      System.out.println(thay.sacar(900));
      System.out.println("Saldo final da conta:  " + thay.saldo);
      System.out.println("Saldo final esse é o extrato: " + thay.extrato());
     
	}
	

}
