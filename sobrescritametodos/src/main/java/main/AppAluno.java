package main;

import java.util.Scanner;

class Pessoa {
    private final String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    Pessoa(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    void mostrarIdade() {
        System.out.println("Idade: " + getIdade());
    }

    void cracha() {
        System.out.println("Convidado: " + nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + '}';
    }
}

class Aluno extends Pessoa {
    private final String ra;

    public String getRa() {
        return ra;
    }

    Aluno(String nome, int idade, String ra) {
        super(nome, idade);
        if (ra == null || ra.isEmpty()) {
            throw new IllegalArgumentException("RA não pode ser nulo ou vazio.");
        }
        this.ra = ra;
    }

    // Sobrescrita do método mostrarIdade para Aluno
    @Override
    void mostrarIdade() {
        System.out.println("Idade do aluno: " + getIdade());
    }

    // Sobrescrita do método cracha para Aluno
    @Override
    void cracha() {
        System.out.println("Aluno: " + getNome() + ", RA: " + getRa());
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + getNome() + '\'' + ", idade=" + getIdade() + ", ra='" + ra + '\'' + '}';
    }
}

class AlunoGraduacao extends Aluno {
    private final String curso;

    public String getCurso() {
        return curso;
    }

    AlunoGraduacao(String nome, int idade, String ra, String curso) {
        super(nome, idade, ra);
        if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Curso não pode ser nulo ou vazio.");
        }
        this.curso = curso;
    }

    // Sobrescrita do método mostrarIdade com validação específica para graduação
    @Override
    void mostrarIdade() {
        if (getIdade() >= 16) {
            System.out.println("Idade do aluno de graduação: " + getIdade());
        } else {
            System.err.println("A idade não pode ser menor que 16.");
        }
    }

    // Sobrescrita do método cracha incluindo curso
    @Override
    void cracha() {
        System.out.println("Aluno: " + getNome() + ", RA: " + getRa() + ", Curso: " + getCurso());
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" + "nome='" + getNome() + '\'' + ", idade=" + getIdade() + ", ra='" + getRa() + '\''
                + ", curso='" + curso + '\'' + '}';
    }
}

public class AppAluno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU CADASTRO =====");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("3. Cadastrar Aluno de Graduação");
            System.out.println("0. Sair");
            System.out.println("=========================");
            System.out.print(">> Escolha uma opção: ");
            opcao = scn.nextInt();
            scn.nextLine();

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite o nome: ");
                        String nome = scn.nextLine();
                        System.out.print("Digite a idade: ");
                        int idade = scn.nextInt();
                        scn.nextLine();

                        Pessoa pessoa = new Pessoa(nome, idade);
                        System.out.println("=========================");
                        pessoa.cracha();
                        pessoa.mostrarIdade();
                        System.out.println(pessoa);
                        System.out.println("=========================");

                    }
                    case 2 -> {
                        System.out.print("Digite o nome: ");
                        String nome = scn.nextLine();
                        System.out.print("Digite a idade: ");
                        int idade = scn.nextInt();
                        scn.nextLine();
                        System.out.print("Digite o RA: ");
                        String ra = scn.nextLine();

                        Aluno aluno = new Aluno(nome, idade, ra);
                        System.out.println("=========================");
                        aluno.cracha();
                        aluno.mostrarIdade();
                        System.out.println(aluno);
                        System.out.println("=========================");

                    }
                    case 3 -> {
                        System.out.print("Digite o nome: ");
                        String nome = scn.nextLine();
                        System.out.print("Digite a idade: ");
                        int idade = scn.nextInt();
                        scn.nextLine();
                        System.out.print("Digite o RA: ");
                        String ra = scn.nextLine();
                        System.out.print("Digite o curso: ");
                        String curso = scn.nextLine();

                        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(nome, idade, ra, curso);
                        System.out.println("=========================");
                        alunoGraduacao.cracha();
                        alunoGraduacao.mostrarIdade();
                        System.out.println(alunoGraduacao);
                        System.out.println("=========================");
                    }
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
                scn.nextLine();
            }

        } while (opcao != 0);

        scn.close();
    }
}
