import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first 3x3 matrix: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter second 3x3 matrix: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j++) {
                arr[i][j] = 0;
                for(int k = 0; k < 3 ;k++){
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }

            }
        }

        System.out.println("\nProduct of matrices is: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3 ; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
