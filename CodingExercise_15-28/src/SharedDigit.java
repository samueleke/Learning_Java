public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 > 11 && num1 < 100 && num2 > 11 && num2 < 100) {

            return num1 % 10 == num2 % 10 || num1 / 10 == num2 / 10 || num1 % 10 == num2 / 10 || num2 % 10 == num1 / 10;

        }else
            return false;
    }
}
