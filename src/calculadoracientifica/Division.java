package calculadoracientifica;
 
     public class Division extends Operacion {
        public Division(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            if (num2 == 0) {
                System.out.println("Error: no se puede dividir entre cero");
                return 0;
            }
            return num1 / num2;
        }

        @Override
        public String getNombreOperacion() {
            return "division";
        }
    }
    

