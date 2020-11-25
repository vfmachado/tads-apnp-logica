
public class Exemplo {

    public static void main(String[] args) {
        
        int n = 0;
        
        do {

            if (n % 2 == 0) {
                System.out.println(n + " par =D");
            } else {
                System.out.println(n);
                if (n == 3) {
                    break;
                }
            }

            n++;
        } while (n < 5);

    }

}
