package Exercicios5;

public class Cavalo extends Animal {

	// variaveis
	private boolean correr;
	private boolean rapido;

	
	//Metodo construtor
	public Cavalo(boolean correr, boolean rapido, String nome, int idade, boolean som, int patas) {
		this.correr = correr;
		this.rapido = rapido;
		this.setNome(nome);
		this.setIdade(idade);
		this.setSom(som);
		this.setPatas(patas);
	}

	// metodos
	public void atividades() {
		
		System.out.println("O nome do cavalo é "+ this.getNome() );
		
		if (rapido == true) {
			System.out.println("O cavalo é o animal mais rapido do zoologico");
		} else {
			System.out.println("O cavalo não é mais rapido");
		}

	}

	public boolean getCorrer() {
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
