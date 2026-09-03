package calculadoracientifica;

public abstract class Operacion {
    protected double num1;
    protected double num2;

    public Operacion() {
        this.num1 = 0.00;
        this.num2 = 0.00;
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double calcular();

    public abstract String getNombreOperacion();

    public void mostrarResultado() {
        double resultado = calcular();
        System.out.println("El resultado de la " + getNombreOperacion() + " es:" + resultado);
    }

    public static class Suma extends Operacion {
        public Suma(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return num1 + num2;
        }

        @Override
        public String getNombreOperacion() {
            return "suma";
        }
    }

    public static class Resta extends Operacion {
        public Resta(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return num1 - num2;
        }

        @Override
        public String getNombreOperacion() {
            return "resta";
        }
    }

    public static class Multiplicacion extends Operacion {
        public Multiplicacion(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return num1 * num2;
        }

        @Override
        public String getNombreOperacion() {
            return "multiplicacion";
        }
    }

    public static class Division extends Operacion {
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

    public static class Potencia extends Operacion {
        public Potencia(double num1, double num2) {
            super(num1, num2);
        }

        @Override
        public double calcular() {
            return Math.pow(num1, num2);
        }

        @Override
        public String getNombreOperacion() {
            return "potencia";
        }
    }

    public static class Raiz extends Operacion {
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
            return Math.pow(num1, 1.0 / num2);
        }

        @Override
        public String getNombreOperacion() {
            return "raiz";
        }
    }

    public static class Seno extends Operacion {
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

    public static class Coseno extends Operacion {
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

    public static class Tangente extends Operacion {
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

    public static class Factorizacion extends Operacion {
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
}