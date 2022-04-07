package Exercicios4;

public class ClassPatinete {
//ATRIBUTOS
	
	String marca, cor, modelo;
	double preco;
	
	
	//METODOS
	
	public void informacoes()
	{
	System.out.println("Marca: " + marca);
	System.out.println("Cor: " + cor);
	System.out.println("Modelo: " + modelo);
	System.out.println("Preço: " + preco);
	
	}
	
	public void promocao()
	{
		if(preco>5000.00)
			System.out.println("Você ganhou um desconto de 5%");
		else
			System.out.println("Obrigado pela compra!");
	}
	
	
	
}