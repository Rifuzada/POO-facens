package model;

public class Carro extends Objeto {
	private String modelo;
	
	public Carro(String nome, String modelo) {
		super(nome);
		this.modelo = modelo;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Carro: " + nome + "\nModelo:" + modelo);
	}
}
