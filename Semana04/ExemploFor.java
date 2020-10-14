import java.util.Scanner;

public class ExemploFor {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = 0;
        while (number < 10) {
            System.out.println("Exatamente... " + number);
            number++;
        }

        //for (inicializacao ; teste ; passo) { }
        for (int i = 0; i < 10; i++ ) {
            System.out.println("FOR ... " + i);
        }

    }

}
