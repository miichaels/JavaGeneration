package Exercicios4;

public class ProgramOficinaGen {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe automovel
		
		ClassOficina carro1 = new ClassOficina("Michael", "Toro", "Yah400", 2022);
		
		carro1.imprimirInfo();
		
		System.out.println("Tranferencia de proprietario  ");
		carro1.setNomeProprietario("Julio");
		carro1.getModelo();
		carro1.setPlaca("bk467");
		carro1.getAno();
		carro1.imprimirInfo();
		
	}
}
