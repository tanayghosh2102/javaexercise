import java.text.DecimalFormat;
import java.util.Scanner;

public class AssignmentOne {

    public static void swapVariables() {
        Integer num1 = 123;
        Integer num2 = 321;
        Integer numTmp = 0;

        System.out.println("Num#1: " + num1);
        System.out.println("Num#2: " + num2);

        numTmp = num1;
        num1 = num2;
        num2 = numTmp;
        System.out.println("Swap using third variable completed.");
        System.out.println("Num#1: " + num1);
        System.out.println("Num#2: " + num2);

        System.out.println("Resetting variable to original value.");
        numTmp = num1;
        num1 = num2;
        num2 = numTmp;
        System.out.println("Num#1: " + num1);
        System.out.println("Num#2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Swap without using third variable completed.");
        System.out.println("Num#1: " + num1);
        System.out.println("Num#2: " + num2);

    }

    public static void printUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string...");
        String str = scanner.nextLine();
        System.out.println("User input: " + str);
    }

    public static void addTwoUserInput() {
        Integer z = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number between 1 and 10.");

        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        z = num1 + num2;

        z += 30;

        System.out.println("Value of Z is " + z);
    }

    public static void printIfFloat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");

        String str = scanner.nextLine();
        Float f = new Float(0);

        try {
            f = Float.valueOf(str);
        } catch(Exception e) {
            System.out.println("A valid number was not entered.");
        } finally {
            System.out.println("Float: " + f);
        }
    }

    public static void checkDivisibility() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");

        String str = scanner.nextLine();
        Integer num = 0;

        try {
            num = Integer.parseInt(str);
        } catch(Exception e) {
            System.out.println("A valid number was not entered.");
        } finally {
            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number is divisible by 3 and 5.");
            } else if(num % 3 == 0) {
                System.out.println("Number is divisible by 3.");
            } else if (num % 5 == 0) {
                System.out.println("Number is divisible by 5.");
            } else {
                System.out.println("Number is neither divisible by 3 nor by 5.");
            }
        }
    }

    public static void stringFormatting() {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String str1Lang = str1.split(" ")[0];
        Integer str1Num = Integer.parseInt(str1.split(" ")[1]);

        String str2Lang = str2.split(" ")[0];
        Integer str2Num = Integer.parseInt(str2.split(" ")[1]);

        String str3Lang = str3.split(" ")[0];
        Integer str3Num = Integer.parseInt(str3.split(" ")[1]);

        System.out.printf("%-15s%03d\n", str1Lang, str1Num);
        System.out.printf("%-15s%03d\n", str2Lang, str2Num);
        System.out.printf("%-15s%03d\n", str3Lang, str3Num);
    }

    public static void main(String[] args) {
        swapVariables();
        printUserInput();
        addTwoUserInput();
        printIfFloat();
        checkDivisibility();
        stringFormatting();
    }
}
