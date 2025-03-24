package model;

public class filme {
    private String nome;
    private int duracaoMin;
    private String genero;

    public String getGenero() {
        System.out.println(genero);
        return genero;
    }
    public void setGenero(String genero) throws Exception {
        genero = genero.toUpperCase();
        if(genero.equals("ROMANCE") || genero.equals("TERROR") || genero.equals("COMEDIA")){
            this.genero = genero;
        }else{
            throw new Exception("O filme deve ser de Romance, Terror ou comedia.");
        }
    }
    public int getDuracaoMin() {
        System.out.println(duracaoMin);
        return duracaoMin;
    }
    public void setDuracaoMin(int duracaoMin) throws Exception {
        if(duracaoMin > 300){
            throw new Exception("O filme nao pode ter mais que 300 minutos");
        }else if(duracaoMin < 0){
            throw new Exception("O filme nao pode ter menos que 0 minutos");
        }
        this.duracaoMin = duracaoMin;
    }
    public String getNome() {
        System.out.println(nome);
        return nome;
    }
    public void setNome(String nome)throws Exception {
        if(nome.length() > 100) {
            throw new Exception("O nome do filme nao pode passar 100 caracteres.");
        }else if(nome == ""  || nome == null || nome.isEmpty()){
            throw new Exception("O filme precisa ter um nome.");
        }else{
            this.nome = nome;
        }
    }
}
