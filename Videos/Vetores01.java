import java.util.Scanner;

//array
public class Vetores01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAMANHO = 10;

        int[] notas;
        notas = new int[TAMANHO];   //TAMANHO VALOR INTEIRO

        int[] notas2 = new int[10];

        int[] vetor = {10, 15, 20, 8, 0, 5, 18};    //tamanho 7 e o ultimo indice e 6
                    // 0    1   2   3 4  5   6
        
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.println("na pos " + indice + " tem o valor " + vetor[indice]);        
        }
        
    }

}
