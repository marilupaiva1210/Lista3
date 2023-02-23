package Atividade3;

import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];

        System.out.println("digite os elementos da matriz A:");
        for (int i = 0; i < 15; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("digite os elementos da matriz B:");
        for (int i = 0; i < 15; i++) {
            B[i] = input.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            C[i] = A[i];
            C[i + 15] = B[i];

        }

        System.out.println("Matriz C: ");
        for (int i = 0; i < 30; i++) {
            System.out.println(C[i] + " ");
        }

    }

}






