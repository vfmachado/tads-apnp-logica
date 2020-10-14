import java.util.Calendar;
import java.util.Scanner;

public class ForSync2 {

    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int soma = 0;
        /*
        Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.
        */
        
        for (int pares = 2; pares <= n; pares += 2) {
            soma = soma + pares;
        }

        /*
            int pares = 2;
            while (pares <= n) {


                pares += 2;
            }
        */

        System.out.println("A soma dos pares ate " + n + " eh igual a " + soma);

        Calendar calendario = Calendar.getInstance();
        System.out.println(calendario.get(Calendar.MONTH)+1);
    }

}
