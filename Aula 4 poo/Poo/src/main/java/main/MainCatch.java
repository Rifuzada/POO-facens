package main.java.main;

public class MainCatch {
    public static void main(String[] args){
        int a = 9;
        int b = 0;
        try{
            int c = a + b;
            System.out.println("c="+c);

        }catch(Exception e){
            System.err.println("Ocorreu um problema, verifique os numeros e tente novamente!");
        }
    }
}
