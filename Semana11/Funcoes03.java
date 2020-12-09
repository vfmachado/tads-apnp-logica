


public class Funcoes03 {

    static int fatorial(int n) {
        if (n == 0) return 1;
        return n * fatorial(n-1);
    }
                                //valor = 1
    static int troca(int n) {  //n =1
        n = n * 123;
        return n;
    }

    
    public static void main(String[] args) {

        int numero = 5;

        System.out.println(fatorial(5));

        int valor = 1;
        valor = troca(valor);
        System.out.println(valor);

    }

}
