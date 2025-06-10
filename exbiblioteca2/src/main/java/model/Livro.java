package model;

import java.util.Objects;

/**
 * Modelo que representa um Livro.
 */
public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private String genero;
    private int numPaginas;

    public Livro(String titulo, String autor, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return titulo.equalsIgnoreCase(livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("Título: %s | Autor: %s | Gênero: %s | Páginas: %d",
                titulo, autor, genero, numPaginas);
    }

    @Override
    public int compareTo(Livro outro) {
        return this.titulo.compareToIgnoreCase(outro.titulo);
    }
}
