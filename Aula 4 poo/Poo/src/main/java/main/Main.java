package main;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        try {
            v.setModelo("Comodoro");
            v.setMarca("Chevrolet");
            v.setCombustivel("Gasolina");
            v.setAno(1977);
            v.setPotencia(80);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("Vendo este carro:");
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Modelo: " + v.getModelo());
        System.out.println("Potencia: " + v.getPotencia() + "cv");
        System.out.println("Combustivel: " + v.getCombustivel());
        System.out.println("Ano: " + v.getAno());
        
    }
}
