package wk11;

// Polymorphism - behavior changes based on the object that is referred to

public class Driver2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape circular = new Circle();
        System.out.println("" + shape.toString() + circle);
        System.out.println(circular.toString());
    }
}
