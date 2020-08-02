public class Conta {	
		double saldo;
		int agencia;
		int numero;
		String titular;		
		void sacar(double valor) {
			saldo = saldo-valor;			
		}
		
		boolean temSaldo(double valor) {
			boolean permitir = false;
			
			if (saldo>=valor) {
				permitir = true;
			}
			return permitir;			
		}
		
		void depositar(double valor) {
			saldo = saldo+valor;
		}
	}


