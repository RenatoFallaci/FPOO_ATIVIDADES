package Cinema_Renato_Fllaci;

public class Sala {
private int numero;
private int capacidade;
private String filme;

//construtor padrao
Sala (){//2
}//2

//construtor com parametro
Sala (int numero,int capacidade,String filme){
this.numero=numero;
this.capacidade=capacidade;
this.filme=filme;
}
//get e setter

private int getNumero() {
	return numero;
}

private void setNumero(int numero) {
	this.numero = numero;
}

private int getCapacidade() {
	return capacidade;
}

private void setCapacidade(int capacidade) {
	this.capacidade = capacidade;
}

private String getFilme() {
	return filme;
}

private void setFilme(String filme) {
	this.filme = filme;
}









}
