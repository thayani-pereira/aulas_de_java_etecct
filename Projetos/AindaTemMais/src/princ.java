
public class princ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cont thay = new Cont();//Instanciar
    thay.conta = 987;
    thay.setSaldo(380);//atribuindo um valor
    System.out.println("Saldo Inicial da conta: " + thay.getSaldo()); //mostrando o valor inicial da conta
    thay.depositar(900);
    System.out.println("Saldo após o deposito: " + thay.getSaldo());
    System.out.println("Saldo após o deposito extrato da conta: " + thay.extrado());
    System.out.println(thay.sacar(2000));
    System.out.println("Saldo final em conta: " + thay.getSaldo());
    System.out.println("Saldo final extrato: " + thay.extrado());
		
		
		
	}

}
