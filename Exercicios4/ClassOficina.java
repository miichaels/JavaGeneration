package Exercicios4;

public class ClassOficina {
	
	//Declaração de variaveis
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	
	//Criar o metodo especial - construtor
	

	public ClassOficina(String nomeProprietario, String modelo, String placa, int ano) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		
	}
	
	
		public void imprimirInfo() {
			System.out.println(nomeProprietario+ " possui um " + modelo + " com a placa " + placa + " do ano " + ano);
			
		}


		public String getNomeProprietario() {
			return nomeProprietario;
		}


		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public String getPlaca() {
			return placa;
		}


		public void setPlaca(String placa) {
			this.placa = placa;
		}


		public int getAno() {
			return ano;
		}


		public void setAno(int ano) {
			this.ano = ano;
		}
	
		
	
	
}