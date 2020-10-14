import java.util.Scanner;

public class ForSync {

    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);

        /*
            VARIAVEIS (STRINGS)
            SCANNER
            IF
            ELSE    (CONDICOES SIMPLES, COMPOSTAS && e || )
            
            WHILE
                nao sei quantas vezes eu quero repetir

            DO .. WHILE
                eu sei que quero repetir pelo menos uma vez...

            FOR - outra estrutura repetição
                sei quantas vezes eu quero repetir / tenho uma estrutura bem definida de repeticao
        */

        //n só vale DENTRO do FOR
        for (int n = 99 ; n >= 1 ;  n -= 2 ) {
            System.out.print(n + " ");
        }

        //for (inicio ; teste ; passo)
        
        int a;
        for (a = 0;  a < 5; a++) {
            System.out.println("Valor de 'a' dentro do for: " + a);
        }
        //a = 5; a < 5 => false
        System.out.println("\nValor de 'a' fora do for: " + a);  //qual será o valor printado?


        int b;
        b = 0;
        while (b <= 5) {
            b++;
            for (int c = b+1; c <= 5; c++) {
                if (b != c)
                    System.out.println("[" + b + ", " + c + "] eh um par");
            }
        }


        

    }

}
