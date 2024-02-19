package punto12;


import java.util.Scanner;

public class diaMañana {

    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        String diaSiguiente;
        switch (diaActual.toLowerCase()) {
            case "lunes":
                diaSiguiente = "martes";
                break;
            case "martes":
                diaSiguiente = "miércoles";
                break;
            case "miércoles":
                diaSiguiente = "jueves";
                break;
            case "jueves":
                diaSiguiente = "viernes";
                break;
            case "viernes":
                diaSiguiente = "sábado";
                break;
            case "sábado":
                diaSiguiente = "domingo";
                break;
            case "domingo":
                diaSiguiente = "lunes";
                break;
            default:
                diaSiguiente = "Error: día no reconocido.";
                break;
        }
        return diaSiguiente;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un día de la semana: ");
        String diaActual = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(diaActual);
        if (diaSiguiente.equals("Error: día no reconocido.")) {
            System.out.println(diaSiguiente);
        } else {
            System.out.println("El día siguiente es "  + diaSiguiente + ".");
        }
    }
}
