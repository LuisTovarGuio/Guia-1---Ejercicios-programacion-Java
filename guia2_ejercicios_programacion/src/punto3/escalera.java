package punto3;

public class escalera {

    
    public static double calcularLongitudEscalera(double altura, double angulo) {
       
        double anguloRadianes = Math.toRadians(angulo);
        
        return altura / Math.sin(anguloRadianes);
    }

    public static void main(String[] args) {
        
        double altura = 8; 
        double angulo = 50; 
        
        
        double longitudEscalera = calcularLongitudEscalera(altura, angulo);
        
      
        System.out.printf("La longitud de la escalera es: %.3f", longitudEscalera);
    }
}

