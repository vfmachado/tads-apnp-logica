import java.util.ArrayList;

public class Objetos02 {

    static class Processador {
    
        String nome;
        String marca;
        String modelo;
        float valor;
        int nucleos;

    }


    public static void diaDePromocao(Processador proc) {
        System.out.println("Estou dando desconto no " + proc.nome);
        proc.valor = 0.9f * proc.valor;      //desc de 10%

    }

    public static void diaDePromocao(float valor) {

        valor = 0.9f * valor;      //desc de 10%

    }

    
    public static void main(String[] args) {
        
        Processador i5 = new Processador();
        i5.nome = "Core I5";
        i5.marca = "Intel";
        i5.modelo = "9400F";
        i5.valor = 900;
        i5.nucleos = 4;
     
        System.out.println(i5.marca + " " + i5.nome + " " + i5.modelo);
        System.out.println("Valor: " + i5.valor);

        diaDePromocao(i5);
        System.out.println("Novo Valor: " + i5.valor);

        float valor = 1000;
        diaDePromocao(valor);
        System.out.println("PRECO: " + valor);

    }

}
