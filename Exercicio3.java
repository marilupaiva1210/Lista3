package Atividade3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("valor númerico");
        double VN = input.nextDouble();

        double NS = VN + 1;
        System.out.println(NS);

        double NA = VN - 1;
        System.out.println(NA);


        input.close();
    }
}
