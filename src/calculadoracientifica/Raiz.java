package calculadoracientifica;

     public class Raiz extends Operacion {
        public Raiz(double num1, double num2) {
            super(num1, num2);
        }


        @Override
        public double calcular() {
            if (num1 < 0) {
                System.out.println("Error: no se puede calcular la raiz de un numero negativo");
                return 0;
            }
            if (num2 == 0) {
                System.out.println("Error: el indice de la raiz no puede ser cero");
                return 0;
            }
            return Math.pow(num1,1.0 / num2);
        }

        @Override
        public String getNombreOperacion() {
            return "raiz";
        }
    }
