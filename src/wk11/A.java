package wk11;

public abstract class A {
    private int num;

    public A() {
        this(0);
        System.out.println("A: No-arg constructor");
    }

    public A(int num) {
        this.num = num;
        System.out.println("A: One-arg constructor");
    }

    public abstract double getDouble();

    public String dump() {
        System.out.println("A: dump()");
        return "" + num;
    }
}
