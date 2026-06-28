package nelioalves.java.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, soma;

        System.out.println("Digite as duas notas do aluno: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        soma = nota1 + nota2;

        if (soma > 70.0) {
            System.out.println("NOTA FINAL: " + soma);
        }
        else {
            System.out.println("NOTA FINAL " + soma);
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
