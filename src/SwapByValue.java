//Write a program to implement Pass by Value.

public class SwapByValue {
    public static void swap(int a, int b) {
        System.out.println("Inside fn before swapping:");
        System.out.println("a: " + a + "\tb: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside fn after swapping:");
        System.out.println("a: " + a + "\tb: " + b);
    }

    public static void main(String[] args) {
        int a = 69, b = 420;

        System.out.println("Inside main before swapping:");
        System.out.println("a: " + a + "\tb: " + b);
        swap(a, b);

        System.out.println("Inside main after swapping:");
        System.out.println("a: " + a + "\tb: " + b);
    }
}
