package lacosRepeticao;

import java.util.Scanner;

public class exercicio4 {
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
	public static void main(String[] args) {
		
		int idade =0, sexo=0, outros=0, contCalma=0, contNervosa=0 ,
				contAgressiva=0, opcao=0, contTotal = 0, mNervosa=0 , hAgressivo=0, outrosCalmos=0
				,pessoaNerv40=0 , pessoaCalma18=0; 
		
		Scanner leia = new Scanner(System.in);
		
		
			while(contTotal <2)
			{
				System.out.println("Digite sua idade:");
				idade = leia.nextInt();
				
				System.out.println("Qual sexo ? ");
				System.out.println("(1- Feminino | 2- Masculino | 3- Outro)");
				sexo = leia.nextInt();
			
				
				System.out.println("Que tipo de pessoa você é? ");
				System.out.println("(1- Calma | 2- Nervosa | 3- Agressiva)");
				opcao= leia.nextInt();
			
				
				if(opcao==1)
				{
					contCalma++;
				}
				if(opcao==2)
				{
					contNervosa++;
				}
				if(opcao==3)
				{
					contAgressiva++;
				}
				if (sexo==1 && opcao==2 ) // o número de mulheres nervosas;
				{
				  mNervosa++;	
					}
				if (sexo==2 && opcao==3) //o número de homens agressivos;
				{
	
					hAgressivo++;
				}
				if ((sexo==3 && opcao==1) || opcao==1)//o número de outros calmos;
				{
					contCalma++;
					outrosCalmos++;
				}
				if (opcao==2 && idade>40) //o número de pessoas nervosas com mais de 40 anos;
				{
					pessoaNerv40++;
				}
				if (opcao==1 && idade<=18)//o número de pessoas calmas com menos de 18 anos
				{
					pessoaCalma18++; 
				}
				
				
			contTotal++;
			
			}
			
			System.out.println("o número de mulheres nervosas é: " +mNervosa);
			System.out.println("o número de homens agressivos é: " +hAgressivo);
			System.out.println("o número de outros calmos é: " +outrosCalmos);
			System.out.println("o número de pessoas nervosas com mais de 40 anos é: " + pessoaNerv40);
			System.out.println("o número de pessoas calmas com menos de 18 anos é: " +pessoaCalma18);

			
	}
}
