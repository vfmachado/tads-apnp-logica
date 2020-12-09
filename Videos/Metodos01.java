
public class Metodos01 {

    static int soma(int a, int b) {
        return a + b;
    }

    static int modulo(int a) {
        //exemplo operador ternario
        
        //return a >= 0 ? a : -a;

        if (a >= 0)
            return a;   
        
        return -a;

        //return alem de indicar o resultado da funcao ele tbm encerra a funcao, funciona como se um break no for.
    }

    public static void main(String[] params) {
        
        //METODOS / FUNCOES

        int v1, v2, res;
        v1 = 10;
        v2 = 5;
        
        res = soma(v1, v2);
        System.out.println(res);

        // |5| = |-5| = 5
        res = modulo(-3);
        System.out.println(res);
    }

}
