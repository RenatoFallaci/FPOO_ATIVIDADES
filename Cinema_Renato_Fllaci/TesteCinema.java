package Cinema_Renato_Fllaci;
import java.util.Scanner;
public class TesteCinema {
	
	public static void main(String[] args) {
		
//Propaganda1
Cinema C1 = new Cinema ("ANTONIO BANDEIRA","\nNumero:333");
Filme f1 = new Filme ();
Cliente c2 = new Cliente();
Sala s1 = new Sala ();
 java.util.Scanner entrada = new Scanner (System.in);
System.out.println(C1.getNome() + C1.getEndereco());

System.out.println("....................................................");
	;

//SWITCh
System.out.println("ESCOLHA O TEMA DA SESSAO : \n  SALA 1-TERROR     SALA 2-DESENHO    SALA 3 -COMEDIA    SALA 4-ACAO ");
int escolha = entrada.nextInt();
switch (escolha) {
case 1:
	System.out.println("CLASSIFICACAO +16 \r1-CASA DE CERA = 35$$ "
			+ "\rCAPACIDADE MAXIMA 150 LUGARES");
    System.out.println("FILME ESCOLHIDO\r1:CASA DE CERA ");
System.out.println("....................................................");
break;//Usado para interromper a execução de um dos laços de iteração vistos acima ou de um comando switch.

case 2:
System.out.println("CLASSIFICACAO +0\r1-TARTARUGA NINJA = 35$$ "
		+ "\rCAPACIDADE MAXIMA 150 LUGARES");
System.out.println("FILME ESCOLHIDO\r TARTARUGAS NINJA ");

System.out.println("....................................................");
break;

case 3:
System.out.println("CLASSIFICACAO + 14\r1-VOVOZONA = 20$$\r2-NORBET = 20$$\r3-MINHA MAE E UMA PECA = 20$$\r4-MINHA MAE E UMA PECA 2 = 20$$"
		+ "\rCAPACIDADE MAXIMA 100 LUGARES ");	
System.out.println("FILME ESCOLHIDO\r1: VOVOZONA");

System.out.println("....................................................");
	break;
case 4:
System.out.println("CLASSIFICACAO + 14\r1-VELOZES E FURIOSOS 7 = 40$$\r2-MISSAO IMPOSSIVEL = 40$$\r3-007 = 40$$\r4-BUSCA IMPLACAVEL = 40$$ "
		+ "\rCAPACIDADE MAXIMA 200 LUGARES ");	
System.out.println("FILME ESCOLHIDO\r3 : 007 ");

break;

}



System.out.println("\n LANCHONETE CITYCINE   ");
System.out.println("ESCOLHA O SEU COMBO E APROVEITE O FILME : \rCOMBO 1-COCA COLA E PIPOCA = 15$$     \rCOMBO 2- HOT DOG E COCA COLA + 1 POPCA = 15$$    "
		+ "\rCOMBO 3 - MILHO E UMA BARRINHA DE CHOCOLATE = 15 $$   \rCOMBO 4 - 1 COCA COLA , 2 BALDES DE PIPOCA COM UMA DELICIOSA BARRA DE CHOCOLATE COM AMENDOIM = 20$$");

	System.out.println("QUAL VAI SER O COMBO ");
	

 System.out.println("COMBO ESCOLHIDO \r1:1 COCA COLA E 1 PIPOCA ");
System.out.println("....................................................");
System.out.println(" "); 
entrada.nextLine();
System.out.println(" "); 
entrada.nextLine();
System.out.println("TOTAL 35 reais ");

}
}





























