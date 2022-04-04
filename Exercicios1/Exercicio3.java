package ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		/*
		 
		Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto		
		
		*/	
		
		
		 Scanner leia = new Scanner(System.in);
		 int idade = 0;
		 
		 System.out.print("Insira a idade: ");
		 idade = leia.nextInt();
		 
		 if(idade>=10 && idade <=14 ) {
			 System.out.print("Categoria Infantil");
		 }
		 
		 if(idade>=15 && idade <=17 ) {
			 System.out.print("Categoria Juvenil");
		 }
		 
		 if(idade>=18 && idade <= 25 ) {
			 System.out.print("Categoria Adulto");
		 }
	}

}
