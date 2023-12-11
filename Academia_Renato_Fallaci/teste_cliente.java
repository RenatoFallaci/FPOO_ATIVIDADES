package Aula_1408;

public class teste_cliente {

	private static float cpf;

	public static void main(String[] args) {
	Cliente c2= new Cliente(); {
		c2.nome="Paulo santos";
		System.out.println("o nome e "+c2.nome);
	}	
	// uso "" para tipo String
	 c2.cpf=12346 ;
	 System.out.println("CPF" + c2.cpf);
	
	 //telefone
	 c2.telef=35844;
	 System.out.println("telef "+c2.telef);
	 
	 //peso
	 c2.peso=(double) 85   ;
	 System.out.println("peso"+c2.peso);
	 
	 //altura
	 c2.altura=(double)1.85;
	 System.out.println("altura"+c2.altura);
}
	
}