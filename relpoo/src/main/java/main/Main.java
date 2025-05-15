package main;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Professor {
    String nome;
    List<Disciplina> disciplinas;

    Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);

    }
}

class Disciplina {
    String nome;
    List<Professor> professores;

    public Disciplina(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    void adicionarProfessor(Professor p) {
        professores.add(p);
    }
}

class Aluno {
    String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }
}

class Faculdade {
    String nome;
    List<Aluno> alunos;

    Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    void matricularAluno(Aluno a) {
        alunos.add(a);
    }
}

class Boletim {
    List<String> notas;

    public Boletim(List<String> notas) {
        this.notas = new ArrayList<>();
    }

    void adicionarNotas(String nota) {
        notas.add(nota);
    }

    void exibirNotas() {
        System.out.println("Notas: " + notas);
    }
}

class AlunoComBoletim {
    String nome;

    Boletim boletim;

    public AlunoComBoletim(String nome) {
        this.nome = nome;
        this.boletim = new Boletim(null);
    }

    void adicionarNota(String nota) {
        boletim.adicionarNotas(nota);
    }

    void mostrarBoletim() {
        System.out.println("Boletim do Aluno: " + nome + ":");
        boletim.exibirNotas();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("===[1] Associação ==");
        System.out.println("Digite o nome do Professor: ");
        String nomeProfessor = scn.nextLine();
        Professor prof1 = new Professor(nomeProfessor);
        System.out.println("Digite o nome da disciplina: ");
        String nomeDisciplina = scn.nextLine();
        Disciplina d1 = new Disciplina(nomeDisciplina);
        prof1.adicionarDisciplina(d1);
        d1.adicionarProfessor(prof1);
        System.out.println(prof1.nome + " prof1Ministra: " + prof1.disciplinas.get(0).nome);
        System.out.println(d1.nome + " é ministrada por: " + d1.professores.get(0).nome);

        System.out.println("\n ===[2] Agregação ===");
        System.out.println("Digite o nome da Faculdade:");
        String nomeFaculdade = scn.nextLine();
        Faculdade faculdade = new Faculdade(nomeFaculdade);
        System.out.println("Digite o nome do aluno a ser matriculado: ");
        String nomeAluno = scn.nextLine();

        Aluno aluno1 = new Aluno(nomeAluno);
        faculdade.matricularAluno(aluno1);

        System.out.println("Aluno: " + aluno1.nome + " matriculado na " + faculdade.nome);
        System.out.println(
                "Faculdade: " + faculdade.nome + " tem matriculado este aluno " + faculdade.alunos.get(0).nome);

        System.out.println("\n===[3] Composição ===");
        System.out.println("Digite o nome do aluno com boletim: ");
        String nomeComBoletim = scn.nextLine();
        AlunoComBoletim aluno2 = new AlunoComBoletim(nomeComBoletim);
        System.out.println("Quantas notas deseja adicionar para: " + aluno2.nome + "?");
        int qtdNotas = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Digite a nota " + i + 1);
            String nota = scn.nextLine();
            aluno2.adicionarNota(nota);
        }
        aluno2.mostrarBoletim();
        scn.close();
    }
}
