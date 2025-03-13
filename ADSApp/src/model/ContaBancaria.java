package model;
import java.util.Scanner;

public class ContaBancaria {
	private double saldo;
	
	private int consultasGratis;
	
	private int contadorSaques;
	
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
		this.consultasGratis = 5;
		this.contadorSaques = 0;
	}
	public void deposito(double valor) {
		valor -= valor * 0.01;//aplica taxa de 1%
		
		saldo += valor; // adiciona valo do saldo
		System.out.println("Deposio concluido com sucesso.\nSaldo atual: " + saldo);
	}
	public void saque(double valor) {
		double taxa = valor * 0.005;
		saldo -= (valor + taxa);
		contadorSaques++;
		System.out.println("Saque concluido com sucesso.\nSaldo atual " + saldo );
	}
	public double consultaSaldo() {
		if (consultasGratis > 0) {
			consultasGratis--;
		}else if(contadorSaques > 0) {
			saldo -= 0.1;
			consultasGratis=5;
		}
		return saldo;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Informe o saldo inicial");
		double saldoInicial = scn.nextDouble();
		
		ContaBancaria conta = new ContaBancaria(saldoInicial);
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("4 - Sair");
			int opcao = scn.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("informe o valor do deposito: ");
					double valorDeposito = scn.nextDouble();
					conta.deposito(valorDeposito);
					break;
				case 2:
					System.out.println("Informe o valor do saque: ");
					double valorSaque = scn.nextDouble();
					conta.saque(valorSaque);
					break;
				case 3:
					System.out.println("Saldo atual: "+ conta.consultaSaldo()); 
					break;
				case 4:
					continuar = false;
					break;
				default:
					System.out.println("Opcao invalida, tente novamente.");
			}
		}
	}

}
