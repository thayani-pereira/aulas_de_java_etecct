package application;


public class Pessoa {

	private String nome;
	private String email;
	private String telefone;
	public Pessoa() {}
	public Pessoa(String nome, String email, String telefone) {
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
