package nelioalves.java.introducao;

import java.util.Scanner;

public class Aula06IfElse {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int horas;

        System.out.println("Que horas são? ");
        horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else if (horas < 19) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
