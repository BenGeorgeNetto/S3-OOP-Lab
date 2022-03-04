class GarbageCollectorTest {
    int a, b;

    GarbageCollectorTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void finalize()  {
        System.out.println("Garbage Collector called");
    }
}

class GarbageCollectorTestMain {
    public static void main(String[] args) {
        GarbageCollectorTest ob1 = new GarbageCollectorTest(69, 420);
        GarbageCollectorTest ob2 = new GarbageCollectorTest(25, 19);
        GarbageCollectorTest ob3 = new GarbageCollectorTest(7, 10);

        ob1 = null;
        System.gc();

        ob2 = ob3;
        System.gc();
    }
}


