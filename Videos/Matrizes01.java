import java.util.Scanner;

public class Matrizes01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] vet = {1, 2, 3, 4}; //criava um vetor de tamanho 4

        //LINHAS COLUNAS
        int[][] matriz = {
        //   0  1  2  3
            {1, 2, 3, 6},   //0
            {2, 1, 3, 5},   //1
            {3, 2, 1, 4}    //2
        };

        //System.out.println(matriz[0][0]);
        //System.out.println(matriz[2][3]);

        //i => linha
        for (int i = 0; i < matriz.length; i++) {

            //j => coluna
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }


    }

}
