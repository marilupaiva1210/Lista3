package Atividade3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        double[] temperaturas = new double[20];
        double soma = 0.0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("informe a temperatura " + (i + 1) + " c: ");
            temperaturas[i] = input.nextDouble();

            soma += temperaturas[i];

        if (temperaturas[i] < menor) {
            menor = temperaturas[i];
        }

        if (temperaturas[i] > maior) {
            maior = temperaturas[i];

            }

        }

        double media = soma / 20;

        System.out.println("a maior temperatura é: " + maior);
        System.out.println("a menor temperatura é: " + menor);
        System.out.println("a media das temperaturas é:" + media);

    }

}

