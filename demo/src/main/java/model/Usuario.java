package model;

public class Usuario {
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String novaSenha) throws Exception {
        if(novaSenha.length() < 6){
            throw new Exception("Sua senha precisa ter pelo menos 6 caracteres.");
        }else{
            this.senha = novaSenha;        
        }
    }
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        try {
            u1.setLogin("Rafael");
            u1.setSenha("123");
            System.out.println(u1.getLogin());
            System.out.println(u1.getSenha());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
    
}
