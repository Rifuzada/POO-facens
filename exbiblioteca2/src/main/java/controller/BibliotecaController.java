package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Livro;
import view.BibliotecaView;

/**
 * Controlador que gerencia a lógica da biblioteca.
 */
public class BibliotecaController {
    private final List<Livro> livros;
    private final Set<String> generos;
    private final Map<String, Livro> mapaLivros;
    private final BibliotecaView view;

    public BibliotecaController(BibliotecaView view) {
        this.view = view;
        livros = new ArrayList<>();
        generos = new HashSet<>();
        mapaLivros = new HashMap<>();
    }

    public void executar() {
        int opcao;
        do {
            view.mostrarMenu();
            opcao = view.lerOpcao();
            switch (opcao) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    buscarPorTitulo();
                    break;
                case 4:
                    removerLivro();
                    break;
                case 5:
                    ordenarPorTitulo();
                    break;
                case 6:
                    embaralharAcervo();
                    break;
                case 7:
                    mostrarEstatisticas();
                    break;
                case 8:
                    filtrarPorGenero();
                    break;
                case 0:
                    view.mostrarMensagem("Saindo... Obrigado por usar o sistema!");
                    break;
                default:
                    view.mostrarMensagem("Opção inválida! Tente novamente.");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
    }

    private void adicionarLivro() {
        view.mostrarMensagem("=== Adicionar Livro ===");
        String titulo = view.lerTexto("Título: ");
        if (mapaLivros.containsKey(titulo.toLowerCase())) {
            view.mostrarMensagem("Livro já cadastrado com esse título!");
            return;
        }
        String autor = view.lerTexto("Autor: ");
        String genero = view.lerTexto("Gênero: ");
        int paginas = view.lerInteiro("Número de Páginas: ");

        Livro livro = new Livro(titulo, autor, genero, paginas);

        livros.add(livro);
        generos.add(genero);
        mapaLivros.put(titulo.toLowerCase(), livro);

        view.mostrarMensagem("Livro adicionado com sucesso!");
    }

    private void listarLivros() {
        view.mostrarMensagem("=== Lista de Livros ===");
        view.mostrarLivros(livros);
    }

    private void buscarPorTitulo() {
        view.mostrarMensagem("=== Buscar por Título ===");
        String busca = view.lerTexto("Informe o título do livro: ").toLowerCase();
        Livro livro = mapaLivros.get(busca);
        if (livro != null) {
            view.mostrarMensagem("Livro encontrado:");
            view.mostrarMensagem(livro.toString());
        } else {
            view.mostrarMensagem("Livro não encontrado.");
        }
    }

    private void removerLivro() {
        view.mostrarMensagem("=== Remover Livro ===");
        String titulo = view.lerTexto("Informe o título do livro para remover: ").toLowerCase();
        Livro livro = mapaLivros.remove(titulo);
        if (livro != null) {
            livros.remove(livro);
            atualizarGeneros();
            view.mostrarMensagem("Livro removido com sucesso.");
        } else {
            view.mostrarMensagem("Livro não encontrado para remoção.");
        }
    }

    private void ordenarPorTitulo() {
        view.mostrarMensagem("=== Ordenar por Título ===");
        if (livros.isEmpty()) {
            view.mostrarMensagem("Nenhum livro cadastrado.");
            return;
        }
        Collections.sort(livros);
        listarLivros();
    }

    private void embaralharAcervo() {
        view.mostrarMensagem("=== Acervo Embaralhado ===");
        if (livros.isEmpty()) {
            view.mostrarMensagem("Nenhum livro cadastrado.");
            return;
        }
        Collections.shuffle(livros);
        listarLivros();
    }

    private void mostrarEstatisticas() {
        view.mostrarMensagem("=== Estatísticas da Biblioteca ===");
        view.mostrarMensagem("Total de livros cadastrados: " + livros.size());
        view.mostrarMensagem("Total de gêneros únicos: " + generos.size());

        livros.stream().max(Comparator.comparingInt(Livro::getNumPaginas))
                .ifPresent(l -> view.mostrarMensagem("Livro com maior número de páginas: " + l));
        livros.stream().min(Comparator.comparingInt(Livro::getNumPaginas))
                .ifPresent(l -> view.mostrarMensagem("Livro com menor número de páginas: " + l));
    }

    private void filtrarPorGenero() {
        view.mostrarMensagem("=== Filtrar por Gênero ===");
        String generoFiltro = view.lerTexto("Digite o gênero: ");
        List<Livro> filtrados = livros.stream()
                .filter(l -> l.getGenero().equalsIgnoreCase(generoFiltro))
                .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            view.mostrarMensagem("Nenhum livro encontrado para o gênero informado.");
        } else {
            view.mostrarMensagem("Livros do gênero '" + generoFiltro + "':");
            view.mostrarLivros(filtrados);
        }
    }

    private void atualizarGeneros() {
        generos.clear();
        for (Livro l : livros) {
            generos.add(l.getGenero());
        }
    }
}
