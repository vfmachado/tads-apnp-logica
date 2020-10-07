import java.util.Calendar;
import java.util.Scanner;

public class ExCalendar {
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
        int anos = 29;
        int meses = 3;
        int dias = 22;

        int totalDias = 29 * 365 + 3 * 30 + 22;
        System.out.println("Vc viveu: " + totalDias + " dias");

        Calendar minhaData = Calendar.getInstance();
        System.out.println("Informe em que ano vc nasceu");
        int anoNascimento = in.nextInt();
        minhaData.set(anoNascimento, 6, 14);

        Calendar hoje = Calendar.getInstance();

        System.out.println("Minha data: " + minhaData.get(Calendar.YEAR));
        System.out.println("Hoje: " + hoje.get(Calendar.YEAR));

        int diferencaAnos = hoje.get(Calendar.YEAR) - minhaData.get(Calendar.YEAR);
        System.out.println("Vc tem:  " + diferencaAnos + " anos de idade");
    }

}
