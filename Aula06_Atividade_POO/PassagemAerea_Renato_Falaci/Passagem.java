package Atividades_Renato_fallaci31;

public class Passagem<precoTotal> {//1
	
	//atributos
private Voo voo;
private Cliente cliente1;
private precoTotal precoTotal;


//construtor padrao
Passagem (){
}
//construtor com parametro
Passagem (Voo voo, Cliente cliente,precoTotal precoTotal){
	this.voo = voo;
	this.cliente1 = cliente;
	this.precoTotal= precoTotal;
}
	
	//get e setter

public Voo getVoo() {
	return voo;
}
public void setVoo(Voo voo) {
	this.voo = voo;
}
public Cliente getcliente () {
	return cliente1 ;
}
public void setCliente (Cliente cli1) {
	this.cliente1=cli1;
}
public precoTotal getprecoTotal () {
	return precoTotal;
}
public void setprecoTotal(precoTotal preco) {
	this.precoTotal= preco;
	}
	
	
	
}//1

