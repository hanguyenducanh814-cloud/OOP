import java.util.Scanner;

class Quadratic {
    private double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (delta >= 0) ? (-b + Math.sqrt(delta)) / (2 * a) : 0;
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (delta >= 0) ? (-b - Math.sqrt(delta)) / (2 * a) : 0;
    }
}

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Quadratic equation = new Quadratic(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            System.out.printf("Phương trình có 2 nghiệm: %.2f và %.2f",
                    equation.getRoot1(), equation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("Phương trình có 1 nghiệm: %.2f", equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}