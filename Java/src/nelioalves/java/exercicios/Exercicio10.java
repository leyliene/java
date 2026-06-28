package nelioalves.java.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
