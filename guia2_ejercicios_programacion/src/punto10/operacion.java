package punto10;


import java.util.Scanner;

public class operacion {

    
    public static double aplicarOperacion(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("División por cero.");
                }
                return (double) num1 / num2;
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Ingrese la operación (+, -, *, /, %, **): ");
        String operador = scanner.next();

        try {
            double resultado = aplicarOperacion(numero1, numero2, operador);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la operación: " + e.getMessage());
        }
    }
}
