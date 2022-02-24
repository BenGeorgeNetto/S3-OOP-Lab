//WAP to calculate the area and volume of two boxes. Create two objects. Assign the
//values in the first class, compute the area and volume and print it in the main class.

class Box2 {
    double l = 10;
    double b = 20;
    double h = 30;
}

class Main2 {
    public static void main(String[] args) {
        Box2 b1 = new Box2();
        Box2 b2 = new Box2();
        double ar, vol;

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