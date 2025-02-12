public class Main_Intro {
    public static void main(String[] args) {
        mostrarAlgo("rafael");
        soma(1,2);
    }
    
    public static void mostrarAlgo(String nome){
        System.out.println(nome); 
    }
    public static void soma(int num1, int num2){
        int result = num1 + num2;
        System.out.println("O resultado da soma e: "+result);
    }
}

