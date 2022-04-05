package Exercicios3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um
		 * programa que gere um vetor com os lançamentos, escreva esse vetor. A seguir
		 * determine e imprima a média aritmética dos lançamentos, contabilize e
		 * apresente também quantas foram as ocorrências da maior pontuação.
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

		System.out.println("A média nos numeros sorteados é: " + media / contador);
		System.out.println("A quantidade do maior valor repetido é: " + contador);

	}

}
