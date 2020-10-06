import java.util.Scanner;

public class ExPotencia {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /*
        CRIE UM PROGRAMA QUE FAÇA A OPERAÇÃO DE POTENCIAÇÃO
            LEMBRANDO QUE BASE ELEVADO A UM EXPOENTE SIGINIFICA
            MULTIPLICAR A BASE POR ELA MESMO TANTAS VEZES QUANTO O EXPOENTE INDICAR!
                5³ = 5 * 5 * 5
            QUANDO O EXPOENTE FOR ZERO, O RESULTADO É UM.
            CONSIDERE:
                BASE: QUALQUER VALOR INTEIRO
                EXPOENTES >= 0
        */

        int base, exp, res; 
        System.out.println("Por favor, informe a base e o expoente");
        base = in.nextInt();
        exp = in.nextInt();

        res = 1;

        int n = 0;
        while (n < exp) {
            //res <= 1 * valor digitado pelo usuario como base
            res = res * base;
            n++;
            System.out.println("Resultado parcial: " + res);
        }
       
        System.out.println("Resultado final: " + res);
    }

}
