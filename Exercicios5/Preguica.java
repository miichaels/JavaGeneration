package Exercicios5;

public class Preguica extends Animal {

	private boolean subir;
	private boolean lento;

	
	//Metodo construtor
		public Preguica(boolean subir, boolean lento, String nome, int idade, boolean som, int patas) {
			this.subir = subir;
			this.lento = lento;
			this.setNome(nome);
			this.setIdade(idade);
			this.setSom(som);
			this.setPatas(patas);
		}
	
	public void acao() {
		System.out.println("O nome da preguiça é "+ this.getNome() );
		if (lento == true) {
			System.out.println("A preguiça é um animal muito lento... ZzZZZzz");
		} else {
			System.out.println("A preguiça é um animal normal.");
		}

	}
	
	
	public boolean isSubir() {
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}

	public boolean isLento() {
		return lento;
	}

	public void setLento(boolean lento) {
		this.lento = lento;
	}

}
