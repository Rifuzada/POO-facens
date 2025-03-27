package main;

public class Matematica{
        public int soma(int a, int b){
            return a + b;
        }   
        public int soma(int a,int b ,int c){
            return a + b +c;
        }
        public int soma(int[] lista){
            int result = 0;
            for(int n : lista){
                result += n;
            }
            return result;
        }
        public static void main(String[] args) {
            Matematica mat = new Matematica();
            int[] array  = {1,2,3,4,5,6,7,8,9};
            int x = mat.soma(1,2);
            int y = mat.soma(3, 4,5);
            int z = mat.soma(array);
            System.out.println("x = "+ x +"\ny = "+ y+ "\nz = " + z);
            OperacaoComArrays op  = mat.new OperacaoComArrays();

            System.out.print("\nImprimindo o array completo: ");
            op.printArray(array);

            System.out.print("\nImprimindo os 5 primeiros elementos do array: ");
            op.printArray(array, 5);
            
            System.out.print("\nImprimindo o array do numero 2 ao 6: ");
            op.printArray(array, 2, 6);
            
        }
        public class OperacaoComArrays{
            public void printArray(int[] array){
                for(int i=0; i< array.length; i++){
                    System.out.print(array[i] +  " ");
                }
                System.out.println();
            }            
            public void printArray(int[] array,int qtd){
                int limite = Math.min(qtd, array.length);
                for(int i=0; i< limite; i++){
                    System.out.print(array[i] +  " ");
                }
                System.out.println();
            }
            public void printArray(int[] array,int inicio,int fim){
                if(inicio < 0 || fim >= array.length || inicio > fim){
                    System.err.println("Intervalo invalido.");
                    return;
                }
                for(int i=inicio; i< fim; i++){
                    System.out.print(array[i] +  " ");
                }
                System.out.println();
            }
            
        }
}