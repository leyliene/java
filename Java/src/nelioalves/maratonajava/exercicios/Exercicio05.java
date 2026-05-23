package nelioalves.maratonajava.exercicios;

import java.util.Scanner;

/** CORREÇÃO: Indique as variáveis em um só int ao invés de indicá-las direto no int A = sc */

public class Exercicio05 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 4 valores inteiros: ");

        int A, B, C, D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        dif = (A*B)-(C*D);

        System.out.println("A diferença entre o produto de A e B e o produto de C e D é: " +dif);

        sc.close();
    }
}
