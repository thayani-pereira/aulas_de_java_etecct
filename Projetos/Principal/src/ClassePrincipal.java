public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Conta contaRafael = new Conta();        
		contaRafael.saldo = 3300;
		System.out.println(" Saldo da conta Rafael " + contaRafael.saldo);
		
		///////////////////////////////////////////////////////
		Conta contathayani=new Conta();
		contathayani.saldo = 300;
		
		if (contathayani.temSaldo(400)) {
			contathayani.sacar(400);
			System.out.println(" Saldo da conta Thayani " +  contathayani.saldo);
		} else {
			System.out.println("Conta sem saldo");
		}

		contathayani.depositar(20);
		System.out.println(" Saldo da conta Thayani " +  contathayani.saldo);
	}

}
