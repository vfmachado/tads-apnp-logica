
public class ForBreak {

    public static void main(String[] args) {
        
        //IDENTIFIQUE SE UM NUMERO EH PRIMO
        int n = 12089;

        boolean primo = true;
        for (int i = 2; i < n/2; i++) {

            if (n % i == 0) {
                System.out.println(n + " eh divisivel por " + i);
                primo = false;
                break;
            }
            
        }

        if (primo) {
            System.out.println("eh primo!");
        } else {
            System.out.println("Nao eh primo");
        }

    }

}
