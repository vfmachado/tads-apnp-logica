import java.util.Scanner;

public class Vetores02 {

    public static void main(String[] args) {
        
        String texto;   //nada mais eh do que um vetor de char!
        Scanner in = new Scanner(System.in);

        System.out.println("Diga uma frase: ");
        texto = in.nextLine();
        
        System.out.println("Informe a posicao inicial e a posicao final desejada");
        int posInicial = in.nextInt();
        int posFinal = in.nextInt();
        /*
            QUANDO ESSA MAQUINA CHAMADA CORPO NAO FAZ O QUE AMA, MORRE AOS POUCOS.

            7 15
            ESSA MAQ

            .charAt(int posicao)
                exatamente o equivalente a [posicao]
        */

        //if (posInicial >= 0 && posInicial < texto.length()) //posicao inicial esta dentro do texto
        
        if (posFinal < posInicial) {
            int troca = posFinal;
            posFinal = posInicial;
            posInicial = troca;
        }

        for (int i = posInicial; i < posFinal; i++) {
            if (i % 2 == 0)
                System.out.print(texto.toUpperCase().charAt(i));
            else
                System.out.print(texto.toLowerCase().charAt(i));
        }
        System.out.println();

        //TIPO PRIMITIVO!!!
        // == PARA COMPARAR
        char[] textoEmChar = texto.toCharArray();   
        //textoEmChar[0]

    }

}
