import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random aleat;
        
        int tam = 8;
        int valor = 5;

        //vetor de tamanho tam e todos valores iguais a valor.
        int[] vet = new int[tam];
        Arrays.fill(vet, valor);

        System.out.println("VET");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d  ", vet[i]);
        }
        System.out.println();

        //algoritmos sort
        int[] meuVetor = {4, 2, 1, 3, 8, 3, 5, 0, 9};
        
        //copiar um vetor inteiro
        int[] copia = new int[meuVetor.length];
        System.arraycopy(meuVetor, 0, copia, 0, meuVetor.length);
        
        copia[0] = 10;

        Arrays.sort(meuVetor);
        System.out.println("MEU VETOR");
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.printf("%d  ", meuVetor[i]);
        }
        System.out.println();

        System.out.println("COPIA");
        for (int i = 0; i < copia.length; i++) {
            System.out.printf("%d  ", copia[i]);
        }
        System.out.println();
       
        boolean iguais = Arrays.equals(meuVetor, copia);
        System.out.println(iguais);

        copia[0] = 4;
        Arrays.sort(copia);

        iguais = Arrays.equals(meuVetor, copia);
        System.out.println(iguais);

        int busca = 6;
        int posicao = Arrays.binarySearch(meuVetor, busca);
        System.out.println("Valor " + busca +  " encontrado  na posicao " + posicao);


    }
}
