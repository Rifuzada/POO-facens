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
        return "Olá, " + nome + "!\n" + mensagem + "\nEmail: " + email + "\nTelefone: " + telefone;
    }

    public String resumoCadastro() {
        return "- Tipo: " + this.getClass().getSimpleName()
             + " | Nome: " + nome
             + " | E-mail: " + email
             + " | Telefone: " + telefone;
    }
}

class Aluno extends Pessoa {
    public Aluno(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String enviarEmail(String mensagem) {
        return "Olá Aluno " + nome + "!\nBem-vindo à plataforma!\nEmail: " + email + "\nTelefone: " + telefone;
    }
}

class Professor extends Pessoa {
    public Professor(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String enviarEmail(String mensagem) {
        return "Olá Professor " + nome + "!\nEstamos felizes com sua participação!\nEmail: " + email + "\nTelefone: " + telefone;
    }
}

public class AppPessoas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Cadastrar Pessoa (Aluno ou Professor)");
            System.out.println("2. Enviar Mensagem com uso de Polimorfismo");
            System.out.println("3. Listar Pessoas Cadastradas");
            System.out.println("0. Sair");
            System.out.println("==========================");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scn.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRO DE PESSOA ---");
                    System.out.print("Digite o nome: ");
                    String nome = scn.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scn.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scn.nextLine();
                    System.out.print("Você é Aluno ou Professor? (A/P): ");
                    String tipo = scn.nextLine().toUpperCase();

                    if (tipo.equals("A")) {
                        lista.add(new Aluno(nome, email, telefone));
                        System.out.println("Aluno cadastrado com sucesso!");
                    } else if (tipo.equals("P")) {
                        lista.add(new Professor(nome, email, telefone));
                        System.out.println("Professor cadastrado com sucesso!");
                    } else {
                        System.err.println("Tipo inválido! Pessoa não adicionada.");
                    }
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.print("Digite a mensagem a ser enviada: ");
                        String corpoMensagem = scn.nextLine();

                        System.out.println("\nEnviando mensagens com uso de polimorfismo...\n");
                        for (Pessoa p : lista) {
                            System.out.println("🔎 Tipo real do objeto: " + p.getClass().getSimpleName());
                            System.out.println("📨 Resultado do método polimórfico:");
                            System.out.println(p.enviarEmail(corpoMensagem));
                            System.out.println("-----------------------------");
                        }
                    }
                    break;

                case 3:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.println("\n--- LISTA DE PESSOAS CADASTRADAS ---");
                        for (Pessoa p : lista) {
                            System.out.println(p.resumoCadastro());
                        }
                    }
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.err.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scn.close();
    }
}
