package model;

//Classe Pessoa que herda de Objeto
public class Pessoa extends Objeto{
	private String CPF;
	private String Altura;
	private String Peso;
	private String Profissao;
	
	public Pessoa(String nome, String CPF, String Altura, String Peso, String Profissao) {
		super(nome);
		this.CPF = CPF;
		this.Altura = Altura;
		this.Peso = Peso;
		this.Profissao = Profissao;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Pessoa:" + nome + ", CPF: " + CPF + ", Altura: " + Altura + ", Peso: " + Peso + ", Profissao: " + Profissao);
	}
}