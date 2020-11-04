import java.util.Scanner;

public class ExSwitchSimples {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
         * Opcoes 1. Saldo 2. Deposito 3. Saque 4. Sair
         */

        int opcao;
        do {
            System.out.println("Seleciona uma opcao");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("vc escolheu ver seu saldo");
                    break;
                case 2:
                    System.out.println("vc escolheu depositar");
                    break;
                case 3:
                    System.out.println("vc escolheu sacar");
                    break;
                case 4:
                    System.out.println("bye");

                    break;
                default:
                    System.out.println("Opcao invalida, selecione de 1 a 4");
            }

        } while (opcao != 4);

    }

}
