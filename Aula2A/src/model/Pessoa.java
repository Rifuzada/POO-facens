package model;

public class Pessoa{
	private String CPF;
	private float peso;
	private float altura;
	private String profissao;
	
	public Pessoa(String profissao, String CPF, float peso, float altura) {
		this.profissao = profissao;
		this.CPF = CPF;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void exibirDetalhes() {
		System.out.println("----------");
		System.out.println("Profissao: " + this.profissao + "\nCPF: " + this.CPF + "\nPeso: "+ this.peso + "\nAltura: " + this.altura);
		System.out.println("----------");
	}
}
