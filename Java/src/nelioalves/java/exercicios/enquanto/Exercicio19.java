package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio19 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int coord1;
        int coord2;

        System.out.println("Digite duas coordenadas: ");
        coord1 = sc.nextInt();
        coord2 = sc.nextInt();

        while (coord1 != 0 && coord2 != 0) {
            if (coord1 > 0 && coord2 > 0) {
                System.out.println("Primeiro");
            }
            else if (coord1 < 0 && coord2 > 0) {
                System.out.println("Segundo");
            }
            else if (coord1 < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }
            coord1 = sc.nextInt();
            coord2 = sc.nextInt();
        }


        sc.close();
    }
}
