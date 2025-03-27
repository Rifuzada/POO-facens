package main;

public class Split {
    public static void main(String[] args) {
        String texto = "banana, maça, pera, laranja";

        String[] frutas = texto.split(", ");
        System.out.print("Todas as frutas: ");
        for(String fruta : frutas){
            System.out.print(fruta);
        }
        System.out.print("\nLimitando o numero de splits: ");
        String[] frutasLimitadas = texto.split(",", 3);
        for(String fruta : frutasLimitadas){
            System.out.print(fruta);
        }
    }
}
