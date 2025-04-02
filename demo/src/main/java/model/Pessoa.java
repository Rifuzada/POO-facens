package model;

public class Pessoa {
    private String nome;
    private int dataNascimento;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void calcularIdade(int dataNascimento, int ano){
        ano = 2025;
        int idade =  ano - dataNascimento;
        System.out.println(idade);
    }
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setDataNascimento(2005);
        p1.calcularIdade(p1.dataNascimento, 2025);
        p1.setNome("Rafael");
        System.out.println(p1.getDataNascimento());
        System.out.println(p1.getNome());
        
    }
}
