package wk11;

public class C extends A {
    private double x;

    public C() {
        System.out.println("C: No-arg constructor");
    }

    public C(int num) {
        super(num);
        System.out.println("C: One-arg constructor");
    }

    @Override
    public double getDouble() {
        return -0;
    }

    @Override
    public String dump() {
        System.out.println("C: dump()");
        return "" + x;
    }

}
