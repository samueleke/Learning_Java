public class Main {

    public static void main(String[] args) {
//	    DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
//      dayOfTheWeek.printDayOfTheWeek(-1);
//        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();
//        System.out.println(numberOfDaysInMonth.isLeapYear(2020));
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//        for (int i = 8; i > 1; i--) {
//            System.out.println("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

//        int count = 0;
//
//        for (int i = 10; i < 200; i++) {
//            if (isPrime(i)) {
//                System.out.println("Prime numbers: " + i);
//                count++;
//            }
//            if (count == 10)
//                break;
//        }
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Numbers that can be divided by 3 and 5: " + i);
//                sum += i;
//                count++;
//            }
//            if (count == 5) {
//                System.out.println("The sum of numbers: " + sum);
//                break;
//            }
//        }

//        int num = 4;
//        int finishNum = 20;
//        int count = 0;
//        while (num <= finishNum) {
//            num++;
//            if (isEven(num)) {
//                count++;
//                System.out.println("Total numbers found: " + num);
//
//            }
//            if (count == 5) {
//                break;
//            }
//        }
        System.out.println("Sum of digits of a number: " + sumDigits(125));

    }


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static boolean isEven(int number) {
        if (number > 0 && number % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
