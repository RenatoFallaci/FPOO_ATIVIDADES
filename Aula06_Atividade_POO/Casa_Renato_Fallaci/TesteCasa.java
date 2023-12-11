package Atividades_RenatoFallaci;
import java.util.Scanner;
public class TesteCasa {


//1

	public static void main(String[] args) {//2
		//CASA
		Casa C1 = new Casa ();
		Scanner entrada= new Scanner (System.in);
	    System.out.println("QUAL COR DE CASA VOCE GOSTARIA   ");
	    entrada.nextLine();
	    System.out.println("PRECO IDEAL PARA O SENHOR "); 
	    entrada.nextLine();
	    System.out.println("METRAGEM IDEAL PARA VOCE  "); 
	    entrada.nextLine();
	    
	    
	    //QUARTOS
	    Quarto Q1 = new Quarto ();
		Scanner entrada2= new Scanner (System.in);
		System.out.println("QUANTAS CAMAS O SENHOR GOSTARIA");
	    entrada2.nextLine();
	    
	    //SALA
	    Sala S1 = new Sala ();
		Scanner entrada3= new Scanner (System.in);
		System.out.println("O SENHOR QUER TV NA SALA");
	    entrada3.nextLine();
	    System.out.println("O SENHOR QUER SOFA DE COURO");
	    entrada3.nextLine();
	    System.out.println("COR DA SALA");
	    entrada3.nextLine();


		//COMODOS 
	   
	     Comodo comodo1 = new Comodo ();
		Scanner entrada4= new Scanner (System.in);
	    System.out.println("QUANTOS COMODOS VOCE GOSTARIA");// NAO PRECISA FICAR ADICIONANDO VARIOS SCANNER// APENAS 1 MESMO JA DA CERTO
	    entrada3.nextLine();
	    System.out.println("GOSTARIA DE SALA DE JOGOS");
	    entrada3.nextLine();
// final da casa 
	    

	    
}//2

	

}//1



