package nelioalves.java.exercicios.enquanto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos alunos terão a prova corrigida? ");
        int alunos = sc.nextInt();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        for (int i=1; i<=alunos; i++) {
            System.out.println("Digite as 3 notas do " + i + "º aluno:");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

            System.out.printf("MÉDIA PONDERADA: %.1f%n", media);
        }









        sc.close();
    }
}
