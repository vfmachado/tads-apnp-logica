import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

                
        //if & operador lógico
        float v1, v2, res;
        v1 = in.nextFloat();
        v2 = in.nextFloat();
        res = (v1 + v2)/2;

        boolean valorLogico = res >= 7;
        System.out.println(valorLogico);

        if (valorLogico) {
            System.out.println("Voce foi aprovado");
        }

        //negação de valor lógico
        if (!valorLogico) {

            System.out.println("Voce foi reprovado");
            
            System.out.println("Qual a nota da recuperacao?");
            float novaNota = in.nextFloat();

            if (novaNota >= 7) {
                System.out.println("Parabens, vc conseguiu a aprovacao");
            }

        }

        //if else
        //if ... else if ... else

    }

}
