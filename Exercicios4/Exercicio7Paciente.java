package Exercicios4;

public class Exercicio7Paciente {
	
	String nome,doenca;
	boolean sexo;
	int idade;
	double peso;
	
	
	public void checarSexo () {
	if ( sexo == true)	{
		System.out.println("O paciende é do sexo feminino.");
	}
		
	else {
		System.out.println("O paciente é masculino.");
	}
	}
	
	public void informacaoPaciente(String nome, String doenca, int idade, double peso) {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Motivo da consulta: " + this.doenca);
		System.out.println("O paciente é mulher nervosa? " + this.sexo);
		System.out.println("A idade do paciente: " + this.idade);
		System.out.println("Limite diário: " + String.format("%.2f", this.peso));
		
	}

}
