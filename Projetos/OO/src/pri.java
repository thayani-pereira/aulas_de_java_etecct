
public class pri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Contaa Rafa = new Contaa();//Instanciando 
     Rafa.saldo = 300;
     System.out.println("Saldo Incial da conta Rafa " + Rafa.saldo);     
     Rafa.depositar(300);
     System.out.println("Saldo após o deposito " + Rafa.extrato());
     System.out.println(Rafa.sacar(500));
     System.out.println("Saldo final " + Rafa.saldo);
     System.out.println(Rafa.extrato());
	}

}
