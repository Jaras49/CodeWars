package com.java.sorttheodd;

public class Kata {
    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length -1; i++){


            for (int j = i+1; j< array.length ; j++ ){
                if (array[i] % 2 != 0 && array[j] % 2 != 0 && array[j] < array[i] && array[i] != 0 && array[j] != 0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}