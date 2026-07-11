package nelioalves.java.exercicios.enquanto;

import java.util.Scanner;

public class Exercicio18 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.next();

        while (!senha.equals("2002")) {
            System.out.println("Senha inválida");
            senha = sc.next();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
