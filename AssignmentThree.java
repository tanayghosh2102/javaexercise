import java.text.DateFormatSymbols;
import java.time.YearMonth;
import java.util.Scanner;

public class AssignmentThree {

    private static void multiplicationTable() {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }

    private static void tenNumSumAvg() {
        System.out.println("Enter ten numbers: ");
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += scanner.nextInt();
        }

        System.out.println("Sum of all entered numbers: " + sum);
        System.out.println("Average of all entered numbers: " + (sum/10));
    }

    private static void numOfDaysInMonth() {
        System.out.println("Enter a number for month: ");
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        if(num >= 1 && num <= 12) {
            YearMonth yearMonth = YearMonth.of(2020, num);
            Integer numDays = yearMonth.lengthOfMonth();
            System.out.println("Number of days in month " + num + " is " + numDays);
        } else {
            System.out.println("Invalid month entered.");
        }
    }

    private static void sumOfN() {
        System.out.println("Enter a numbers: ");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum of all natural numbers till " + n + " is " + sum);
    }

    private static void orderOfNums() {
        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        Integer n1 = scanner.nextInt();
        Integer n2 = scanner.nextInt();
        Integer n3 = scanner.nextInt();
        if(n1 < n2 && n2 < n3) {
            System.out.println("INCREASING");
        } else if(n3 < n2 && n2 < n1) {
            System.out.println("DECREASING");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }

    private static void numOfDaysInMonthOfYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for month: ");
        Integer month = scanner.nextInt();
        System.out.print("Input a year: ");
        Integer year = scanner.nextInt();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();

        if(month >= 1 && month <= 12) {
            YearMonth yearMonth = YearMonth.of(year, month);
            Integer numDays = yearMonth.lengthOfMonth();
            System.out.println("Number of days in the month of " + months[month - 1] + " of the year " + year + " is " + numDays);
        } else {
            System.out.println("Invalid month or year entered.");
        }
    }

    private static void isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        Integer year = scanner.nextInt();
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        YearMonth yearMonth = YearMonth.of(year, 2);
        Integer numDays = yearMonth.lengthOfMonth();

        if(numDays == 29) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }

    public static void main(String[] args) {
        multiplicationTable();
        tenNumSumAvg();
        numOfDaysInMonth();
        sumOfN();
        orderOfNums();
        numOfDaysInMonthOfYear();
        isLeapYear();
    }
}
