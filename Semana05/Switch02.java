import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String naipe = in.next();

        if (naipe.equals("Espada")) {

        } else if (naipe.equals("Copas")) {

        } else if (naipe.equals("...")) {

        }

        switch (naipe) {

            case "Espada":
                System.out.println("Sao aquelas cartas que o simbolo parecem uma espada.");
                break;

            default:
                System.out.println("Desconheco esse naipe");
                // NAO COLOCAMOS BREAK, JA E A ULTIMA INSTRUCAO
        }

    }

}
