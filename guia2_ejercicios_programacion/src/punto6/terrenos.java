package punto6;

public class terrenos {

    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    
    public static double calcularAreaTerreno(double A, double B, double C) {
        double areaRectangulo = calcularAreaRectangulo(B, C);
        double areaTriangulo = calcularAreaTriangulo(B, A - C);
        return areaRectangulo + areaTriangulo;
    }

    
    public static double calcularPerimetroTerreno(double A, double B, double C) {
        double hipotenusa = calcularHipotenusa(B, A - C);
        return A + B + C + hipotenusa;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Ingrese la dimensión del lado A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese la dimensión del lado B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese la dimensión del lado C: ");
        double C = scanner.nextDouble();
        
        if (A>C) {

        
        double areaTerreno = calcularAreaTerreno(A, B, C);
        double perimetroTerreno = calcularPerimetroTerreno(A, B, C);

       
        System.out.printf("El área del terreno es: %.3f\n", areaTerreno);
        System.out.printf("El perímetro del terreno es: %.3f\n", perimetroTerreno);
        
        } else {
        	System.out.println("La dimensión A debe ser mayor que la dimensión C.");
        }
        }
}



