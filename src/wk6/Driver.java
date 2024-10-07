package wk6;

public class Driver {
    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println(square);
        Square square8 = new Square(';', 8);
        Square square1 = square;
        System.out.println(square8.toString());
        System.out.println(square1.toString());
    }
}
