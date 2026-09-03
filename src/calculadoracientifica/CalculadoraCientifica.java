package calculadoracientifica;

import java.util.Scanner;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese numero 2");
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
        Operacion operacion;

        switch (opcion) {
            case 1 -> operacion = new Operacion.Suma(num1, num2);
            case 2 -> operacion = new Operacion.Resta(num1, num2);
            case 3 -> operacion = new Operacion.Multiplicacion(num1, num2);
            case 4 -> operacion = new Operacion.Division(num1, num2);
            case 5 -> operacion = new Operacion.Potencia(num1, num2);
            case 6 -> operacion = new Operacion.Raiz(num1, num2);
            case 7 -> operacion = new Operacion.Seno(num1, num2);
            case 8 -> operacion = new Operacion.Coseno(num1, num2);
            case 9 -> operacion = new Operacion.Tangente(num1, num2);
            case 10 -> operacion = new Operacion.Factorizacion(num1, num2);
            default -> {
                System.out.println("Opcion invalida");
                return;
            }
        }
        operacion.mostrarResultado();
    }
}