public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
}
