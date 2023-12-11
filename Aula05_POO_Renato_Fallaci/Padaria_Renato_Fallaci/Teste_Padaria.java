package Atividades_Renato_Fallaci;

import java.util.Scanner;

public class Teste_Padaria {

	//private static final String PAO = null;

	public static void main(String[] args) {
		//instanciando objetos
		PAO p1 = new PAO(); //o obj é o p1;  classe PAO ; palavra new é a instancia(criar/nascer) de um obj; PAO() construtor
		PAO p2= new PAO();
		
		BOLO b1 = new BOLO();	// Instanciando uma classe (bolo) object e b
		BOLO b2 = new BOLO ();
		
		DOCE d1 = new DOCE();
		DOCE d2 = new DOCE();
		
		Scanner entrada= new Scanner (System.in);
		//PAO 
		
		System.out.println("ESCOLHA SEU PAO DOCE:\n ---------CHOCOLATE------------ \n  --------DOCE DE LEITE------------");
		entrada.nextLine();
		System.out.println("VALOR DO PAO DOCE 5$$");

		    //BOLO
		System.out.println("ESCOLHA O SABOR DO BOLO:\n-----------MORANGO---------\n--------------ABACAXI------------");
		entrada.nextLine();
		System.out.println("VALOR DO BOLO E  15$$");

		//DOCE
		
		System.out.println("ESCOLHA SEU  DOCE:\n ---------MACA DO AMOR ------------ \n  --------BRIGADEIRO------------");
		entrada.nextLine();
		System.out.println ("O VALOR DO SEU DOCE FOI:5$$ ");
	}

}//FIM CLASSE