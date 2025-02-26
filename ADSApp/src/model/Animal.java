package model;

public class Animal{
	private String nome;
    private int numeroDePatas;
    private String cor;

    public Animal(String nome, int numeroDePatas, String cor) {
    	this.nome= nome;
    	this.numeroDePatas = numeroDePatas;
        this.cor = cor;
    }

  
    public void exibirDetalhes() {
        System.out.println("Animal: " + nome + ", Número de patas: " + numeroDePatas + ", Cor: " + cor);
    }
}