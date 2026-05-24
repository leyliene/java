package nelioalves.maratonajava.exercicios;

import java.util.Locale;
import java.util.Scanner;

/** MODO SEM PERGUNTAS:
 *  <p>int code1, code2, qnt1, qnt2;</p>
 *  <p>double preco1, preco2, total;</p>
 *
 *  <p>code1 = sc..;</p>
 *  <p>qnt1 = sc..;</p>
 *  <p>preco1 = sc..;</p>
 *
 *  <p>code2 = sc..;</p>
 *  <p>qnt2 = sc..;</p>
 *  <p>preco2 = sc..;</p>
 *  <p>total = preco1 * qnt1 + preco2 * qnt1;</p>
 *  <p>USE VARIÁVEIS MAIS DESCRITIVAS</p>
 */

public class Exercicio07 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do primeiro produto");
        int code1 = sc.nextInt();
        System.out.println("Quantos você deseja comprar? ");
        int quant1 = sc.nextInt();
        System.out.println("Qual o valor unitário de cada produto? ");
        double v1 = sc.nextDouble();

        System.out.println("Insira o código do segundo produto");
        int code2 = sc.nextInt();
        System.out.println("Quantos você deseja levar?");
        int quant2 = sc.nextInt();
        System.out.println("Qual o valor unitário de cada produto?");
        double v2 = sc.nextDouble();

        double vt = (v1*quant1)+(v2*quant2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", vt);


    }
}
