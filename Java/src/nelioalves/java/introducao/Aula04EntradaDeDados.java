package nelioalves.maratonajava.introducao;

import java.util.Scanner;

public class Aula04EntradaDeDados {
    static void main() {

        Scanner sc = new Scanner(System.in);

         /* String x;
         int y;
         double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); */

        String s1, s2, s3;
        int x;

        s1 = sc.nextLine();
        x = sc.nextInt();
        sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(x);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
