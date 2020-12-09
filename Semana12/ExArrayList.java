import java.util.ArrayList;
import java.util.Arrays;

public class ExArrayList {

    public static void main(String[] args) {
        
        //Integer ocupa mais espaco que int
        //Integer eh um objeto
       
        //ArrayList sao de OBJETOS!!!
        ArrayList<String> nomes = new ArrayList<String>();
        
        //inicia com tamanho interno de 10... 
        //conforme mais espaco eh necessario, o java aloca automaticamente...

        nomes.add("Vini");
        nomes.add("Manu");
        nomes.add("Guiga");
        
        ArrayList<String> nomes2 = new ArrayList<String>();

        //add para adicionar
        nomes2.add("Outro");
        nomes2.add("Tche");

        //add all para adicionar uma lista
        nomes.addAll(nomes2);
        
        //size = tamanho
        System.out.println(nomes.size());
        System.out.println(nomes2.size());

        //print mostra o vetor de um jeito "legal"
        System.out.println(nomes);

        System.out.println(nomes.get(0));

    }

}
