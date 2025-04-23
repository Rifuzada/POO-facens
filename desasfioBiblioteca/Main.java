package sistemabiblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Email: " +
                email);
    }
}

class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int idade, String email, int ra) {
        super(nome, idade, email);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("RA: " + ra);
    }
}

class Professor extends Pessoa {
    private String area;

    public Professor(String nome, int idade, String email, String area) {
        super(nome, idade, email);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Área: " + area);
    }
}

class Livro {
    private String titulo;
    private int ano;

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
        this.ano = -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo + " | Ano: " + (ano > 0 ? ano : "Não informado"));
    }
}

public class Main {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static ArrayList<Pessoa> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n📚 MENU - SISTEMA BIBLIOTECA UNIVERSITÁRIA");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Cadastrar aluno");
            System.out.println("3 - Cadastrar professor");
            System.out.println("4 - Exibir livros cadastrados");
            System.out.println("5 - Exibir usuários cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                int opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1:
                        cadastrarLivro(sc);
                        break;
                    case 2:
                        cadastrarAluno(sc);
                        break;
                    case 3:
                        cadastrarProfessor(sc);
                        break;
                    case 4:
                        exibirLivros();
                        break;
                    case 5:
                        exibirUsuarios();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Sistema encerrado.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.nextLine();
            }
        }
        sc.close();
    }

    public static void cadastrarLivro(Scanner sc) {
        System.out.print("Digite o título do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Deseja informar o ano de publicação? (s/n): ");
        String resposta = sc.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) {
            System.out.print("Digite o ano de publicação: ");
            int ano = sc.nextInt();
            sc.nextLine();
            Livro livro = new Livro(titulo, ano);
            livros.add(livro);
        } else {
            Livro livro = new Livro(titulo);
            livros.add(livro);
        }
        System.out.println("Livro cadastrado com sucesso!");
    }

    public static void cadastrarAluno(Scanner sc) {
        try {
            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("RA: ");
            int ra = sc.nextInt();
            sc.nextLine();
            Aluno aluno = new Aluno(nome, idade, email, ra);
            usuarios.add(aluno);
            System.out.println("Aluno cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Dados inválidos. Tente novamente.");
            sc.nextLine();
        }
    }

    public static void cadastrarProfessor(Scanner sc) {
        try {
            System.out.print("Nome do professor: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Área de atuação: ");
            String area = sc.nextLine();
            Professor prof = new Professor(nome, idade, email, area);
            usuarios.add(prof);
            System.out.println("Professor cadastrado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Dados inválidos. Tente novamente.");
            sc.nextLine();
        }
    }

    public static void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\n📚 Livros cadastrados:");
            for (Livro livro : livros) {
                livro.exibirLivro();
            }
        }
    }

    public static void exibirUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\n📚 Usuários cadastrados:");
            for (Pessoa p : usuarios) {
                p.exibirDados();
                System.out.println("-----");
            }
        }
    }
}
