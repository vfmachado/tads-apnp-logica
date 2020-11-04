import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //UMA ESTRUTURA (VARIAVEL) QUE GUARDA VARIOS VALORES
        //EM JAVA, TODOS OS VALORES SAO, OBRIGATORIAMENTE, DO MESMO TIPO!!!

        //DECLARANDO UMA REFERENCIA PARA UM ARRAY/VETOR
        int[] meuVetor;

        //INICIALIZANDO O VETOR
        meuVetor = new int[10]; //tamanho do vetor eh 10

        //NA VARIAVEL MEUVETOR, PODEMOS GUARDAR 10 VALORES DIFERENTES, UM EM CADA POSICAO
        //LEMBRANDO QUE COMECA PELA POSICAO 0 E VAI ATE TAMANHO -1
       
        for (int i = 0; i < meuVetor.length; i++) {
            
            if (i % 2 == 0)
                meuVetor[i] = 444;
            else
                meuVetor[i] = 555;
        }

        meuVetor[0] = 123;
        meuVetor[3] = 321;
        meuVetor[2] = 213;
        meuVetor[9] = 999; //EH A ULTIMA POSICAO DO MEUVETOR

        
       
        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println("Na posicao " + i + " tem o valor " + meuVetor[i]);
        }
        
        
    }

}
