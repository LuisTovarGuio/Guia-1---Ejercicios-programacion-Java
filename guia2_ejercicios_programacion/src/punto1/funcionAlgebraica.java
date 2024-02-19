package punto1;


public class funcionAlgebraica {

    public static int calcularFuncion(int x, int y) {
        return x*x + 2*x*y + y*y;
    }

    public static void main(String[] args) {
        
        int x = 5; 
        int y = 8;

       
        int resultado = calcularFuncion(x, y);

        
        System.out.println("El valor de f(x, y) = x^2 + 2xy + y^2 para x = " + x + " y y = " + y + " es: " + resultado);
    }
}
