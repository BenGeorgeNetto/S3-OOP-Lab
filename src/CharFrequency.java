import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nEnter character to check frequency: ");
        char ch = sc.next().charAt(0);

        int f = 0;

        String strL = str.toLowerCase();
        char chL = Character.toLowerCase(ch);

        for(int i = 0; i < str.length(); ++i) {
            if(chL == strL.charAt(i)) {
                ++f;
            }
        }

        System.out.println("Frequency of " + ch + " in given string = " + f);

        sc.close();
    }
}
