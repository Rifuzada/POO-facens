package main;

import controller.BibliotecaController;
import view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        BibliotecaView view = new BibliotecaView();
        BibliotecaController controller = new BibliotecaController(view);
        controller.executar();
    }
}
