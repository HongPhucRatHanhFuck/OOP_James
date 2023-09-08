public class Car {
    public String name;
    public String color;
    public double weight;

    public Car(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void go() {
        System.out.println(this.name + " on go");
    }
}

class main {
    public static void main(String[] args) {
        Car Mers = new Car("Mers", "Pink", 100.0);
        Car Audi = new Car("Audi", "Pink1", 100.0);
        Audi.go();
        Mers.go();
    }
}