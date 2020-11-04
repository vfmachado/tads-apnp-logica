import java.util.Scanner;

public class ExSwitchComposto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
         * usuario informa o numero do mes, e nos identifcamos qual o trimestre
         * pertecente (1, 2, 3) (4, 5, 6) (7, 8, 9) (10, 11, 12)
         */

        int mes = 1;

        switch (mes) {

            case 1:
                System.out.println("Primeiro mes do ano ... ");
            case 2:
            case 3:
                System.out.println("Primeiro trimestre");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Segundo trimestre");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Terceiro trimestre");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Quarto trimestre");
                break;

            default:
                System.out.println("MES invalido");
        }

    }

}
