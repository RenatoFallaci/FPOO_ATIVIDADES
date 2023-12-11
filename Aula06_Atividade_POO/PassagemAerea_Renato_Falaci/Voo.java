package Atividades_Renato_fallaci31;
import java.time.LocalDate;

public class Voo {//1
private String numeroVoo;
private String origem;
private String destino;
private double Preco;
private LocalDate datalda;
private LocalDate dataVolta;

//construtor padrao
Voo (){
}
//construtor com parametro
Voo (String nmV, String or,String des,double Preco,LocalDate datalda,LocalDate datavolta){
	this.numeroVoo =nmV;
	this.origem=or;
	this.destino=des;
	this.Preco= Preco;
	this.datalda=datalda;
	this.dataVolta=datavolta;
}
//get e setter
public String getNumeroVoo() {
	return numeroVoo;
	}
public void setNumeroVoo(String numeroVoo ) {
	this.numeroVoo=numeroVoo;
}
public String getOrigem() {
	return origem;
	}
public void setOrigem(String origem) {
	this.origem=origem;
}
public String getdestino() {
	return destino;
	}
public void setdestino(String destino) {
	this.destino=destino;
}
public double getPreco() {
	return Preco;
}
public void setPreco(double Preco) {
	this.Preco= Preco;
}
public LocalDate getdatalda() {
	return datalda;
}
public void setdatalda(LocalDate datalda) {
	this.datalda=datalda;
}
public LocalDate getDatalta() {
	return datalda;
}
public void setdatavolta(LocalDate datavolta) {
	this.datalda=datavolta;
}
public LocalDate getDatavolta() {
	return dataVolta;

	
}
}//1


