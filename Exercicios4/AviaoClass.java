package Exercicios4;
public class AviaoClass {
	
/*
2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/
	
	
	
	//Atributos
	public int assento;
	public String cozinha;
	public String mascaras;
	public String banheiro;
	public boolean voar;
	
	
	//Metodo especial constructor
	
	public void AviaoClass(int assento, String cozinha, String mascaras, String banheiro,boolean voar)
	{
		this.assento=assento;
		this.cozinha=cozinha;
		this.mascaras=mascaras;
		this.banheiro=banheiro;
		this.voar=voar;
	}
	
	
	public void voar() {
		if(voar==true) {
			System.out.println("O Avião está em voo por favor coloque o seu celular no modo avião.");
		}
		
		else {
			System.out.println("O avião ira decolar em breve.");
		}
	}
	
	public void imprimirInfo()
	{System.out.println("Você está no assento " + assento + " você conferiu os itens como a cozinha?  " + cozinha+ " , mascaras,? " +mascaras+ " e o banheiro? " + banheiro);
	}
}
