import java.util.Scanner;

public class Funcoes01 {

    //METODO OU FUNCAO
    //trecho de codigo responsavel por uma atividade (subrotina)

    /*
        FUNCAO CHAMADA MAIOR QUE DADO 3 PARAMETROS, RETORNE O MAIOR
    */
    //ASSINATURA
    // retorno nome ( argumentos ou parametros )
    static int maior(int v1, int v2, int v3) {
        if (v1 >= v2 && v1 >= v3) {
            return v1;  //funciona como o break. ele encerra o metodo retornando o valor!
        } else if (v2 >= v1 && v2 >= v3) {
            return v2;
        } else
            return v3;
    }


    public static void main(String[] args) {
        
        //metodo ou funcao
        
            //objeto        //construtor
        Scanner in = new Scanner(System.in);

        int resultado = maior(123, 513, 90);
        System.out.println(resultado);
       

    }

}
