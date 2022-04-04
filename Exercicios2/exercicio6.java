package lacosRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		int numero =0, media =0, cont=0,soma=0;
		
		do {
			System.out.println("Insira um numero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) 
			{
				soma+=numero;
				cont++;
			}
			
		}while (numero !=0);
		
		
		
		media = soma / cont;
		
		System.out.println("A média é: " + media);
		
		
	}
}
