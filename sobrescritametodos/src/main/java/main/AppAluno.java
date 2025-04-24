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
            throw new IllegalArgumentException("Idade nao pode ser negativa");
        }
        this.idade = idade;
    }

    Pessoa(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome nao pode ser nulo ou vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade nao pode ser negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    void mostrarIdade() {
        if (idade > 0) {
            System.out.println("Idade: " + getIdade());
        }
    }

    void cracha() {
        System.out.println("Convidado: " + nome);

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
            throw new IllegalArgumentException("RA nao pode ser nulo ou vazio.");
        }
        this.ra = ra;
    }

    @Override
    void mostrarIdade() {
        if (getIdade() >= 0) {
            System.out.println("Idade do aluno: " + getIdade());
        } else {
            System.err.println("Idade invalida");
        }
    }

    @Override
    void cracha() {
        System.out.println("Aluno: " + getNome() + ", RA: " + getRa());
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
            throw new IllegalArgumentException("Curso nao pode ser nulo ou vazio.");
        }
        this.curso = curso;
    }

    @Override
    void mostrarIdade() {
        if (getIdade() >= 16) {
            System.out.println("Idade do aluno de graduacao: " + getIdade());
        } else {
            System.err.println("A Idade nao pode ser menor que 16.");
        }
    }

    @Override
    void cracha() {
        System.out.println("Aluno: " + getNome() + ", RA: " + getRa() + ", Curso: " + getCurso());
    }
}

public class AppAluno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("Joao", 30);
        Aluno a1 = new Aluno("Rafael", 19, "240169");
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("Pedro", 18, "240133", "ADS");
        a1.cracha();
        a1.mostrarIdade();
        pessoa.cracha();
        pessoa.mostrarIdade();
        alunoGraduacao.cracha();
        alunoGraduacao.mostrarIdade();
        scn.close();
    }
}
