package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio20 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("==============");
        System.out.println(" COMBUSTÍVEIS ");
        System.out.println("==============");
        System.out.println("Qual seu combustível de preferência? ");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Cancelar");
        int codigo = sc.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool = alcool + 1;
            }
            else if (codigo == 2) {
                gasolina = gasolina + 1;
            }
            else if (codigo == 3) {
                diesel = diesel + 1;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
