package Atividade3;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] matrizA = new int[12];
        int[] matrizB = new int[12];
        int[] matrizC = new int[24];

        System.out.println("Informe o valor da Matriz A:");
        for (int i = 0; i < matrizA.length;) {
            int valorA = input.nextInt();
            if ((valorA % 2 == 0) || (valorA % 3 == 0)) {
                System.out.println("Valor válido!");
                matrizA[i] = valorA;
                i++;
            } else {
                System.out.println("Valor inválido!");
            }
        }
        System.out.println("Informe o valor da Matriz B:");
        for (int i = 0; i < matrizB.length;) {
            int valorB = input.nextInt();
            if ((valorB % 5 != 0)) {
                System.out.println("Valor válido!");
                matrizB[i] = valorB;
                i++;
            } else {
                System.out.println("Valor inválido!");
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            matrizC[i] = matrizA[i];
            matrizC[i + 12] = matrizB[i];
        }
        for (int i = 0; i < matrizC.length; i++) {
            System.out.println(":" + matrizC[i]);
        }


        input.close();
    }

}










