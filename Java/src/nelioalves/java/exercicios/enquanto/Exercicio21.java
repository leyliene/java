package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio21 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        double nota;

        System.out.println("Digite as notas (ou digite um número negativo para parar)");

        nota = sc.nextDouble();

        while (nota >= 0) {
            quantidade ++;
            soma += nota;
            nota = sc.nextDouble();
        }

        if (quantidade == 0) {
            System.out.println("Nenhuma nota válida foi digitada");
        }
        else {
            double media = soma / quantidade;
            System.out.printf("A média aritmética das notas é: %.1f%n", media);
        }

        sc.close();
    }
}
