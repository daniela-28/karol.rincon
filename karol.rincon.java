import java.util.Scanner;

public class Coordenadas {

    // Convertir coordenadas polares a rectangulares
    public static double[] polarToRectangular(double radio, double angulo) {
        double x = radio * Math.cos(Math.toRadians(angulo));
        double y = radio * Math.sin(Math.toRadians(angulo));
        return new double[]{x, y};
    }

    // Convertir coordenadas rectangulares a polares
    public static double[] rectangularToPolar(double x, double y) {
        double radio = Math.sqrt(x * x + y * y);
        double angulo = Math.toDegrees(Math.atan2(y, x));
        return new double[]{radio, angulo};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Convertir de coordenadas polares a rectangulares");
            System.out.println("2. Convertir de coordenadas rectangulares a polares");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.println("Ingrese el radio:");
                double radio = scanner.nextDouble();
                System.out.println("Ingrese el ángulo (en grados):");
                double angulo = scanner.nextDouble();
                double[] rectangulares = polarToRectangular(radio, angulo);
                System.out.println("Coordenadas rectangulares: (x, y) = (" + rectangulares[0] + ", " + rectangulares[1] + ")");
            } else if (opcion == 2) {
                System.out.println("Ingrese la coordenada x:");
                double x = scanner.nextDouble();
                System.out.println("Ingrese la coordenada y:");
                double y = scanner.nextDouble();
                double[] polares = rectangularToPolar(x, y);
                System.out.println("Coordenadas polares: (radio, ángulo) = (" + polares[0] + ", " + polares[1] + " grados)");
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
        
        scanner.close();
    }
}
