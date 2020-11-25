import java.util.Random;
import java.util.Scanner;

public class Matrizes02 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe quantas linhas e colunas tem a matriz");
        final int LINHAS = in.nextInt();
        final int COLUNAS = in.nextInt();
        
        String[][] mat = new String[LINHAS][COLUNAS];

        Random aleatorio = new Random();
        int contador = 0;
        int totalJOG;
        do {

            int contLinha = aleatorio.nextInt(LINHAS);  //0 até (linhas -1)
            int contColuna = aleatorio.nextInt(COLUNAS);
            System.out.printf("\nLinha: %d\tColuna: %d", contLinha, contColuna);
            String palavra = contador % 2 == 0 ? "JOG" : "ENE";
            contador++;
            //OPERADOR TERNARIO
            // teste ? bloco1 : bloco2
            /*
            if (teste) {
                bloco1
            } else
                bloco2
            */

            System.out.println("\n====================");
            mat[contLinha][contColuna] = palavra;
            int nulos = 0;
            totalJOG = 0;
            for (int linha = 0; linha < LINHAS; linha++) {
                for (int coluna = 0; coluna < COLUNAS; coluna++) {
                    System.out.print(mat[linha][coluna] + "  ");

                    if (mat[linha][coluna] != null && mat[linha][coluna].equals("JOG")) 
                        totalJOG++;

                    if (mat[linha][coluna] == null)
                        nulos++;
                }
                System.out.println();
            }
            System.out.println("====================\n");
            

            if (nulos == 0) break;
        } while(true);

        System.out.println("Acabamos depois de ... " + contador + " vezes.");
        int totalENE = LINHAS * COLUNAS - totalJOG;
        System.out.println(totalJOG > totalENE ? "Jogador ganhou" : "Enemy ganhou");
    }

}
