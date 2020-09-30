import java.util.Scanner;

public class CondicionaisLive2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float velocidadeMaxima;
        float velocidadeRegistrada;
        
        float excedido;

        //5% tolerancia
        //20% media
        //50% grave
        //50% + infração gravissima + carteira caçada

        System.out.println("Sou seu assistente de multas.");
        System.out.println("Qual era a velocidade max da rodovia que vc passou?");
        velocidadeMaxima = in.nextFloat();

        System.out.println("Em que velocidade vc estava?");
        velocidadeRegistrada = in.nextFloat();

        excedido = (velocidadeRegistrada - velocidadeMaxima)/velocidadeMaxima;
        System.out.printf("Vc excedeu a velocide em %.1f%%\n", excedido*100);

        System.out.println(excedido);

        if (excedido > 0) {
            
            if (excedido < 0.05f) {
                System.out.println("Ufaa... deu sorte desta vez");
            } else if (excedido < 0.2) {
                System.out.println("Multa media...");
            } else if (excedido < 0.5) {
                System.out.println("Multa grave...");
            } else {
                System.out.println("Multa gravissima, vai ter que tirar outra carteira...");
            }

        } else {
            
            if (excedido > -0.5) {
                System.out.println("Vc nao precisa se preocupar, andar abaixo do limite eh permitido!!! (ateh 50%)");
            } else {
                System.out.println("tao lent@ que se deu mal");
            }
        }
    }

}
