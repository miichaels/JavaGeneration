package Exercicios4;
public class AviaoClass {
	
/*
2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
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
			System.out.println("O Avi�o est� em voo por favor coloque o seu celular no modo avi�o.");
		}
		
		else {
			System.out.println("O avi�o ira decolar em breve.");
		}
	}
	
	public void imprimirInfo()
	{System.out.println("Voc� est� no assento " + assento + " voc� conferiu os itens como a cozinha?  " + cozinha+ " , mascaras,? " +mascaras+ " e o banheiro? " + banheiro);
	}
}
