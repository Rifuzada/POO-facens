package main;

import java.util.Scanner;

class Veiculo{
    String marca;
    String modelo;

    Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modeo: " + modelo);
    }
}

class Carro extends Veiculo{
    int ano;
    String cor;

    Carro(String marca, String modelo){
        super(marca, modelo);
        this.ano = 0;
        this.cor = "Nao informada";

    }

    Carro(String marca, String modelo, int ano, String cor){
        super(marca, modelo);
        this.ano = ano;
        this.cor = (cor == null || cor.isEmpty()) ? "Indefinida" : cor;
    }

    void exibirDetalhes(){
        System.out.println("=====DADOS COMPLETOS DO CARRO=====");
        exibirInfo();
        System.out.println("Ano: " + (ano > 0 ? ano : "Nao informado"));
        System.out.println("Cor: " + cor);
    }
}
public class TesteCarro{
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            System.out.println("===SISTEMA DE CADASTRO DE CARROS===");
            System.out.println("Digite a marca do carro: ");
            String marcaDoCarro = scn.nextLine().trim();
            System.out.println("Digite o modelo do carro:  ");
            String modeloDoCarro = scn.nextLine().trim();
            System.out.println("Deseja informar o ano e a cor? (S/N)");
            String resposta = scn.nextLine().trim().toLowerCase();
            Carro meuCarro;
            if(resposta.equals("s")){
                System.out.println("Digite o ano do carro: ");
                int anoDoCarro = 0;
                try{
                    anoDoCarro = Integer.parseInt(scn.nextLine());
                } catch (NumberFormatException e) {
                    // TODO: handle exception
                    System.err.println("Ano invalido! Usando valor padrao (0)");
                }
                System.out.println("Digite a cor do carro: ");
                String corDoCarro = scn.nextLine().trim();
                meuCarro = new Carro(marcaDoCarro, modeloDoCarro, anoDoCarro, corDoCarro);
            }else{
                meuCarro = new Carro(marcaDoCarro, modeloDoCarro);
            }
            System.out.println("\nProcessando Informacoes...");
            try {
                Thread.sleep(1000);
                meuCarro.exibirDetalhes();
                scn.close();
            } catch (InterruptedException e) {
                System.err.println("Erro na pausa!");
            }
        } catch (Exception e) {
            System.err.println("Erro");
        }

    }
}
