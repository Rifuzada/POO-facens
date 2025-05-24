package model;

public interface Estudante extends Comparable<Estudante> {
    String getNome();

    int getId();

    double calcNotaFinal();

}
