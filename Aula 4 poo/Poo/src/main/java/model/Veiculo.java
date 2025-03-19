package model;

public class Veiculo {
    public String modelo;
    public int potencia;
    public String combustivel;
    public String marca;
    public int ano;
    public static void main(String[] args){
        Veiculo v = new Veiculo();
        
        v.modelo = "Comodoro";
        v.marca = "Chevrolet";
        v.potencia = 180;
        v.combustivel = "Gasolina";
    }
}
