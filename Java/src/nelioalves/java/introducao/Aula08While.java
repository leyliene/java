package nelioalves.java.introducao;

import java.util.Scanner;

public class Aula08While {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int soma = 0;

        while (valor !=0) {
            soma = soma + valor;  // ou  soma += valor;
            valor = sc.nextInt();
        }

        System.out.println(soma);


        sc.close();
    }
}
