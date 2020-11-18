import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /*
        //int[] vetor = {10, 51, 63, 99, 12};
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
              
        System.out.println("Seu vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        */

        //SEQUENCIA DE FIBONACCI
        /*
        0 1 1 2 3 5 8 13 21 ...
        */

        //Crie um vetor com os 100 primeiros elementos da sequencia de fibonacci

        int[] fib = new int[50];
        fib[0] = 0;
        fib[1] = 1;

        //fib[2] = fib[1] + fib[0]
        //fib[3] = fib[2] + fib[1]
        //fib[4] = fib[3] + fib[2]
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("Fibonacci: ");
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + "  ");
        }
        System.out.println();


    }

}
