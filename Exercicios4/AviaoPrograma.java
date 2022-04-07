package Exercicios4;

public class AviaoPrograma {

	/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
	
	public static void main(String[] args) {
		
		AviaoClass voo1 = new AviaoClass();
		
		voo1.AviaoClass(12, "sim", "sim", "sim", true);
		
		voo1.imprimirInfo();
		voo1.voar();
		
	}
}
