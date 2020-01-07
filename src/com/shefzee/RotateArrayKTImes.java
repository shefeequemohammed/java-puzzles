package com.shefzee;

import java.util.Arrays;

public class RotateArrayKTImes {

    static void rotate(int[] arr, int k){

        for(int i=0; i< k; i++ ){

            int temp = arr[0];

            for(int j=0; j< arr.length -1; j++){

                arr[j] = arr[j+1];

            }

            arr[arr.length -1] = temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        rotate(arr,2);
    }
}
