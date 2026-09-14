package calculadoracientifica;

import java.util.Scanner;

public class CalculadoraCientifica {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero");
            double num1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo numero");
            double num2 = scanner.nextDouble();
            
            int opcion;
            System.out.println("Ingrese una opcion");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. Tangente");
            System.out.println("10. Factorizacion (trinomio cuadrado perfecto)");
            opcion = scanner.nextInt();
            
            Operacion operacion = null;

            switch (opcion) {
                case 1 -> operacion = new Suma(num1, num2);
                case 2 -> operacion = new Resta(num1, num2);
                case 3 -> operacion = new Multiplicacion(num1, num2);
                case 4 -> operacion = new Division(num1, num2);
                case 5 -> operacion = new Potencia(num1, num2);
                case 6 -> operacion = new Raiz(num1, num2);
                case 7 -> operacion = new Seno(num1, num2);
                case 8 -> operacion = new Coseno(num1, num2);
                case 9 -> operacion = new Tangente(num1, num2);
                case 10 -> operacion = new Factorizacion(num1, num2);
                default -> {
                    System.out.println("Opcion invalida");
                    return; 
                }
            }
            
            operacion.mostrarResultado();
            
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }
    
}
