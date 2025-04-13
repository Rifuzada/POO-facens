package model;

import model.Funcionario;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public String getDepartamento() {
        return departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public Gerente(String nome, double salario, String departamento) throws Exception {
        super(nome, salario);
        this.departamento = (departamento == null || departamento.isEmpty()) ? "Departamento nao informado"
                : departamento;
        this.bonus = 1000;
    }

    public Gerente(String nome, double salario, String departamento, double bonus) throws Exception {
        super(nome, salario);
        this.departamento = (departamento == null || departamento.isEmpty()) ? "Departamento nao informado"
                : departamento;
        if (bonus < 1000) {
            throw new Exception("Bonus não pode ser menor que 1000");
        } else {
            this.bonus = bonus;
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Departamento: " + departamento);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salario total: " + (getSalario() + bonus));
    }
}
