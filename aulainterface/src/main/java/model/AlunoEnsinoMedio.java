package model;

class AlunoEnsinoMedio implements Estudante {
    private String nome;
    private int id;
    private double prova1, prova2;

    public AlunoEnsinoMedio(String nome, int id, double p1, double p2) {
        this.nome = nome;
        this.id = id;
        this.prova1 = p1;
        this.prova2 = p2;
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
        return (prova1 + prova2) / 2;
    }

    @Override
    public int compareTo(Estudante outro) {
        return Double.compare(outro.calcNotaFinal(), this.calcNotaFinal());
    }
}
