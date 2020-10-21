

public class Switch {
    
    public static void main(String[] args) {
        
        //ESCOLHA

        //DIAS DA SEMANA
        //O USUÁRIO INDICA UM NÚMERO E PROGRAMA DEVE MOSTRAR O DIA DA SEMANA
        int numeroDia = 2;
        boolean finalSemana;

        if (numeroDia == 1) {
            System.out.println("Domingo");
            finalSemana = true;
        } else if (numeroDia == 2) {
            System.out.println("Segunda-feira");
            finalSemana = false;
        } else if (numeroDia == 3) {
            System.out.println("Terça-feira");
            finalSemana = false;
        } else if (numeroDia == 4) {
            System.out.println("Quarta-feira");
            finalSemana = false;
        } else {

        }
         // ... 7 vezes no total

        switch (numeroDia) {
            case 1:
                System.out.println("Domingo");
                finalSemana = true;
                break;  //encerra o caso
            case 2:
                System.out.println("Segunda-feira");
                finalSemana = false;
                break;
            default:
                System.out.println("Numero informado nao equivale a um dia da semana.");
        }
        

        

    }

}
