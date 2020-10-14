import java.util.Scanner;

public class ExemploFor02 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //for (inicializacao ; teste ; passo) { }
        for (int i = 0; i < 3; i++ ) { 
            System.out.println("FOR ... " + i);
        }

        /*
        1. O primeiro passo é inicializar, executar a primeira instrução antes do ;
            int i = 0;

        2. Teste - Antes de executar o bloco de código, faz-se o TESTE!!!
            i < 3
            caso seja verdadeiro, executa o bloco
        3. BLOCO DE CÓDIGO - DENTRO DAS CHAVES

        4. PASSO / INCREMENTE - última parte do FOR
            i++
            
        5. Volta para o TESTE!
        
        */
    }

}
