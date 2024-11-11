package wk11;

public class Parrot implements Drawable {
    @Override
    public void draw() {
        System.out.println("[Parrot drawing goes here]");
    }

    @Override
    public String dumbest() {
        return "";
    }
}
