package model;

public class Funcionario {
    private String nome;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario(String nome, double salario) throws Exception {
        this.nome = (nome == null || nome.isEmpty()) ? "Nome não informado" : nome;
        if (salario <= 0) {
            throw new Exception("Salario não pode ser negativo ou igual a 0");
        } else {
            this.salario = salario;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
