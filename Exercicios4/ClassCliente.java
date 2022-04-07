package Exercicios4;

public class ClassCliente {

/*
 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
	public static void main(String[] args) {
		
		ProgramaCliente cliente1 = new ProgramaCliente();
		
		
		cliente1.nome="michael";
		cliente1.sobrenome="Silva";
		cliente1.corCabelo="preto";
		
		cliente1.clienteCompleto();
		
	}

}
