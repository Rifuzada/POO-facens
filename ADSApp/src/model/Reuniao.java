package model;

public class Reuniao{
    private String data;
    private String hora;
    private String local;

    public Reuniao(String data, String hora, String local) {
        this.data = data;
        this.hora = hora;
        this.local = local;
    }

   
    public void exibirDetalhes() {
        System.out.println("Data: " + data + ", Hora: " + hora + ", Local: " + local);
    }
}