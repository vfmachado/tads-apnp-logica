import java.util.Scanner;

public class ExemploEntrada {
    
    public static void main(String [] args) {

        //codigo
        Scanner in = new Scanner(System.in);

        //tipo nomeDaVariavel
        String nomeDaPessoa;

        System.out.println("Opa, eai, tudo bem? Qual seu nome?");
        nomeDaPessoa = in.nextLine();

        System.out.println("OI, " + nomeDaPessoa);
        System.out.println("Tchau, " + nomeDaPessoa);

    }

}
