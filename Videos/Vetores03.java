import java.util.Scanner;

public class Vetores03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe um texto.");
        String texto = in.nextLine().replaceAll(" ", "");
        char[] textoChar = texto.toCharArray();

        /*
        Palindromos sao palavras ou frases que podem ser lidas da esquerda para a direita ou da direita para a esquerda. Exemplos: 
            ANA
            SAIPPUAKIVIKAUPPIAS     //maior palindromo conhecido
            
            ROMA ME TEM AMOR

        */
        
        boolean ehPalindromo = true;
        for (int i = 0; i < textoChar.length / 2; i++) {
            
            int posComp = textoChar.length -1 -i;
            
            System.out.printf("Posicoes %d %d\n", i, posComp);
            System.out.println(textoChar[i] + " comparando com " + textoChar[posComp]);
            if (textoChar[i] != textoChar[posComp]) {
                ehPalindromo = false;
                break;
            }
        }
        
        System.out.println(ehPalindromo ? "Sim, eh palindromo" : "Oops... isto nao eh um palindromo");

        /*
        troca o numero por uma variavel ...
        i => ultima -i
        i => ultima -i 
        i => ultima -i


        */
    }

}
