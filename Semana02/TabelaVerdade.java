import java.util.Scanner;

public class TabelaVerdade {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        boolean a, b;

        a = true;
        b = false;
        
        //operador e: && 
        /*
            V e V = V
            V e F = F
            F e V = F
            F e F = F
        */

        //operador ou: ||
        /*
            V ou V = V
            V ou F = V
            F ou V = V
            F ou F = F
        */

        //verifica se ambos os valores são verdadeiros
        if ( a && b) {}
        
        float media = 7; boolean matriculado = true;
        if (media >= 7 && matriculado) {}       //se a media é igual ou maior que 7 e o valor de matriculado é true

        media = 4;
        float valorRecuperacao = 8;
        if (media >= 7 || valorRecuperacao >= 7) {
            //false     ou    //true    ==> VERDADEIRO!!!
        }

    }
}