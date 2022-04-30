package com.example.test;

public class Cat {


    public static void main(String[] args) {

    }
    public static void bubbleSort(int[] arr){
        int length = arr.length;
        boolean ok = true;
        do {
            int nn = length -1;
            ok = true;
            for (int i = 1; i < nn; i++){
                if (arr[i] > arr[i + 1]){
                    ok = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    length = i;
                }
            }
        }while (!ok);
    }
}

