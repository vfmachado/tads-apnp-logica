import java.util.Scanner;

public class ExBreakContinue {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Laco.. " + i);

            if (i % 2 == 0) {
                System.out.println("\t e eh par.");
                continue;   //quebrou o fluxo de execucao aqui... e voltou la para parte do incremento do for!!
            }

            if (i % 5 == 0) {
                System.out.println("\t e eh divisivel por 5");
            }

            if (i % 7 == 0) {
                System.out.println("no 7... break");
                break;  //faz com que o laco termine!!!
            }

            System.out.println("Parte final do for...");
        }


    }

}