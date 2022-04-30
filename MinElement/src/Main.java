import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer: \r");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = readElements(count);
        System.out.println("Minimum value is: " + findMin(array));
    }

//    private static int readInteger(int number){
//        System.out.println("Enter an integer: \r");
//        Scanner scanner = new Scanner(System.in);
//        number = scanner.nextInt();
//        return number;
//    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " numbers!\r");
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static int findMin(int[] array) {
        int min = array[0];


        for (int i = 1; i < array.length ; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

}
