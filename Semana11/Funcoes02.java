import java.util.Scanner;

public class Funcoes02 {

        //void => sem retorno!
    static void mostrarVetor(int[] qlqrVetor) {

        for (int i = 0; i < qlqrVetor.length; i++) {
            System.out.print(qlqrVetor[i] + "  ");
        }
        System.out.println();

    }

        //VETORES SAO OBJETOS (REFERENCIA NA MEMORIA)
    static void iniciaComPares(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i*2;
        }
        outroMetodo();
    }


    static void outroMetodo() {
        System.out.println("Isso vem de outro metodo =D");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor:");
        final int TAMANHO = in.nextInt();

        int[] vetor = new int[TAMANHO];

        mostrarVetor(vetor);
        iniciaComPares(vetor);
        mostrarVetor(vetor);
        // pede uma letra...
        // faz alguma coisa
        // mostra vetor
    }

}
