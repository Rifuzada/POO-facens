package model;

public class Bola {
		private int diametro;
		private int peso;
		private String cor;
		private String tipo;
		
		public Bola(int diametro, int peso, String cor, String tipo) {
			this.diametro = diametro;
			this.peso = peso;
			this.cor = cor;
			this.tipo = tipo;
		}
		
		public void exibirDetalhes() {
			System.out.println("----------");
			System.out.println("Diametro: " + this.diametro +"cm"+ "\nPeso: " + this.peso +" gramas"+ "\nCor: "+ this.cor + "\nTipo: " + this.tipo);
			System.out.println("----------");
		} 
	}

