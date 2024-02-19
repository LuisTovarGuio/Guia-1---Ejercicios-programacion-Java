package punto8;


import java.util.Scanner;

public class edificioUniversidad {

    
    public static int calcularNumeroDeSalones(int numeroEstudiantes, int capacidadSalon) {
        
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    
    public static int calcularNumeroDePisos(int numeroSalones, int salonesPorPiso) {
        
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();
        
        System.out.println("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();
        
        System.out.println("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        
        int numeroSalones = calcularNumeroDeSalones(numeroEstudiantes, capacidadSalon);
        int numeroPisos = calcularNumeroDePisos(numeroSalones, salonesPorPiso);

       
        System.out.println("El número total de salones necesarios es: " + numeroSalones);
        System.out.println("El número total de pisos necesarios es: " + numeroPisos);
    }
}
