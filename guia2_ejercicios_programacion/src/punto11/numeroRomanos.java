
package punto11;


import java.util.Scanner;

public class numeroRomanos {

    // Función para obtener la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un dígito a romano
    public static String digitoARomano(int digito) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanos[digito];
    }

    // Función para convertir un dígito a decenas romanas
    public static String decenasARomano(int decena) {
        String[] decenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return decenasRomanas[decena];
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango permitido
        if (numero < 1 || numero > 99) {
            System.out.println("Error: el número debe estar entre 1 y 99.");
        } else {
            // Convertir el número a romanos
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);
            String romano = decenasARomano(decenas) + digitoARomano(unidades);
            System.out.println("El número " + numero + " en romano es: " + romano);
        }
    }
}
