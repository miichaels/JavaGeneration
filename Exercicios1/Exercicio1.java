package ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 Faça um programa que receba três inteiros e diga qual deles é o maior.
		 
		 */
		
		 Scanner leia = new Scanner(System.in);
		 
		 int[] vetor = new int[3];
		 int maiorNum = 0;
		 
		 for(int contador = 0; contador < vetor.length; contador++) {
			 System.out.printf("Insira um numero: ");
			 vetor[contador] = leia.nextInt();
		 
			 if(vetor[contador] > maiorNum) {
				 maiorNum = vetor[contador];
			 }
		
		}
		 
		 System.out.println("Maior numero é: " + maiorNum);
	}

}
