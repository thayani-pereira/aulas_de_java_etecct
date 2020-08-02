
public class Pessoas {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoas(String nome,String endereco,String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
   public Pessoas () {
	   this("","","");
   }
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
   public void setTelefone() {
	   this.telefone = telefone;
   }
   public void apresentaPessoa() {
	   System.out.println("Nome:" + this.getNome());
	   System.out.println("Endereço: " + this.getEndereco());
	   System.out.println("Telefone: " + this.getTelefone());
   }
}
