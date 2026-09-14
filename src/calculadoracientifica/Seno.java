package calculadoracientifica;

public class Seno extends Operacion {
        public Seno(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return Math.sin(Math.toRadians(num1));
        }

        @Override
        public String getNombreOperacion() {
            return "seno";
        }
    }
    
