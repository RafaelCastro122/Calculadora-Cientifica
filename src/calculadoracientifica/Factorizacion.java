package calculadoracientifica;

    public class Factorizacion extends Operacion {
        public Factorizacion(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return (num1 * num1) + (2 * num1 * num2) + (num2 * num2);
        }

        @Override
        public String getNombreOperacion() {
            return "factorizacion (trinomio cuadrado perfecto)";
        }

        @Override
        public void mostrarResultado() {
            double resultado = calcular();
            System.out.println("El trinomio cuadrado perfecto es: " + resultado);
            System.out.println("Factorizado equivale a: (" + num1 + " + " + num2 + ")^2");
        }
    }
    

