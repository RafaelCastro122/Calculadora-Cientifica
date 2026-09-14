package calculadoracientifica;

    public class Tangente extends Operacion {
        public Tangente(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return Math.tan(Math.toRadians(num1));
        }

        @Override
        public String getNombreOperacion() {
            return "tangente";
        }
    }
    
