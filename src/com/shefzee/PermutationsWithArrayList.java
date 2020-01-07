package com.shefzee;

import java.util.ArrayList;

public class PermutationsWithArrayList {


        // Utility function to print the contents
        // of the ArrayList
        static void printArrayList(ArrayList<String> arrL)
        {
            arrL.remove("");
            for (int i = 0; i < arrL.size(); i++)
                System.out.print(arrL.get(i) + " ");
        }

        // Function to returns the arraylist which contains
        // all the permutation of str
        public static ArrayList<String> getPermutation(String str)
        {

            // If string is empty
            if (str.length() == 0) {

                // Return an empty arraylist
                ArrayList<String> empty = new ArrayList<>();
                empty.add("");
                return empty;
            }

            // Take first character of str
            char ch = str.charAt(0);

            // Take sub-string starting from the
            // second character
            String subStr = str.substring(1);

            // Recurvise call
            ArrayList<String> prevResult = getPermutation(subStr);

            // Store the generated permutations
            // into the resultant arraylist
            ArrayList<String> Res = new ArrayList<>();

            for (String val : prevResult) {
                for (int i = 0; i <= val.length(); i++) {
                    Res.add(val.substring(0, i) + ch + val.substring(i));
                }
            }

            // Return the resultant arraylist
            return Res;
        }

    // Driver code
    public static void main(String[] args)
    {
        String str = "abc";
        printArrayList(getPermutation(str));
    }

}
