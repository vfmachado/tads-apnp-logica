import java.util.Random;
import java.util.Scanner;

public class Forca {

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
        
        /*
            JOGO DA FORCA

            1. escolhe a palavra
            1.5 Mostra a palavra com os __
            2. diz uma letra
            3. marca a letra
            4. verifica se tem na palavra
                se acertou, anota na posicao certa  && palavra completa
                se errou, perde uma vida   && vidas >= 0
            volta ao passo 1.5
        */

        Scanner in = new Scanner(System.in);

        System.out.println("BEM VIND@ AO SUPER JOGO DA FORCA!!");
        String[] palavras = {"Fire", "Cold", "Poison", "Acid",
        "Holy", "Psychic","Necrotic", "Lightning", "Thunder", "Energy"};

        Random aleat = new Random();
        String sorteada = palavras[aleat.nextInt(palavras.length)].toUpperCase();
        boolean[] corretas = new boolean[sorteada.length()];

        int quantTentativas = 0;
        char[] letrasUtilizadas = new char[26];

        //System.out.println(sorteada);

        do {

            mostraPalavra(sorteada, corretas);

            System.out.println("Digite uma letra");
            char letra = in.next().toUpperCase().charAt(0);

            letrasUtilizadas[quantTentativas] = letra;
            quantTentativas++;

            mostraVetor(letrasUtilizadas);

            verificaLetra(sorteada, letra, corretas);

            if (ganhou(corretas))
                break;
        } while (true);

        mostraPalavra(sorteada, corretas);
        System.out.println("Parabens!! Vc Acertou!");
    }

}
