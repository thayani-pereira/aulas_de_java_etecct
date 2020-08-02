
public class p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      dd ThayRafa = new dd(); //instancia
      ThayRafa.saldo = 1500; //passando um valor incial para o atributo saldo
      System.out.println("Saldo Inicial da conta: " + ThayRafa.saldo);
       ThayRafa.depositar(200);
       System.out.println("Saldo após o deposito em conta " + ThayRafa.saldo);
       System.out.println("Extrato da sua conta: " + ThayRafa.extrato());
       ThayRafa.sacar(300);
       System.out.println("Saldo após o saque em conto: " + ThayRafa.extrato());
      System.out.println("Saldo Finalem conta " + ThayRafa.saldo);
      
		
		
	}

}
