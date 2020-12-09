
public class Metodos02 {

    //assinatura
        //retorno nome   parametros (separados por virgula)
    static int metodoSomaUm(int a) {   // a = 0
        a++;    // a = 1
        return a;
    }

    static void metodoVoid(int a) {
         
        if (a > 10)
            return;
        
        System.out.println("Era menor ou igual a 10...");
    }


    static void mostraVetor(int[] vetor) {
        
        System.out.println("Tamanho do Vetor: " + vetor.length);
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length -1)
                System.out.println(vetor[i] + "]");
            else
                System.out.print(vetor[i] + ", ");
        }
        if (vetor.length == 0) System.out.println("]");
    }


    public static void main(String[] args) {
     
        if (args.length > 0)
            System.out.println("Primeiro argumento enviado: " + args[0]);
        else {
            System.out.println("Erro: Rode o programa com algum parametro.");
            return;
        }

        int numero = 0;
        numero = metodoSomaUm(numero);   //metodoSomaUm(0)
        System.out.println(numero);

        metodoVoid(8);
        metodoSomaUm(15);

        int[] a = new int[5];
        mostraVetor(a);

        int[] b = new int[3];
        b[0] = 231;
        b[1] = 264;
        b[2] = 912;

        mostraVetor(b);

    }
}
