package testes;

public class Pessoa {

//*************************************************************************		
	// Atributos	
	private String nome;
	private String endereco;
	private String telefone;
//*************************************************************************	
	public Pessoa()	{
		// definindo valore default para quando o construtor não tiver parametros
		this("","","");
	}
	// Sobrecarga do médodo construtor
	// Porque os metodos tem os mesmos nomes e parametros diferentes
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
//*************************************************************************	
	// Metodos get e set dos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

//*************************************************************************	
	// metodo que apresenta os dados da pessoa
	public void apresentar() {                                                      
		System.out.println("Nome " + this.getNome());
		System.out.println("Endereço " + this.getEndereco());
		System.out.println("Telefone " + this.getTelefone());
	}
//*************************************************************************	
}
