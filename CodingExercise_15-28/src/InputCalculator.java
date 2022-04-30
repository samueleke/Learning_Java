import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else
                break;
        }
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);

        System.out.println("SUM = " + sum + " AVG = " + roundedAverage);
        scanner.close();
    }
}
