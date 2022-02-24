//WAP to calculate the area and volume of two boxes. Create two objects. Assign the
//values in the main class, compute the area and volume and print it.

class Box1 {
    double l, b, h;
}

class Main1 {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1();
        double ar, vol;

        b1.l = 10;
        b1.b = 20;
        b1.h = 30;

        b2.l = 5;
        b2.b = 10;
        b2.h = 15;

        ar = 2 * ((b1.l * b1.b) + (b1.b * b1.h) + (b1.l * b1.h));
        System.out.println("\nArea of Box 1 = " + ar);

        vol = b1.l * b1.b * b1.h;
        System.out.println("Volume of Box 1 = " + vol);

        ar = 2 * ((b2.l * b2.b) + (b2.b * b2.h) + (b2.l * b2.h));
        System.out.println("\nArea of Box 2 = " + ar);

        vol = b2.l * b2.b * b2.h;
        System.out.println("Volume of Box 2 = " + vol);
    }
}
