package com.shefzee;

import java.util.Arrays;
import java.util.Optional;

public class CountOfWords {


    static long getCount(String mainString, String suff){


        String[] words = mainString.split(" ");

        return  Arrays.stream(words)
                .filter(a -> a.endsWith(suff))
                .count();




    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks is a computer"
                + " science portal for geeks";
        String suff = "ks";

        System.out.print(getCount(str, suff));

    }
}
