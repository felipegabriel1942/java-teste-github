package conversao;

public class Pessoa {
	private String nome;
	private int idade;
	private String cidade;
	
	
	public Pessoa(String nome, int idade, String cidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
