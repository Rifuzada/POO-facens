package main;

import java.util.Scanner;
import java.util.ArrayList;

class Pessoa {
    protected String nome;
    protected String email;
    protected String telefone;

    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String enviarEmail(String mensagem) {
        return "Ola, " + nome + "!\n " + mensagem + "\n E-mail:" + email + "\nTelefone: " + telefone;
    }

    public String resumoCadastro() {
        return "- Tipo: " + this.getClass().getSimpleName() + "| Nome: " + nome + " | E-mail:" + email + "| Telefone: "
                + telefone;
    }

}

class Professor extends Pessoa {
    public Professor(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String enviarEmail(String mensagem) {
        return "Ola, " + nome + "!\n " + mensagem + "\n E-mail:" + email + "\nTelefone: " + telefone;
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String enviarEmail(String mensagem) {
        return "Ola, " + nome + "!\n " + mensagem + "\n E-mail:" + email + "\nTelefone: " + telefone;
    }
}

class pessoas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Pessoa> Lista = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. - Cadastrar Pessoa");
            System.out.println("2. - Enviar mensagem ( com uso do polimorfismo)");
            System.out.println("3. - Listar pessoas cadastradas");
            System.out.println("0. - Sair");
            System.out.println("Escolha uma opção:  ");
            int opcao = Integer.parseInt(scn.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("\n---CADASTRO DE PESSOAS---");
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scn.nextLine();
                    System.out.println("Digite o email da pessoa: ");
                    String email = scn.nextLine();
                    System.out.println("Digite o telefone da pessoa: ");
                    String telefone = scn.nextLine();
                    System.out.println("Você é aluno ou professor? (A/P)");
                    String tipo = scn.nextLine().toUpperCase();
                    if (tipo.equals("A")) {
                        Lista.add(new Aluno(nome, email, telefone));
                    } else if (tipo.equals("P")) {
                        Lista.add(new Professor(nome, email, telefone));
                    } else {
                        System.err.println("Tipo inválido! Pessoa não adicionada.");
                    }
                    break;
                case 2:
                    if (Lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada");
                    } else {
                        System.out.println("Digite a mensagem a ser enviada: ");
                        String corpoMensagem = scn.nextLine();
                        System.out.println("\nEnviando mensagens com o uso do polimorfismo...");
                        for (Pessoa p : Lista) {
                            System.out.println("Tipo real do objeto: ");
                            System.out.println("Resultado do metodo polimorfico: ");
                            System.out.println(p.enviarEmail(corpoMensagem));
                            System.out.println("---------------------");
                        }
                    }
                    break;
                case 3:
                    if (Lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada");
                    } else {
                        System.out.println("\nLista de pessoas cadastradas");
                        for (Pessoa p : Lista) {
                            System.out.println(p.resumoCadastro());
                        }
                    }
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.err.println("Opção inválida.");
                    break;
            }
        }
        scn.close();
    }
}
