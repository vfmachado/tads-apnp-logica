import java.util.Scanner;

public class Vetores03 {

    public static void main(String[] args) {
    
        /*
            CRIA UM VETOR COM TAMANHO 10.
            O PROGRAMA FICA APRESENTANDO O SWITCH CASE ATE O USUARIO ESCOLHER SAIR
            SWITCH CASE COM 4 OPCOES 
            1. ADD VALOR NO VETOR (POSICAO E QUAL O VALOR)
            2. MENOR VALOR DO VETOR - MOSTRA 
            3. MAIOR VALOR DO VETOR - MOSTRA
            4. Mostrar - Mostra todo vetor
            5. SAIR  
        */

        Scanner in = new Scanner(System.in);
        int[] valores = new int[10];
        int entrada;

        do {

            System.out.println("\nEscolha uma opcao");
            System.out.println("1. ADD\n2. MENOR\n3. MAIOR\n4. Mostrar\n5. Sair");
            entrada = in.nextInt();

            switch (entrada) {

                case 1: 
                    System.out.println("Informe uma posicao e o valor");
                    int posicao = in.nextInt();
                    int valor = in.nextInt();

                    //verificar se a posicao eh valida
                    if (posicao < 0 || posicao >= 10) {
                        System.out.println("Posicao invalida");
                    } else {
                        valores[posicao] = valor;
                    }
                    break;
                case 2:
                    int posMenor = 0;
                    for (int i = 1; i < valores.length; i++) {
                        if (valores[i] < valores[posMenor]) {
                            posMenor = i;
                        }                        
                    }
                    System.out.println("O menor valor eh " + valores[posMenor] + " e esta na posicao " + posMenor);
                    break;
                case 3:

                    break;
                case 4: 
                    for (int i = 0; i < valores.length; i++) {
                        System.out.print(valores[i] + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                System.out.println("Bye bye");
                    break;

                default:
                    System.out.println("Opcao invalida");
            
                

            }

        } while (entrada != 5);
        
    }

}
