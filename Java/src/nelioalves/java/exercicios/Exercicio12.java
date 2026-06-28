package nelioalves.java.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaFim, duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicio = sc.nextInt();
        System.out.println("Digite a hora final: ");
        horaFim = sc.nextInt();

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
            System.out.println("O JOGO DUROU " + duracao + " HORAS");
        }
        else {
            duracao = 24 - horaInicio + horaFim;
            System.out.println("O JOGO DUROU " + duracao + " HORAS");
        }

        sc.close();
    }
}
