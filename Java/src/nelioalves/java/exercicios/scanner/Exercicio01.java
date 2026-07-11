package nelioalves.java.exercicios.scanner;

public class Exercicio01 {
    static void main() {

        double l = 30.0;
        double c = 10.0;
        double m2 = 200.00;
        double a = 300.00;
        double p = 60000.00;

        System.out.println("====================");
        System.out.println("  TERRENO À VENDA  ");
        System.out.println("====================");

        System.out.println("LARGURA: " + l + "m");
        System.out.println("COMPRIMENTO: " + c + "m");
        System.out.printf("ÁREA EM METROS QUADRADOS: %.2fm²%n", m2);
        System.out.println("ÁREA TOTAL: " + a + "m");

        System.out.println("====================");
        System.out.printf(" PREÇO: R$%.2f%n", p);
        System.out.println("====================");


    }
}
