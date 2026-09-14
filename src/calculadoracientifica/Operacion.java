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
        try {
            double resultado = calcular();
            if (Double.isNaN(resultado) || Double.isInfinite(resultado)) {
                throw new ArithmeticException("El resultado no es valido");
            }
            System.out.println("El resultado de la " + getNombreOperacion() + " es:" + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al calcular la operacion: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
    }

}
