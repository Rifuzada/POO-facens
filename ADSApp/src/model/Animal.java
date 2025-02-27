package model;

//Classe Animal que herda de Objeto
public class Animal extends Objeto{
	private String Especie;
	private String N_patas;
	private String Cor;
	
	public Animal(String nome, String Especie, String N_patas, String Cor) {
		super(nome);
		this.Especie = Especie;
		this.N_patas = N_patas;
		this.Cor = Cor;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Animal: " + nome + ", Especie: " + Especie + ", Numero de Patas: " + N_patas + ", Cor: " + Cor);
	}
}