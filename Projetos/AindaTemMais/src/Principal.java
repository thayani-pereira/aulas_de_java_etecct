
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Conta Thay = new Conta();//Intancia a classe conta
		Thay.saldo = 1244;
		System.out.println("Saldo Inicial da conta: " +Thay.saldo);
		Thay.depositar(700);
		System.out.println("Saldo após o deposito: " + Thay.saldo);
		System.out.println("Saldo pelo extrato: " + Thay.extrato());
		System.out.println("Valor final " + Thay.sacar(900));
		System.out.println("Valor final " + Thay.extrato());
	}
	

}
