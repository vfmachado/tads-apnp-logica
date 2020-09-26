import java.util.Scanner;

public class Media {

    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        float valor1, valor2, media;
        
        System.out.print("Informe dois valores: ");
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();

        media = (valor1 + valor2)/2;
        System.out.println("A media entre os valores e' " + media);
    }


}

