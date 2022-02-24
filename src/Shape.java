abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("No of sides of rectangle = 4");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("No of sides of triangle = 3");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("No of sides of hexagon = 6");
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();

        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}