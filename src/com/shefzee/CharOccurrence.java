package com.shefzee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharOccurrence {

    static void getOccurrence(String str){

        char[] chars = str.toCharArray();
        Map<Character, Integer> occ = new HashMap<>();

        for(Character c : chars){

            if(!occ.containsKey(c)){
                occ.put(c, 1);
            }else{
                occ.put(c, occ.get(c)+1);
            }

        }

        boolean f = true;
        boolean g = true;

        for(Map.Entry<Character,Integer> map : occ.entrySet()){
            if(map.getValue() == 1 && f){
                System.out.println("First non repeated character = " + map.getKey());
                f= false;
            }else if(map.getValue() > 1 && g){
                System.out.println("\nFirst repeated character " + map.getKey()) ;
                g = false;
            }
        }



    }

    public static void main(String[] args) {

        getOccurrence("Shefeeque");
    }
}
