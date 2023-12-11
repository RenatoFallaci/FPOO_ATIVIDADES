package Cinema_Renato_Fllaci;

public class Cinema {
private String nome;
private String endereco;



//construtor padrao
Cinema (){//2
}//2

//construtor com parametro
Cinema (String nm, String endereco){
	this.nome = nm;
	this.endereco=endereco;
}
//get e setter


public String getEndereco() {
	return endereco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

}