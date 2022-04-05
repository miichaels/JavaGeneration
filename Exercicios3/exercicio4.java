package Exercicios3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*
		Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		int num, somaTotal=0, somaDiagonal=0;
		
		int [][]mat = new int[3][3];
		

		
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
				{
					System.out.print("Digite um numero");
					mat[l][c] = ler.nextInt();
					
					if(l==c) {
						somaDiagonal += mat[l][c];
					}
					
					somaTotal = somaTotal + mat[l][c];
				
				}
		}
		
		for (int i = 0; i < 3; i++) {
		      for (int j = 0; j < 3; j++) {
		          System.out.print(mat[i][j] + " ");
		      }
		      System.out.println("\n");
		    }
		
		
		System.out.println("A soma total é: " + somaTotal);
		System.out.println("A soma Diagonal é : " + somaDiagonal);
		
		
		
		}
			
						
	}

