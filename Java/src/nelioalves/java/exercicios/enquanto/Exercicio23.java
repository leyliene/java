package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio23 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite a quantidade de valores a serem digitados: ");
        int quantidade = sc.nextInt();

        for (int i=0; i<quantidade; i++) {
            int valorIntervalo = sc.nextInt();
            if (valorIntervalo >= 10 && valorIntervalo <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");


        sc.close();
    }
}
