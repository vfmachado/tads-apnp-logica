import java.util.Scanner;

public class VetoresDinamicos {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] vetor;
        
        System.out.println("Informe o tamanho do vetor");
        //constante
        final int TAMANHO = in.nextInt();   

        vetor = new int[TAMANHO];

        System.out.println("Vetor criado com sucesso, tamanho: "+ vetor.length);

        do {
            
            System.out.println("Informe uma posicao e um valor" );
            int pos = in.nextInt();
            int valor = in.nextInt();

            vetor[pos] = valor;

            System.out.print("Vetor [");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i == vetor.length -1) {
                    System.out.println("]");
                } else {
                    System.out.print(", "); 
                }
            }

        } while (true);
    }

}
