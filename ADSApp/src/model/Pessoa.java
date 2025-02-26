package model;

public class Pessoa {
 private float altura;
 private float peso;
 private String cpf;
 private String profissao;

 public Pessoa( float altura, float peso, String cpf, String profissao) {
     this.altura = altura;
     this.peso = peso;
     this.cpf = cpf;
     this.profissao = profissao;
 }


 public void exibirDetalhes() {
     System.out.println("Altura: " + altura + ", Peso: " + peso + ", CPF: " + cpf + ", Profissão: " + profissao);
 }
}