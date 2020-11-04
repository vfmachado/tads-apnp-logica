import java.util.Scanner;

public class VetoresInverso {

    public static void main(String[] args) {
        
        //LEIA 5 VALORES DO USUÁRIO E MOSTRE EM ORDEM REVERSA
        /*
        ENTRADA: 1 2 3 4 5
        SAIDA:   5 4 3 2 1

        ENTRADA: 5 8 11
        SAIDA: 11 8 5

        PASSO 1: MEMORIZEI!
        PASSO 2: OLHAR DE TRAS PRA FRENTE
        
        */
        Scanner in = new Scanner(System.in);
        //varias variaveis com o mesmo tipo e a mesma finalidade, que logicamente, devem estar agrupadas
        //DECLARA E INCIALIZA UM VETOR DE TAMANHO 5
        int[] vetor = new int[5];
        //TAMANHO 5 SIGNIFICA EU TER OS INDICES DE 0 ATEH 4
        System.out.println("Informe 5 valores...");
        
        // vetor.length = 5  O .length tem o valor do tamanho do vetor
        //I COMECAR EM ZERO E IR ATEH 4 =D
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        
        //VETOR.LENGTH EH O TAMANHOOOOO 
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.println("Na posicao " + i + " tem o valor " + vetor[i]);
        }
    }

}
