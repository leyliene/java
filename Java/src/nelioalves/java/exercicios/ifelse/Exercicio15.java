package nelioalves.java.exercicios.ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Indique duas coordenadas: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (y == 0) {
            System.out.println("Eixo Y");
        }
        else if (x == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else {
            System.out.println("Q3");
        }



        sc.close();
    }
}
