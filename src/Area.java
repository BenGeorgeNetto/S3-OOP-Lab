//Write a Java program to calculate the area of different shapes namely circle,
//rectangle and square using the concept of method overloading.

public class Area {
     void ar(int a) {
         System.out.println("Area of square = " + (a * a));
    } //Square

    void ar(int a, int b) {
         System.out.println("Area of rectangle = " + (a * b));
    } //Rectangle

    void ar(double r) {
         double a = Math.PI * r * r;
         System.out.println("Area of circle = "+ a);
    } //Circle

    public static void main(String[] args) {
        Area A = new Area();
        A.ar(10);
        A.ar(69, 420);
        A.ar(69.420);
    }
}

