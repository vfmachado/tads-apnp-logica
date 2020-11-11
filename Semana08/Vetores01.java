import java.util.Scanner;

public class Vetores01 {

    public static void main(String[] args) {
        
        /*
        Faça um programa que leia um vetor X[5]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

        entrada: [ 35, 49, -10, -3, 0 ]

        saida:   [ 35, 49, 1, 1, 1 ]
                -->
                 
        */

        Scanner in = new Scanner(System.in);
        int[] vetor = new int[8];

        System.out.println("Informe os " + vetor.length + " valores");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();

            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

}
