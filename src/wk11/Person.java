package wk11;

public class Person implements Drawable {

    @Override
    public void draw() {
        System.out.println("""
                   O
                  \\|/
                   |
                  / \\""");
    }

    @Override
    public String dumbest() {
        return "";
    }
}
