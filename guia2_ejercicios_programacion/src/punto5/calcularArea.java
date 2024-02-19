package punto5;


public class calcularArea {

    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    
    public static double calcularAreaCoronaCircular(double radioPequeno, double radioGrande) {
        double areaGrande = calcularAreaCirculo(radioGrande);
        double areaPequena = calcularAreaCirculo(radioPequeno);
        return areaGrande - areaPequena;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Ingrese el valor del radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        System.out.print("Ingrese el valor del radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        
        if (radioGrande > radioPequeno) {	
           
            double areaCoronaCircular = calcularAreaCoronaCircular(radioPequeno, radioGrande);
            System.out.printf("El área de la coronaes: %.2f\n", areaCoronaCircular);
        } else {
            System.out.println("El radio grande debe ser mayor que el radio pequeño.");
        }
        
        scanner.close();
    }
}
