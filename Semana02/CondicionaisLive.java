import java.util.Scanner;

import java.lang.Math;  //matemmatica =D

public class CondicionaisLive {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        String texto = "Teste";
        System.out.println(texto.charAt(0));

        //condicionais
        float saldo;
        float compra;

        System.out.println("Informe seu saldo: ");
        saldo = in.nextFloat();

        System.out.println("Informe o valor da compra: ");
        compra = in.nextFloat();

        boolean podeComprar = saldo >= compra;
        
        //se condição for satisfeita
        /** valor lógico, tem que ser verdadeiro (true) ou falso (false) ... ou uma expressão que retorna um valor lógico*/ 
        if (podeComprar) {
            System.out.println("Se deu bem!!! Pode comprar...");
        } 

        //false == false ? sim... 
        //podeComprar == false
        if (!podeComprar) { //pode comprar é false e eu nego => !false = true
            System.out.println("Vc precisa ganhar mais para fazer isso");
        }


        //if else
        if (podeComprar) {
            System.out.println("So' para confirmar que pode...");
        } else {    //senao
            System.out.println("eh... realmente nao deu!");
        }

    }

}
