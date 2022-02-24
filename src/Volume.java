//Write a Java program to implement Constructor Overloading

public class Volume {
    double v;

     public Volume(int a) {
        v = a * a * a;
        System.out.println("Volume of cube = " + v);
    } //Cube

    public Volume(int l, int b, int h) {
        v = l * b * h;
        System.out.println("Volume of cuboid = " + v);
    } //Cuboid

    public Volume(double r) {
        v = 4/3 * (Math.PI * r * r * r);
        System.out.println("Volume of sphere = " + v);
    } //Sphere

    public static void main(String[] args) {
        Volume v1 = new Volume(10);
        Volume v2 = new Volume(19, 10, 21);
        Volume v3 = new Volume(6.9);
    }
}
