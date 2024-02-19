package punto7;



public class cartesiano {

    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        
        if (x2 == x1) {
            throw new IllegalArgumentException("La pendiente es indefinida (división por cero).");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer punto (x1 , y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto (x2 , y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = 0;
        try {
            pendiente = calcularPendiente(x1, y1, x2, y2);
            System.out.println("La distancia entre los dos puntos es: " + distancia);
            System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
