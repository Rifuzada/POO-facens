package model;

public class Animal {
		private String especie;
		private int nPatas;
		private float altura;
		private String cor;
		
		public Animal(String especie, int nPatas, String cor) {
			this.especie = especie;
			this.nPatas = nPatas;
			this.cor = cor;
		}
		
		public void exibirDetalhes() {
			System.out.println("----------");
			System.out.println("Especie: " + this.especie + "\nNumero de patas: " + this.nPatas + "\nCor: "+ this.cor);
			System.out.println("----------");
		}
	}

