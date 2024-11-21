package wk11;

public abstract class A {
    private int num;

    public A() {
        this(0);
        System.out.println("A: No-arg constructor");
    }

    public A(int num) {
        this.num = num;
        if (Math.random() < 1) {
            throw new RuntimeException("weee");
        }
        System.out.println("A: One-arg constructor");
    }

    @Override
    public final boolean equals(Object o) {
        return (o instanceof A a) && num == a.num;
    }

    public abstract double getDouble();

    public String dump() {
        System.out.println("A: dump()");
        return "" + num;
    }
}
