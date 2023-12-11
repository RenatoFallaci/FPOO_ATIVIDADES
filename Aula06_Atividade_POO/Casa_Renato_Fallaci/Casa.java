package Atividades_RenatoFallaci;

import java.util.List;



public class Casa {//1
	//Atributos
public String cor;
public float preco ;
public float metragem;

//construtor 
public void Casa (String Cor,float Preco,float metragem) {//2
}//2


//get e setter
public String getCor() {
	return cor;
	}
public void setCor(String verde) {
	this.cor=verde;
}
//preço 
public float getPreco() {
	return preco ;
	}
public void setPreco(float valor) {
	this.preco= valor;
}
//metragem
public float getmetragem() {
	return metragem ;
	}
public void setmetragem(float metros) {
	this.metragem = metros  ;
}

public void mostrarDetalhes() {
	System.out.println();
	System.out.println("Cor da casa "+ getCor());
	
}


	
}//1
