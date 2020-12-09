import java.util.Scanner;

public class Matrizes03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas e colunas da matriz");
        int linhas = in.nextInt();
        
        int[][] matriz = new int[linhas][];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Para a linha " + (i+1) + " quantos valores serao associados?");
            int colunasDaLinha = in.nextInt();
            matriz[i] = new int[colunasDaLinha];
        }

        System.out.println();
        // i => linha
        for (int i = 0; i < matriz.length; i++) {

            // j => coluna
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
