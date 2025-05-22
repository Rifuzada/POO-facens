package model;

class AlunoEnsinoFundamental implements Estudante {
    private String nome;
    private int id;
    private double mediaBimestral;

    public AlunoEnsinoFundamental(String nome, int id, double media) {
        this.nome = nome;
        this.id = id;
        this.mediaBimestral = media;

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
        return mediaBimestral;
    }

    @Override
    public int compareTo(Estudante outro) {
        return Double.compare(outro.calcNotaFinal(), this.calcNotaFinal());
    }
}
