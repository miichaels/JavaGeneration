package Exercicios3;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
/*
 1.	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma 
 atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
 */
	
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int [5];
		int maiorV=0;
		
		for(int x=0; x<5; x++){
			System.out.print("Digite um numero: ");
			vet[x] = ler.nextInt();
			
			if (vet[x] > maiorV) {
				maiorV = vet[x];
			}
		}
		
		for(int x=0; x<5; x++)
		{
			
			System.out.print(vet[x]);
			System.out.print("\t");
		}
		System.out.println("\n");
		System.out.println("O maior valor do vetor �: " + maiorV);
	}


}








