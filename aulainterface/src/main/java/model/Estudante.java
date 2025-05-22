package model;

import java.util.*;

interface Estudante extends Comparable<Estudante> {
    String getNome();

    int getId();

    double calcNotaFinal();

}
