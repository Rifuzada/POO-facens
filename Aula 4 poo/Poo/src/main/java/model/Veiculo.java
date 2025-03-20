package model;

public class Veiculo {
    private String modelo;
    private int potencia;
    private String combustivel;
    private String marca;
    private int ano;
    
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) throws Exception {
        if(potencia < 70){
            throw new Exception("A potencia é invaida. ");
        }
        this.potencia = potencia;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) throws Exception {
        if(combustivel != "Gasolina" && combustivel != "Diesel"){
            throw new Exception("Combustivel nao aceito!");
        }
        this.combustivel = combustivel;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo) throws Exception{
        if( modelo == null || modelo.trim().isEmpty()){
            throw new Exception("Modelo é obrigatorio. ");
        }
        this.modelo = modelo;
    }
    public static void main(String[] args){
        Veiculo v = new Veiculo();
        try {
            v.setModelo("Comodoro");
            v.setPotencia(60);
            v.setCombustivel("Gasolina");
            v.setAno(1977);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
