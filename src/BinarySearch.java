import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    int binarySearch(ArrayList<Integer> arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr.get(mid) == x)
                return mid;

            if (arr.get(mid) > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        int c, n, x;

        BinarySearch ob = new BinarySearch();
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("\nEnter size of array: ");
        n = sc.nextInt();

        System.out.println("\nEnter the elements of the array: ");
        c = sc.nextInt();
        arr.add(c);

        for (int i = 1; i < n; i++) {
            c = sc.nextInt();
            arr.add(c);
            if(arr.get(i) <= arr.get(i - 1)) {
                System.out.println("\nInvalid input... Enter a number bigger than " + arr.get(i - 1) + "\n");
                arr.remove(i);
                --i;
            }
        }

        System.out.println("The elements of the arraylist are: " + arr);

        System.out.println("\nEnter the element to search: ");
        x = sc.nextInt();

        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("The Element " + x + " is found at index " + result);
        }

        sc.close();
    }
}