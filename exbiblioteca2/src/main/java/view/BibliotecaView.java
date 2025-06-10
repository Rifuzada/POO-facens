package view;

import java.util.List;
import java.util.Scanner;

import model.Livro;

/**
 * Classe responsável pela interação com o usuário via console.
 */
public class BibliotecaView {
    private Scanner scanner;

    public BibliotecaView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("=== MENU BIBLIOTECA DIGITAL ===");
        System.out.println("1. Adicionar Livro");
        System.out.println("2. Listar Livros");
        System.out.println("3. Buscar por Título");
        System.out.println("4. Remover Livro");
        System.out.println("5. Ordenar por Título");
        System.out.println("6. Embaralhar Acervo");
        System.out.println("7. Estatísticas");
        System.out.println("8. Filtrar por Gênero (Bônus)");
        System.out.println("0. Sair");
    }

    public int lerOpcao() {
        System.out.print("Escolha uma opção: ");
        while (true) {
            String entrada = scanner.nextLine().trim();
            try {
                int opcao = Integer.parseInt(entrada);
                return opcao;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite um número: ");
            }
        }
    }

    public String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }

    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (true) {
            String entrada = scanner.nextLine().trim();
            try {
                int valor = Integer.parseInt(entrada);
                if (valor >= 0) {
                    return valor;
                }
                System.out.print("Número deve ser positivo. Tente novamente: ");
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite um número inteiro: ");
            }
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void mostrarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
