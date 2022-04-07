package Exercicios4;

public class ProgramaPatinete {
	public static void main(String[] args) {
		
		ClassPatinete patinete1	= new ClassPatinete();
		
		patinete1.marca="Honda";
		patinete1.modelo="XX500";
		patinete1.cor="Degrade";
		patinete1.preco=1000.00;
		
		patinete1.informacoes();
		patinete1.promocao();
		
		
	}

}
