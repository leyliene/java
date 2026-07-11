package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio26 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int valor = sc.nextInt();

        int fatorial = 1;

        for (int i=1; i<=valor; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
