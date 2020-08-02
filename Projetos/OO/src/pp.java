
public class pp {
	public static void main(String[]args) {
   dddddd primeiro = new dddddd();
   primeiro.saldo = 300;
   System.out.println("Saldo Incial da conta " + primeiro.saldo);
   primeiro.depositar(300);
   System.out.println("Saldo após deposito " + primeiro.extrato());
   primeiro.sacar(200);
   System.out.println("Valor após o saque " + primeiro.saldo);
   System.out.println(primeiro.extrato());
}
	
}