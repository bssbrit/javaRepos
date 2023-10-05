
/**
 * Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lapiz = new Scanner(System.in);

        System.out.println("Numero");
        double numero = lapiz.nextDouble();
        System.out.println(evenOdd(numero));

    }

    public static String evenOdd(double number) {
        /*
         * para um programa ser primo ele tem que ser divisivel por ele mesmo ou 1
         * if number == 1 return "even"
         * else o numero for diferente de 2 e o resto da divisao por 2 der 0
         * entao even
         * 
         * else odd
         * 
         * 
         */
        if (number == 1)
            return "even";
        else if (number != 2 && number % 2 == 0)
            return "even";
        else
            return "odd";
    }
}