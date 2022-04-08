package Exercicios5;

/*
 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
 */

public class Animal implements InterfaceAnimal{
	// Atributos
	private String nome;
	private int idade;
	private boolean som;
	private int patas;

	// metodos

	@Override
	public void aniversario() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void emitirSom() {
		System.out.println("Todos animais emitem som");
		
	}
	
	
	
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	
	

}
