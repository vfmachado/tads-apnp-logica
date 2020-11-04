import java.util.Scanner;

public class Array01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do vetor/array");
        
        final int ARRAY_LENGTH = in.nextInt(); 
        int[] numeros = new int[ARRAY_LENGTH]; 

        for (int counter = 0; counter < array.length; counter++) {
            System.out.println("Informe o valor para a posicao " + counter);
            numeros[counter] = in.nextInt();
        }

    }

}
