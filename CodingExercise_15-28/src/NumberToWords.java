public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        for (int i = 0; i < digitCount; i++) {

            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");

                    break;
                case 2:
                    System.out.println("Two");

                    break;

                case 3:
                    System.out.println("Three");

                    break;

                case 4:
                    System.out.println("Four");

                    break;

                case 5:
                    System.out.println("Five");

                    break;

                case 6:
                    System.out.println("Six");

                    break;

                case 7:
                    System.out.println("Seven");

                    break;

                case 8:
                    System.out.println("Eight");

                    break;

                case 9:
                    System.out.println("Nine");

                    break;
                default:
                    System.out.println("Invalid Value");

                    break;

            }
            reversedNumber /= 10;

        }

    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int count = 1;
        while (number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }
}
