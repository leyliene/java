package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio22 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valorX = sc.nextInt();

        for (int impar=1; impar<=valorX; impar++) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
        }

        sc.close();
    }
}
