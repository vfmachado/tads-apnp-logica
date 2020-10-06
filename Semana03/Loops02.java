import java.util.Scanner;

public class Loops02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int number;

        //repita/faça ... enquanto o input for >= 0, 
        //do ... while
        do {
            System.out.println("Informe um valor... (< 0 para sair)");
            number = in.nextInt();
        } while (number >= 0);

        System.out.println("Estou fora da repeticao!");
    }

}