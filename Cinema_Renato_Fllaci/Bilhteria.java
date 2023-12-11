package Cinema_Renato_Fllaci;

public class Bilhteria {
private String catalogo;
private float Preco;

//construtor padrao
Bilhteria (){//2
}//2

//construtor com parametro
Bilhteria (String catalogo,float preco){
this.catalogo = catalogo;
this.Preco=preco;
}
//get e setter

private String getCatalogo() {
	return catalogo;
}

private void setCatalogo(String catalogo) {
	this.catalogo = catalogo;
}

private float getPreco() {
	return Preco;
}

private void setPreco(float preco) {
	Preco = preco;
}
}