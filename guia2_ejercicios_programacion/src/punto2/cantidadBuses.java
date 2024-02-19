package punto2;

public class cantidadBuses {

   
    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        
        int sillasNecesarias = estudiantesGordos * 2 + estudiantesFlacos;
        
        
        int busesNecesarios = sillasNecesarias / sillasPorBus;
        if (sillasNecesarias % sillasPorBus > 0) {
            busesNecesarios++; // Agrega un bus si hay un residuo
        }
        
        return busesNecesarios;
    }

    public static void main(String[] args) {
        
        int sillasPorBus = 25; 
        int estudiantesGordos = 50;
        int estudiantesFlacos = 80;
        
        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
        System.out.println("Se necesitan alquilar " + busesNecesarios + " buses.");
    }
}




