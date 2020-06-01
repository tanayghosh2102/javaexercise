import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AssignmentTwo {

    public static void checkDivisibility() {
        String outStr = "";
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
                outStr += "Consultadd JAVA Training";
            } else if (num % 5 == 0) {
                outStr += "JAVA Training";
            } else if(num % 3 == 0) {
                outStr += "Consultadd";
            } else {
                outStr += "Nothing else to print";
            }
        }
        System.out.println(outStr);
    }

    public static void mathOp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:\n " +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Division\n" +
                "4 - Multiplication\n" +
                "5 - Average\n");

        Integer num = scanner.nextInt();
        Float mathNum = 0F;
        if(num == 1) {
            System.out.println("Enter two numbers:");
            mathNum = Float.valueOf(scanner.nextInt());
            mathNum += scanner.nextInt();
        } else if (num == 2) {
            System.out.println("Enter two numbers:");
            mathNum = Float.valueOf(scanner.nextInt());
            mathNum -= scanner.nextInt();
        } else if(num == 3) {
            System.out.println("Enter two numbers:");
            mathNum = Float.valueOf(scanner.nextInt());
            mathNum = mathNum/scanner.nextInt();
        }else if(num == 4) {
            System.out.println("Enter two numbers:");
            mathNum = Float.valueOf(scanner.nextInt());
            mathNum = mathNum*scanner.nextInt();
        }else if(num == 5) {
            System.out.println("Enter four numbers:");
            mathNum = Float.valueOf(scanner.nextInt());
            mathNum += scanner.nextInt();
            mathNum += scanner.nextInt();
            mathNum += scanner.nextInt();
            mathNum = mathNum/4;
        } else {
            System.out.println("Nothing else to print");
        }
        if(mathNum > 0) {
            System.out.println("The output is: " + mathNum);
        } else {
            System.out.println("Oops option " + num + " is returning a negative number");
        }
    }

    public static void flowChart() {
        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);

        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();

        Float avg = Float.valueOf((a+b+c)/3);

        if(avg > a && avg > b && avg > c) {
            System.out.println("Average is higher than a, b and c");
        } else if(avg > a && avg > b) {
            System.out.println("Average is higher than a and b");
        } else if(avg > a && avg > c) {
            System.out.println("Average is higher than a and c");
        } else if(avg > c && avg > b) {
            System.out.println("Average is higher than b and c");
        } else if(avg > a) {
            System.out.println("Average is just higher than a");
        } else if(avg > b) {
            System.out.println("Average is just higher than b");
        } else if(avg > c) {
            System.out.println("Average is just higher than c");
        }
    }

    public static void continueAndBreak() {
        Scanner scanner = new Scanner(System.in);

        for(;;) {
            Float f = scanner.nextFloat();
            if(f < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
                continue;
            }
        }
    }

    public static void zeroAndSix() {
        for(int i = 0; i <= 6; i++) {
            if(i != 3 && i != 6) {
                System.out.print(i + " ");
            }
        }
    }

    public static void newAndOld() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer num = scanner.nextInt();

        if(num % 2 != 0 || (num % 2 == 0 && num > 5 && num < 31)) {
            System.out.println("NEW");
        } else if(num % 2 == 0 && ((num > 1 && num < 6) || num > 30)) {
            System.out.println("OLD");
        } else {
            System.out.println("HUH?");
        }
    }

    public static void floatAnalysis() {
        Scanner scanner = new Scanner(System.in);
        String outStr = "";

        System.out.println("Enter a number with floating point: ");
        Float f = scanner.nextFloat();

        if (f == 0) {
            outStr = "zero";
        } else if(f < 0) {
            outStr = "negative";
        } else if(f > 0) {
            outStr = "positive";
        }

        if(f != 0 && Math.abs(f) < 1) {
            outStr += " small";
        } else if(f != 0 && Math.abs(f) > 1000000) {
            outStr += " large";
        }

        System.out.println(outStr);
    }

    public static void randomKey() {
        Scanner scanner = new Scanner(System.in);
        String[] randArr = {"r", "a", "n", "d", "o", "m"};

        String str = scanner.nextLine();
        if(Arrays.asList(randArr).contains(str.toLowerCase())) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }

    public static void main(String[] args) {
        checkDivisibility();
        mathOp();
        flowChart();
        continueAndBreak();
        zeroAndSix();
        newAndOld();
        floatAnalysis();
        randomKey();
    }
}
