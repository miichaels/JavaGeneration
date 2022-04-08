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
	@Override
	public void emitirSom()
	{
		System.out.println("O cachorro faz au au au");
	}
	
	public void emitirSom(String barulho)
	{
		System.out.println("Esse cachorro faz um barulho estranho");
	}
	

	public void status()
	{
		
		System.out.println("O nome do cachorro é "+ this.getNome()+ "A idade é " + this.getIdade());
		this.morde();
		this.emitirSom();
		
	}
	
	public void status(int n)
	{
		
	}
	
	
	
	public void morde() {
		System.out.println("Cuidado, o cachorro morde!!!");
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
