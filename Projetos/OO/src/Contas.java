
public class Contas {
	
	//Atributos ou caracteristicas da classe ou class
	double saldo;
	int agencia;
	int conta;
	String titular;
	
	void deposito(double valor) {//metado sem retorno
		//saldo = saldo + saldo; //saldo+=saldo
		saldo+=saldo;
			}
    double extrato() {
    	return saldo;
    }
    //metado com retorno e parametro 
    String sacar(double valor) {
    	if(saldo>=valor) {  		
    		//saldo = saldo-valor;
    		saldo-=saldo;
    		return "Valor sacado com sucesso";	
  	  		
    	   		
    	}
    	return "Saldo Insuficiente";
    }
    
}
