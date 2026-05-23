package nelioalves.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura, comprimento e valor do metro quadrado do seu terreno: ");
        double l = sc.nextDouble();
        double c = sc.nextDouble();;
        double m2 = sc.nextDouble();

        double a = l*c;
        double p = a*m2;


        System.out.println("====================");
        System.out.println("  TERRENO À VENDA   ");
        System.out.println();
        System.out.printf("ÁREA TOTAL: %.2fm%n", a);
        System.out.printf("PREÇO: R$ %.2f%n", p);
        System.out.println("====================");

        sc.close();


    }
}
