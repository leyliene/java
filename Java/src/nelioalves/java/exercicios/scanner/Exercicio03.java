package nelioalves.java.exercicios.scanner;

import java.util.Scanner;

/** CORREÇÃO: Não dividir as variáveis em vários int, usar apenas um */

public class Exercicio03 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int soma;

        System.out.println("=====================");
        System.out.println("     CALCULADORA     ");
        System.out.println("=====================");
        System.out.println("Digite dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();
        soma = A+B;

        System.out.println("SOMA = " + soma);

        //

        sc.close();


    }
}
