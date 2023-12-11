package Atividades_Renato_fallaci31;

public class Cliente {////1 
	//Atributos 
private	String nome;
private String sobrenome;
private String email1;
  

       //construtor padrao
Cliente (){
	

}
	// construtor com parametro
Cliente (String nm, String sb,String em){
	this.nome =nm;
	this.sobrenome=sb;
	this.email1=em;

}

//get e setter
public String getNome() {
	return nome;
	}
public void setNome(String nome) {
	this.nome= nome;
}
//sobrenome
public String getsobrenome() {
	return sobrenome;
	}
public void setsobrenome(String sobrenome) {
	this.sobrenome=sobrenome;
}
//email 
public String getEmail() {
	return email1;
	}
public void setEmail(String email1) {
	this.email1= email1;
}


}///1
