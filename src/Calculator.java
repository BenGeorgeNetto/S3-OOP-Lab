import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator\n\n");

        do {
            c = '\0';
            try {
                System.out.println("Enter choice:");
                System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n0. Exit\n");
                c = sc.next().charAt(0);

                System.out.println();

                switch(c) {
                    case '1' -> {
                        System.out.println("Enter numbers to add: ");
                        int x = sc.nextInt();
                        int y= sc.nextInt();

                        System.out.println("\n" + x + " + " + y + " = " + (x + y));
                    }

                    case '2' -> {
                        System.out.println("Enter numbers to subtract: ");
                        int x = sc.nextInt();
                        int y= sc.nextInt();

                        System.out.println("\n" + x + " - " + y + " = " + (x - y));
                    }

                    case '3' -> {
                        System.out.println("Enter numbers to multiply: ");
                        int x = sc.nextInt();
                        int y= sc.nextInt();

                        System.out.println("\n" + x + " * " + y + " = " + (x * y));
                    }

                    case '4' -> {
                        System.out.println("Enter numbers to divide: ");
                        double x = sc.nextDouble();
                        double y= sc.nextDouble();

                        if(y == 0) throw new ArithmeticException();

                        System.out.println("\n" + x + " / " + y + " = " + (x / y));
                    }

                    case '0' -> {
                        System.out.println("\nExiting...\n");
                        System.exit(0);
                    }

                    default -> {
                        if(!(Character.isDigit(c))) throw new InputMismatchException();

                        throw new IllegalArgumentException();
                    }
                }
            } catch(InputMismatchException e) {
//                e.printStackTrace();
                System.out.println("\nEnter correct format...\n\n");
            } catch(IllegalArgumentException e) {
//                e.printStackTrace();
                System.out.println("\nEnter correct input...\n\n");
            } catch(ArithmeticException e) {
//                e.printStackTrace();
                System.out.println("\nCannot divide by zero...\n\n");
            } catch(Exception e) {
                e.printStackTrace();
                System.out.println("\nError encountered...\n\n");
            }
        } while(c != 0);

        sc.close();
    }

}




