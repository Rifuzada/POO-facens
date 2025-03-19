import java.util.Scanner;

public class ExerciciosMetodos {
    public int n1, n2, n3;

    public static void verificar(int n1){
        if(n1 >= 0){
            System.out.println("O numero "+ n1 +" é positivo.");
        }else{
            System.out.println("O numero " + n1 +" é negaivo.");
        };
    }
    public static void media(int n1, int n2, int n3){
        int resultado = (n1 + n2 + n3) / 3;
        System.out.println("O Resultado da media é " + resulado);
    }
    public static void maiorNumero(int n1, int n2, int n3){
        if(n1 > n2){
            if(n2 > n3){
                System.out.println("O numero " + n1 +" é maior que o " + n2 + " que é maior que o " + n3);
            }else{
                System.out.println("O numero " + n1 +" é maior que o " + n3 + " que é maior que o " + n2);
            }
        }else if(n2 > n3){
            if(n3>n1){
                System.out.println("O numero " + n2 +" é maior que o " + n3 + " que é maior que o " + n1);
            }else{
                System.out.println("O numero " + n2 +" é maior que o " + n1 + " que é maior que o " + n3);
            }
        }else if (n3>n1){
            if(n1>n2){
                System.out.println("O numero " + n3 +" é maior que o " + n1 + " que é maior que o " + n2);
            }else{
                System.out.println("O numero " + n3 +" é maior que o " + n2 + " que é maior que o " + n1);
            }
        }
    }
    public static void potencia(double n1, double n2){
        double resultado = Math.pow(n1, n2);
        System.out.println(n1+ "^"+n2 + "=" + resultado);
    }
    public static void minPraHora(double n1){
        double resultado = n1 / 60;
        System.out.println(n1 + "em horas é " + resultado);

    }
    public static void fatorial(int n1){
        int resultado = n1 * (n1-1) * (n1-2);
        System.out.println("o resultado do fatorial de "+ n1 + " é " + resultado);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        boolean continuar = true;
        
        while(continuar) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Verifica positivo e negativo");
            System.out.println("2 - Média aritimética");
            System.out.println("3 - Maior numero");
            System.out.println("4 - Potencia");
            System.out.println("5 - Min p/ hora");
            System.out.println("6 - Fatorial");
            System.out.println("7 - Sair");
            int opcao = scn.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um numero: ");
                    int numero1Verificar = scn.nextInt();
                    verificar(numero1Verificar);
                    break;
                case 2:
                    System.out.println("Escolha um numero: ");
                    int numero1Media = scn.nextInt();
                    System.out.println("Escolha outro numero: ");
                    int numero2Media = scn.nextInt();
                    System.out.println("Escolha mais um numero: ");
                    int numero3Media = scn.nextInt();
                    media(numero1Media, numero2Media, numero3Media);
                    break;
                case 3:
                    System.out.println("Escolha um numero: ");
                    int numero1Maior = scn.nextInt();
                    System.out.println("Escolha outro numero: ");
                    int numero2Maio = scn.nextInt();
                    System.out.println("Escolha mais um numero: ");
                    int numero3Maior = scn.nextInt(); 
                    maiorNumero(numero1Maior, numero2Maio, numero3Maior);   
                    break;
                case 4:
                    System.out.println("Escola um numero: ");
                    double numero1Potencia = scn.nextInt();
                    System.out.println("Escolha outro numero: ");
                    double numero2Potencia = scn.nextInt();
                    potencia(numero1Potencia, numero2Potencia);
                    break;
                case 5:
                    System.out.println("Escola um numero: ");
                    double numero1minPraHora = scn.nextInt();
                    minPraHora(numero1minPraHora);    
                    break;
                case 6:
                    System.out.println("Escola um numero: ");
                    int numero1Fatorial = scn.nextInt();
                    fatorial(numero1Fatorial);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
        }
    }
}
}
