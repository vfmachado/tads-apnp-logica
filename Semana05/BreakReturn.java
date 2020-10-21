import java.util.Random;
import java.util.Scanner;

public class BreakReturn {
    
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        Scanner in = new Scanner(System.in);
        
        int numero = in.nextInt();

        //programa que repita de um até 100 o lançamento de um dado de 20 lados... caso o lado sorteado seja o informado pelo usuario no inicio do programa, o laço de repeticao deve ser encerrado. 
        for (int i = 0; i < 100; i++) {
            System.out.println("Repetindo ..." + i);
            int sorteado = aleatorio.nextInt(20) + 1;
            System.out.println(sorteado);

            if (numero == sorteado) {
                System.out.println("woowwww!!!");
                break;  //o mesmo comando do switch, permite que eu pare o meu laco de repeticao!
            }
        }

        //EXERCICIO, CRIAR UM PROGRAMA COM DOIS LACOS DE REPETICAO ALINHADOS (UM DENTRO DO OUTRO) E CRIAR UMA LOGICA PARA QUE QUANDO DADA UMA CONDICAO DE PARADA DO LACO INTERNO, O LACO EXTERNO TAMBEM PARE., 
    }
    

}
