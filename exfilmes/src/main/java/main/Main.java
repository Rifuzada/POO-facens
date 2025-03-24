package main;

import model.filme; 

public class Main {
    public static void main(String[] args) {
        filme f = new  filme();

        try {
            f.setNome("Sexta Feira 13");
            f.getNome();
            f.setDuracaoMin(120);
            f.getDuracaoMin();
            f.setGenero("terror");
            f.getGenero();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}