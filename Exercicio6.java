package Atividade3;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        double A = input.nextDouble();

        System.out.println("Informe o valor de B");
        double B = input.nextDouble();

        System.out.println("Informe o valor de C");
        double C = input.nextDouble();

        double CD = B * B - (4 * A * C);

        if (CD < 0) {
            System.out.println("Não há solução");

        } else {
            double X1 = (-B + Math.sqrt(CD)) / (2 * A);
            double X2 = (-B - Math.sqrt(CD)) / (2 * A);

            if (CD == 0) {
                System.out.println("O valor de X é: " + X1);

            } else {

                if (CD >0) {
                    System.out.println("O valor de X1 " + X1 + "O valor de X2 " + X2);

                }

                input.close();
            }

        }

    }

}





