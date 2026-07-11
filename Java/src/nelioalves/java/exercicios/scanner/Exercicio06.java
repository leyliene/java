package nelioalves.java.exercicios.scanner;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your id number: ");
        int employeeId = sc.nextInt();
        System.out.print("How many hours do you work? ");
        int hoursWorked = sc.nextInt();
        System.out.print("How much do you earn per hour? ");
        double amountEarned = sc.nextDouble();

        double sum = amountEarned * hoursWorked;

        System.out.println("NUMBER = " + employeeId);
        System.out.printf("SALARY = U$ %.2f", sum);


        sc.close();
    }
}
