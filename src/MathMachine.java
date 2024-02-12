public class MathMachine {
    private double a, b;
    private Calculable calculable;

    public MathMachine(double a, double b, Calculable calculable) {
        this.a = a;
        this.b = b;
        this.calculable = calculable;
    }

    public void setCalculable(Calculable calculable) {
        this.calculable = calculable;
    }

    public double calculate() {
        return calculable.calculate(a, b);
    }
}
