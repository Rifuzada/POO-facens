package model;

//Classe carro que herda de Objeto
public class Carro{
	private String modelo;
	private String nome; 
	
	public Carro(String nome, String modelo) {
		this.nome = nome;
		this.modelo = modelo;
	}

	public void exibirDetalhes() {
		System.out.println("Carro: " + nome + ", Modelo " + modelo);
	}
}
