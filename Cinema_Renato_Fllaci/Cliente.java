package Cinema_Renato_Fllaci;

import java.util.List;


public class Cliente {
private String nomes;
private boolean tipodoc;
private int idade;

//construtor padrao
Cliente (){//2
}//2

//construtor com parametro
Cliente(String nme,boolean tipodoc,int idade){
this.nomes = nme;
this.tipodoc=tipodoc;
this.idade=idade;

//get e setter 
}
public void setNome(String nome) {
	this.nomes = nome;
}

public boolean isTipodoc() {
	return tipodoc;
}

public void setTipodoc(boolean tipodoc) {
	this.tipodoc = tipodoc;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}
}