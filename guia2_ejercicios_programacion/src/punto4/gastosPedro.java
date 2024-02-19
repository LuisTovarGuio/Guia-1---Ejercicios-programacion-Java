package punto4;

public class gastosPedro{

   
    public static double calcularGastoEnArriendo(double sueldo) {
        return sueldo * 0.40; 
    }

    
    public static double calcularGastoEnComida(double sueldo) {
        return sueldo * 0.15; 
    }

    public static void main(String[] args) {
       
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el sueldo de Pedro: ");
        double sueldo = scanner.nextDouble(); 

       
        double gastoArriendo = calcularGastoEnArriendo(sueldo);
        double gastoComida = calcularGastoEnComida(sueldo);
        double Restante = sueldo - (gastoArriendo + gastoComida);

        // Mostrando los resultados
        System.out.printf("Gasto en arriendo: $%.2f\n", gastoArriendo);
        System.out.printf("Gasto en comida: $%.2f\n", gastoComida);
        System.out.printf("Dinero restante: $%.2f\n", Restante);
    }
}


