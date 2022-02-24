//Write a program to implement Pass by Object/Reference

public class SwapByReference {
    public static void swap(Ref a, Ref b) {
        System.out.println("Inside fn before swapping:");
        System.out.println("a: " + a.x + "\tb: " + b.x);

        Ref temp = new Ref(a.x);
        a.x = b.x;
        b.x = temp.x;

        System.out.println("Inside fn after swapping:");
        System.out.println("a: " + a.x + "\tb: " + b.x);
    }

    public static void main(String[] args) {
        Ref a = new Ref(69);
        Ref b = new Ref(420);

        System.out.println("Inside main before swapping:");
        System.out.println("a: " + a.x + "\tb: " + b.x);
        swap(a, b);

        System.out.println("Inside main after swapping:");
        System.out.println("a: " + a.x + "\tb: " + b.x);
    }
}

class Ref {
    public int x;
    public Ref(int x) {
        this.x = x;
    }
}