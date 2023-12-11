package Cinema_Renato_Fllaci;

public class Lanchonete {
private String lanche;
private float preco;


//construtor padrao
Lanchonete(){//2
}//2

//construtor com parametro
Lanchonete (String lanche,float preco){
this.lanche=lanche;
this.preco=preco;


//get e setter
}
private String getLanche() {
	return lanche;
}

private void setLanche(String lanche) {
	this.lanche = lanche;
}

private float getPreco() {
	return preco;
}

private void setPreco(float preco) {
	this.preco = preco;
}
}