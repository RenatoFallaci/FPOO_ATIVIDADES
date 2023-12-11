package Cinema_Renato_Fllaci;

public class Comida {
private String nome;
private float preco;
private int Qntd;


//construtor padrao
Comida(){//2
}//2

//construtor com parametro
Comida (String nome,float preco,int Qntd){
this.nome=nome;
this.preco=preco;
this.Qntd=Qntd;

//get e setter
}

private String getNome() {
	return nome;
}

private void setNome(String nome) {
	this.nome = nome;
}

private float getPreco() {
	return preco;
}

private void setPreco(float preco) {
	this.preco = preco;
}

private int getQntd() {
	return Qntd;
}

private void setQntd(int qntd) {
	Qntd = qntd;
}
}