package nelioalves.java.exercicios.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas divisóes serão realizadas?: ");
        int valor = sc.nextInt();

        for (int i=1; i<=valor; i++) {
            System.out.println(i + "º divisão: ");
            double dividendo1 = sc.nextDouble();
            double dividendo2 = sc.nextDouble();

            if (dividendo2 == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double divisao = dividendo1/dividendo2;
                System.out.printf("Resultado: %.1f%n", divisao);
            }
        }
        sc.close();
    }
}
