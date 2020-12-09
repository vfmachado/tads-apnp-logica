import java.util.Scanner;

public class Vetores02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAMANHO = 5;

        float[] notas;
        notas = new float[TAMANHO];  

        System.out.println("Informe as " + TAMANHO + " notas da turma");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i+1));
            notas[i] = in.nextFloat();
        }
        
        System.out.println("Suas notas digitadas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + "\t");
        }
        System.out.println();


        //QUAL A MAIOR NOTA DA TURMA?   => MAIOR VALOR DO VETOR
        float maior = notas[0];
        //PESQUISAR NO VETOR O MAIOR VALOR
        for (int i = 1; i < notas.length; i++) {
            System.out.println("Comparando " + maior + " com " + notas[i]);
            if (notas[i] > maior) {
                maior = notas[i];
                System.out.println("Maior alterado!!!");
            }
        }
        System.out.println("A maior nota foi " + maior);

        /*
            PILHA DE CONTAS E QUERO SEPARAR A MAIOR CONTA...

            50     20   70      100     40
                                        ^^

            MAIOR = 100;

        */

    }

}
