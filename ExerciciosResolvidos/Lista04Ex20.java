import java.util.Scanner;

public class Lista04Ex20 {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int lado = in.nextInt();

        int n = 0;

        while (n < lado * lado) {
            
            System.out.print("*");
            n++;

            if (n % lado == 0) {
                System.out.println();
            }

        }
    
        System.out.println();
        
    }

}
