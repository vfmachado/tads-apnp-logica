import java.util.Scanner;

public class Tipos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        //dados primitivos

         //true ou false
        boolean estaJogando = true;
        //estaJogando = in.nextBoolean();
        
        //numericos
        byte numeroBemPequeno = 122;
        //in.nextByte();

        short numerosAte32Mil = 21312;
        numerosAte32Mil = -32132;
        //in.nextShort();

        int valoresInteiros = 21423509;
        //in.nextInt();

        long segundosEmNano = 1_000_000_000L;
        //in.nextLong();

        //4 bytes
        float numeroComVirgulaFloat = 1.123456f;
        //in.nextFloat();

        //8 bytes
        double numeroComVirgulaDouble = 1.123124124123123124123;
        //in.nextDouble();
       
        char letras = 'A';
      
      
        //dados não primitivos ou objetos
        String texto = "Vinicius";
        //in.next(); //ler uma palavra
        //in.nextLine(); //ler até o usuario apertar ENTER
        
        //objetos em java com informações dos tipos primitivos
        System.out.println("O tipo byte:\n\tTem o intervalo (min, max): " + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE);
        System.out.println("\tTem tamanho (em bytes): " + Byte.BYTES);
        
        //Integer.parseInt("12312412");        
        //Character

        
    }

}
