package nelioalves.java.introducao;

import java.util.Scanner;

public class Aula09For {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valorInicial = sc.nextInt();

        int soma = 0;
        for (int i=0; i<valorInicial; i++) {
            int outrosValores = sc.nextInt();
            soma += outrosValores;
        }

        System.out.println(soma);

        sc.close();
    }
}
