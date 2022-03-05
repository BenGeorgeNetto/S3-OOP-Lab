import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfInt {
    public static void main(String[] args) {
        int sum = 0, x;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a string of numbers: ");
            String str = sc.nextLine();

            StringTokenizer st = new StringTokenizer(str);
            System.out.println("\nThe entered numbers are:");

            while(st.hasMoreTokens()) {
                x = Integer.parseInt(st.nextToken());
                System.out.print(x + " ");
                sum += x;
            }

            System.out.println("\n\nSum of the numbers = " + sum);
        } catch(Exception e) {
            System.out.println("\nError encountered...");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
