//WAP to calculate the area and volume of two boxes. Create two objects. Assign the
//values in the first class, compute the area and volume in the first class and print the
//result in the main class – Using the concept of parameterised constructor.

class Box5 {
    double l, b, h;

    public Box5(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double ar() {
        return 2 * ((l * b) + (b * h) + (l * h));
    }

    double vol() {
        return l * b * h;
    }
}

class Main5 {
    public static void main(String[] args) {
        Box5 b1 = new Box5(10, 20, 30);
        Box5 b2 = new Box5(69, 420, 10);

        System.out.println("\nArea of Box 1 = " + b1.ar());
        System.out.println("Volume of Box 1 = " + b1.vol());

        System.out.println("\nArea of Box 2 = " + b2.ar());
        System.out.println("Volume of Box 2 = " + b2.vol());
    }
}
