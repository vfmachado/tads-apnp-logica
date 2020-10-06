import java.util.Scanner;

public class Loops01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int number = 0;

        //enquanto o input for >= 0, repita
        while (number >= 0) {
            System.out.println("Informe um valor...");
            number = in.nextInt();
        }

        System.out.println("Estou fora da repeticao!");
    }

}