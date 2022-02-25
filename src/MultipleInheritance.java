class MultipleInheritance implements i1, i2{
    @Override
    public void fn1() {
        System.out.println("Function 1 called...");
    }

    @Override
    public void fn2() {
        System.out.println("Function 2 called...");
    }
}

interface i1 {
    void fn1();
}

interface i2 {
    void fn2();
}

class MultipleInheritanceTest {
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();

        m.fn1();
        m.fn2();
    }
}