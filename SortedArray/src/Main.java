import java.util.Arrays;

import java.util.Scanner;

import static java.util.Collections.swap;

public class Main {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " number:\r");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers( int[] unSortedArray){
        int[] myArray = new int[unSortedArray.length];
        for (int i = 0; i < unSortedArray.length; i++){
            myArray[i] = unSortedArray[i];
        }

        // int[] myArray = Arrays.copyOf(unSortedArray,unSortedArray.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < myArray.length - 1; i++){
                if (myArray[i] < myArray[i + 1]){
                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return myArray;
    }


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sortedArray = sortIntegers((myIntegers));
        printArray(sortedArray);
    }
}
