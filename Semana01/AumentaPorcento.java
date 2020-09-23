import java.util.Scanner;

public class AumentaPorcento  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        float valor, porcentagem, valorAtualizado;
        
        System.out.println("Informe um valor:");
        valor = in.nextFloat();

        System.out.println("Aumento de quantos %?");
        porcentagem = in.nextFloat();

        valorAtualizado = valor * (1 + porcentagem/100);

        System.out.println(valor + " atualizando em " + porcentagem + " e' igual a " + valorAtualizado);

    }
}

