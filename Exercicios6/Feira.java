package Exercicios6;

import java.util.*;

public class Feira {
	
/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.	
Apresentar todos os dados da list.
 */
	
	public static void main(String[] args) {
		
		String produto1 = "maca";
		String produto2 = "manga";
		String produto3 = "banana";
		String produto4 = "pera";
		String produto5 = "abacaxi";
		String adicionar;
		int selecao,opcao;
		char resposta = ' ';
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> barraca = new ArrayList<>();
		
		barraca.add(produto1);
		barraca.add(produto2);
		barraca.add(produto3);
		barraca.add(produto4);
		barraca.add(produto5);
		
		System.out.println("\tProdutos da barraca maneira");
		System.out.println("\n" + barraca);
		
		barraca.remove(2);
		
		
		System.out.println("\nProdutos ainda listados: ");
		System.out.println(barraca);
	
		

	}	
}

/*
		
		System.out.println("Digite 1 para remover e 2 para adicionar");
		opcao=ler.nextInt();
		
		switch(opcao) {
		
		case 1:
		{
			
			System.out.println("Qual item Gostaria de remover?\n");
			System.out.println(estoque.get(0)+"\n"+estoque.get(1)+"\n"+estoque.get(2));
		}
		selecao=ler.nextInt();
			if(selecao==1)
				estoque.remove(0);
			else if(selecao==2)
				estoque.remove(1);
			else
				estoque.remove(2);	
			{
			System.out.println(estoque);
			System.out.println("\nEstoque atualizado");
			}
		break;
		
		case 2:
		    
			System.out.println("Digite o nome do item: ");
			
			adicionar=ler.next();
			estoque.add(adicionar);
			
			System.out.println("\nItem adicionado ao estoque!");
			System.out.println(estoque);
		
			System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite 'n' para retornar ao inicio.");
	}
		resposta = ler.next().charAt(0);
		}while (resposta != 's');
		System.out.println("Fim do programa");
}
}
 */
