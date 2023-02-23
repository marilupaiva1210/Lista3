package Atividade3;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        double ValorAtual = 1;
        double ValorAnt;
        double Soma = 0;


        for (int i = 0; i < 64; i++) {
            ValorAnt = ValorAtual;
            ValorAtual = ValorAnt * 2;
            Soma = Soma + ValorAnt;



        }

        System.out.println(Soma);

        }


    }


