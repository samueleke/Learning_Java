public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first >= 10 && second >= 10){
            int temp;
            while (second > 0){
                temp = second;
                second = first % second;
                first = temp;
            }
            return first;
        }else {
            return  -1;
        }
    }
}
