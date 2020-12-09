import java.util.Random;
import java.util.Scanner;

public class ForcaTeste {

    static void mostraPalavra(String palavra, boolean[] corretas) {

        for (int i = 0; i < corretas.length; i++) {
            if (corretas[i])
                System.out.print(" " + palavra.charAt(i) + " ");
            else 
                System.out.print(" _ ");
        }
        System.out.println();

    }


    static void mostraVetor(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + "  ");
        }
        System.out.println();
    }
    

    static void verificaLetra(String palavra, char letra, boolean[] posicoes) {
        for (int i = 0; i < palavra.length(); i++) {
            if (letra == palavra.charAt(i)) {
                posicoes[i] = true;
            }
        }
    }


    static boolean ganhou(boolean[] tdTrue) {
        for (int i = 0; i < tdTrue.length; i++) {
            if (tdTrue[i] == false)
                return false;
        }
        return true;
    } 

    public static void main(String[] args) {
     
        boolean[] testeGanhou = {true, true, true};
        System.out.println(ganhou(testeGanhou));


        boolean[] testeNaoGanhou = {true, true, false};
        System.out.println(ganhou(testeNaoGanhou));


    }

}
