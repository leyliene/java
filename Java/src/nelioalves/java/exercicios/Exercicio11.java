package nelioalves.java.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite dois valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("SAO MULTIPLOS");
        }
        else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }
}
