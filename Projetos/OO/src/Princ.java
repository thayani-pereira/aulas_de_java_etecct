
public class Princ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Contas Thayani = new Contas();
    Thayani.saldo = 200; //Dando um valor valor para o atributo saldo
     System.out.println("Saldo da conta Inicial " + Thayani.saldo);//adicionado o valor na conta thayani
     Thayani.deposito(200);//usando o métado depositar adicionar para adicionar valor
     System.out.println("Saldo após o deposito " + Thayani.saldo);
     System.out.println(Thayani.sacar(500));//mostrar o saque
     System.out.println("Saldo final da conta " + Thayani.saldo);
     System.out.println(Thayani.extrato());
		
		
	}

}
