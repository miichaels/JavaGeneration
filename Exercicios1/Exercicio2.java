package ExerciciosIntroducao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 
		 * */	
		
		
		 Scanner leia = new Scanner(System.in);
		 
		 int[] vetor = new int[5];
		 
		 for(int contador = 0; contador < vetor.length; contador++) {
			 System.out.print("Insira um numero: ");
			 vetor[contador] = leia.nextInt();
		 }
		 
		 Arrays.sort(vetor);
		 
		 System.out.println("Ordem crescente: ");
		 
		 for(int contador = 0; contador < vetor.length; contador++) {
			 System.out.print(vetor[contador] + " ");		 
		}
	}

}

