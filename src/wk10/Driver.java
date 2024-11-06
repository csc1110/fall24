package wk10;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Color.RED + "this is red");
        System.out.println("\u001B[1m this is red");
        System.out.println(Color.RESET + "this is red");
    }
}
