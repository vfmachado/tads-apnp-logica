import java.util.ArrayList;

public class Objetos01 {

    static class Aluno {
        String nome;
        int semestre;
        ArrayList<String> disciplinas;
    }

    
    public static void main(String[] args) {
        
        ArrayList<String> disc1 = new ArrayList<String>();
        disc1.add("Logica de Prog");
        disc1.add("Fudamentos de Comp");
        disc1.add("Estatistica");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Vinicius";
        aluno1.semestre = 1;
        aluno1.disciplinas = disc1;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Manu";
        aluno3.semestre = 1;
        aluno3.disciplinas = disc1;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Guilherme";
        aluno2.semestre = 3;
        aluno2.disciplinas = new ArrayList<String>();
        aluno2.disciplinas.add("POO");
        aluno2.disciplinas.add("Banco de Dados");
        aluno2.disciplinas.add("Engenharia de SW I");
     
        System.out.println(aluno1.nome + " Disciplinas: " + aluno1.disciplinas);
        System.out.println(aluno3.nome + " Disciplinas: " + aluno3.disciplinas);
        System.out.println(aluno2.nome);

    }

}
