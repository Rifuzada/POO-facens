package model;

//Classe base dos objetos
public class Objeto {
	protected String nome;
	
	public Objeto(String nome) {
		this.nome = nome;
	}
	
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		
	}

}
