package Exercicios3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um
		 * programa que gere um vetor com os lan�amentos, escreva esse vetor. A seguir
		 * determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e
		 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */
		Scanner ler = new Scanner(System.in);

		int vet[] = new int[10];
		int num, maior = 0, media = 0, contador = 0;

		for (int x = 0; x < 4; x++) {
			System.out.print("Digite o numero sorteado: ");
			vet[x] = ler.nextInt();
			media += vet[x];

			if (vet[x] > maior) {
				maior = vet[x];
			}

		}

		for (int x = 0; x < 4; x++) 
		{
				if (vet[x] == maior) 
				{
				contador++;
				}

		}

		System.out.println("A m�dia nos numeros sorteados �: " + media / contador);
		System.out.println("A quantidade do maior valor repetido �: " + contador);

	}

}
