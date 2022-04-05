package Exercicios3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
/*
	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/

		Scanner ler = new Scanner(System.in);
		
		int N1[][] = new int [4][6];
		int N2[][] = new int [4][6];
		int M1[][] = new int [4][6];
		int M2[][] = new int [4][6];
		
		
		Random ale = new Random();
		 System.out.println("___________________");
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
				{
				 N1[l][c] = ale.nextInt(100);
				 System.out.print(N1[l][c] + "|");
								
				}
			
			System.out.println("\n");
			
		}
		
		System.out.println("___________________");
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
				{
				 N2[l][c] = ale.nextInt(100);
				 System.out.print(N2[l][c] + "|");
				
				}
			
			System.out.println("\n");
			
		}
		System.out.println("___________________");
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
				{
				 M1[l][c] = N1[l][c] + N2[l][c];
				 System.out.print(M1[l][c] + "|");
								
				}
		
			System.out.println("\n");
			
		}
		
		System.out.println("___________________");
		for(int l=0; l<3; l++)
		{
			for(int c=0; c<3; c++)
				{
				 M2[l][c] = N1[l][c] - N2[l][c];
				 System.out.print(M2[l][c] + "|");
				
				}
			
			System.out.println("\n");
			
		}
			
		
 	}

}
