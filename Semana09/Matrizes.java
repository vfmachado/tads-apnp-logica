import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
         * 2 x 3
         * 
         * 10 20 30 40 50 60
         */

        // linha, coluna
        int[][] matriz = new int[4][6];

        matriz[0][0] = 10;
        matriz[1][1] = 50;
        matriz[1][2] = 60;

        /*
         * for (int linha = 0; linha < 2; linha++) {
         * System.out.println("Vamos comecar a linha " + linha); for (int coluna = 0;
         * coluna < 3; coluna++) {
         * 
         * System.out.println("Linha: " + linha + " e Coluna: " + coluna );
         * 
         * } }
         */

        while (true) {

            int lin = in.nextInt();
            int col = in.nextInt();
            int valor = in.nextInt();

            matriz[lin][col] = valor;
            System.out.println();

            System.out.print("\t");
            for (int i = 0; i < 6; i++) {
                System.out.print("\t#" + i);
            }
            System.out.println();

            for (int linha = 0; linha < matriz.length; linha++) {
                System.out.print("Linha #" + linha);
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    System.out.printf("\t%d", matriz[linha][coluna]);
                }
                System.out.println();
            }

        }
    }

}
