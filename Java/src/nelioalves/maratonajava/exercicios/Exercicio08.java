package nelioalves.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * CORREÇÃO: Colocar nomes melhores para variáveis e todas no mesmo double
 *
 * <p>double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo</p>
 *
 * <p>Sem necessidade de variável pi, apenas multiplique com 3,14159</p>
 *
 * <p>MUITO BAGUNÇADO!</p>
 */

public class Exercicio08 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três valores: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaDoTri = (a*c)/2;
        double pi = 3.14159;
        double areaDoCirculo = pi*(c*c);
        double areaDoTrap = (a+b)*c/2;
        double areaDoQuad = b*b;
        double areaDoRet = a*b;

        System.out.printf("TRIÂNGULO: %.3f%n", areaDoTri);
        System.out.printf("CÍRCULO: %.3f%n", areaDoCirculo);
        System.out.printf("TRAPÉZIO: %.3f%n", areaDoTrap);
        System.out.printf("QUADRADO: %.3f%n", areaDoQuad);
        System.out.printf("RETÂNGULO: %.3f%n", areaDoRet);





    }
}
