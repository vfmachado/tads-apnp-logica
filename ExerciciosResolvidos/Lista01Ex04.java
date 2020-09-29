/*
Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do triângulo.
*/

import java.util.Scanner;

public class Lista01Ex04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        float base, altura, area;

        System.out.print("Informe a base e a altura do triangulo: ");

        base = in.nextFloat();
        altura = in.nextFloat();

        area = ( base * altura ) / 2;

        System.out.println("A area do triangulo e' " + area);


    }

}