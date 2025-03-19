package main;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {
            Veiculo v = new Veiculo();
            
            v.modelo = "Comodoro";
            v.marca = "Chevrolet";
            v.potencia = 180;
            v.combustivel = "Gasolina";
            v.ano = 1977;
            
            System.out.println("Vendo este carro:");
            System.out.println("Marca: " + v.marca);
            System.out.println("Modelo: " + v.modelo);
            System.out.println("Potencia: " + v.potencia);
            System.out.println("Combustivel: " + v.combustivel);
            System.out.println("Ano: " + v.ano);
        
    }
}