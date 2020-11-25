
public class Matrizes01 {

    public static void main(String[] args) {
        
        /*
        1A  1B  1C  |   | 1D  1E  1F
        2A  2B  2C  |   | 2D  2E  2F
        3A  3B  3C  |   | 3D  3E  3F
        4A  4B  4C  |   | 4D  4E  4F
        5A  5B  5C  |   | 5D  5E  5F        
        */
        //variaveis e constantes
        //FINAL => CONSTANTE!
        final int LINHAS = 6;
        final int COLUNAS = 4;
        boolean[][] lugares = new boolean[LINHAS][COLUNAS];

        //lugares.length == 6 => true
        //comecar em 0 e ir ate 5!

        lugares[1][3] = true;

        lugares[2][0] = true;
        lugares[2][1] = true;

        int algumContador = 0;
        for (int linha = 0; linha < LINHAS; linha++) {
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                if (lugares[linha][coluna] == false) {
                    System.out.print("Disp.  ");
                } else {
                    System.out.print("  X    ");
                    algumContador++;
                }
            }
            System.out.println();
        }
        
        System.out.println("\nTotal de lugares ocupados: " + algumContador);

        System.out.println("Lugares Disponiveis: " + (LINHAS * COLUNAS - algumContador));
    }

}
