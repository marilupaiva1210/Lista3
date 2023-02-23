package Atividade3;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        int celsius = 10;

        int fahrenheit = (9 * celsius + 160)/5;

        for (int contador = 1; contador < 10; contador++) {

            System.out.println(contador + " Valor em Celsius = " + celsius + " Temperatura em Fahrenheit = " + fahrenheit);

            celsius = celsius + 10;

            fahrenheit = (9 * celsius + 160)/5;
        }



    }


}