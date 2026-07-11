package nelioalves.java.exercicios.ifelse;

import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
