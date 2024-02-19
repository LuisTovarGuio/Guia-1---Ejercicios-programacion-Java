package punto9;


import java.util.Scanner;

public class numerosEnteros {

    // Función que recibe dos números enteros y retorna el mayor
    public static int encontrarMayor(int num1, int num2) {
    	if (num1==num2) {
    		System.out.println("Los números son iguales " );
    	}
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        
        int mayor = encontrarMayor(numero1, numero2);

        
        System.out.println("El mayor de los dos números es: " + mayor);
    }
}
