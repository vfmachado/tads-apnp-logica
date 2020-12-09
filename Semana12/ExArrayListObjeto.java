import java.util.ArrayList;

public class ExArrayListObjeto {

    //seria equivalente a uma STRUCT em C
    public static class Item {

        String nome;
        float valor;
        int quantidade;

    }
    
    public static void main(String[] args) {
        
        ArrayList<Item> carrinho = new ArrayList<Item>();

        Item ps5 = new Item();
        ps5.nome = "PS5";
        ps5.valor = 4799;
        ps5.quantidade = 2;

        Item rtx3060 = new Item();
        rtx3060.nome = "RTX 3060 TI";
        rtx3060.valor = 3000;
        rtx3060.quantidade = 1;

        Item memoriaRam = new Item();
        memoriaRam.nome = "Memoria RAM 8GB DDR4 3000MHz";
        memoriaRam.valor = 320;
        memoriaRam.quantidade = 4;

        carrinho.add(ps5);
        carrinho.add(memoriaRam);

        /*
        for (int i = 0; i < carrinho.size(); i++) {
            Item item = carrinho.get(i);
            System.out.println("\nNOME: " + item.nome);
            System.out.println("Valor unitario R$ " + item.valor);
            System.out.println("Quantidade " + item.quantidade);
            System.out.println("Total: " + item.valor * item.quantidade);
        }
        */

        for (Item item : carrinho) {
            System.out.println("\nNOME: " + item.nome);
            System.out.println("Valor unitario R$ " + item.valor);
            System.out.println("Quantidade " + item.quantidade);
            System.out.println("Total: " + item.valor * item.quantidade);
        }

    }


}