import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //declaracao do Scanner
        //tipo e nome
        Scanner in; //input
        in = new Scanner(System.in);

        String apelido;
        int numero;

        System.out.print("Qual sua idade? ");
        numero = in.nextInt();

        //System.out.println("Voce digitou o numero " + numero);
        
        System.out.print("Qual seu apelido? ");
        apelido = in.next();

        System.out.println(apelido + " tem " + numero + " anos de idade");
        
        in.close();
    }

}
