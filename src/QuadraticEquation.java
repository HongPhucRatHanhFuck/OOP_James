import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double Delta = delta();

        if (Delta >= 0) {
            return (-b + Math.sqrt(Delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double Delta = delta();

        if (Delta >= 0) {
            return (-b - Math.sqrt(Delta)) / (2 * a);
        } else {
            return 0;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta" + quadraticEquation.delta());
        if (quadraticEquation.delta() > 0) {
            System.out.println("Delta >= 0 nen pt co 2 nghiem phan biet x1 va x2 la: " + quadraticEquation.getRoot1() + quadraticEquation.getRoot2());
        } else if (quadraticEquation.delta() == 0) {
            System.out.println("Delta = 0 nen pt co 1 nghiem duy nhat x1 = x2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Delta < 0 nen pt vo nghiem");
        }

    }

}
