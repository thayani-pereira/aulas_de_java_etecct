public class pr {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
   Cont Thay = new Cont();//Instanciando a classe Cont
   Thay.saldo = 400;
   System.out.println("Saldo Inicial da Conta " + Thay.saldo);
   Thay.depositar(400);
   System.out.println("Saldo após Deposito " + Thay.extrato());
   //System.out.println(Thay.sacar(200));
   Thay.sacar(300);
   System.out.println("Saldo final da conta " + Thay.saldo);
   System.out.println(Thay.extrato());
   		
	}

}
