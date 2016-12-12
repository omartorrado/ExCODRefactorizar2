package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numero;
        int factorial;

        numero = 8;

        int contador;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (contador = numero; contador >= 1; contador--) {
                factorial = factorial * contador;
            }
        }

        System.out.println(factorial);

    }

}
