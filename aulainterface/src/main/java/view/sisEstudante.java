package view;

import java.util.*;
import model.AlunoEnsinoFundamental;
import model.AlunoEnsinoMedio;
import model.AlunoGraduacao;
import model.Estudante;

public class sisEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudante> alunos = new ArrayList<>();
        System.out.println("Sistema de Cadastro de Alunos");

        System.out.println("\n Cadastro de Aluno | Graduação");
        System.out.println("Nome: ");
        String nomeG = sc.nextLine();

        System.out.println("ID: ");
        int idG = sc.nextInt();

        System.out.println("Nota prova 1: ");
        double p1G = sc.nextDouble();

        System.out.println("Nota prova 2: ");
        double p2G = sc.nextDouble();

        System.out.println("Nota trabalho: ");
        double trabG = sc.nextDouble();

        alunos.add(new AlunoGraduacao(nomeG, idG, p1G, p2G, trabG));
        sc.nextLine();
        System.out.println("\n CAdastro de Aluno | Ensino Medio");
        System.out.println("Nome: ");
        String nomeM = sc.nextLine();

        System.out.println("ID: ");
        int idM = sc.nextInt();

        System.out.println("Nota prova 1: ");
        double p1M = sc.nextDouble();

        System.out.println("Nota prova 2: ");
        double p2M = sc.nextDouble();

        alunos.add(new AlunoEnsinoMedio(nomeM, idM, p1M, p2M));
        sc.nextLine();
        System.out.println("\n CAdastro de Aluno | Fundamental");
        System.out.println("Nome: ");
        String nomeF = sc.nextLine();

        System.out.println("ID: ");
        int idF = sc.nextInt();

        System.out.println("Nota media media bimestral: ");
        double mBF = sc.nextDouble();

        alunos.add(new AlunoEnsinoFundamental(nomeF, idF, mBF));
        sc.nextLine();
        Collections.sort(alunos);
        System.out.println("\nLista de alunos ordenada por nota final: ");
        for (Estudante e : alunos) {
            System.out.printf("> %s(ID: %d) - Nota Final: %.2f\n", e.getNome(), e.getId(), e.calcNotaFinal());
        }
        Estudante melhor = alunos.get(0);
        System.out.printf("\n melhor Aluno: %s com nota %.2f\n", melhor.getNome(), melhor.calcNotaFinal());
        sc.close();
    }

}
