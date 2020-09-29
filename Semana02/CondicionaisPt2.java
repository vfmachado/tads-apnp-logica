import java.util.Scanner;

public class CondicionaisPt2 {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        float v1, v2, media;
        v1 = in.nextFloat();
        v2 = in.nextFloat();
        media = (v1 + v2)/2;


        //EM ALGUNS CASOS, A GENTE SEMPRE QUER FAZER ALGUMA COISA OU OUTRA
        /*
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {     //senão
            System.out.println("Nao foi suficiente");
        }
        */

        /*
        aprovado >= 7
        recuperacao >= 4
        reprovado
        */

        if (media >= 7) {
            System.out.println("Aprovado!!!");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else if (media == 0) {
            System.out.println("Desistente...");
        } else {
            System.out.println("Reprovado");
        }

    }
}