public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;

        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0)
                    return i;
            }
        }
        return -1;
    }
}
