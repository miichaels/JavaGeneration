package Exercicios5;

public class Zoologico {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro(true, true, "Zacare", 5, true, 8);
		Cavalo ca1 = new Cavalo(true, true, "CavaLOOO", 15, true, 2);
		Preguica p1 = new Preguica(true, true, "tartatuga", 5, true, 4);
		Cachorro c2 = new Cachorro(false,true, "Maiar", 6, false, 4);

	
		c1.status();
		System.out.println();
		ca1.atividades(); 
		System.out.println();
		p1.acao();
		System.out.println();
		c2.status();
		c1.emitirSom("sim");
		c1.emitirSom();
		
	}

}
