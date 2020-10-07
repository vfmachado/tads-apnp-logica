import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public static void main(String [] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        //sorteia uma valor de 0 a 99
        int aleatorio = random.nextInt(100);
        int valor = -1;

        int contador = 0;
        while (valor != aleatorio) {
            
            valor = in.nextInt();
            
            if (valor == aleatorio) {
                System.out.println("Vc acertou!");
            } else {
                System.out.println("Vc errou");

                if (valor < aleatorio) {
                    System.out.println("Tente algo maior");
                } else {
                    System.out.println("Quem sabe algo menor");
                }
            }
            contador++;
          
        }

        System.out.println("VC precisou de "  + contador + " tentativas");

    }

}
