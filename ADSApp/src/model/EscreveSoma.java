package model;

import java.util.Scanner;

public class EscreveSoma {
	public void Soma(int n, int n1 ) {
		int soma = n + n1;
		System.out.println("A soma dos numeros é " + soma);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Escreva um numero");
		int n = scn.nextInt();
		System.out.println("Escreva outro numero");
		int n1 = scn.nextInt();
		scn.close(); 
		EscreveSoma soma = new EscreveSoma();
		soma.Soma(n, n1);
	}

}
