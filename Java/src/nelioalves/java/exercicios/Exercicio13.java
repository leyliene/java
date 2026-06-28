package nelioalves.java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double total;

        System.out.println("=================");
        System.out.println("    LANCHONETE   ");
        System.out.println("=================");
        System.out.println("1. Cachorro-Quente | R$ 4.00");
        System.out.println("2. X-Salada        | R$ 4.50");
        System.out.println("3. X-Bacon         | R$ 5.00");
        System.out.println("4. Torrada Simples | R$ 2.00");
        System.out.println("5. Refrigerante    | R$ 1.50");
        System.out.println("Insira o número e quantidade do seu pedido: ");
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
