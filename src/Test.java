class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void finalize()  {
        System.out.println("Garbage Collector called");
    }
}

class GarbageCollectorTestMain {
    public static void main(String[] args) {
        Test ob1 = new Test(69, 420);
        Test ob2 = new Test(25, 19);
        Test ob3 = new Test(7, 10);

        ob1 = null;
        System.gc();

        ob2 = ob3;
        System.gc();
    }
}


