package lacosRepeticao;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		Scanner leia = new Scanner (System.in);
		
	int numero=0, soma=0;
	
	do {
		System.out.println("Insira o numero: ");
		numero = leia.nextInt();
		
		soma+=numero;
	}while (numero!=0);
	
	
	System.out.println("A soma �:" + soma);
	
		
	}

}
