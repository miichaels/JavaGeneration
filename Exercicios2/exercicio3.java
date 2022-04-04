package lacosRepeticao;

import java.util.Scanner;

public class exercicio3 {
	
  /* 3- Solicitar a idade de várias pessoas e imprimir: 
   * Total de pessoas com menos de 21 anos. 
   * Total de pessoas com mais de 50 anos. 
   * O programa termina quando idade for =-99. (WHILE) */
	
	public static void main(String[] args) {
		
	int idade =0, menor =0, maior=0;
	
	Scanner leia = new Scanner(System.in);
	
	
	
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		while(idade>=1)
		{
			
			if(idade<=21) 
			{
				
				menor++;
			}
			
			if(idade>50)
			{
			
				maior++;
			}
			
			System.out.println("Digite -99 na idade para sair..."); 
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();
			
			
	}
	
		
		System.out.println("\n Quantidade com menos de 21 anos: " + menor);
		System.out.println("\n Quantidade com mais de 50 anos: " + maior );
		
	}
}
