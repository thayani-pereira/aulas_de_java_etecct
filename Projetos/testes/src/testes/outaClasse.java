package testes;

public class outaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*************************************************************************		
		// Gerando a Pessoa Thayani
		Pessoa thayani = new Pessoa("Thayani Pereira", "Rua Brasil", "(11) 99999-8888");
		// Gerando a Pessoa Rafael
		Pessoa rafael = new Pessoa("Rafael Silva", "Rua Jamaica", "(11) 97777-8888");
		// Gerando uma Pessoa
		Pessoa pessoa = new Pessoa();
//*************************************************************************
		//Dando um nome para a Pessoa
		pessoa.setNome("Vanda Alves");
		//Dando um endere�o para a Pessoa
		pessoa.setEndereco("Rua 25 de Dezembro");
		//Dando um tefone para a Pessoa
		pessoa.setTelefone("(11) 91111-4444");
//*************************************************************************		
		// Exibir n�mero de telefone da Thayani
		System.out.println("Telefone Thayani: " +  thayani.getTelefone());
		// Thayani quer atualizar o numero de telefone
		thayani.setTelefone("(11) 92222-3333");
		//Apresente os dados da Thayani
		thayani.apresentar();
//*************************************************************************
		// Apresentar os dados do Rafael
		rafael.apresentar();
		// Rafael Mudou de endere�o
		// Atualizando as informa�oes de endere�o
		rafael.setEndereco("Av 9 de Julho");
		// Apresentar os dados do Rafael
		rafael.apresentar();
//*************************************************************************
		// Apresentar os dados da Pessoa
		pessoa.apresentar();
	}

}
