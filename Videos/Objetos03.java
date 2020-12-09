import java.util.ArrayList;
import java.util.Scanner;

public class Objetos03 {

    static class Aluno {
        String nome;
        float n1, n2;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        do {

            System.out.println("Vc qr adicionar um novo aluno? (s/n)");
            String resp = in.next();
            in.nextLine();

            if (!resp.equals("s"))
                break;
            
            Aluno novo = new Aluno();
            System.out.println("Informe o nome");
            novo.nome = in.nextLine();
            System.out.println("Informe as notas: ");
            novo.n1 = in.nextFloat();
            novo.n2 = in.nextFloat();

            alunos.add(novo);

        } while (true);

        System.out.println("\n===========\nLista de alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            float media = (aluno.n1 + aluno.n2)/2;
            System.out.println(aluno.nome + " Media: " + media );
        }
        
    }

}
