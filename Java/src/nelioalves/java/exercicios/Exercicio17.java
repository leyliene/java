package nelioalves.java.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        int dia = sc.nextInt();
        String diaDaSemana;

        if (dia == 1) {
            diaDaSemana = "Domingo";
        }
        else if (dia == 2) {
            diaDaSemana = "Segunda-feira";
        }
        else if (dia == 3) {
            diaDaSemana = "Terça-feira";
        }
        else if (dia == 4) {
            diaDaSemana = "Quarta-feira";
        }
        else if (dia == 5) {
            diaDaSemana = "Quinta-feira";
        }
        else if (dia == 6) {
            diaDaSemana = "Sexta-feira";
        }
        else if (dia == 7) {
            diaDaSemana = "Sábado";
        }
        else {
            diaDaSemana = "valor inválido";
        }

        System.out.println("Dia da semana: " + diaDaSemana);




        sc.close();
    }
}
