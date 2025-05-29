package model;

public class AlunoGraduacao implements Estudante {
    private String nome;
    private int id;
    private double prova1, prova2, trabalho;

    public AlunoGraduacao(String nome, int id, double p1, double p2, double trab) {
        this.nome = nome;
        this.id = id;
        this.prova1 = p1;
        this.prova2 = p2;
        this.trabalho = trab;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double calcNotaFinal() {
        return (prova1 * 0.4) + (prova2 * 0.4) + (trabalho * 0.2);
    }

    @Override
    public int compareTo(Estudante outro) {

        return Double.compare(outro.calcNotaFinal(), this.calcNotaFinal());
    }

}
