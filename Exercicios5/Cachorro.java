package Exercicios5;

public class Cachorro extends Animal {

	private boolean correr;
	private boolean rapido;
	
	//construtor
	
	public Cachorro(boolean correr, boolean rapido, String nome, int idade, boolean som, int patas) {
		this.correr = correr;
		this.rapido = rapido;
		this.setNome(nome);
		this.setIdade(idade);
		this.setSom(som);
		this.setPatas(patas);

	}

	// metodo
	public void status()
	{
		this.latir();
		System.out.println("O nome do cachorro é "+ this.getNome() );
		this.morde();
		
	}
	
	
	
	public void morde() {
		System.out.println("Cuidado, o cachorro morde!!!");
	}

	public void latir() {
		System.out.println("O cachorro late");

	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	public boolean isRapido() {
		return rapido;
	}

	public void setRapido(boolean rapido) {
		this.rapido = rapido;
	}

}
