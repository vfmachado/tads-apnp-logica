
public class Continue {
    public static void main(String[] args) {

        /*
         * int n = 187152642412; boolean primo = true;
         * 
         * for (int i = 2; i < n/2; i++) { if (n % i == 0) { primo = false; break; } }
         */

         //mostre os blocos 1, 2 e 3 de código, exceto quando os valores de i forem pares, que deve aparecer o bloco 1.
        for (int i = 0; i < 10; i++) {

            System.out.println(i + " Bloco 1");

            if (i % 2 == 0)
                continue;

            System.out.println(i + " Bloco 2");
            System.out.println(i + " Bloco 3");
            System.out.println("========\n\n");
            // bloco com outros if, for, switch..
        }

        
        for (int i = 0; i < 10; i++) {

            // if (i == 5) {
            //     break;
            // }
            if (i == 5) {
                i = 10;
            }

        }

    }
}
