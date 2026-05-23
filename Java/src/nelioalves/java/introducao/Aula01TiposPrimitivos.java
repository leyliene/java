package nelioalves.maratonajava.introducao;

import java.util.Locale;

public class Aula01TiposPrimitivos {

    static void main() {
        // int, double, float, char, byte, short, long, boolean
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        Locale.setDefault(Locale.US);
        System.out.printf("A paciente se chama %s, tem %d anos e renda mensal de %.2f reais%n", nome, idade, renda);
        

        }
}
