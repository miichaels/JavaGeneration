package lacosRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		/* 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		
		
		Scanner leia = new Scanner(System.in); 
		
		int impar =0 , par = 0, num = 0 ;

		for (int contador =0 ; contador <= 4 ; contador++ )
		{
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			
			
			if(num %2==0) 
			{
				par++;
			}
			
			else
			{
				impar++;
			}
			
				
		}
	
		System.out.println("\nOs numero pares s�o: " + par);
		System.out.println("\nOs numeros impares s�o: " + impar);
		
	}
	
}
