package Exercicios4;

public class ClassEletronico {
	
/*
 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */
	
//Atributos - Celular
	private String tela;
	private int bateria;
	private String carregador;
	private int camera;
	
	
	
//Metodos - Construtor
	public void descricao (String tela, int bateria , String carregador, int camera)
	{
		this.tela=tela;
		this.bateria=bateria;
		this.carregador=carregador;
		this.camera=camera;
	}
	
	
	public void info() 
	{
	System.out.println("Você ira receber celular com tela " + tela + ", com a bateria em " +bateria+ " %," + " com o carregador "+ carregador+ " e de camera " +camera + " px"  );
	
	}
	

}
