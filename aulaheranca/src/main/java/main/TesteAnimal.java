package main;

import java.util.Scanner;

class Animal {

    String nome;

    Animal(String nome){
        this.nome = nome; 
    }

    void mostrarNome(){
        System.out.println("O nome do animal é " + nome);
    }

}
class Cachorro extends Animal{
    Cachorro(String nome){
        super(nome);
    }

    void latir(){
        System.out.println(nome + " esta latindo: Au au!");;
    }
}
public class TesteAnimal{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o nome do cachorro: ");
        String nomeDoCachorro = scn.nextLine();
        Cachorro meuCachorro = new Cachorro(nomeDoCachorro);
        meuCachorro.latir();
        meuCachorro.mostrarNome();
        scn.close();
    }
}