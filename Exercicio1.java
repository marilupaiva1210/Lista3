package Atividade3;

import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("informe valor celsius");
        double celsius = input.nextDouble();

        Double conversao = (9 * celsius + 160)/5;
        System.out.println(conversao);

     input.close();
    }



}
