package lacosRepeticao;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		/* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
		
		int n = 0;
		
		for(n = 1000 ; n <= 1999; n++)
		
		{
			if (n%11==5) // Se o n dividido por 11 restar 5
				
		System.out.printf("\n %d " , + n);
		}
		
	
		
	}

}
