import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double chuVi() {
        return (this.width + this.height) * 2;
    }

    public double dienTich() {
        return (this.width * this.height);
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter Weight: ");
        double weight = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, weight);

        System.out.println("Dien tich HCN la: " + rectangle.dienTich());
        System.out.println("Chu vi HCN la: " + rectangle.chuVi());
        System.out.println("Hinh chu nhat la: " + rectangle.display());
    }
}


