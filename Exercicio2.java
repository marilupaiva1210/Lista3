package Atividade3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("salario mensal");
        double MS = input.nextDouble();

        System.out.println("percentual de reajuste");
        double PR = input.nextDouble();

        double salariofinal = (MS * PR)/100;
        System.out.println(salariofinal + MS);

     input.close();

    }


}
