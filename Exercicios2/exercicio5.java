package lacosRepeticao;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner (System.in);
		
	int numero=0, soma=0;
	
	do {
		System.out.println("Insira o numero: ");
		numero = leia.nextInt();
		
		soma+=numero;
	}while (numero!=0);
	
	
	System.out.println("A soma é:" + soma);
	
		
	}

}
