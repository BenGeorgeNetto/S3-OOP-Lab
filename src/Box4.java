//WAP to calculate the area and volume of two boxes. Create two objects. Assign the
//values in the first class, compute the area and volume in the first class and print the
//result in the main class – Using the concept of constructor.

class Box4 {
    double l, b, h;

    public Box4() {
        l = 69;
        b = 420;
        h = 10;
    }

    double ar() {
        return 2 * ((l * b) + (b * h) + (l * h));
    }

    double vol() {
        return l * b * h;
    }
}

class Main4 {
    public static void main(String[] args) {
        Box4 b1 = new Box4();
        Box4 b2 = new Box4();

        System.out.println("\nArea of Box 1 = " + b1.ar());
        System.out.println("Volume of Box 1 = " + b1.vol());

        System.out.println("\nArea of Box 2 = " + b2.ar());
        System.out.println("Volume of Box 2 = " + b2.vol());
    }
}
