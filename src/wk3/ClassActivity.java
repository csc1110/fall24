package wk3;

public class ClassActivity {
    public static void main(String[] args) {
        String word = "happy";
        boolean a = 13 < word.length();
        boolean b = true || false;
        boolean c = a && 8 > 3;
        boolean d = 5 < 2 && 7 > 2 && 3 == 3 || 8 <= 8;
    }

    public static void main2(String[] args) {
        int a = 1;
        int b = 1;
        if (a < b) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

    public static void main3(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        if (a < b) {
            System.out.println("A");
        } else {
            if (b < c) {
                System.out.println("C");
            }
            System.out.println("B");
        }
    }
}
