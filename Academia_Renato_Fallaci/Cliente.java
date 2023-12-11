package Aula_1408;

public class Cliente {
        //atributos
	public String nome;
	float cpf;
	public int telef;
    public double peso;
    public double altura;
    public boolean idade;

    
    public void calcularimc() {
    	double imc=peso/(altura*altura);
    	if(imc<18.5) {
    		System.out.println("magro");
    		
    	}else if (imc>18.5&& imc<24.9) {
    		System.out.println("normal");
    		
    	}else if (imc>24.9&&imc<30.0) {
    		System.out.println("obeso");
    		
    	}
    }
}	
    
 


