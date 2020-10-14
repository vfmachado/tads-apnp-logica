import java.util.Scanner;

public class ExemploFor03 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();

        //for (inicializacao ; teste ; passo) { }
        for ( ; i != 10 ; i *= 2 ) {    //i = i * 2
            System.out.println("FOR ... " + i);
            i = in.nextInt();
        }


    }

}
