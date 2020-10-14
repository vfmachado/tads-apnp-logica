import java.util.Scanner;

public class Lista04Ex25 {

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        /*
            34 é quadrado perfeito? NÃO ... PQ?

                x * x == 34 ?       34 / x == x

                1 * 1 == 34 ?
                2 * 2 == 34 ?
                ...
                6 * 6 == 34 ? 36
        */


        int tentativas = 1;

        while ( tentativas * tentativas < number ) {        
            tentativas++;
        }

        if (tentativas * tentativas == number) {
            System.out.println("eh quad perfeito");
        } else {
            System.out.println(" ooops... nao deu!!");
        }

        //prova real 
        //System.out.println(Math.sqrt(number));
    }

}
