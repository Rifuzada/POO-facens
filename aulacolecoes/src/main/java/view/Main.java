package view;

import java.util.*;
import model.Product;

public class Main {
    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<>();
        Set<String> categorias = new HashSet<>();
        Map<String, Product> mapaProdutos = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n===== MENU SISTEMA PRODUTOS =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto por nome");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Ordenar produtos por nome");
            System.out.println("6 - Embaralhar produtos");
            System.out.println("7 - Mostrar estatisticas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scn.nextInt();
            scn.nextLine();
            switch (opcao) {
                case 1: {
                    System.out.print("Digite o nome do produto: ");
                    String nome = scn.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scn.nextDouble();
                    System.out.print("Digite a categoria do produto: ");
                    String categoria = scn.nextLine();
                    Product p = new Product(nome, preco, categoria);
                    produtos.add(p);
                    categorias.add(categoria);
                    mapaProdutos.put(nome.toLowerCase(), p);
                    System.out.println("Produto Adicionado com sucesso!");
                    break;
                }
                case 2: {
                    for (Product p : produtos) {
                        System.out.println(p);
                    }
                    break;
                }
                case 3: {
                    System.out.print("Digite o nome do produto: ");
                    String busca = scn.nextLine().toLowerCase();
                    Product encontrado = mapaProdutos.get(busca);
                    if (encontrado != null) {
                        System.out.println("Produto encontrado: " + encontrado);
                    } else {
                        System.out.println("Produto nao encontrado!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome do produto a remover: ");
                    String nomeRemover = scn.nextLine();
                    Product temp = new Product(nomeRemover, 0, "");

                    if (produtos.remove(temp)) {
                        mapaProdutos.remove(nomeRemover.toLowerCase());
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto nao encontrado!");
                    }
                    break;
                }
                case 5: {
                    produtos.sort(Comparator.comparing(Product::getName));
                    for (Product p : produtos) {
                        System.out.println(p);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Produtos embaralhados com sucesso!");
                    Collections.shuffle(produtos);
                    for (Product p : produtos) {
                        System.out.println(p);
                    }
                    break;
                }
                case 7: {
                    System.out.println("Estatisticas:");
                    System.out.println("Quantidade de produtos: " + produtos.size());
                    System.out.println("Quantidade de categorias: " + categorias.size());

                    System.out.println("Menor preço:  R$"
                            + produtos.stream().map(Product::getPrice).min(Double::compare).orElse(0.0));
                    System.out.println("Maior preço:  R$"
                            + produtos.stream().map(Product::getPrice).max(Double::compare).orElse(0.0));
                    break;
                }
                case 0: {
                    System.out.println("Encerando sistema...");
                    break;
                }
                default: {
                    System.out.println("Opcao invalida!");
                }
            }
        } while (opcao != 0);
    }
}
