import java.util.ArrayList;

public class ArrayLists01 {

    public static void main(String[] args) {
        
        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
        ArrayList<String> listaStrings = new ArrayList<String>();

        listaInteiros.add(10);
        listaInteiros.add(14);
        listaInteiros.add(43);
        listaInteiros.add(6);

        System.out.println(listaInteiros);

        listaInteiros.clear();
        System.out.println("Depois do clear... " + listaInteiros);

        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(40);
        listaInteiros.add(50);

        int valor = listaInteiros.get(3);
        System.out.println(listaInteiros.get(3));

        System.out.println(".contains 30: " + listaInteiros.contains(30));
        System.out.println(".contains 31: " + listaInteiros.contains(31));

        System.out.println(".indexOf 10 (indice do valor): " + listaInteiros.indexOf(10));

        System.out.println(".indexOf 14 (indice do valor): " + listaInteiros.indexOf(14));
        
        listaInteiros.remove(0);
        System.out.println(listaInteiros);
        System.out.println("Novo indice 0 => " + listaInteiros.get(0)
        );

        System.out.println("Consultar o tamanho atual do ArrayList: " + listaInteiros.size());

    }
    
}
