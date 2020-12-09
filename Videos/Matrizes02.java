import java.util.Scanner;

public class Matrizes02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas e colunas da matriz");
        int linhas = in.nextInt();
        int colunas = in.nextInt();

        int[][] matriz = new int[linhas][colunas];

        do {
            System.out.println();
            //i => linha
            for (int i = 0; i < matriz.length; i++) {

                //j => coluna
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "  ");
                }
                System.out.println();
            }

            System.out.println("\nInforme uma linha, uma coluna e um valor para atualizar a matriz");
            int linha = in.nextInt();
            int coluna = in.nextInt();
            int valor = in.nextInt();

            matriz[linha][coluna] = valor;

        } while (true);

    }

}
