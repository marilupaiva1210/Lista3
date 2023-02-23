package Atividade3;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("valor numerico");
        double A = input.nextDouble();

        System.out.println("valor numerico");
        double B = input.nextDouble();

        double diferenca = A - B;
        System.out.println(diferenca);


        input.close();
    }


}
