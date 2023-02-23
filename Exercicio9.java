package Atividade3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ValorAtual = 0;
        int MaiorValor = Integer.MIN_VALUE;
        int MenorValor = Integer.MAX_VALUE;
        int ValorAnterior;

        do {

            System.out.println("Informe um valor");
            ValorAtual = input.nextInt();

            if (ValorAtual > MaiorValor) {
            MaiorValor = ValorAtual;

            }
            if (ValorAtual < MenorValor) {
            MenorValor = ValorAtual;


            }

            System.out.println("Maior valor informado " + MaiorValor);
            System.out.println("Menor valor informado " + MenorValor);


        } while
            (ValorAtual >= 0);

        input.close();

        }


    }


