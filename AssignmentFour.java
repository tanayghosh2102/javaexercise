import java.util.Scanner;

public class AssignmentFour {

    private static void rightAngleTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        Integer rows = scanner.nextInt();
        System.out.println("");
        String triangleBuilder = "";
        for (int i = 1; i <= rows; i++) {
            triangleBuilder = "";
            for(int j = 1; j <= i; j++) {
                triangleBuilder += String.valueOf(j);
            }
            System.out.println(triangleBuilder);
        }
    }

    private static void printPascalTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        Integer rows = scanner.nextInt();
        System.out.println("");
        int[][] arr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j <= i; j++) {
                if(i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private static void floatingPointNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input two floats: ");
        System.out.println("");
        String f1 = scanner.nextLine();
        String f2 = scanner.nextLine();

        String[] f1Arr = f1.split("\\.");
        String[] f2Arr = f2.split("\\.");

        if(f1Arr[01].equals(f2Arr[0]) && f1Arr[1].charAt(0) == f2Arr[1].charAt(0) && f1Arr[1].charAt(1) == f2Arr[1].charAt(1)) {
            System.out.println("Input numbers are identical up to two decimal places");
        } else {
            System.out.println("Input numbers are NOT identical");
        }
    }

    public static void main(String[] args) {
        rightAngleTriangle();
        printPascalTriangle();
        floatingPointNum();
    }
}
