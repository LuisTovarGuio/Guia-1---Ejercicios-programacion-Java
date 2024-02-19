package punto13;


import java.util.Scanner;

public class aumentoSueldo {

    
    public static double calcularAumento(double sueldoActual) {
        if (sueldoActual <= 800000) {
            return sueldoActual * 0.10; 
        } else if (sueldoActual <= 1200000) {
            return sueldoActual * 0.08; 
        } else {
            return sueldoActual * 0.05; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        
        double aumento = calcularAumento(sueldoActual);
        
        double nuevoSalario = sueldoActual + aumento;

        
        System.out.println("El valor del aumento es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
    }
}
