package Exercicios4;

public class AviaoPrograma {

	/*
2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
*/
	
	public static void main(String[] args) {
		
		AviaoClass voo1 = new AviaoClass();
		
		voo1.AviaoClass(12, "sim", "sim", "sim", true);
		
		voo1.imprimirInfo();
		voo1.voar();
		
	}
}
