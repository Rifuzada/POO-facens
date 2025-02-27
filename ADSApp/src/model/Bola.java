package model;

//Classe Bola que herda de Objeto
public class Bola extends Objeto{
	private String Diametro;
	private String Peso;
	private String Cor;
	
	public Bola(String nome, String Diametro, String Peso, String Cor) {
		super(nome);
		this.Diametro = Diametro;
		this.Peso = Peso;
		this.Cor = Cor;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Bola de " + nome + ", Diametro: " + Diametro + ", Peso: " + Peso + ", Cor: " + Cor);
	}
}