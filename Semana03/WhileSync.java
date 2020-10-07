import java.util.Scanner;

public class WhileSync {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int numero = 0;
        while (numero < 5) {    
            System.out.println("Hello!!!! " + numero);
            numero++;   //numero = numero + 1
        }


        //EXEMPLO COM INTERVALO - [X, Y]
        System.out.println("Informe os limites do intervalor [x, y]");
        int x = in.nextInt();
        int y = in.nextInt();

        /*
            x = 2  e y = 5
                x   s   r
            2   x + 0   2 <= 5 true
            3   x + 1   3 <= 5 true
            4   x + 2   4 <= 5 true
            5   x + 3   5 <= 5 true
            6   x + 4   6 <= 5 false

            x = 1 e y = 100
        */
        int res = x;
        int soma = 0;
        while (res <= y) {
            System.out.println(res);
            soma++;
            res = x + soma;
        }

        /*
            x = 2  e y = 5
                x   
            2   x + 0   2 <= 5 true
            3   (x + 0) + 1   3 <= 5 true
            4   ((x + 0) + 1) + 1   4 <= 5 true
            5   ( ((x + 0) + 1) + 1) + 1   5 <= 5 true
            6   x + 4   6 <= 5 false

            x = 1 e y = 100
        */
        
        /*

        [1, 4]

        x = 1;
        y = 4;

            Saída:  1
            x = 2;
            2 <= 4 ? true
            Saída: 2
            x = 3
            3 <= 4 ? true
            Saída: 3
            x = 4
            4 <= 4 ? true
            Saída: 4
            x = 5
            5 <= 4 ? false 

            \o/ terminou
        */
        while (x <= y) {
            System.out.println(x);    //printar o valor x
            x++;
        }

        System.out.println("\n================\n");   
        //TODOS OS PARES DE VALORES INTEIROS NO INTERVALO X E Y
        /*
            x = 1 E y = 4
            [1, 2, 3, 4]
            
            [1, 1]
            [1, 2]
            [1, 3]
            [1, 4]

            [2, 1]
            [2, 2]
            [2, 3]
            [2, 4]
            
            [3, 1]
            [3, 2]
            [3, 3]
            [3, 4]

            [4, 1]
            [4, 2]
            [4, 3]
            [4, 4]


        */

        x = 1;
        y = 4;
        while (x <= y) {
            int auxiliar = 1;
            while (auxiliar <= y) {
                if (x != auxiliar) {
                    System.out.printf("[%d, %d]\n", x, auxiliar);
                }
                auxiliar++;
            }
            x++;
            System.out.println();
        }

    }
}
