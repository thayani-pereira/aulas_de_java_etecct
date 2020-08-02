
public class Contaa {
	//atributos da conta
	double saldo;
	int agencia;
	int conta;
	String titular;
  void depositar(double valor) {//metado sem retorno e com parametro
	  //saldo=saldo+valor;
	  saldo+=saldo;
	    }
  double extrato() { //metado com retorno mas sem parametro
	  return saldo;
  }
  String sacar(double valor) { //metado com retorno e com parametro
	  if (saldo>=valor) {
		  saldo = saldo -valor;
		  return "Valor sacado com Sucesso";
	  }
	  return "Saldo Insuficiente";
	  
  }
}
