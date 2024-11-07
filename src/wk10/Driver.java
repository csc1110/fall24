package wk10;

public class Driver {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        String answer;
        if (j != 0 && i / j > 8) {
            answer = "hi";
        } else {
            answer = "bye";
        }
        System.out.println(answer);

        // TERNARY
        // CONDITIONAL ? <TRUE STATEMENT> : <FALSE STATEMENT>;
        System.out.println((j != 0 && i / j > 8) ? "hi" : "bye");

        String word = null;
        if (word != null && word.length() > 4) {
            System.out.println("Nice letters");
        }

        if (true || false) {

        }
        char a = 'p';
        System.out.println(a++ - 'a' + 1);
        System.out.println(a);
    }

    public static void main2(String[] args) {
        System.out.println(Color.RED + "this is red");
        System.out.println("\u001B[1m this is red");
        System.out.println(Color.RESET + "this is red");
    }
}
