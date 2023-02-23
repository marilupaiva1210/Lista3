package Atividade3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        String[] nomes = new String[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

        }

        System.out.println("Nomes lidos:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i]);

        }
    }

}
