package Atividades_Renato_Fallaci;

public class Vaso {

public String cor;
public double Tamanho;
public String material;
//construtor padrao
Vaso(){//2
}//2

//construtor com parametro
Vaso (String cor, double Tamanho,String materi){
	this.cor = cor;
	this.Tamanho =  Tamanho;
	this.material = materi;
}

//get e setter
public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public void setTamanho(double tamanho) {
	Tamanho = tamanho;
}

}
