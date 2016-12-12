package factorial;

import javax.swing.JOptionPane;

public class Factorial {
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Indica el numero a factorizar"));
        int factorial;
        
        factorial = calculaFactorial(numero);
        
        getFactorial(factorial);
        
    }
    
    public static void getFactorial(int factorial) {
        System.out.println(factorial);
    }
    
    public static int calculaFactorial(int numero) {
        int factorial;
        int contador;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (contador = numero; contador >= 1; contador--) {
                factorial = factorial * contador;
            }
        }
        return factorial;
    }
    
}
