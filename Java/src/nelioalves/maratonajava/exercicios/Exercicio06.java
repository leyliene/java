package nelioalves.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your id number: ");
        int id = sc.nextInt();
        System.out.print("How many hours do you work? ");
        int hour = sc.nextInt();
        System.out.print("How much do you receive per hour? ");
        double amount = sc.nextDouble();

        double s = amount * hour;

        System.out.println("NUMBER = " +id);
        System.out.printf("SALARY = U$ %.2f", s);


        sc.close();
    }
}
