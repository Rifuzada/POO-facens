package main;

import java.util.Scanner;
import model.Funcionario;
import model.Gerente;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Funcionario f;
        Gerente g;
        try {
            System.out.println("Digite o nome do funcionario: ");
            String nomeFuncionario = scn.nextLine();

            System.out.println("Digite o salario do funcionario: ");
            double salarioFuncionario = scn.nextDouble();
            scn.nextLine(); // limpa o buffer depois do nextDouble

            f = new Funcionario(nomeFuncionario, salarioFuncionario);
            f.exibirDados();

            System.out.println("Digite o nome do gerente: ");
            String nomeGerente = scn.nextLine();

            System.out.println("Digite o salario do gerente: ");
            double salarioGerente = scn.nextDouble();
            scn.nextLine(); // limpa o buffer de novo

            System.out.println("Digite o departamento do gerente: ");
            String departamentoGerente = scn.nextLine();

            System.out.println("Deseja adicionar um bonus? (S/N)");
            String resposta = scn.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Digite o bonus: ");
                double bonusGerente = scn.nextDouble();
                g = new Gerente(nomeGerente, salarioGerente, departamentoGerente, bonusGerente);
            } else {
                g = new Gerente(nomeGerente, salarioGerente, departamentoGerente);
            }
            g.exibirDados();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
