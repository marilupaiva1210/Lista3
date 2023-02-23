package Atividade3;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("valor numerico");
        double N = input.nextDouble();

        if (N < 0) {
            N = N * -1;

        }
        System.out.println("O número transformado em positivo é:" + N);


        input.close();
    }

}
