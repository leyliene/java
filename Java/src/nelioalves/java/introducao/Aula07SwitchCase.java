package nelioalves.java.introducao;

import java.util.Scanner;

public class Aula07SwitchCase {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique o dia da semana: ");
        int dia = sc.nextInt();
        String diaDaSemana;

        switch (dia) {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana= "segunda";
                break;
            case 3:
                diaDaSemana = "terça";
                break;
            case 4:
                diaDaSemana = "quarta";
                break;
            case 5:
                diaDaSemana = "quinta";
                break;
            case 6:
                diaDaSemana = "sexta";
                break;
            case 7:
                diaDaSemana = "sábado";
                break;
            default:
                diaDaSemana = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + diaDaSemana);


        sc.close();
    }
}
