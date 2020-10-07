import java.util.Scanner;

public class ExParesIntervalo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //MOSTRAR TODOS VALORES PARES ENTRE O INTERVALO SELECIONADO PELO USUARIO
        System.out.println("Informe os limites do intervalor [x, y]");
        int x = in.nextInt();
        int y = in.nextInt();

        if (x % 2 == 1) {
            x = x + 1;
        }

        while (x <= y) {
            
            System.out.println(x);
            
            x = x + 2;
        }

    }

}
