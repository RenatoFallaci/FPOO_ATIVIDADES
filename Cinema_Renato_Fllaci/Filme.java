package Cinema_Renato_Fllaci;

public class Filme {
private String nome;
private int classificacao;
private int Sala;
public String getnome;

//construtor padrao



//2
	//construtor com parametro
	Filme(String nome){
	this.nome = nome;
	this.classificacao=classificacao;
			this.Sala=Sala;
	}
			
//get e setter 
			

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public int getSala() {
		return Sala;
	}

	public void setSala(int sala) {
		Sala = sala;
	}
}