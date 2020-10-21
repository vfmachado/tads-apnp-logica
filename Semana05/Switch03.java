import sun.jvm.hotspot.tools.SysPropsDumper;

public class Switch03 {

    public static void main(String[] args) {
        
        //faca um programa que identifique se a letra digitada e uma vogal ou nao... (considere que serao digitadas as letras de a-z)

        char letra = 'a';

        switch (letra) {

            // if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u')
            case 'a': 
            case 'e': 
            case 'i': 
            case 'o': 
            case 'u': 
                System.out.println("eh vogal..");
                break;

            default:
                System.out.println("nao eh vogal...");
        }

    }

}
