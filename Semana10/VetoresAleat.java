import java.security.SecureRandom;
import java.util.Random;

public class VetoresAleat {

    public static void main(String[] args) {
        
        SecureRandom r2 = new SecureRandom();
        Random r = new Random();
        int[] vet = new int[6];

        for (int i = 0; i < 100; i++) {
            vet[r2.nextInt(6)]++;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Valor " + (i + 1) + " saiu " + vet[i] + " vezes");
        }
    }

}
