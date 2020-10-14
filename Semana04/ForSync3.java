import java.util.Scanner;

public class ForSync3 {

    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);

        char letra;

        String senha = in.next();

        for (int i = 0; i < senha.length(); i++) {
            letra = senha.charAt(i);
            System.out.println("A letra "+ letra + " esta na posicao " + i);

            for (int comparador = i + 1; comparador < senha.length(); comparador++) {
                if (letra == senha.charAt(comparador)) {
                    System.out.println("A letra repetiu na posicao " + comparador);
                    System.out.println("Senha nao segura...");
                }
            }

        }

        
    }

}
