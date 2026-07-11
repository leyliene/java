package nelioalves.java.exercicios.scanner;

import java.util.Locale;
import java.util.Scanner;

/** CORREÇÃO: Colocar todas as variáveis no mesmo double, indicando o valor de pi ali mesmo
 * <p> double r, a, pi = 3.14159;</p>
 * <p>    a = pi * r * r; </p> */

public class Exercicio04 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double r = sc.nextDouble();

        double pi = 3.14159;
        double d = Math.pow(r,2);
        double a = pi*d;

        System.out.printf("ÁREA DO CÍRCULO = %.4f%n", a);



        sc.close();
    }
}
