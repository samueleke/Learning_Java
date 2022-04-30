import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        FirstLastDigitSum firstLastDigitSum = new FirstLastDigitSum();
//        System.out.println(firstLastDigitSum.sumFirstAndLastDigit(1));
//        EvenDigitSum evenDigitSum = new EvenDigitSum();
//        System.out.println(evenDigitSum.getEvenDigitSum(123456789));
        //System.out.println(12 % 30);
        //System.out.println(getDigitCount(100));
        printSquareStar(5);
    }
//    public static int getDigitCount(int number){
//        int count = 1;
//        while(number > 9){
//            number/=10;
//            count++;
//        }
//        return count;
//    }

    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else {

            for (int j = 0; j < number; j++) { // sor

                for (int i = 0; i < number; i++) { // oszlop
                    if ((i == 0) || (j == 0) || (i == j) || (i == number - 1) || (j == number - 1) || (i == number - (j + 1))) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");

                }
                System.out.println("");

            }
        }
    }

}
