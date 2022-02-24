//WAP to calculate the area and volume of two boxes. Create two objects. Assign the
//values in the first class, compute the area and volume in the first class and print the
//result in the main class.

class Box3 {
    double l = 10;
    double b = 20;
    double h = 30;

    double ar() {
        return 2 * ((l * b) + (b * h) + (l * h));
    }

    double vol() {
        return l * b * h;
    }
}

class Main3 {
    public static void main(String[] args) {
        Box3 b1 = new Box3();
        Box3 b2 = new Box3();

        System.out.println("\nArea of Box 1 = " + b1.ar());
        System.out.println("Volume of Box 1 = " + b1.vol());

        System.out.println("\nArea of Box 2 = " + b2.ar());
        System.out.println("Volume of Box 2 = " + b2.vol());
    }
}
