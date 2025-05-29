package model;

import java.util.*;

public interface Estudante extends Comparable<Estudante> {
    String getNome();

    int getId();

    double calcNotaFinal();

}
