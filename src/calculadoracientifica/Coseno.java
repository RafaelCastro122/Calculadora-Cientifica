package calculadoracientifica;

     public class Coseno extends Operacion {
        public Coseno(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return Math.cos(Math.toRadians(num1));
        }

        @Override
        public String getNombreOperacion() {
            return "coseno";
        }
    }
    
